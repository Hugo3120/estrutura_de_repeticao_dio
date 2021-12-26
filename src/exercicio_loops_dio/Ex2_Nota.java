package exercicio_loops_dio;

import java.util.Scanner;

/*
 * Objetivo do programa e pedir uma nota de 0 a 10,
 * e mostrar uma msg caso o valor seja inválido e que continue
 * pedindo até que o usuário informe um valor válido.
 * */
public class Ex2_Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nota;
        System.out.print("Nota: ");
        nota = scan.nextInt();
        while(nota<0|| nota>10){
            System.out.println("Nota Inválida! Digite novamente");
            nota = scan.nextInt();

        }



    }
}
