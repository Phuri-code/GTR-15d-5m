import java.util.Arrays;

public class Algorithm_lyna extends Algorithm_V1{
    @Override
    int sum(int[] input) {
        int sum  = 0;

        for (int i = 0; i < 10; i++) {
            sum = sum  + input[i];   
        }
        return sum;
    }
    public static void main(String[] args) {
        Algorithm_V1 al = new Algorithm_lyna();
        System.out.println(Arrays.toString(al.sample));
        System.out.println(al.sum(al.sample));
    }   
    
}