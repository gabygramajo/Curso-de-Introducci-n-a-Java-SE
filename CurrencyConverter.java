public class CurrencyConverter {
    public static void main(String[] args) {
        double usd = 0;

        usd = converToDolar(200, "MXN");
        System.out.println("Pesos MXN a USD: $" + usd);

        usd = converToDolar(20000, "ARS");
        System.out.println("Pesos ARS a USD: $" + usd);
    }
    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dólares.
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de Moneda: solo acepta MXN, COP y ARS
     * @return quantity Devuelve la cantidad actualizada en USD
     * */
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
