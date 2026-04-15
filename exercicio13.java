package exercicio_lista4;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d ;
        String s;

        System.out.println("Digite um numero para saber se ele e mágico.");
        a= sc.nextInt();
        b=a/100; c = a%100;
        d=(b+c)*(b+c);
        s=(d==a)?"Este e um numero magico":"nao e um numero magico ";

        System.out.println(s + d);
        sc.close();
    }
}
