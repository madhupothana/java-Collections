package Collections;
import java.util.*;
public class IteratorEx {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(10);
		Iterator<Integer> d=a.iterator();
		while(d.hasNext()) {
			System.out.print(d.next()+" ");
		}
	}

}
