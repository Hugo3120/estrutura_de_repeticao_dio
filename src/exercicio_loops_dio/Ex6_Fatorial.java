package exercicio_loops_dio;
/*
* programa para calcular o fatorial de um número inteiro.
* */
import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("O fatorial de : ");
        int fatorial = scan.nextInt();
        int multiplicacao= 1;
        System.out.print(fatorial + " ! = ");
        for(int i = fatorial;i >=1; i--){
            multiplicacao = multiplicacao * i;
        }
        System.out.println( multiplicacao);

    }
}
