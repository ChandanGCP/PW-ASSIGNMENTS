class q7{
    public static void main(String[] args) {
        int a[][]=new int [2][3];
        a[0][0]=1;
        a[0][1]=4;
        a[0][2]=7;
        a[1][0]=6;
        a[1][1]=2;
        a[1][2]=5;


        for(int n[]:a){
            for(int b:n){
                System.out.println(b);
            }

        }
    }
}