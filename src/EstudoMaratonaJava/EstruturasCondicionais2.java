package EstudoMaratonaJava;

import java.sql.SQLOutput;

public class EstruturasCondicionais2 {
    public static void main(String[] args) {
        //idade <15 categoria infantil
        //idadae >=15 && idae <18 categoria juvennil
        //idade >=18 categoria adulto

        int idade =18;
        String categoria;

                if(idade<15){
                    categoria = "Categotia Infantil";
                }else if (idade >=15&& idade <18){
                    categoria = "Categoria Juveni";
                }else {
                    categoria = "Categoria Adulto";
                }
        System.out.println(categoria);
    }
}
