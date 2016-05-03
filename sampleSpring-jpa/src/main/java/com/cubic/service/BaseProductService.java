package com.cubic.service;

import com.cubic.vo.ProductVO;

public  abstract class BaseProductService {
	
	private String defaultManufac = null;
	private NotifyService<ProductVO> notifyService;
	private String email;
	private String phone;
	
	
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

	public String getDefaultManufac() {
		return defaultManufac;
	}

	public void setDefaultManufac(String defaultManufac) {
		this.defaultManufac = defaultManufac;
	}

	public NotifyService<ProductVO> getNotifyService() {
		return notifyService;
	}

	public void setNotifyService(NotifyService<ProductVO> notifyService) {
		this.notifyService = notifyService;
	}

}
