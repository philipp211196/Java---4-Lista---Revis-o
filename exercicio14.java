package exercicio_lista4;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo.");
        String a = sc.nextLine();
        System.out.println("Olá "+a+" digite seu salario para que possamos calcular o imposto dele.");
        System.out.println("Acima de R$2000,00 sera 10%, acima de R$5000,00 20% de imposto.");
        double s = sc.nextInt();
        if (s<=2000){
            System.out.println("O seu salario esta isento de impostos. "+a);
        }else {
        double c = (s>=2002 && s<=5000)?s-(s*0.1):s-(s*0.2);
        System.out.println(a+" O valor do seu salario com imposto sera de: "+c);}

        sc.close();
    }
}
