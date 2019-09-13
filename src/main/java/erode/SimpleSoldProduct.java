package erode;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class SimpleSoldProduct {
	private String name;
	private BigDecimal price;

	public SimpleSoldProduct(String name, BigDecimal price) {
		this.name=name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}  
	@Override
	public String toString() {
		return name + ":" + new DecimalFormat("#.##").format(price.doubleValue());
	}
}
