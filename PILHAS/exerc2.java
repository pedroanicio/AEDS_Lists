/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PILHAS;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author pedro
 */
public class exerc2 {
    public static void main(String[] args){
        Stack<Double> pilha = new Stack<Double>();
        Scanner s = new Scanner(System.in);
        double n, num, maior = MIN_VALUE, menor = MAX_VALUE;
        System.out.println("Deseja inserir quantos números? ");
        n = s.nextDouble();
        
        for(int i = 0; i<n; i++){
            System.out.println("Digite o número: ");
            num = s.nextDouble();
            pilha.push(num);
            if(pilha.peek()>=maior){
                maior = pilha.peek();
            }
            if(pilha.peek()<=menor){
                menor = pilha.peek();
            }
            
        }
        System.out.println(maior);
        System.out.println(menor);
        
        
    }
}
