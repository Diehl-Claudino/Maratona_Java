package EstudoMaratonaJava;

public class LaçosDeRepetição {
    public static void main(String[] args) {
        // while, do while, for
        int count =0;
        while(count<10){
            System.out.println(count);
            count =count+1;
            // ou count += 1;
            //ou count ++;
            //System.out.println(++count);

        }
        count = 0;
        do{
            System.out.println("dentro do Do-while"+count);
            count++;
        }while (count<10);

        // 3 partes variavel incrementar -
        for(int i=0;i<10;i++){
            System.out.println("For"+i);
        }
    }
}
