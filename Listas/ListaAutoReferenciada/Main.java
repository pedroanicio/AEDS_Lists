/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaAutoReferenciada;

/**
 *
 * @author 0072383
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Lista lista = new Lista();
        lista.insere(10);
        lista.insere(4);
        lista.insere(4);
        lista.insere(3);
        lista.insere(1);
        lista.imprime();
        System.out.println("Quantidade de items iguais na lista: "+lista.pesquisa(3));
        lista.retirar(3);
        lista.imprime();
    }
}
