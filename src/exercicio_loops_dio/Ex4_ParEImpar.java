package exercicio_loops_dio;
/*
Programa para pedir N números inteiros,
e calcular e mostrar a quantidade de
números pares e impares.
*/

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.print("Quantidade de numeros");
        quantNumeros = scan.nextInt();
        int cont = 0;
        do{
            System.out.print("Numeros: ");
            numero = scan.nextInt();
            if(numero%2 ==0)quantPares++;
            else quantImpares++;
            cont++;
        }while (cont<quantNumeros);
        System.out.println("Quntidade Par: " + quantPares);
        System.out.println("Quntidade Impar: " + quantImpares);
    }
}
