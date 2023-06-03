import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

//5. Criar um programa que calcule a média de salários de uma empresa,
// pedindo ao usuário a grade de funcionários e os salários,
// e devolvendo a média salarial.
public class Exercicio05 {
    public static void main(String[] args) {
        Map<String,Double> grade = new HashMap<>();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        double salMin=1000;
        double salMax=20000;
        System.out.println("grade de funcionarios");
        double salario1 =  salMin + (random.nextDouble() * (salMax - salMin));
        double salario2 =  salMin + (random.nextDouble() * (salMax - salMin));
        double salario3 =  salMin + (random.nextDouble() * (salMax - salMin));
        double salario4 =  salMin + (random.nextDouble() * (salMax - salMin));

        grade.put("Mateus",salario1);
        grade.put("asdf",salario2);
        grade.put("dfasdf",salario3);
        grade.put("sfgasdkj",salario4);

        double soma=0;
        double divisor =0;
        int i=0;
        for (String key : grade.keySet()) {
            double salario = grade.get(key);
            soma = soma + salario;
            divisor++;
            System.out.println(key + " " + salario);
        i++;
        }
        System.out.println("soma "+soma);
        System.out.println(divisor);
        double media = soma/divisor;
        System.out.println("media "+ media);

    }
}
