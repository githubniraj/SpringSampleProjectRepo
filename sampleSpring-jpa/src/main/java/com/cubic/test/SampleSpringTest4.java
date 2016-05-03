package com.cubic.test;

import com.cubic.service.ProductService;
import com.cubic.util.SpringFactory;
import com.cubic.vo.ProductVO;


public class SampleSpringTest4 {

	public static void main(String[] args) {
		ProductService psWalmart = SpringFactory.getInstance().getBean("psWalmart", ProductService.class);
		ProductService psTarget = SpringFactory.getInstance().getBean("psTarget", ProductService.class);
		psWalmart.createProduct(createProduct());
		psTarget.createProduct(createProduct());
	}

	private static ProductVO createProduct() {
		ProductVO vo = new ProductVO();
		vo.setProductName("Laptop");
		vo.setProductCount(10);
		vo.setProductPrice(100.2);
		return vo;
	}

}
