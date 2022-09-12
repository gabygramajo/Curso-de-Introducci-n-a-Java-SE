public class MathematicOperations {
    public static void main(String[] args) {
        double resultado = 0;
        double a = 2.1;
        double b = 3;
        double e = 2;

        //redondea hacia arriba
        resultado = Math.ceil(a);
        System.out.println(resultado);

        //redondea hacia abajo
        resultado = Math.floor(a);
        System.out.println(resultado);

        //Potencia
        resultado = Math.pow(b,e);
        System.out.println(resultado);

        //Raíz
        double potencia = Math.pow(b,e);
        resultado = Math.sqrt(potencia);
        System.out.println(resultado);

        // y mas operaciones.
    }
}
