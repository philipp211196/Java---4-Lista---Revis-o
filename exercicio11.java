package exercicio_lista4;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String d,e ;
        System.out.println("Digite o numero, para verificar se ele e par ou impar");
        a= sc.nextInt();

        d=(a%2==0 && a<=100)?"Este numero e par e menor que 100 ": "este numero e impar ou maior que 100  ";
        System.out.println(d);
        sc.close();
    }
}
