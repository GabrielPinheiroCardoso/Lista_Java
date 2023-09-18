/*
Problema "idades"
Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mesnsagem com os
nomes e a idade média entre essas pessoas, com uma casa decimal.
*/

import java.util.Scanner;
import java.util.Locale;

public class App2{
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome1, nome2;
        double idade1, idade2;

        System.out.println("Dados da primeira pessoa:");
        System.out.println();
        System.out.print("Nome: ");
        nome1 = sc.nextLine();
        System.out.print("Idade: ");
        idade1 = sc.nextDouble();
        System.out.println();

        sc.nextLine();

        System.out.println("Dados da segunda pessoa:");
        System.out.println();
        System.out.print("Nome: ");
        nome2 = sc.nextLine();
        System.out.print("Idade: ");
        idade2 = sc.nextDouble();

        System.out.println();
        System.out.println("A idade média entre " + nome1 + " e " + nome2 + " é de " + String.format("%.1f", (idade1 + idade2) / 2) + " anos.");
        System.out.println();

        sc.close();
    }
}

