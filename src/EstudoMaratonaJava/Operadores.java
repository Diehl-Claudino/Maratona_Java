package EstudoMaratonaJava;

public class Operadores {
    public static void main(String[] args) {
        // + - / *
        int n1 = 10;
        int n2 = 20;
        int resultado = n1+n2;
        System.out.println("Valor "+resultado);

        //% resto da divisão
        int resto = 21 % 2;
        System.out.println(resto);

        //Operadores logicos retornam valores booleanos
        //< > , <= >= , ==(comparaçao, não pode ser utilizado = pois ele é uma atribuição),  !=(diferente)
        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMenorQueVinte = 10<20;
        boolean isDezIgualVinte = 10 == 10;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 !=10;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDez);

        //Operadores Logicos
        //e && (and) "Grande e Bonito, Banana e Morando"
        //ou || (or) "Grande ou Bonito.
        // negação ! (logical not).

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroMAiorQueTrinta: " +isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroMenorQueTrinta: " +isDentroDaLeiMenorQueTrinta);

        //CC Conta Corrente | CP Conta Poupansa para comprar PlayStation
        double valorTotalCC = 200;
        double valorTotalCP = 3000;
        float valorPlaysatacion = 5000F;
        boolean isPlaystation5Compravel = valorTotalCC > valorPlaysatacion || valorTotalCC >valorPlaysatacion;
        System.out.println("Playstation 5 Compravel? "+isPlaystation5Compravel);

        //Operadores de Atribução
        // = += -= *= /= %=
        double bonus = 1800;
        bonus = bonus + 1000;
        bonus -=100;
        bonus *= 2;
        bonus %=2;
        System.out.println("Bonus agora é de: "+bonus);

        //
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        System.out.println(contador);
        int contador2 = 0;
    }
}
