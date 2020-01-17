import java.util.Scanner;

public class JavaVariable {
    public static void main(String args[]) {
        int anosEmDias;
        int qtdAnos, qtdMeses, qtdDias;
        int resto;

        Scanner keyboard = new Scanner(System.in);
        anosEmDias = keyboard.nextInt();

        qtdAnos = anosEmDias / 365;
        resto = anosEmDias % 365;
        qtdMeses = resto / 30;
        qtdDias = resto % 30;

        System.out.println(qtdAnos + " ano(s)");
        System.out.println(qtdMeses + " mes(es)");
        System.out.println(qtdDias + " dias(s)");
    }
}

// public class JavaVariable {
// public static void main(String args[]) {
// int a;
// float b;
// double c;
// String d;
// char e;

// Scanner keyboard;
// keyboard = new Scanner(System.in);

// System.out.println("Digite um valor inteiro");
// a = keyboard.nextInt();

// System.out.println("Valor digitado = " + a);
// }
// }