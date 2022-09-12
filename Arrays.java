public class Arrays {
    public static void main(String[] args) {
        // Array de 1 dimension
        String[] androidVersions = new String[17];
        String days[] = new String[7];

        // Array de 2 dimensiones
        String[][] cities = new String[4][2]; // 4 filas, 2 columnas
        /*
         * +------------------------------+
         * |  Country    |  City          |
         * --------------------------------
         * | México      | CDMX           |
         * | México      | Guadalajara    |
         * | Colombia    | Bogotá         |
         * | Colombia    | Medellín       |
         * +------------------------------+
         * */

        // Array de 3 dimensiones
        int [][][] numbers = new int[2][2][2];

        // Array de 4 dimensiones
        int [][][][] numbers4 = new int[2][2][2][2];

        // Indices
        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);
        System.out.println(androidVersions);

    }
}
