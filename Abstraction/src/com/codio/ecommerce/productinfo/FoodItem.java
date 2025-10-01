package com.codio.ecommerce.productinfo;

public class FoodItem extends Product{
 int id;
 String name;
 int gst;
 
 double price; 
 
	
	public  FoodItem(int Id, String Name,double Price) {
		id = Id;
		name = Name;
		price = Price;
//	    OriginalPrice=(gst * Price)/100;
	    
	    
	     
		
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
