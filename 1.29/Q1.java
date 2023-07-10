public class Q1{
    public static void main(String[] args) {
       // A
        int n=19;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==(n-1)/2||j-i==(n-1)/2||i==(n-1)/4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.print("  ");

        //B
        // int n=19;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1||i==(n-1)/2||j==1||j==2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
                System.out.print("  ");


        //C
        // int n=9;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
                System.out.print("  ");


       // D
        // int n=9;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1||j==1||j==2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
                System.out.print("  ");


       // E
        //   int n=9;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==1||j==2||i==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
                System.out.print("  ");


       // F
        //  int n=9;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||j==1||j==2||i==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
                System.out.print("  ");


        //G
        //  int n=9;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==0||j==n-1&&i>=(n-1)/2||i==(n-1)/2&&j>=(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
                System.out.print("  ");


        //H
        // int n=9;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0||j==n-1||i==(n-1)/2){
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