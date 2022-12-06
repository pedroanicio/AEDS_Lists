/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PILHAS.packageJava;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author pedro
 */
public class exerc5 {

    public static void main(String[] args) {
        int idade = 0, qtdeMaior = 0, qtdeMenor = 0;
        String nome;
        Scanner s = new Scanner(System.in);
        Stack<String> maioridade = new Stack<String>();
        Stack<String> menoridade = new Stack<String>();

        while (idade >= 0) {
            System.out.println("Digite a idade: ");
            idade = s.nextInt();
            s.nextLine();
            System.out.println("Digite o nome: ");
            nome = s.nextLine();
            if (idade >= 18) {
                maioridade.push(nome);
                qtdeMaior++;
            } else if (idade < 18 & idade >= 0) {
                menoridade.push(nome);
                qtdeMenor++;
            }

        }
        System.out.println("Quantodade de pessoas maiores de idade: " + qtdeMaior);
        System.out.println(maioridade);
        System.out.println("Quantodade de pessoas menores de idade: " + qtdeMenor);
        System.out.println(menoridade);
    }
}
