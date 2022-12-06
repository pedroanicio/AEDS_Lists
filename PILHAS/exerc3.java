/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PILHAS;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author pedro
 */
public class exerc3 {
    public static void main(String[] args){
        int n=0;
        Scanner s = new Scanner(System.in);
        Stack<Integer> pares = new Stack<Integer>();
        Stack<Integer> impares = new Stack<Integer>();
        
        System.out.println("Digite um número: (Digite um número negativo para sair)");
        while(n>=0){
            n = s.nextInt();
            if(n%2==0 && n>0){
                pares.push(n);
            }else if(n%2!=0 && n>0){
                impares.push(n);
            }
        }
        System.out.println(pares);
        System.out.println(impares);
    }
}
