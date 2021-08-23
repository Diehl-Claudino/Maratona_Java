package EstudoMaratonaJava;

public class ArrayVetores5 {
    public static void main(String[] args) {

        //int[] arrayNE = {1,2,3};

        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1,2,3}; // arrayNE [1] = array;
        arrayInt[2] = new int[]{6,5,4,3,2,1,};

        /* ou
        int[][] arrayInt ={{0,0}, {1,2,3}, {6,5,4,3,2,1}};
         */

        for(int[] arrayBase: arrayInt){
            System.out.println("\n-----");
            for (int num: arrayBase){
                System.out.println(num + " ");
            }
        }
    }
}
