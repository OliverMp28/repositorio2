public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Recursividad recursivo = new Recursividad();
//        recursivo.metodoA();

        System.out.println(recursivo.factorial(9));


        System.out.println("----------------------------------");
        Fibonacci f = new Fibonacci();
        System.out.println(f.posicionFibonacci(2,5));
        System.out.println(f.jp(2));
    }
}
