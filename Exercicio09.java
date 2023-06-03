import java.util.Random;
import java.util.Scanner;

//9. Crie um programa para exibir a soma de 20 números usando uma matriz.
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        System.out.println("digite quantas linhas quer na matriz de 1 2,4,5,10,20");
        int linhas = sc.nextInt();

        int coluna=0;
        if(linhas ==1){
            coluna=20;
        }else if (linhas==2){
            coluna=10;
        }else if(linhas==4) {
            coluna = 5;
        }else if(linhas==5){
            coluna=4;
        } else if (linhas==10) {
            coluna=2;
        } else if (linhas==20) {
            coluna=1;
        }else {
            System.out.println("valores invalidos para uma matriz de 20 elementos");
        }
        System.out.println("a partir do valor das suas linhas, para ter 20 elementos, sua coluna sera de: "+ coluna);

        int[][] matriz = new int[linhas][coluna];
        int soma=0;

        int valor=random.nextInt(10);
        for(int i=0;i<linhas;i++){
            for(int j=0;j<coluna;j++){
                System.out.print(matriz[i][j]=valor);
                System.out.print("-");
                valor = random.nextInt(10);
            }
            System.out.println(" ");
        }

        for(int i=0;i<linhas;i++){
            for(int j=0;j<coluna;j++){
                soma += matriz[i][j];
            }
        }
        System.out.println("soma dos 20 numeros sao "+ soma);
    }
}
