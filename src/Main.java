public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int resultado = suma(a, b);

        System.out.println("El resultado es: " + resultado);
    }

    public static int suma(int x, int y) {
        int res = x + y;
        return res;
    }
}
