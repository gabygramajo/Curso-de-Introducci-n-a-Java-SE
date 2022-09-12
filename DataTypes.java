public class DataTypes {
    public static void main(String[] args) {

        //Números enteros
        int n = 1234567890;
        long nL = 12345678901L;

        //Números con decimales
        double nD = 123.456;
        float nF = 123.456F;

        //Utilizando var - disponible desde java10
        var salary = 1000; //int
        //pension 3%
        var pension = salary*0.03; //double
        var totalSalary = salary - pension; //double
        var booleano = true;
        boolean isTrue = false;
        var letraA = 'A';
        char letraB = 'B';

        System.out.println(booleano);
        System.out.println(isTrue);
        System.out.println(letraA);
        System.out.println(letraB);

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Anahí Salgado";
        System.out.println(
                "Employee: " + employeeName + ".\nSalary: $" + totalSalary
        );
    }
}
