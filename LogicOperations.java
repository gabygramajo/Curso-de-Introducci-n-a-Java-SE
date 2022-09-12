public class LogicOperations {
    public static void main(String[] args) {
        int a = 8, b = 5;

        //Operadores de equidad
        System.out.println("a es igual a b? -> " + (a == b));
        System.out.println("a es diferente a b? -> " + (a != b));

        //Operadores Relacionales
        System.out.println("a es mayor que b? -> " + (a > b));
        System.out.println("a es menor que b? -> " + (a < b));
        System.out.println("a es mayor o igual que b? -> " + (a >= b));
        System.out.println("a es menor o igual que b? -> " + (a <= b));

        boolean wifiDisponible = false,
                datosDisponibles = true;

        if(wifiDisponible || datosDisponibles){
            System.out.println("Puedo navegar en la web");
        } else {
            System.out.println("No puedo navegar en la web");
        }

        // Ternary Operator
        String resultado = (wifiDisponible || datosDisponibles)
                ? "Puedo navegar en la web"
                : "No puedo navegar en la web";
        System.out.println(resultado);
    }
}
