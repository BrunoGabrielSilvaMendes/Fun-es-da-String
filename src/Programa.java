import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual número é o maior ?");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Número maior = A");
        } else if (b > c) {
            System.out.println("Número maior = B");
        } else
            System.out.println("Número maior = C");

        sc.close();

    }
}