package exercicio_lista4;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String b;
        String c;
        System.out.println("Escreva seu nome !");
        c = sc.nextLine();
        System.out.println(c + " Digite sua idade para saber a sua categoria na competiçao de nado.");
        a = sc.nextInt();
        b = (a >= 5 && a <= 7) ? "Voce esta na categoria Infantil " + c : (a >= 8 && a <= 17) ? "Voce esta na categoria Juvenil " + c :
                (a >= 0 && a <= 5) ? "Categoria Inexistente, Voce nao podera competir. " +c : "Voce esta na categoria Senior " +c;
        System.out.println(b);
        sc.close();
    }


}
