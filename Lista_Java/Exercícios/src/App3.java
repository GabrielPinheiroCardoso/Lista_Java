/*
Problema "menor_de_tres"
Fazer um programa para ler três números inteiros. Em seguida, mostrar qual deles é o menor. 
Caso de empate, mostrar apenas umas vez.
*/

import java.util.Scanner;
import java.util.Locale;

public class App3{
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int var1, var2, var3;

        System.out.println("Digite três valores inteiros: ");
        System.out.println();
        System.out.print("Valor 1: ");
        var1 = sc.nextInt();
        System.out.print("Valor 2: ");
        var2 = sc.nextInt();
        System.out.print("Valor 3: ");
        var3 = sc.nextInt();
        System.out.println();

        if(var1 < var2 && var1 < var3){
            System.out.println("O menor valor é " + var1);
            System.out.println();
        }else if(var2 < var3){
            System.out.println("O menor valor é " + var2);
            System.out.println();
        }else{
            System.out.println("O menor valor é " + var3);
            System.out.println();
        }
        
        sc.close();
    }
}

