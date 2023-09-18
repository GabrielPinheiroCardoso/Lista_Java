/*Problema "soma_vetor"
Faça um programa que leia N números e armazene-os em um vetor. Em seguida:
-Imprimir todos os elementos do vetor
-Mostrar na tela a soma e a média dos elementos do vetor
*/

import java.util.Scanner;
import java.util.Locale;

public class App6{
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtd;
        double media = 0, soma = 0;

        System.out.print("Quantos números serão inseridos?: ");
        qtd = sc.nextInt();

        double[] vet = new double[qtd];

        for(int i = 0; i < qtd; i++){
            System.out.print("valor " + (i + 1) + ": ");
            vet[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.print("Valores = ");
        for(int x = 0; x < qtd; x++){
            System.out.print(String.format("%.1f", vet[x]) + "  ");
            soma += vet[x];
        }
        System.out.println();
        media = soma / qtd;

        System.out.println("Soma = " + String.format("%.2f", soma));
        System.out.println("Média = " + String.format("%.2f", media));
        System.out.println();

        sc.close();
    }
}
