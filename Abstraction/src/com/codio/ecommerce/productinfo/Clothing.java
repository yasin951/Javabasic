package com.codio.ecommerce.productinfo;

public class Clothing extends Product {
	int id ;
	String name;
	double price;
	
   public	Clothing(int Id,String Name,double Price){
		id = Id;
		name =Name;
		price =Price;
		
	}
	
	

	@Override
	public int productId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String productName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double productPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
