public class MinMaxAvgArrayElement {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 19 , 103, 51, -1, 21, 52, 11, 14};
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        
        for(int n : arr){
            if(max < n) max = n;
            if(min > n) min = n;
            sum += n;
        }
        double avg = (double) sum / arr.length;

        System.out.println("Maximum number in array : " + max);
        System.out.println("Mininumber in array : " + min);
        System.out.println("Maximum number in array : " + avg);
        
    }
}
