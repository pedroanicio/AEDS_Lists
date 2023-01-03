/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas.Lista;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int chave, remov, pesq;
        int opc[] = new int[3];
        double notafinal;
        Lista.Aluno(30);

        for (int i = 0; i < 30; i++) {
            System.out.println("Digite a chave do aluno: ");
            chave = s.nextInt();
            System.out.println("Digite a nota do aluno: ");
            notafinal = s.nextDouble();
            for (int aux = 0; aux < opc.length; aux++) {
                System.out.println("Digite a " + (aux + 1) + " opção do aluno: ");
                opc[aux] = s.nextInt();
            }
            Lista.insere(chave, notafinal);
            Lista.verifica(chave, notafinal, opc);
        }

        Lista.imprimeAluno();
        Lista.imprime();

        //Lista.removeAluno(remov);
        //Lista.pesquisa(pesq);
    }
}
