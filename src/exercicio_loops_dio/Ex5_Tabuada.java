package exercicio_loops_dio;

import java.util.Scanner;

/*
* Tabuada de qualquer número inteiro entre 1 a 10.
*
*
* */
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada : ");
        int tabuada = scan.nextInt();
        System.out.println("Tabuada de " + tabuada + " é ");
        for(int i = 1;i <= 10; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));

        }

    }
}
