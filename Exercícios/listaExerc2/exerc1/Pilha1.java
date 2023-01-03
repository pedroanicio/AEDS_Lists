/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaExerc2.exerc1;

/**
 *
 * @author pedro
 */
public class Pilha1 {
    private char item[];
    private int topo;
    private String x = "", y = "";
    private String xy;
    
    public Pilha1(int tam){
        this.item = new char[tam];
        this.topo = -1;
    }
    
    public void empilha(char caractere){
        if (this.topo+1 == this.item.length){
            System.out.println("A pilha está cheia :(");
        } else {
            this.topo = topo + 1;
            this.item[this.topo] = caractere;
            x = x+this.item[this.topo];
        }
    }
    public void imprimeX(){
        System.out.println(x);
    }
    
    public boolean vazia(){
        if(this.topo == -1){
            return true;
        } else { 
            return false;
        }
    }
    public void desempilha(){
        if(vazia()){
            System.out.println("Erro! Lista vazia.");
        } else {
            while(this.topo>=0){
                this.topo = topo - 1; 
                y = y+this.item[this.topo+1];
            }
        }
    }
    public void imprimeY(){
        System.out.println(y);
    }
    
    public void determinaXY(){
        xy = x+y;
        System.out.println(xy);
    }
    

}
