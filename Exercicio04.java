import javax.sound.midi.Soundbank;
import java.util.*;

//4. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
// Fazer um algoritmo que calcule e escreva:
//a. a maior e a menor altura do grupo; ok
//b. média de altura dos homens;
//c. o número de mulheres.
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String sexo;

        double alturaMinima = 1.00;
        double alturaMaxima = 2.50;
        double altura = 0;

        double minAltura = Double.MAX_VALUE;
        double maxAltura = Double.MIN_VALUE;

        int contHomens=0;
        double somaHomens= 0.0;

        int contMulheres=0;

        ArrayList<ArrayList<String>> dados = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            altura = alturaMinima + (random.nextDouble() * (alturaMaxima - alturaMinima));

            int sexoInt = random.nextInt(2);

            if (sexoInt == 0) {
                sexo = "M";
            } else {
                sexo = "F";
            }


            dados.add(i, new ArrayList<>(Arrays.asList(sexo)));
            dados.get(i).add(String.valueOf(new Double(altura)));


        }

        for (int i = 0; i < dados.size(); i++) {
            for (int j = 0; j < 2; j++) {

                //a) maior  menor altura
                if( Double.compare(minAltura, Double.parseDouble(dados.get(i).get(1)))==1){
                     minAltura = Double.parseDouble(dados.get(i).get(1));
                } if( Double.compare(maxAltura,Double.parseDouble(dados.get(i).get(1)))==-1){
                    maxAltura = Double.parseDouble(dados.get(i).get(1));
                }
                //b)media de altura dos homens

                if(dados.get(i).get(j).equalsIgnoreCase("m")){
                    contHomens++;
                    somaHomens += Double.parseDouble(dados.get(i).get(1));

                }
                //c)numero de mulheres
                if(dados.get(i).get(j).equalsIgnoreCase("f")){
                    contMulheres++;

                }



            }

        }
            //letra A
            System.out.printf("maior altura: %.3f", maxAltura);
            System.out.println();
            System.out.printf("menor altura: %.3f", minAltura);
            System.out.println();
            //letra B
            System.out.printf("media altura dos homens:  %.3f", somaHomens/contHomens);
            System.out.println();
            //letra C
            System.out.println("numero de mulheres "+ contMulheres);
            System.out.println(dados);

    }
}
