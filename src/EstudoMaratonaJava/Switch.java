package EstudoMaratonaJava;

public class Switch {
    public static void main(String[] args) {
        //imprima o dia da semana, considereando 1 com domingo.
        byte dia = 10;
        //char,it,bute,short,enum,String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção Invalida");


    /*    if (dia == 1){
            System.out.println("Domingo");
        }else if (dia ==2){
            System.out.println("Segunda");

     */
        }
        char sexo ='M';
        switch (sexo){
            case 'M':
                System.out.println("Homen");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Invalido");
                break;
        }
    }
}
