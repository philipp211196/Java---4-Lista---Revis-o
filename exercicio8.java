package exercicio_lista4;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        String d,e;
        System.out.println("Digite seu nome.");
        e= sc.nextLine();
        System.out.println(e+" Digite sua altura e seu peso.");
        a= sc.nextDouble(); b= sc.nextDouble();
        c =(b/(a*a));
        d = (c<=18.5)?e+" Peso abaixo do padrão":(c<=24.9)?e+" Peso padrão":(c<=29.9)?e+" Excesso de peso"
                :(c<=34.9)?e+" obesidade classe 1 "
                :(c<=39.9)?e+" Obesidade classe 2"
                :e+" Obesidade classe 3 ";
        System.out.println(d);
        sc.close();


    }
}
