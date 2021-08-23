package EstudoMaratonaJava;

public class ArrayVetores3 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        //ou
        int[] numeros2 = {1,2,3,4,5};
        //ou
        int[] numeros3 = new int[]{5,4,3,2,1,};

        for (int i = 0; i< numeros3.length; i++){
            System.out.println(numeros3[i]);
        }
        // outra forma de impressão
        //criar variavel local
        for(int num: numeros3){
            System.out.println(num);
        }
    }
}
