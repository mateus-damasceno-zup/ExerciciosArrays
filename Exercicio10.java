import java.util.Random;

//10. Criar um vetor A com 10 elementos inteiros.
// Implementar um programa que defina e escreva a média aritmética simples
// dos elementos ímpares armazenados neste vetor.
public class Exercicio10 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int soma=0;
        double media=0;
        Random random = new Random();
        int divisor=0;
        for (int i=0;i<vetor.length;i++){
            vetor[i]=random.nextInt(100);

            if(vetor[i]%2!=0){
                soma+=vetor[i];
                divisor++;
            }
            System.out.println("vetor["+i+"] = "+vetor[i]);
        }

        System.out.println("soma "+ soma);
        System.out.println("numero de impares "+ divisor);

        media=soma/divisor;
        System.out.println("media "+ media);

    }
}
