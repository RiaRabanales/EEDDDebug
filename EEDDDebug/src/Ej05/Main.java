package Ej05;

public class Main {
// la función es_primo indica si el número pasado es o no primo
// recordamos que un número primo es solo divisible por el mismo y 1

    static boolean es_primo(int num) {
        boolean primo;
        int i;
        primo = true; // suponemos que el número es primo
        i = 2;
        while (i < num && primo == true) { // en realidad basta probar
        // hasta la raíz cuadrada de num
            if (num % i == 0) { // si es divisible
                primo = false; // si hemos entrado aquí el número no es primo
            }
            i++;
        }
        return (primo);
    }

    // esta función devuelve el número de divisores primos del número pasado 
    //como parámetro.
    static int num_divisores(int num) {
        int cont;
        cont = 1; // siempre habrá un divisor seguro, el 1.
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) { // si i es primo y divide a num
                if (es_primo(i)) {
                    cont++; // incrementamos el número de divisores primos
                }
            }
        }
        return (cont);
    }

    public static void main(String[] args) {
        int num, div;
        System.out.print("Introduce numero: ");
        num = Entrada.entero();
        div = num_divisores(num);
        System.out.println("Tiene " + div + " divisores");
    }
}
