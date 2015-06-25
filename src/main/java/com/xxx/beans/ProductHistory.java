package com.pricebaba.beans;

public class ProductHistory {
	private Long productId;
	private Long price;
	private String effectiveFrom;
	private String effectiveTill;
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getEffectiveFrom() {
		return effectiveFrom;
	}
	public void setEffectiveFrom(String effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}
	public String getEffectiveTill() {
		return effectiveTill;
	}
	public void setEffectiveTill(String effectiveTill) {
		this.effectiveTill = effectiveTill;
	}
	
}
