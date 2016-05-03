package com.cubic.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cubic.vo.ProductVO;
import com.cubic.vo.VendorVO;

public class ProductServiceImpl extends BaseProductService implements ProductService {
	
	private List<Double> priceList=new ArrayList<Double>();
	public List<Double> getPriceList() {
		return priceList;
	}

	public void setPriceList(List<Double> priceList) {
		this.priceList = priceList;
	}

	public Set<VendorVO> getVendors() {
		return vendors;
	}

	public void setVendors(Set<VendorVO> vendors) {
		this.vendors = vendors;
	}

	public Map<String, String> getCustomers() {
		return customers;
	}

	public void setCustomers(Map<String, String> customers) {
		this.customers = customers;
	}

	private Set<VendorVO> vendors=new HashSet<VendorVO>();
	private Map<String, String> customers=new HashMap<String, String>();
	
	public ProductVO createProduct(ProductVO vo){
		vo.setManufacturerName(this.getDefaultManufac());
		vo.setEmail(this.getEmail());
		vo.setPhone(this.getPhone());
		vo.setPk((int) (Math.random() * 10000));
		this.getNotifyService().notify(vo);
		return vo;
	}

}
