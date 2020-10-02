package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Kalimat: ");
        String kalimat = input.nextLine();
        String kalimat_dibalik = "";
        for(int i = kalimat.length() - 1; i >= 0; i--) {
            kalimat_dibalik += kalimat.charAt(i);
        }
        if (kalimat.equals(kalimat_dibalik)) {
            System.out.println("COOL");
        } else {
            System.out.println("BAD");
        }
    }
}
