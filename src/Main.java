import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        persona persona1=new persona();
        Scanner scanner=new Scanner(System.in);

        while(true) {
            System.out.println("""
                    Ingrese una de las siguientes opciones:
                    1 Calculo de la mayoria de edad
                    2 Determinar el numero mayor
                    3 Calcular si un numero es par o impar
                    0 Salir del programa
                    """);
            int seleccion = scanner.nextInt();
            switch (seleccion) {
                case 1:
                    //Ejercicio 1
                    System.out.print("Ingrese su edad\n");
                    persona1.setEdad();

                    if (persona1.mayorEdad()) {
                        System.out.println("Es mayor de edad\n");
                    } else {
                        System.out.println("Es menor de edad\n");
                    }
                    break;

                case 2:
                    //Ejercicio 2
                    persona1.numeroMayor();
                    break;

                case 3:
                    //Ejercicio 3
                    System.out.print("Ingrese un numero para validar que sea par o impar\n");
                    persona1.setNumFavorito();
                    if (persona1.getNumFavorito()) {
                        System.out.print("El numero ingresado es es par \n");
                    } else {
                        System.out.print("El numero ingresado es impar \n");
                    }
                    break;
            }
            if(seleccion==0){break;}
        }
        scanner.close();
    }
}

