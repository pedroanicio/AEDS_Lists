/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaExerc2.exerc3;

/**
 *
 * @author pedro
 */
public class Pilha3 {

    private char item[];
    private int topo;
    private String palavra = "", inverso = "";

    public Pilha3(int tam) {
        this.item = new char[tam];
        this.topo = -1;
    }

    public void empilha(char caractere) {
        if (this.topo + 1 == this.item.length) {
            System.out.println("A pilha está cheia :(");
        } else {
            this.topo = topo + 1;
            this.item[this.topo] = caractere;
            palavra = palavra + this.item[this.topo];
        }
        
    }
    
    public void inverso(){
         inverso = new StringBuilder(palavra).reverse().toString();
    }
    
    public void imprimePalavra(){
        System.out.println(palavra);
    }
    
    //verifica se é um palindromo
    public boolean verifica(){
        inverso();
        return palavra.equals(inverso);
    }

}
