class Setbitfind{
    public static void main(String[] args) {
        //1st method
        int    count=0;
        int n=34;
        System.out.println(n);
        
        System.out.print("Numbers of sets bit in a :");
        System.out.println(Integer.bitCount(n));
        
        //Second method
        //Brian Kernighan’s Algorithm (n & (n - 1))
        while(n>0){
            n=n & (n-1);
        
        count++;
        }
        
        System.out.print("Numbers of sets bit in n by  2nd Method:  ");
        System.out.print(count);
        
        
    }
}