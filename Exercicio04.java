import java.util.*;

//4. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
// Fazer um algoritmo que calcule e escreva:
//a. a maior e a menor altura do grupo;
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


        ArrayList<ArrayList<String>> dados = new ArrayList<ArrayList<String>>();

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
                System.out.println("dados.get(i).get(j)" + dados.get(i).get(j));
                if (Double.compare(minAltura, Double.parseDouble((dados.get(i).get(1)))) == 0) {
                    minAltura = Double.parseDouble(dados.get(i).get(1));
                    System.out.println(minAltura);
                } else if (Double.compare(minAltura, Double.parseDouble((dados.get(i).get(1)))) <= 0) {
                    minAltura = altura;
                    System.out.println("altura"+altura);
                }else {
                    maxAltura = Double.parseDouble(dados.get(i).get(1));
                    System.out.println(maxAltura);
                }


            }

        }
            //letra A
            System.out.println("maior altura: " + maxAltura);
            System.out.println("menor altura: " + minAltura);

            System.out.println(dados);

    }
}
