package exercicio_lista4;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora que voce iniciou o jogo e a hora que terminou.");
        int i = sc.nextInt();
        int f = sc.nextInt();
        String a = (i>24 || f>24 || i<0 || f<0)?"Hora invalida":"";
        System.out.println(a);
        int v = (i<f)?f-i:(f+24-i);
        System.out.println("Seu tempo de jogo foi de: "+v);
        sc.close();
    }
}
