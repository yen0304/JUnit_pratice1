package com.example.demo;

public class Calcultor {

    public int add(int x,int y){
        return(x+y);
    }

    public static void main(String[] args) {
        Calcultor calcultor =new Calcultor();
        int result = calcultor.add(1,2);
        System.out.println("結果為" + result);
    }
}
