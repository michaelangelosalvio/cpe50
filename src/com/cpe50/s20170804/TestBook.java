package com.cpe50.s20170804;

public class TestBook {
	public static void main(String[] args) {
		Fiction f = new Fiction("GOT");
		System.out.println(f.getPrice());

        NonFiction nf = new NonFiction("The Life of Pi");
        System.out.println(nf.getPrice());

        System.out.println();
        Book[] books = new Book[2];

        books[0] = new Fiction("Ang Pugad sng mga Baboy");
        books[1] = new NonFiction("Marimar");

        for ( int i = 0 ; i < books.length ; i++ ) {
            System.out.println(books[i]);
            System.out.println();
        }

		
	}
}
