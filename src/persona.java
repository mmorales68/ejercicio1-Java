import java.util.Scanner;

public class persona{
    Scanner reader = new Scanner(System.in);
    public int edad;


    public persona() {

    }

    public void setEdad() {
        //Scanner reader = new Scanner(System.in);
        this.edad = reader.nextInt();
    }

    public boolean mayorEdad(){
        return edad >= 18;
    }

    public void numeroMayor(){
        System.out.print("Ingrese el primer numero para validar cual es mayor\n");
        int numero1=reader.nextInt();
        System.out.print("Ingrese el segundo numero para validar cual es mayor\n");
        int numero2=reader.nextInt();

        if(numero1>numero2){
            System.out.print("El numero "+numero1+" es mayor\n");
        }else if(numero2>numero1){
            System.out.print("El numero "+numero2+" es mayor\n");
        }else{
            System.out.print(numero1 +" es igual a "+numero2);
        }
    }

}
