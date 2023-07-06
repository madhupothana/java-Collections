import java.util.*;
import java.util.LinkedList;
abstract class List{
	public abstract void Display(LinkedList<String> L1);
}
class Test extends List{
	@Override
	public void Display(LinkedList<String> L1) {
		for(int i=0;i<L1.size();i++) {
			System.out.println(L1.get(i));
		}
	}
}
class LinkedListEx{
	public static void main(String[] args) {
		LinkedList<String> L1=new LinkedList<>();
		L1.add("madhu");
		L1.add("Pavani");
		L1.add("Jaanu");
		L1.addFirst("Varshitha");
		L1.add(2,"Fatso");
		Collections.reverse(L1);
		//L1.remove(2);
		Test l1=new Test();
		//l1.Display(L1);
		Iterator<String> l=L1.iterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
	}
}
