
import java.util.BitSet;
public class BitSetDemo {
	public static void main(String[] args) {
		BitSet bitSet = new BitSet(100);
		System.out.println("default size="+bitSet.size()+" "+bitSet.length());
 
		BitSet bitSet2 = new BitSet(200);
		System.out.println("        size="+bitSet2.size()+" "+bitSet.length());
	}
}
