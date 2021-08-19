package estruturas;

import java.util.Scanner;

public class IfElseEncadeado {
    public static void main (String... args){
        long nota;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma nota ");
        nota = leitor.nextLong();
//        if(nota >= 90) {
//            System.out.println("Conceito A");
//        }
//        else {
//            if (nota >= 80)
//                System.out.println("Conceito %s\n", "B");
//        }
//            else{
//            if (nota >= 70)
//                System.out.println("Conceito C\n");
//            else{
//                System.out.println("Conceito R");
//            }
//        }

        if(nota >= 90)
            System.out.println("Conceito A");
        else if (nota >= 80)
            System.out.println("Conceito B\n");
        else if (nota >= 70)
            System.out.println("Conceito C\n");
        else{
            System.out.println("Conceito R");
        }

    }
}
