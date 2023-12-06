public class Specific_value {
    public static void main(String[] args){
        int[] arr={4,5,6,9,45,12};
        int n=6;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("Element found");
                break;
            }
            else{
                System.out.println("Element not found");
            }
        }
    }

}
