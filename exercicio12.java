package exercicio_lista4;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        String d,e;
        System.out.println("Digite se nome, para iniciarmos ");
        e= sc.nextLine();
        System.out.println(e+" digite o valor do produto. ");
        a= sc.nextDouble();
        System.out.println(e+" digite a forma de pagamento." +
                " 1 = Pagamento a vista.10% de desconto" +
                " 2 = Pagamento via cartão. 5% de desconto." +
                " 3 = Pagamento via credito. dividido de ate 2x o valor da compra.(Sem juros)");
        b= sc.nextDouble();
        d = (b ==1)?"Valor com desconto de 10% ":(b==2)?"Valor com 5% de desconto."
                :(b==3)?" Valor parcelado de 2x":"Digite uma opçao valida.";
        c=(b==1)? a * 0.10 : (b==2)? a*0.05:(b==3)?a/2: 0;
        c= a-c;
        System.out.printf("%s %.2f%n",d,c);
        sc.close();
    }
}
