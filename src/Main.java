public class Main {

    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 10;

        int resultado = suma(numero1, numero2);

        mostrarResultado(resultado);
    }

    private static void mostrarResultado(int resultado) {
        System.out.println("Resultado final: " + resultado);
    }

    public static int suma(int x, int y) {
        int resultadoSuma = x + y;
        return resultadoSuma;
    }
}
