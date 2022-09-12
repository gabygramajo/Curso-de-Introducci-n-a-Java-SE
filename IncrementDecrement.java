public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); //4

        //postfijo: primero accede al dato y luego lo opera
        lives--; //Decremento
        System.out.println(lives); //3

        lives++; //Incremento
        System.out.println(lives); //4

        //Prefijo: accede al dato ya operado.
        //Gana un regalo por ganar una vida
        int gift = 100 + ++lives; //Incremento prefijo
        System.out.println(gift); //105
        System.out.println(lives); //5
    }
}