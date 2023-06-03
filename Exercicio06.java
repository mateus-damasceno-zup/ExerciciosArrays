import java.util.ArrayList;
import java.util.List;

//6. Crie um programa para verificar se o inteiro fornecido é um múltiplo de 5 e 7.
public class Exercicio06 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        int numero =0;
        System.out.println("interios divisiveis por 5 e 7 somente");

        while(numero<=1000000000){
            if((numero %5==0) && (numero % 7)==0){
                lista.add(numero);
            }
            numero++;
        }
        System.out.println(lista);
    }
}
