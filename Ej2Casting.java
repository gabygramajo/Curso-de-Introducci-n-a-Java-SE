public class Ej2Casting {
    public static void main(String[] args) {
        char c = 'z'; //conviertelo a int.
        int new_c = c; // casting implícito y esta estimando.
        System.out.println(new_c);

        int i1 = 250; //conviertelo a long y luego de long a short.
        long new_i1  = i1; //casting implícito.
        i1 = (int) new_i1; //casting explícito y exatitud.
        System.out.println(i1);

        double d1 = 301.067; //conviertelo a long.
        long new_d1 = (long) d1; // casting explícito y estimacion. pierde decimales
        System.out.println(new_d1);

        int i2 = 100; //súmale 5000.66 y conviertelo a float.
        float new_i2 = (float) (i2 + 5000.66); //casting explícito y exatitud.
        System.out.println(new_i2);

        int i3 = 737; //multiplícalo por 100 y conviertelo a Byte.
        byte new_i3 = (byte) (737 * 100); //casting explícito y estimación.
        System.out.println(new_i3);

        double d2 = 298.638; //divídelo entre 25 y conviertelo a long.
        long new_d2 = (long) (d2 / 25); //casting explícito y estimación.
        System.out.println(new_d2);
    }
}
