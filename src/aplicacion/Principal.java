package aplicacion;
import dominio.*;

public class Principal {

    public static void main (String [] args){

        System.out.println("La suma iterativa resulta en: " + MetodosYEjercicios.metodoSumaHastaNIterativo(10));
        System.out.println("La suma iterativa resulta en: " + MetodosYEjercicios.metodoSumaHastaNRecursivo(10));
        System.out.println("2 elevado a 4 es: "+ MetodosYEjercicios.potenciaEnesima(2,4));
        System.out.println("2 elevado a 4 es: "+ MetodosYEjercicios.potenciaEnesimaIterativo(2,4));

        int[] array = {1,3,1,4,5,3,2};
        if (MetodosYEjercicios.buscar(1,array)){
            System.out.println("Numero encontrado");
        }
        else {
            System.out.println("Numero no encontrado");
        }

        if (MetodosYEjercicios.buscarRecursivo(10,array)){
            System.out.println("Numero encontrado");
        }
        else {
            System.out.println("Numero no encontrado");
        }


    }

}
