/*Problema "retângulo
Fazer um programa para ler medidas da base e altura de um retângulo. Em seguida, mostrar o valor da área, 
perímetro e diagonal deste retângulo, com quatro casas decimais."*/

import java.util.Scanner;
import java.util.Locale;

public class App{
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double base, altura, area, perimetro, diagonal;

        System.out.print("Valor da base do retângulo: ");
        base = sc.nextDouble();
        System.out.print("Valor da altura do retângulo: ");
        altura = sc.nextDouble();

        area = base * altura;
        perimetro = (base * 2) + (altura * 2);
        diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));

        System.out.println();
        System.out.println("Valor da área do retângulo: " + String.format("%.4f", area));
        System.out.println("Valor da perímetro do retângulo: " + String.format("%.4f", perimetro));
        System.out.println("Valor da diagonal do retângulo: " + String.format("%.4f", diagonal));
        System.out.println();

        sc.close();
    }
}
