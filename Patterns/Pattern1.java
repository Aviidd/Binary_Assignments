public class Pattern1{
    // in this pattern we are printing a pattern which is a hollow in from middle and have boundaries on its outside.
    public static void main(String[] args) {
        int n=10;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}