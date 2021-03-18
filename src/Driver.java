import java.util.ArrayList;
import java.util.Collections;


public class Driver {
    public static void main (String []args) {
        ArrayList<String> myranda = new ArrayList<>();
        myranda.add("a");
        myranda.add("bb");
        myranda.add("cc");
        myranda.add("ddd");
        myranda.add("eee");

        StringLengthComparator compare= new StringLengthComparator();
        Collections.sort(myranda,compare);
    }
}
