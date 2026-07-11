class OddArray{
    public static void main(String[] args) {
        int arr[]=new int[15];
        int index=0;
        for(int i=1; index<15; i+=2){
            arr[index]=i;
            index++;
        }
        for(int i=0; i<15; i++){
            System.out.print(arr[i]+" ");
        }
    }
}