package exercicio_lista4;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podemos saber seu nome? Digite-o abaixo.");
        String n = sc.nextLine();
        System.out.println("Olá "+n+" Agora digite um numero para ver se é divisivel por 2,3 e 5 ao mesmo tempo.");
        int a = sc.nextInt();
        String b = (a%2==0 && a%3==0 && a%5==0)?"É divisivel":"Não é divisivel.";
        System.out.println(b);
        sc.close();
    }
}
