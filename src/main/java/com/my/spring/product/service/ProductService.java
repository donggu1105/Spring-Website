package com.my.spring.product.service;

import java.util.List;
import java.util.Map;

import com.my.spring.product.vo.ImageFileVO;
import com.my.spring.product.vo.ProductVO;

public interface ProductService {
	List<ProductVO> productlist(Map<String, Object> map);
	int productlist_count(Map<String, Object> map);
	Map<String, Object> productdetail(int pro_code);
	void productcountupdate(int pro_code);
	String productquantity_check(Map<String, Object> map);
	int product_detail_code(Map<String, Object> map);
}
