package EstudoMaratonaJava;

public class ArraysVetores2 {
    public static void main(String[] args) {
        /*bute, short, int, long float e double o valor padrão da variavel é 0
        //char  imprime espaço em braco
        // //boolean false
        // //String null

         */

        String[] nomes = new String[3];
        nomes[0] = "Magdiel";
        nomes[1] = "Cristina";
        nomes[2] = "Junior";

        for (int i=0; i<3; i++){
            System.out.println(nomes[i]);
        }
    }
}
