public class ForLoop {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();

        for (int i = 1; i <= 10; i++) {
            printSOS(i);
        }
    }
    public static void printSOS(int index) {
        System.out.println(index + " . . . _ _ _ . . .");
    }
    public static boolean turnOnOffLight() {
        isTurnOnLight = (isTurnOnLight) ? false : true;
        return isTurnOnLight;
    }
}
