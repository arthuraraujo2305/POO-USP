package br.executordeclasses;

public class Cachorro extends Animal {
    public String animal;
    public String cor;
    public String animal() {
        return "Sou um cachorro";
    }
    public String cor() {
        return "Sou da cor preta";
    }
    public double computa(double num1, double num2) {
        return (num1*num2);
    }
    public String despedeSe() {
        return "Au Au";
    }
}


