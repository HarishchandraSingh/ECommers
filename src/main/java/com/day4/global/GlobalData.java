package com.day4.global;

import java.util.ArrayList;
import java.util.List;

import com.day4.model.Product;



public class GlobalData {

	
	public static List<Product> cart;
	static {
		cart =new ArrayList<Product>();
	}
}