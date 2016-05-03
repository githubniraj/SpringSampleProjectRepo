package com.cubic.vo;

public class CustomerVO {

	private int customerNumber;
	private String custormerName;
	private String customerAddress;
	private CategoryVO categoryvo;
	
	public CustomerVO(int customerNumber, String custormerName,
			String customerAddress, CategoryVO categoryvo) {
		super();
		this.customerNumber = customerNumber;
		this.custormerName = custormerName;
		this.customerAddress = customerAddress;
		this.categoryvo = categoryvo;
	}
	public CustomerVO(){
		
	}
	public CustomerVO(int customerNumber, String custormerName,
			String customerAddress) {
		super();
		this.customerNumber = customerNumber;
		this.custormerName = custormerName;
		this.customerAddress = customerAddress;
	}
	
	public CustomerVO(int customerNumber, String custormerName) {
		super();
		this.customerNumber = customerNumber;
		this.custormerName = custormerName;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustormerName() {
		return custormerName;
	}
	public void setCustormerName(String custormerName) {
		this.custormerName = custormerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public CategoryVO getCategoryvo() {
		return categoryvo;
	}
	public void setCategoryvo(CategoryVO categoryvo) {
		this.categoryvo = categoryvo;
	}
	@Override
	public String toString() {
		return "CustomerVO [customerNumber=" + customerNumber
				+ ", custormerName=" + custormerName + ", customerAddress="
				+ customerAddress + ", categoryvo=" + categoryvo + "]";
	}
	
	
	
	
	
}
