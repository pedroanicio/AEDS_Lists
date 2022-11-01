/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestaLista;

import java.util.Scanner;

/**
 *
 * @author 0072383
 */
public class Main {
        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            //System.out.println("Digite o número de convidados: ");
            //tam = s.nextInt();
            ListaConvidados.Lista(10);
            
            ListaConvidados.inserir("Luis Silva");
            ListaConvidados.inserir("Pedro Arthur");
            ListaConvidados.inserir("André Balada");
            ListaConvidados.inserir("Paulo Vitor");
            ListaConvidados.imprimir();
            //System.out.println("Qual nome deseja pesquisar? ");
            //pesquisa = s.nextLine();
            ListaConvidados.pesquisar("Luis Silva");
            ListaConvidados.retirar("Luis Silva");
            ListaConvidados.imprimir();
            
            
        }
}
