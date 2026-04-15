package exercicio_lista4;

import java.util.Scanner;

public class exercicio3 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l1,l2,l3;
    String a;
    System.out.println("Digite os 3 numeros para vermos se formam um triangulo.");
    l1 = sc.nextInt();
    l2 = sc.nextInt();
    l3 = sc.nextInt();
    a=(l1==l2 && l1==l3)
            ?"Estes numeros formam um triangulo Equilátero.":(l1==l2 || l1==l3 || l2==l3)
            ?"Estes numeros formam um triangulo Isosceles":"Estes numeros formam um triangulo Escaleno.";
    System.out.println(a);
    sc.close();

}}

