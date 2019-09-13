package erode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ProductConverter {

	ExchangeService exchangeService = new ExchangeService();

	public static void main(String[] args) {
		List<SoldProduct> soldProducts = new ArrayList<>(3);
		soldProducts.add(new SoldProduct("test", new BigDecimal(10)));
		soldProducts.add(new SoldProduct("test2", new BigDecimal(1.25)));
		soldProducts.add(new SoldProduct("test3", null));
		SoldProductsAggregate spa = new ProductConverter().converToSimpleSoldProducts(soldProducts);
		System.out.println(spa);

	}

	public SoldProductsAggregate converToSimpleSoldProducts(List<SoldProduct> soldProducts) {
		List<SimpleSoldProduct> simpleProducts = new LinkedList<>();
		BigDecimal total;
		Predicate<SoldProduct> ispriceNotNull = p -> p.getPrice() != null;
		Predicate<SoldProduct> isValidCurrencyRate = p -> exchangeService.rate(p.getCurrency()).isPresent();
		Stream<SoldProduct> filteresSoldProducts = soldProducts.stream()
				.filter(ispriceNotNull.and(isValidCurrencyRate));
		Stream<SimpleSoldProduct> simpleProStream = filteresSoldProducts.map((p) -> {
			return new SimpleSoldProduct(p.getName(),
					exchangeService.rate(p.getCurrency()).get().multiply(p.getPrice()));
		});

		total = simpleProStream.peek(simpleProducts::add).map(p -> p.getPrice()).reduce((x, y) -> x.add(y)).get();
		return new SoldProductsAggregate(simpleProducts, total);
	}

}
