/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PILHAS.PilhaEstatica;

import java.util.Scanner;


/**
 *
 * @author pedro
 */
public class test {
    public static void main(String[] args){
        int tamanho, aux = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o tamanho máximo da pilha: "); 
        tamanho = s.nextInt();
        Pilha pilha = new Pilha (tamanho);
        Object tam, n, x;
        
        while(aux<=tamanho){
            System.out.println("Digite o número: ");
            x = s.nextInt();
            pilha.empilha(x);
            aux++;
        }
 
        tam = pilha.tamanho();
        System.out.println("Tamanho: "+tam);
        
        for(int i = 0; i < (Integer)tam; i++){
            n = (Integer) pilha.desempilha();
            System.out.println("Desempilhou: "+n);
        }
        
        System.out.println("Tamanho: "+pilha.tamanho());
        
    }
}
