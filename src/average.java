public class average {
    public static void main(String[] args){
        int arr[]={12,52,8,45,41};
        int sum= 0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
        float average= sum/arr.length;
        System.out.println(average);
    }
}
