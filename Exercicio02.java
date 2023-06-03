import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.DoubleStream;

//2. Escreva um programa para inserir um elemento (posição específica) em uma lista.

public class Exercicio02 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int entrada = 0;
        int posicao = 0;

       DoubleStream entrada21 = random.doubles(1.71,3.15);
        while (lista.size() < 10) {
            System.out.println("digite um numero para a lista");
            //entrada = sc.nextInt();
            lista.add(random.nextInt(30));
        }
        System.out.println("lista de elementos");
        System.out.println(lista);

        System.out.println("qual elemento voce quer adicionar? ");
        entrada = sc.nextInt();

        System.out.println("em qual posicao voce quer adicionar?\n" +
                "caso a posicao nao exista, sera adicionado no final da lista ");
        posicao = sc.nextInt();

        if (posicao>0 && posicao < lista.size()) {

            lista.add((posicao - 1), entrada);
        }else{

            lista.add(entrada);
            System.out.println("elemento adicionado no final da lista, posicao inválida");
        }

            System.out.println("lista atualizada\n" + lista);

        }

}