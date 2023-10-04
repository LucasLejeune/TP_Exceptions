package com.example;

public class SoldelnsuffisantException extends Exception {
    public SoldelnsuffisantException() {
        super("Impossible de retirer une somme supérieure au solde.");
    }
}
