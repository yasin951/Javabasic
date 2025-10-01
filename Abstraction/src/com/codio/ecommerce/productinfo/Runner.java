package com.codio.ecommerce.productinfo;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Product elec = new Electronics(11254,"Cooler",100000.00);
   Product Clothess = new Clothing(1,"Pants",5000);
   Product Food = new FoodItem(1,"Pizza",255);
   
   System.out.println("id:-"+elec.productId()+"   "+"Product Name:- "+elec.productName() +"    "+"Product Price:-"+elec.productPrice());
   System.out.println("id:-"+Clothess.productId()+"   "+"Product Name:- "+Clothess.productName() +"    "+"Product Price:-"+Clothess.productPrice());
   System.out.println("id:-"+Food.productId()+"   "+"Product Name:- "+Food.productName() +"    "+"Product Price:-"+Food.productPrice());
   
	}

}
