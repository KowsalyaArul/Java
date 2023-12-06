public class ARRAY {
    public static void main(String[] args){
        int[][] arr={
                        { 1,8,8,6},
                        { 5,8,6,2},
                        {4,7,10,45},
                        {84,7,95,100}
                     };
        for(int i =0;i<arr.length;i++){
            for(int j= 0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
