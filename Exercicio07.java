import java.util.Scanner;

//7. Crie um programa para exibir o inteiro fornecido pelo usuário na ordem inversa.
 public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero para mostrar o numero invertido");
        String numero = sc.next();
        char cabeca;
        String inverso="";
        for(int i=numero.length()-1;i>=0;i--){
            cabeca = numero.charAt(i);

            inverso += cabeca;
        }
        System.out.println(inverso);

    }
}
