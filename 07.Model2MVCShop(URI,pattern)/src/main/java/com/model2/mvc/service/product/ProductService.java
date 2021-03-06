package com.model2.mvc.service.product;

import java.util.Map;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;

public interface ProductService {

	//상품추가
	public void addProduct(Product product) throws Exception;
	
	//상품 확인
	public Product getProduct(int prodNo) throws Exception;
	
	//상품 리스트
	public Map<String, Object> getProductList(Search search) throws Exception;
	
	//상품 업데이트
	public void updateProduct(Product product) throws Exception;
	
	//상품 no 중복 확인
//	public boolean checkDuplication(int prodNo) throws Exception;
}
