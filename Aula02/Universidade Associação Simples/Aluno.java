/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade_associacaosimples;

/**
 *
 * @author 14651458
 */
public class Aluno {
    private String nome;
    private int nusp;

    public String getNome() {
        return nome;
    }

    public int getNusp() {
        return nusp;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNusp(int nusp) {
        this.nusp = nusp;
    }

    public Aluno(String nome, int nusp) {
        this.nome = nome;
        this.nusp = nusp;
    }
    
}
