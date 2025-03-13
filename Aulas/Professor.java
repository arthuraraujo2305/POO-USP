/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 14651458
 */
public class Professor {
    private String nome;
    private String nivel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Professor(String nome, String nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }
    public void Ministra(Aluno a){
        System.out.println("Prof" + nome +"ministra para "+ a.getNome());
    }
}
