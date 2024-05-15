package org.lessons.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prodotto products = new Prodotto();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("insert the product name");
		products.setNome(input.nextLine());
		
		System.out.println("the name of this product is :" + products.getNome());
	}

}
