package com.cubic.service;

import com.cubic.vo.ProductVO;

public class ProductNotifyService implements NotifyService<ProductVO> {

	public void notify(ProductVO object) {
		System.out.println("Notify Product Created: " + object);

	}

}
