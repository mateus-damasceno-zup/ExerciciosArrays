//1. Escreva um programa para remover um elemento específico de uma lista.


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int entrada=0;
        while (lista.size()<10) {
            System.out.println("digite um numero para a lista");
            //entrada = sc.nextInt();
            lista.add(random.nextInt(30));
        }
        System.out.println("lista de elementos");
        System.out.println(lista);

        System.out.println("qual elemento voce quer remover? ");
        entrada=sc.nextInt();

        if(lista.contains(entrada)){
            lista.remove(entrada);

        }




        System.out.println(lista);
    }
}
