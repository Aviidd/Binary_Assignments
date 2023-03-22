public class Patterns {
    // in this we are going to print the pattern PRASHANT SAINI
    public static void main(String[] args) {
        int n= 10;
        //for P
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(j==0 || i==0 && j<=(n-1)/2 || j==(n-1)/2 && i<=(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        //for R
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(j==0 || i==0 && j<= (n-1)/2 || i==(n-1)/2 && j<=(n-1)/2 || i+j==(n-1)/2 || j==(n-1)/2 && i>=(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        //for A
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || i==(n-1)/2 || j==n-1 || j==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //for S
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==0 && j<= (n-1)/2 || j==0 && i<(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i> (n-1)/2 || i==n-1 && j<=(n-1)/2 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //for H
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0 || i==(n-1)/2 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //for A
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || i==(n-1)/2 || j==n-1 || j==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //for N
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(j==0 || i==j || j==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        //for T
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //for S
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==0 && j<= (n-1)/2 || j==0 && i<(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i> (n-1)/2 || i==n-1 && j<=(n-1)/2 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //for A
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || i==(n-1)/2 || j==n-1 || j==0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //for I
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==(n-1)/2 || i==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println(" ");

        //for N
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(j==0 || i==j || j==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //for I
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==(n-1)/2 || i==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println(" ");
    
    }
}
