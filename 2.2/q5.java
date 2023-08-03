public class q5{
        
            public int add_no(int num[]){
                int res=0;
                for(int n:num){
                    res=n+res;
                    
                }
                return res;
            }

        
    public static void main(String[] args) {
        q5 obj =new q5();
        // int num[]={1,2,3,4,7};
       int res= obj.add_no(new int []{1,2,3,4,7});
       System.out.println(res);

    }
}