/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

/**
 *
 * @author pedro
 */
public class Lista {
    static int chave[];
    static double notaFinal[];
    int opcao;

    static int primeiro, ultimo;
    
    public static void Aluno(){
        chave = new int[30];
        notaFinal = new double[30];
        primeiro = 0;
        ultimo = primeiro;
    }
    
    public static void insere(int x, double nf, int opc) {
    if (ultimo >= chave.length) {
        System.out.println("Erro: Lista está cheia");

    } else {
        chave[ultimo] = x;
        notaFinal[ultimo] = nf;
        ultimo = ultimo + 1;
    }
}


    
}
