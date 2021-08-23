package EstudoMaratonaJava;

import javax.swing.*;

/*
Crie variaveis para os campos descritos abaixo entre <> e imorima a seguinte menssagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de  <salario>, na data <data>
 */
public class Exercicio1 {
    public static void main(String[] args) {
        String nome = "Magdie";
        String endereco = "rua Chico Mendes 210 Recife-PE";
        double salario = 1200;
        String data = "21/08/21";
        //String relatorio = "Eu " + nome+ " morando no endereço" + endereco+ " confirmo que recebi o salario de: " + salario+ "na data:" + data;

        System.out.println("Eu " + nome+ " morando no endereço" + endereco+ " confirmo que recebi o salario de: " + salario+ "na data:" + data);

    }
}
