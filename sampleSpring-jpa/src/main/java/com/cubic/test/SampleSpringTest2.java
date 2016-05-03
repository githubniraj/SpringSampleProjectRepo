package com.cubic.test;

import com.cubic.service.ProductService;
import com.cubic.service.Result;
import com.cubic.util.SpringFactory;
import com.cubic.vo.ProductVO;



public class SampleSpringTest2 {

	public static void main(String[] args) {
		ProductService ps = SpringFactory.getInstance().getBean("psBeanTarget", ProductService.class);
		ProductService ps1 = SpringFactory.getInstance().getBean("productServiceBean", ProductService.class);
		ProductVO vo = createProduct();
		vo = ps.createProduct(vo);
		System.out.println(vo);
		vo = ps1.createProduct(vo);
		System.out.println(vo);

		Result<ProductVO> r = new Result<ProductVO>();
		r.setResult(vo);
		Result<ProductService> r1 = new Result<ProductService>();
		r1.setResult(ps);
	}

	private static ProductVO createProduct() {
		ProductVO vo = new ProductVO();
		vo.setProductName("Laptop");
		vo.setManufacturerName("TEST");
		vo.setProductCount(10);
		vo.setProductPrice(100.2);
		return vo;
	}

}
