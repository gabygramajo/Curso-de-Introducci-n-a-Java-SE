public class Functions {
    public static void main(String[] args) {
        double y = 3;

        double area = circleArea(y);
        System.out.println(area);

        //Convertir pesos MXN a Dolares.
        System.out.println("Pesos MXN a USD: $" + converToDolar(200, "MXN"));
        System.out.println("Pesos ARS a USD: $" + converToDolar(20000, "ARS"));
    }
    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }
    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }
    public static double sphereVolumen(double r) {
        return (4/3) * Math.PI * Math.pow(r, 3);
    }
    public static double converToDolar(double quantity, String currency) {
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.050 ;
                break;
            case "COP":
                quantity = quantity * 0.00023;
                break;
            case "ARS":
                quantity = quantity * 0.0071;
                break;
        }
        return quantity;
    }
}
