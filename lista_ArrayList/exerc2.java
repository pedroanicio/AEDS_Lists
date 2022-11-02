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
public class exerc2 {

    public static void lerProdutos(ArrayList nome, ArrayList valor, ArrayList qtde) {
        String name;
        double val;
        int qtd;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("Digite o nome do produto: (Digite  fim para parar)");
            name = s.nextLine();
            nome.add(name);

            if (!name.equals("fim")) {
                System.out.println("Digite o valor do produto: ");
                val = s.nextDouble();
                valor.add(val);
                System.out.println("Digite a quantidade comprada desse produto: ");
                qtd = s.nextInt();
                qtde.add(qtd);
                s.nextLine();
            }
        } while (!name.equals("fim"));

    }

    public static void imprimir(ArrayList nome, ArrayList valor, ArrayList qtde) {

        double valorCompraFinal = 0, valorTotal, valor1;
        int qtde1;

        for (int i = 0; i < valor.size(); i++) {
            System.out.println(nome.get(i));
            System.out.println("R$" + valor.get(i));
            System.out.println("Quantidade: " + qtde.get(i));

            valorTotal = (double) valor.get(i) * (int) qtde.get(i);
            System.out.println("Valor total: R$" + valorTotal);
            System.out.println("");
            valorCompraFinal = valorCompraFinal + valorTotal;
        }

        System.out.println("Valor total da compra: R$" + valorCompraFinal);

    }

    public static void main(String[] args) {
        ArrayList<String> nome = new ArrayList();
        ArrayList<Double> valor = new ArrayList();
        ArrayList<Integer> qtde = new ArrayList();

        lerProdutos(nome, valor, qtde);
        imprimir(nome, valor, qtde);

    }
}
