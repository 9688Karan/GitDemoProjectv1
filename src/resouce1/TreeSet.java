package resouce1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TreeSet {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(55);
		al.add(92);
		al.add(88);
		al.add(78);
		
		
		LinkedHashSet<Integer> tr=new LinkedHashSet<Integer>(al);
		
		System.out.println(tr);
		
		Iterator itr= tr.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		

	}

}
