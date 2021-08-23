package EstudoMaratonaJava;

public class Exercicio3 {
    public static void main(String[] args) {
        //-------------Estrutura Condicional com Swich-------------------------
        //Dados os valores de 1 a 7, imprima se é dia util ou final de semana.
        //considerando 1 como Domingo.
        byte dia =7;
        switch (dia){
            case 1:
            case 7:
                System.out.println("FDS");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
