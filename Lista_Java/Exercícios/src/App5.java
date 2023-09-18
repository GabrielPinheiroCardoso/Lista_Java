/*Problema "soma_impares"
Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos números
ímpares entre eles.
*/

import java.util.Scanner;
import java.util.Locale;

public class App5{
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y, aux, total = 0;

        System.out.println("Digite dois números: ");        
        System.out.println();
        System.out.print("X: ");
        x  = sc.nextInt();
        System.out.print("Y: ");
        y  = sc.nextInt();
        if(x > y){
            aux = x;
            x = y;
            y = aux;
        }
        for (int i = x + 1; i < y; i++) {
            if (i % 2 != 0) {
                total += i;
            }
        }
        System.out.println();
        System.out.println("Soma dos ímpares: " + total);
        System.out.println();

        sc.close();
    }
}
