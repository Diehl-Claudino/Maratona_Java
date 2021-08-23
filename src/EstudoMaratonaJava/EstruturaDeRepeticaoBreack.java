package EstudoMaratonaJava;

public class EstruturaDeRepeticaoBreack {
    public static void main(String[] args) {
        //imprima os primeiros 25 numeros de um valor
        int valorMax = 50;
        for (int i=0;i<=valorMax; i++){

            if(i>25){
                break;
            }
            System.out.println(i);
        }
    }
}
