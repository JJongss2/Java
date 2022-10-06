public class array {
    public static void main(String[] args) {
        int [][] arr = new int[10][10];
        for (int i = 0; i<10; i++){
            for(int j = 0; j<10;j++){
                arr[i][j] = 10*i + j;
            }
        }

        for (int i = 0; i < arr.length; i ++){
            for(int j = 0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
