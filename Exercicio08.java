import java.util.ArrayList;
import java.util.List;

//. Crie um programa para exibir todos os inteiros dentro do intervalo 100-150
// cuja soma de todos os dígitos é um número par.
public class Exercicio08 {
    public static void main(String[] args) {
        int soma = 0;

        List<Integer> lista = new ArrayList<>();

        for(int i=100;i<150;i++){
            int unidade = i%10;
            int dezena=(i%100)/10;
            int centena = i/100;
            soma = centena + dezena + unidade;
            if(soma%2==0){
                lista.add(i);
            }
        }
        System.out.println(lista);

    }
}