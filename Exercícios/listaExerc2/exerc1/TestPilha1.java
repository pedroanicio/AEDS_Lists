/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaExerc2.exerc1;

/**
 *
 * @author pedro
 */
public class TestPilha1 {
    public static void main(String[] args){
        Pilha1 pilha = new Pilha1(5);
        pilha.empilha('s');
        pilha.empilha('d');
        pilha.empilha('g');
        pilha.empilha('h');
        
        pilha.imprimeX();
        pilha.desempilha();
        pilha.imprimeY();
        pilha.determinaXY();
    }
}

