import java.util.Random;

//11. Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
// Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições.
public class Exercicio11 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Random random = new Random();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0;i<vetor.length;i++){
            vetor[i]=random.nextInt(100);
            System.out.println("vetor["+i+"] = "+vetor[i]);

            if(vetor[i]<=min){
                min=vetor[i];
            }if(vetor[i]>max){
                max=vetor[i];
            }
        }
        System.out.println("menor "+ min);
        System.out.println("maior "+ max);

    }
}