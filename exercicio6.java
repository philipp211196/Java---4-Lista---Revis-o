package exercicio_lista4;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, c, d ;
        String b;

        System.out.println("Digite o primeiro numero, o sinal e o segundo numero, para fazer a conta ");
        a = sc.nextDouble(); b = sc.next(); c = sc.nextDouble();
        d = b.equals("+")? a + c :b.equals("-")? a-c: b.equals("*")?a*c:b.equals("/")?a/c:b.equals("%")?a%c:0;
        System.out.println(d);
        sc.close();
    }
}
