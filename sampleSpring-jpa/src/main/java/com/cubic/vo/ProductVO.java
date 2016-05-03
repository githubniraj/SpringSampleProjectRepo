package com.cubic.vo;

public class ProductVO {
	
	private String productName;
	private Integer productCount;
	private String manufacturerName;
	private Double productPrice;
	private Integer pk;
	private String email;
	private String phone;
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductCount() {
		return productCount;
	}
	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public Integer getPk() {
		return pk;
	}
	public void setPk(Integer pk) {
		this.pk = pk;
	}
	@Override
	public String toString() {
		return "ProductVO [productName=" + productName + ", productCount="
				+ productCount + ", manufacturerName=" + manufacturerName
				+ ", productPrice=" + productPrice + ", pk=" + pk + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
