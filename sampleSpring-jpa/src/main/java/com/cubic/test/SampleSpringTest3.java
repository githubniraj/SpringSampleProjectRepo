package com.cubic.test;

import com.cubic.service.ProductService;
import com.cubic.util.SpringFactory;
import com.cubic.vo.ProductVO;


public class SampleSpringTest3 {

	public static void main(String[] args) {
		ProductService psWalmart = SpringFactory.getInstance().getBean("psWalmart", ProductService.class);
		ProductService psTarget = SpringFactory.getInstance().getBean("psTarget", ProductService.class);

		ProductVO vo = psWalmart.createProduct(createProduct());
		System.out.println(vo);
		ProductVO vo1 = psTarget.createProduct(createProduct());
		System.out.println(vo1);
	}

	private static ProductVO createProduct() {
		ProductVO vo = new ProductVO();
		vo.setProductName("Laptop");
		vo.setProductCount(10);
		vo.setProductPrice(100.2);
		return vo;
	}

}
