package exercicio_lista4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu numero e verificaremos se esta entre 100 e 200.");
        int a = sc.nextInt();
        String b = (a>=100 && a<=200)?"Esta entre o intervalo.":"Esta fora do intervalo.";
        System.out.println(b);
        sc.close();
    }
}
