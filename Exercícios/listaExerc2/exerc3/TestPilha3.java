/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaExerc2.exerc3;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class TestPilha3 {
    public static void main(String[] args){
        int x;
        char caracter;
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o número de letras da palavra? ");
        x = s.nextInt();
        Pilha3 pilha = new Pilha3(x);
        for(int i = 0; i<x; i++){
            System.out.println("Digite o caracter: ");
            caracter = s.next().charAt(0);
            pilha.empilha(caracter);
        }
        System.out.println(pilha.verifica());
        
        
    }
}
