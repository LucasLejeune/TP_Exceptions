package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SoldelnsuffisantException {
        division();
        char2Int("1");
        char2Int("test");
        getTabElemOutOfLenght();
        retirerArgent((double) 500, (double) 1200);
        retirerArgent((double) 500, (double) 200);

    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisie de deux entriers à diviser:");
        System.out.println("Saisir a:");
        int a = scanner.nextInt();
        System.out.println("Saisir b:");
        int b = scanner.nextInt();
        int res = 0;

        try {
            res = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Impossible de diviser par 0.");
        }

        System.out.println(res);

    }

    public static void char2Int(String numChar) {
        try {
            int numInt = Integer.parseInt(numChar);
            System.out.println("Votre numéro est: " + numInt);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Impossible de transformer la chaine de caractère \"" +
                    numChar + "\" en int.");
        }
    }

    public static void getTabElemOutOfLenght() {
        int[] tab = { 1, 2, 3, 4, 5 };
        try {
            System.out.println(tab[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Impossible d'accéder à un élément non existant");
        }
    }

    public static void retirerArgent(double retrait, double solde) throws SoldelnsuffisantException {
        if (retrait > solde) {
            throw new SoldelnsuffisantException();
        }
        double temp = solde - retrait;
        System.out.println(
                "Solde de base: " + solde + "\nRetrait de: " + retrait + "\nLe nouveau solde est de: " + temp);

    }
}