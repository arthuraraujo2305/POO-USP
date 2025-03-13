/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 14651458
 */
public class Universidade {
    private String nome;
    private Professor profs[];
    private int top;

    public Universidade(String nome) {
        this.nome = nome;
        top = -1;
        profs = new Professor[3];
    }
    boolean Vincula (Professor p){
        top +=1;
        if (top<3) {
            profs [top] = p;
            return true;
        }
        else{
            top -=1;
            return false;
        }
    }
    boolean Desvincula (Professor p){
        for (int i = 0; i < top; i++) {
            if (profs[i] ==p) {
                profs[i] = null;
                return true;
            }            
        }
        return false;
    }
    
}
