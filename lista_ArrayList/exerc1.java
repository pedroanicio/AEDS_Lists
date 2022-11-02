/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_ArrayList;



import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 0072383
 */
public class exerc1 {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList(); 
        int idade, maiorIdade=0, menorIdade=150, qtdeMaior=0, qtdeMenor=0;
        Scanner s = new Scanner(System.in);
        
        do{
            System.out.println("Digite a idade: ");
            idade = s.nextInt();
            if(idade>=0){
                numeros.add(idade);
                
                if(idade>=maiorIdade){
                    maiorIdade = idade;
                }
                if(idade<=menorIdade){
                      menorIdade = idade;
                }
                
            }
        }while(idade>=0);
        
        for(int i=0;i<numeros.size();i++){
            if(numeros.get(i)>=18){
                qtdeMaior++;
            }else{
                qtdeMenor++;
            }
            
        }
        
        
        System.out.println("Quantidade de idades digitadas: "+numeros.size());
        System.out.println("Quantidade de idades acima de 18: "+qtdeMaior);
        System.out.println("Quantidade de idades abaixo de 18: "+qtdeMenor);
        System.out.println("Maior idade: "+maiorIdade);
        System.out.println("Menor Idade: "+menorIdade);
        
        
        
        
    }
        
}
