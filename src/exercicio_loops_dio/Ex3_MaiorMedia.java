package exercicio_loops_dio;

import java.util.Scanner;
/*
programa para ler 5 números e informar
o maior número e a média deles.
*/
public class Ex3_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        int soma= 0;
        int cont = 0;
        do{
            System.out.print("Número: ");
            numero = scan.nextInt();
            soma = soma + numero;
            if(numero > maior) maior = numero;
            cont = cont + 1;
        }while(cont < 5);
        System.out.println("Maior número é = " + maior);
        System.out.println("A média é = " + (soma)/5);


    }
}
