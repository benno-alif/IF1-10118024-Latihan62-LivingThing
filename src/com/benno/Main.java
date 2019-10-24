package com.benno;

	/*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Menampilkan method abstact
     */

public class Main {

    public static void main(String[] args) {
	    Human human = new Human();

	    human.setNama("Rizki Adam Kurniawan");
	    human.walk(human.getNama());
	    human.breath(human.getNama());
	    human.eat(human.getNama());
    }
}
