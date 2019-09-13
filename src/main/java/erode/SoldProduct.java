package erode;

import java.math.BigDecimal;

public class SoldProduct {
	private String name;
	private BigDecimal price;
	private String currency;

	public SoldProduct(String name, BigDecimal price) {
		this.name = name;
		this.price = price; 
	}

	public String getCurrency() {
		// TODO Auto-generated method stub
		return currency;
	}
	
	public String getName() {
		return name;
	} 
	public BigDecimal getPrice() {
		return price;
	} 
}