/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.po.semana3.aulaexerc;

/**
 *
 * @author 4856322
 */
public class Main {
    public static void main(String[] args) {
        Universidade USP = new Universidade("USP");
        Universidade UFSCar = new Universidade("UFSCar");
        
        Professor Nolasco = new Professor("Nolasco","Universitario");
        Professor Mencattini = new Professor("Mencattini","Universitario");
        
        USP.vincula(Nolasco); UFSCar.vincula(Nolasco);
        USP.vincula(Mencattini); UFSCar.vincula(Mencattini);
        
        UFSCar = null; // Federupa destruída ;)
    }
}
