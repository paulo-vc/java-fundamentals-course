package com.estoque;

public class Main {

    public static int estoqueMedio(int qtdMinima, int qtdMaxima){
        return (qtdMinima+qtdMaxima)/2;
    }
    public static void main(String[] args) {
        int a=20, b=100;
        System.out.println(estoqueMedio(a,b));
    }
}