/*Problema "crescente"
Leia uma quantidade de duplas de valores inteiros X e Y. Escreva para cada X e Y uma mensagem que 
indique se estes valores foram digitados em ordem crescente ou decrescente> O programa deve finalizar
quando forem digitados dois valores iguais. 
*/

import java.util.Scanner;
import java.util.Locale;

public class App4{
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y;

        do{
            System.out.println("Digite dois números: ");        
            System.out.println();
            System.out.print("X: ");
            x  = sc.nextInt();
            System.out.print("y: ");
            y  = sc.nextInt();
            if(x > y){
                System.out.println("Decrescente!");
                System.out.println();
            }else if(y > x){
                System.out.println("Crescente!");
                System.out.println();
            }
        }while(x != y);

        sc.close();
    }
}
