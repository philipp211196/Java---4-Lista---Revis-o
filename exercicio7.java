package exercicio_lista4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para vermos se é multiplo de 7 ou 11.");
        int a = sc.nextInt();
        String b = (a%7==0)?"Multiplo de 7":(a%11==0)?"Multiplo de 11":"Não é multiplo de nenhum.";
        System.out.println(b);
        sc.close();
    }
}
