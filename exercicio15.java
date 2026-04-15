package exercicio_lista4;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,b;
        int c,d,e ;
        System.out.println("Informe seu nome para inicializar.");
        a= sc.nextLine();
        System.out.println("Seja bem vindo "+a+" Informe seu dia de nascimento .");
        c= sc.nextInt();
        System.out.println(a+ " informe agora seu mes de nascimento.");
        d= sc.nextInt();
        b=(c>=21 && c <=31 && d == 3||c>=1 && c <=19 && d==4 )?"Seu signo e de aries "  +a+ "tenha um otimo dia."
                :"Seu signo nao e de aries." +a+ " Obrigado por usar nosso programa, tenha um otimo dia.";
        System.out.println(b);
        sc.close();


    }
}
