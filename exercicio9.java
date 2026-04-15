package exercicio_lista4;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra maiuscula para ver se é consoante ou vogal.");
        String a = sc.nextLine();
        String b = (a.equals("A"))?"Vogal.":(a.equals("E"))?"Vogal.":(a.equals("I"))?"Vogal."
                :(a.equals("O"))?"Vogal.":(a.equals("U"))?"Vogal.":"Consoante.";
        System.out.println(b);
sc.close();
    }
}
