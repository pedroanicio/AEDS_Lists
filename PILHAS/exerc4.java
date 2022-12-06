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
public class exerc4 {
    public static void main(String[] args){
        int idade, n, maioridade = 0, menoridade = 150;
        String nome, maiorNome = null, menorNome = null;
        Scanner s = new Scanner(System.in);
        Stack<String> nomes = new Stack<String>(); 
        Stack<Integer> idades = new Stack<Integer>();
        System.out.println("Qual a quantidade de pessoas? ");
        n = s.nextInt();
        s.nextLine();

        
        for(int i = 0; i<n ; i++){
            System.out.println("Nome: ");
            nome = s.nextLine();
            nomes.push(nome);
            System.out.println("Idade: ");
            idade = s.nextInt();
            s.nextLine();
            idades.push(idade);
            if(idades.peek()>=maioridade){
                maioridade = idades.peek();
                maiorNome = nomes.peek();
            }
            if(idades.peek()<=menoridade){
                menoridade = idades.peek();
                menorNome = nomes.peek();
            }
        }
        System.out.println("Pessoa mais velha: "+maiorNome);
        System.out.println("Idade: "+maioridade);
        System.out.println("");
        System.out.println("Pessoa mais nova: "+menorNome);
        System.out.println("Idade: "+menoridade);
        
        System.out.println("");
        for(int i = 0; i<n ; i++){
            System.out.println("Nome: "+nomes.pop());
            System.out.println("Idade: "+idades.pop());
        }
        
        

        
        
    }
}
