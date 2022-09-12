public class NamingJava {
    public static void main(String[] args) {
        // Formas correctas de declarar variables
        int celphone= 333377777;
        int celPhone= 44449999;
        System.out.println(celphone);
        System.out.println(celPhone);

        String $countryName = "Spain";
        String _backgroundColor = "Green";
        String currency$ = "MXN";
        String background_color = "Blue";

        // Formas incorrectas de declarar variables
        /*
        String nombre-apellido;
        int 1erNombre;
        */

        // Las mayúsculas son para la constantes.
        int POSITION = -5;
        int MAX_WIDTH = 9999;
        int MIN_WIDTH = 100;

        //Lower Calmer Case
        String fullName = "Juan Alberto Dominguez De la vega";
        int sizeInCentimeters = 20;
    }
}
