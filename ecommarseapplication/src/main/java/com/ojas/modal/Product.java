package com.ojas.modal;

public class Product {
	
	private int productId;
	private String productName;
	private String ProductCategory;
	private String  productPrice;
	private String productImage;
	
	
	public Product(){}


	public Product(int productId, String productName, String productCategory, String productPrice,
			String productImage) {
		
		this.productId = productId;
		this.productName = productName;
		ProductCategory = productCategory;
		this.productPrice = productPrice;
		this.productImage = productImage;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductCategory() {
		return ProductCategory;
	}


	public void setProductCategory(String productCategory) {
		ProductCategory = productCategory;
	}


	public String getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}


	public String getProductImage() {
		return productImage;
	}


	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", ProductCategory="
				+ ProductCategory + ", productPrice=" + productPrice + ", productImage=" + productImage + "]";
	}


	
	
	

}
