/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PILHAS;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author 0072383
 */
public class exerc1 {
    public static void main(String[] args){
        double tam, soma = 0;
        double media;
        Stack<Integer> pilha = new Stack<Integer>();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        pilha.push(6);
        pilha.push(7);
        pilha.push(8);
        pilha.push(9);
        pilha.push(10);
        tam = pilha.size();
        System.out.println("Valores da  pilha: ");
        System.out.println(pilha);
        
        for(int i = 0; i<tam;i++){
            soma = pilha.peek() + soma;
            pilha.pop();
        }
        System.out.print("Valor da soma: ");
        System.out.println(soma);
        media = soma/10;
        System.out.println("Valor da média: "+media);
        

        
    }

}
