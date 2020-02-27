package Ej02;

public class Main {

    static int maximo(int a, int b) {
        int max;
        if (a < b) {
            max = b;
        } else {
            max = a;
        }
        return (max);
    }

    public static void main(String[] args) {
        int max;
        int a, b;
        System.out.print("Introduce un número:: ");
        a = Entrada.entero();
        System.out.print("Introduce otro número:: ");
        b = Entrada.entero();
        max = maximo(a, b);
        System.out.println("El número mayor es: " + max);
    }
}
