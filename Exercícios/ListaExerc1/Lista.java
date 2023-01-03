/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas.Lista;

import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class Lista {

    static int chave[];
    static double notaFinal[];
    static ArrayList<Integer> Curso1 = new ArrayList();
    static ArrayList<Integer> Curso2 = new ArrayList();
    static ArrayList<Integer> Curso3 = new ArrayList();
    static ArrayList<Integer> naoPassou = new ArrayList();
    static int primeiro, ultimo;

    // cria a lista de alunos vazia
    public static void Aluno(int tam) {
        chave = new int[tam];
        notaFinal = new double[tam];
        primeiro = 0;
        ultimo = primeiro;
    }

    // insere os alunos na lista
    public static void insere(int x, double nf) {
        if (ultimo >= chave.length) {
            System.out.println("Erro: Lista está cheia");

        } else {
            chave[ultimo] = x;
            notaFinal[ultimo] = nf;
            ultimo = ultimo + 1;
        }
    }

    // verifica se a lista de alunos está vazia
    public static boolean vazia() {
        return primeiro == ultimo;
    }

    // remove um aluno pelo valor da chave indicado
    public static void removeAluno(int remov) {
        if (vazia()) {
            System.out.println("Lista vazia!");
        }
        int p = 0;
        while (p < ultimo && chave[p] != remov) {
            p++;
        }
        if (p >= ultimo) {
            System.out.println("Chave não está na lista."); // item não está na lista
        }
        ultimo = ultimo - 1;
        for (int aux = p; aux < ultimo; aux++) {
            chave[aux] = chave[aux + 1];
        }
    }

    // pesquisa um aluno específico
    public static void pesquisa(int pesq) {
        int qtde = 0;
        for (int i = primeiro; i < ultimo; i++) {
            if (pesq == chave[i]) {
                qtde++;
            }
        }
        System.out.println("Quantidade de chaves iguais: " + qtde);
    }

    // imprime toda a lista de alunos e suas notas
    public static void imprimeAluno() {
        for (int i = 0; i < 30; i++) {
            System.out.println("Aluno: " + chave[i] + " Nota: " + notaFinal[i]);
        }
        System.out.println("");
    }

    // verifica em quail curso o aluno pode passar e o adiciona em um arraylist
    public static void verifica(int x, double nf, int[] opc) {

        for (int aux = 0; aux < opc.length; aux++) {
            if (opc[aux] == 1 && aux == 0) {
                if (nf >= 70 && Curso1.size() < 10 && opc[aux] == 1) {
                    Curso1.add(x);
                }
                if (opc[aux + 1] == 2) {
                    if (nf >= 40 && nf < 70 && Curso2.size() < 10) {
                        Curso2.add(x);
                    }
                }
                if (opc[aux + 2] == 2) {
                    if (nf >= 40 && nf < 70 && Curso2.size() < 10) {
                        Curso2.add(x);
                    }
                }
                if (opc[aux + 2] == 3) {
                    if (nf >= 10 && nf < 40 && Curso3.size() < 10) {
                        Curso3.add(x);
                    }
                }
                if (opc[aux + 1] == 3) {
                    if (nf >= 10 && nf < 40 && Curso3.size() < 10) {
                        Curso3.add(x);
                    } else {
                        naoPassou.add(x);
                    }
                }

            } else if (opc[aux] == 2 && aux == 0) {
                if (nf >= 40 & Curso2.size() < 10) {
                    Curso2.add(x);
                }

            } else if (opc[aux] == 3 && aux == 0) {
                if (nf >= 0 & Curso3.size() < 10) {
                    Curso3.add(x);
                }

            }

        }
    }

    // imprime o resultado do "vestibular"
    public static void imprime() {
        System.out.println("Aprovados em cada curso: ");
        System.out.println("Ciência da computação: " + Curso1);
        System.out.println("Sistemas de informação: " + Curso2);
        System.out.println("Análise e desenvolvimento de sistemas: " + Curso3);
        System.out.println("Nota insuficiente: " + naoPassou);
    }

}
