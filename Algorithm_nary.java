
import java.util.Arrays;

public class Algorithm_nary extends Algorithm_V1 {

    @Override
    int sum() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sum'");
    }

    @Override
    double average() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'average'");
    }

    public static void main(String[] args) {
        Algorithm_V1 al = new Algorithm_nary();
        System.out.println(Arrays.toString(al.sample));
        System.out.println(al.average(al.sample));

    }

    
}
