/*Problema "diagonal_negativos"
Fazer um programa para ler um número inteiro N (Máximo = 10) e uma matriz quadrada de ordem N contendo números inteiros.
Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz.
*/

import java.util.Scanner;
import java.util.Locale;

public class App7{
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int ordem, qtd_negativos = 0;

        System.out.print("Qual a ordem da matriz?: ");
        ordem =  sc.nextInt();
        int[][] matriz = new int[ordem][ordem];
        System.out.println();

        for(int x = 0; x < ordem; x++){
            for(int y = 0; y < ordem; y++){
                System.out.print("Valor[" + x + "][" + y + "]: ");
                matriz[x][y] = sc.nextInt();
                if(matriz[x][y] < 0){
                    qtd_negativos++;
                }
            }
        }
        System.out.println();
        System.out.println("MATRIZ: ");
        System.out.println();
        for(int x = 0; x < ordem; x++){
            for(int y = 0; y < ordem; y++){
                System.out.print(matriz[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Diagonal principal: ");
        for(int x = 0; x < ordem; x++){
            System.out.print(matriz[x][x] + "  ");
        }
        System.out.println();
        System.out.println("Quantidade de negativos: " + qtd_negativos);
        System.out.println();

        sc.close();
    }
}
