package erode;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

public

class SoldProductsAggregate {
	List<SimpleSoldProduct> products;
	BigDecimal total;

	public SoldProductsAggregate(List<SimpleSoldProduct> products, BigDecimal total) {
		this.products = products;
		this.total = total;
	}

	@Override
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("#.##");
		 StringBuilder builder= new StringBuilder();
		 builder.append(formatter.format(total.doubleValue()));
		 builder.append(" : ");
		 products.forEach(builder::append);
		 return builder.toString();
	}
}