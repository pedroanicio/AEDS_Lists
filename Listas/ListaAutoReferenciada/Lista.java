/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaAutoReferenciada;

import javax.swing.JOptionPane;

/**
 *
 * @author 0072383
 */
public class Lista {
    private static class Celula{
        Object item; // aceita string, int, double, float
        Celula prox;
    
    }
    private Celula primeiro, ultimo, pos;
    public Lista(){
        this.primeiro = new Celula();
        this.pos = this.primeiro;
        this.ultimo = this.primeiro;
        this.primeiro.prox = null;
    }
    public void insere(Object x){
        this.ultimo.prox = new Celula();
        this.ultimo = this.ultimo.prox;
        this.ultimo.item = x;
        this.ultimo.prox = null;
    }
    public void imprime (){
        Celula aux = this.primeiro.prox;
        while(aux != null){
            System.out.println(aux.item.toString());
            aux = aux.prox;
        }
    }
    public boolean vazia(){
        return (this.primeiro == this.ultimo);
    }
    public Object pesquisa(Object chave){
        int qtde = 0;
        Celula aux = this.primeiro.prox;
        if(vazia()){
            return null;
        }else{
            while(aux != null){
                if(chave == aux.item){
                    qtde++;
                    aux = aux.prox;
                }else{
                    aux = aux.prox;
                }
            }
        }
        return qtde;
    }
    public Object retirar(Object remove) throws Exception{
        Celula aux = this.primeiro;
        if(vazia() || (remove == null)){
            throw new Exception ("Erro, lista vazia ou chave inválida");
        }
            
//            while(aux != null){
//                if(remove.equals(aux.item)){
//                    aux.item = 0;
//                    aux = aux.prox;
//                }else{
//                    aux = aux.prox;
//                }       
//            }
            while(aux.prox != null && !aux.prox.item.equals(remove)){
                aux = aux.prox;
            }
            if(aux.prox == null){
                return null;
            }
            Celula q = aux.prox;
            Object item =  q.item;
            aux.prox = q.prox;
            if(aux.prox == null){
                this.ultimo = aux;
            }
                
        return item;
    }
    
}
