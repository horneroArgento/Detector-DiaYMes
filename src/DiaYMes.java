import java.util.Scanner;

public class DiaYMes {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int dia, mes;

        System.out.println("Ingrese un numero, (del 1 al 7), para determinar el dia de la semana:");
        dia = tec.nextInt();
        System.out.println("Ingrese un numero, (del 1 al 12), para determinar el mes:");
        mes = tec.nextInt();

        if (dia < 1 || dia > 7){
            System.out.println("El numero ingresado no es valido");
        }
        else if(dia == 1){
            System.out.println("El dia es: LUNES");
        }
        else if(dia == 2){
            System.out.println("El dia es: MARTES");
        }
        else if(dia == 3){
            System.out.println("El dia es: MIERCOLES");
        }
        else if(dia ==4){
            System.out.println("El dia es: JUVES");
        }
        else if(dia ==5){
            System.out.println("El dia es: VIERNES");
        }
        else if(dia ==6){
            System.out.println("El dia es: SABADO");
        }
        else{
            System.out.println("El dia es: DOMINGO");
        }

        if(mes < 1 || mes > 12){
            System.out.println("El numero ingresado no es valido");
        }
        else if(mes == 1){
            System.out.println("El mes es: ENERO");
        }
        else if(mes == 2){
            System.out.println("El mes es: FEBRERO");
        }
        else if(mes == 3){
            System.out.println("El mes es: MARZO");
        }
        else if(mes == 4){
            System.out.println("El mes es: ABRIL");
        }
        else if(mes == 5){
            System.out.println("El mes es: MAYO");
        }
        else if(mes == 6){
            System.out.println("El mes es: JUNIO");
        }
        else if(mes == 7){
            System.out.println("El mes es: JULIO");
        }
        else if(mes == 8){
            System.out.println("El mes es: AGOSTO");
        }
        else if(mes == 9){
            System.out.println("El mes es: SEPTIEMBRE");
        }
        else if(mes == 10){
            System.out.println("El mes es: OCTUBRE");
        }
        else if(mes == 11){
            System.out.println("El mes es: NOVIEMBRE");
        }
        else{
            System.out.println("El mes es: DICIEMBRE");
        }

    }
}
