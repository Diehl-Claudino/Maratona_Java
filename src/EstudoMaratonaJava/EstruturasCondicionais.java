package EstudoMaratonaJava;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        // IF (se) | ELSE (senao)
        int idade = 23;
        boolean isAutorizadoComprarBebibda = idade >=18;
        // operador de negação !


        if(isAutorizadoComprarBebibda){
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não autorizado a comprar bebida Alcólica");
        }
        if(isAutorizadoComprarBebibda){
            System.out.println("Não autorizado a comprar bebida Alcólica");
        }
        boolean c=false;
        if(c==true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
    }
}
