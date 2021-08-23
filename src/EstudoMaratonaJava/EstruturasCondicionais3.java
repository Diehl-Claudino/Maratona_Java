package EstudoMaratonaJava;

import java.sql.SQLOutput;

public class EstruturasCondicionais3 {
    public static void main(String[] args) {
        //operador ternario

        double salario = 2000;
        String mensaegemDoar = "Eu vou doar 500 reais";
        String mensagemNaoDoar = "Não Doar";
        String resultado = salario >5000 ? mensaegemDoar : mensagemNaoDoar;
/*
        if(salario >5000){
            resultado = mensaegemDoar;
        }else{
            resultado =mensagemNaoDoar;
        }

 */
        System.out.println(resultado);

    }
}
