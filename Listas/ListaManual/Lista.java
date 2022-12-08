/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaManual;

/**
 *
 * @author 0072383
 */
public class Lista {

    static int item[];
    static int primeiro, ultimo;

    // cria lista vazia
    public static void Lista(int tam) {
        item = new int[tam];
        primeiro = 0;
        ultimo = primeiro;
    }

    //insere um elemento ao final da lista
    public static void insere(int x) {
        if (ultimo >= item.length) {
            System.out.println("Erro: Lista está cheia");
            
        } else {
            item[ultimo] = x;
            ultimo = ultimo + 1;
        }
    }

    //testa se há elementos no vetor 'item' e retorna true ou false
    public static boolean vazia() {
        return (primeiro == ultimo);
    }

    //imprime os elementos da lista do primeiro até o último
    public static void imprime() {
        for (int i = primeiro; i < ultimo; i++) {
            System.out.println(item[i]);
        }
    }

    //pesquisa insere mais um elemento no final da lista
    public static Object pesquisa(int chave) {

        return null;

    }

    //busca um elemento igual a cahave na lista. se existir retorna o elemento
    public static Object retira(int chave) {

        return null;

    }

    //retorna o 1 elemento da lista, se ela não estiver vazia.
    public static Object retiraPrimeiro() {
        if (vazia() == true) {
            System.out.println("Erro! Lista vazia");
            return null;
        }
        //salva o item[0] para retornar
        Object elem = item[0];

        //todos os demais elementos 
        //serão deslocados uma posição para frente
        //para ocupar a posição 0
        ultimo = ultimo - 1;
        for (int aux = 0; aux < ultimo; aux++) {
            item[aux] = item[aux + 1];
        }

        return elem;

    }

}
