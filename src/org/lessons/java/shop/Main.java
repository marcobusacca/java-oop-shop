package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		
		Prodotto p = new Prodotto("prodotto", "descrizione", 111.25, 22);
		
		System.out.println(p);
		
		System.out.println("Prezzo senza IVA: " + p.getPrezzoBase());
		
		System.out.println("Prezzo comprensivo di IVA: " + p.getPrezzoPieno());
		
		System.out.println("Nome esteso: " + p.getNomeEsteso());
	}
}
