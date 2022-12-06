/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PILHAS.PilhaEstatica;

/**
 *
 * @author pedro
 */
public class Pilha {

    private Object item[];
    private int topo;

    public Pilha(int maxTam) {
        this.item = new Object[maxTam];
        this.topo = -1;
    }


    public void empilha(Object x) {
        if (this.topo+1 == this.item.length) {
            System.out.println("A pilha está cheia.");
        } else {
            this.topo = topo + 1;
            this.item[this.topo] = x;
        }
    }

    public boolean vazia() {
        if (this.topo == -1) {
            return true;
        } else {
            return false;
        }

    }

    public Object desempilha() {
        if (vazia()) {
            System.out.println("Erro! Lista vazia.");
            return null;
        } else {
            this.topo = topo - 1;
            return this.item[this.topo + 1];
        }

    }
    public Object tamanho(){
        int tamanho;
        tamanho = this.topo+1;
        return tamanho;
    }

}
