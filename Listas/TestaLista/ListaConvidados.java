/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestaLista;

/**
 *
 * @author 0072383
 */
public class ListaConvidados {
    static String nome[];
    static int primeiro, ultimo;
    
    public static void Lista(int tam){
    nome = new String[tam];
    primeiro = 0;
    ultimo = primeiro;
    }
    
    public static boolean vazia(){
        return primeiro==ultimo;
    }
    
    public static void inserir(String n){
        if(ultimo>=nome.length){
            System.out.println("Erro: Lista está cheia");
            return;
        }else{
            nome[ultimo] = n;
            ultimo = ultimo+1;
        }
    }
    public static void imprimir(){
        for(int i = primeiro; i < ultimo;i++){
            System.out.println(nome[i]);
        }
    }
    public static void pesquisar(String pesquisa){
        int qtde=0;
        if(vazia()){
            System.out.println("Erro! Lista vazia.");
        }else{           
            for(int i = 0;i<nome.length;i++){
               if(nome[i] == pesquisa){
                    qtde++;
                } 
            }
            
        }
        System.out.println("Quantidade de nomes iguais: "+qtde);
    }
    public static void retirar(String retira){
        if(vazia()){
            System.out.println("Erro! Lista vazia.");

        }else{
            for(int i = 0;i<nome.length;i++){
                if(nome[i] == retira){
                    nome[i] = "Excluido";
                }
                    
            }
        }
        
        
        
        
    }
    
    
    

}
