/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaAlunos;

/**
 *
 * @author 0072383
 */
public class Main {

    public static void main(String[] args) {
        ListaNotas.lista(3);
        ListaNotas.inserir(90);
        ListaNotas.inserir(10);
        ListaNotas.inserir(60);
        ListaNotas.mediaTurma();
        ListaNotas.imprimir();

        ListaNotas.acimaAbaixo();

        ListaNotas.remover(10);
        ListaNotas.imprimir();
        ListaNotas.mediaTurma();

    }
}
