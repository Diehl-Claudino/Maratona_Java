package EstudoMaratonaJava;

public class ArrayVetores4 {
    public static void main(String[] args) {
        //Array Multidimensionais
        // 1º array meses do ano | 2º array os dias de cada més.
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for (int i=0; i< dias.length; i++){
            for (int j=0; j< dias[0].length;j++){
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("--------------------------");
        for(int[] arrBase: dias){
            for (int num: arrBase){
                System.out.println(num);
            }
        }
    }

}
