/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaAlunos;

import java.util.ArrayList;

/**
 *
 * @author 0072383
 */
public class ListaNotas {

    static float notas[];
    static int primeiro, ultimo;
    
    // cria a lista
    public static void lista(int tam) {
        notas = new float[tam];
        primeiro = 0;
        ultimo = primeiro;
    }
    // verifica se a lista está vazia
    public static boolean vazia() {
        return primeiro == ultimo;
    }
    // insere um valor na lista
    public static void inserir(float nota) {
        if (ultimo >= notas.length) {
            System.out.println("Erro: Lista está cheia");
            return;
        } else {
            while (nota < 0 | nota > 100) {
                System.out.println("Nota inválida! Digite novamente: ");
            }
            notas[ultimo] = nota;
            ultimo = ultimo + 1;
        }
    }
    // calcula a media da turma
    public static void mediaTurma() {
        float soma = 0, media;
        for (int i = primeiro; i < ultimo; i++) {
            soma = soma + notas[i];
        }
        media = soma / ultimo;
        System.out.println("Média da turma: " + media);
    }
    // imprime toda a lista
    public static void imprimir() {
        for (int i = primeiro; i < ultimo; i++) {
            System.out.println(notas[i]);
        }
    }
    // verifica quais notas estão abaixo da média e quais estão acima
    public static void acimaAbaixo() {
        ArrayList<Float> acimaMedia = new ArrayList();
        ArrayList<Float> abaixoMedia = new ArrayList();
        for (int i = primeiro; i < ultimo; i++) {
            if (notas[i] >= 60) {
                acimaMedia.add(notas[i]);
            } else {
                abaixoMedia.add(notas[i]);
            }
        }
        System.out.println("Acima da média:");
        System.out.println(acimaMedia);
        
        System.out.println("Abaixo da média: ");
        System.out.println(abaixoMedia);
        
    }
    // pesquisa uma nota especifica
    public static void pesquisa(float chave) {
        int qtde = 0;
        for (int i = primeiro; i < ultimo; i++) {
            if (chave == notas[i]) {
                qtde++;
            }
        }
        System.out.println("Quantidade de notas iguais: " + qtde);
    }
    // remove uma nota da lista
    public static void remover(float remove) {
        if (vazia()) {
            System.out.println("Erro! Lista vazia.");
            
        } 
        int p = 0;
        while(p < ultimo && notas[p] != remove) {
            p++;
        }
        if(p >= ultimo){
            System.out.println("Nota não está na lista."); // item não está na lista
        }
        ultimo = ultimo - 1;
        for(int aux = p; aux < ultimo; aux++){
            notas[aux] = notas[aux + 1];
        }
        
    }

}
