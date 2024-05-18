//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Ejercicio 1
        System.out.print("Ingrese su edad\n");
        persona persona1=new persona();
        persona1.setEdad();

        if(persona1.mayorEdad()){
            System.out.println("Es mayor de edad\n");
        }else{
            System.out.println("Es menor de edad\n");
        }

        //Ejercicio 2
        persona1.numeroMayor();

    }
}

