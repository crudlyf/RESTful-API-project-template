package com.pricebaba.beans;

public class RetailerHistory {
	private Long retailerId;
	private Long productUpdated;
	private String updateTime;
	private String loginTime;
	public Long getRetailerId() {
		return retailerId;
	}
	public void setRetailerId(Long retailerId) {
		this.retailerId = retailerId;
	}
	public Long getProductUpdated() {
		return productUpdated;
	}
	public void setProductUpdated(Long productUpdated) {
		this.productUpdated = productUpdated;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	
}
