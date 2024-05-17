public class Exercicio1 {
    public static void main(String[] args) {
        Progressao aritmetica = new ProgressaoAritmetica(0, 2);
        System.out.println("Progressão Aritmética:");
        for (int i = 0; i < 10; i++) {
            System.out.print(aritmetica.proximo() + " ");
        }
        System.out.println();
        aritmetica.reset();

        Progressao geometrica = new ProgressaoGeometrica(1, 2);
        System.out.println("Progressão Geométrica:");
        for (int i = 0; i < 10; i++) {
            System.out.print(geometrica.proximo() + " ");
        }
        System.out.println();
        geometrica.reset();

        Progressao fibonacci = new ProgressaoFibonacci();
        System.out.println("Progressão Fibonacci:");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci.proximo() + " ");
        }
        System.out.println();
        fibonacci.reset();
    }
}
