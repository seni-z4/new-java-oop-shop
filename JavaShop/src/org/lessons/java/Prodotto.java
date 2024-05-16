package org.lessons.java;

import java.util.Random;

public class Prodotto {

	private double codice;
	private String nome;
	private String description;
	private int prezzo;
	private int iva;

	// codice valorizato con un numero random
	public int randomNumber() {
		Random random = new Random();
		int upperbound = 10000;

		int min = 1;
		int max = 10000;

		int rand = random.nextInt(random.nextInt(max - min + 1) + min);
		
		return rand;

	}
	public int ivaCal() {
		int finalPrice = (this.prezzo * 22)/100;
		return finalPrice;
		
	}
	
	
	public int getCodice() {
		return randomNumber();
	}
	
	//get&set di nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nomeProdotto) {
		this.nome = nomeProdotto;
	}

	//get&set desciption
	public String getDescription() {
		return description;
	}
	public void setDescription(String descriptionProdotto) {
		this.description = descriptionProdotto;
	}
	
	//get&set prezzo;
	public int getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(int prezzoProdotto) {
		this.prezzo = prezzoProdotto;
	}
	
	//get iva;
	public int getIva() {
		return ivaCal();
	}
	

}
