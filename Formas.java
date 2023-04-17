public class DibujarFormas {
    static void rect(int a, int b){
        for(int i=0; i<a; i++) {
            System.out.print("* ");
            for(int j=0; j<b-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void triang(int a){
        for(int i=0; i<a; i++){
            System.out.print("* ");
                for(int j=0; j<i; j++){
                    System.out.print("* ");
                }
            System.out.println();
        }
    }

    static void palind(String palabra){

    }

    public static void main(String[] args) {
        triang(8);
    }
}
