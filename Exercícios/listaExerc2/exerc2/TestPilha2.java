/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaExerc2.exerc2;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class TestPilha2 {
    public static void main(String[] args){
        Pilha2 pilha = new Pilha2(30);
        char caracter = ' ';
        Scanner s = new Scanner(System.in);  
        
        //separe as palavras por ',' e para finalizar digite '.'
        while(caracter != '.'){
            caracter = s.next().charAt(0);
            pilha.empilha(caracter);
        }
        
        
        pilha.imprimir();
        
        
    }
}
