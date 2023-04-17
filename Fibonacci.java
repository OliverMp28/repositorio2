public class Fibonacci {
    int posicionFibonacci(int base, int n){
        int serie=1;
        int r=2;
        int resultado=0;


        if(n>1){
            base = (int) (base*1.61803);
            base = base+((int) (base*1.61803));

            posicionFibonacci(base, n-1);

//            r=   posicionFibonacci(n--)+ r+((int) (2*1.61803));
            resultado = base;
        }
        return resultado;
    }

    long jp(int n){
        if (n>1)
            return jp(n-1) + jp(n-2);
        else if(n==1)
            return 1;
        else return 0;
    }
}
