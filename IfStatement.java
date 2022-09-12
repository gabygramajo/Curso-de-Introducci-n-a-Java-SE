public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            fileSended++;
            System.out.println("Archivo Enviado");
        } else {
            System.out.println("Por favor enciende tu Bluetooth para iniciar la transferencia");
        }
        System.out.println("Archivos enviados: " + fileSended);
    }
}
