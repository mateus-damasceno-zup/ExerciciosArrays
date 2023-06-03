import java.util.Random;

//12. Ler um vetor A com 20 elementos. Construir dois vetores B e C,
// sendo que nos vetor B e C serão armazenados o valores pares e ímpares de A, respectivamente.
public class Exercicio12 {
    public static void main(String[] args) {
        int[] a = new int[20];
        int contB = 0;
        int contC = 0;
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
            System.out.println("vetor[" + i + "] = " + a[i]);

            if (a[i] % 2 == 0) {
                contB++;
            } else {
                contC++;
            }
        }

        int[] b = new int[contB];
        int[] c = new int[contC];

        int j = 0;
        int k = 0;
        for (int i = 0; i < a.length; i++) {

            if( (a[i] % 2)==0){
              b[j]=a[i];
              j++;
          }else{
              c[k]=a[i];
              k++;
          }

        }
            for (int printB = 0; printB < contB; printB++) {
                System.out.println(" par b[" + printB + "] " + b[printB]);
            }
            for (int printC = 0; printC < contC; printC++) {
                System.out.println("impar c[" + printC + "] " + c[printC]);
            }
    }
}
