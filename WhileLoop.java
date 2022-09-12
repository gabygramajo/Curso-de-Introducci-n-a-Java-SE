public class WhileLoop {
    static boolean isTurnOnLight = false;
    public static void main(String[] args) {
        int i = 0;
        turnOnOffLight();

        while (isTurnOnLight && i <= 10) {
            printSOS();
            i++;
        }
    }
    public static void printSOS() {
        System.out.println(". . . _ _ _ . . .");
    }
    public static boolean turnOnOffLight() {
        isTurnOnLight = (isTurnOnLight) ? false : true;
        return isTurnOnLight;
    }
}
