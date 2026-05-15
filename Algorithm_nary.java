
import java.util.Arrays;

public class Algorithm_nary extends Algorithm_V1 {

    @Override
    double average(int[] input) {
        double sum = 0;
        for (int i = 0; i < input.length; i++){
            sum = sum + input[i];
        } 
        double avg = sum / input.length;
        return avg;
    }


        
    public static void main(String[] args) {
        Algorithm_V1 al = new Algorithm_nary();
        System.out.println(Arrays.toString(al.sample));
        System.out.println(al.average(al.sample));

    }

    @Override
    int sum(int[] input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sum'");
    }

    
}
