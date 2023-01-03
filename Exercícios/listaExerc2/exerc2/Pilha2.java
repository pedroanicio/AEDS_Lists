/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaExerc2.exerc2;

import listaExerc2.exerc1.*;

/**
 *
 * @author pedro
 */
public class Pilha2 {
    private char item[];
    private int topo;
    private String fraseInv = "";
    
    public Pilha2(int tam){
        this.item = new char[tam];
        this.topo = -1;
    }
    
    //empilha os objetos
    public void empilha(char x ){
        if (this.topo+1 == this.item.length){
            System.out.println("A pilha está cheia :(");
        } else {
            this.topo = topo + 1;
            this.item[this.topo] = x;  
            
            if(x == ',' || x == '.'){
                this.topo = topo -1;
                this.item[this.topo+1] = ' ';
                desempilha();
            }
        }
    }
    //verifica se esta vazia
    public boolean vazia(){
        if(this.topo == -1){
            return true;
        } else { 
            return false;
        }
    }
    //desempilha items da pilha
    public void desempilha(){
        if(vazia()){
            System.out.println("Lista vazia.");

        } else {
            while(this.topo>=0){
                this.topo = topo - 1; 
                fraseInv = fraseInv+this.item[this.topo+1]; //adiciona char à frase um por um
            }
            fraseInv = fraseInv+' '; //cria um espaço entre as palavras
        }
            
    }
    //imprime a frase invertida
    public void imprimir(){
        System.out.println(fraseInv+".");
    }
    

}
