import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//3. Peça ao usuário dois números e exiba em ordem decrescente (suponha números diferentes).
public class Exercicio03 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        List<Integer> listaInversa = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<2;i++){
         System.out.println("digite um numero");
        lista.add(sc.nextInt());
        }

        for (int i=(lista.size()-1);i>=0;i--){
            listaInversa.add(lista.get(i));
        }
        System.out.println(listaInversa);
    }
}
