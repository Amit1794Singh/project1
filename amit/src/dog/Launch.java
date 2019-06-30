package dog;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
class Launch
{
public static void main(String[] args) 
	{
		/*ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		al.add(2,70);
		System.out.println(al);
		ArrayList al1=new ArrayList();
		al1.add(80);
		al1.add(60);
		al1.add(90);
		System.out.println(al1);
		al.addAll(al1);
		System.out.println(al);
		al.removeAll(al1);
		System.out.println(al);
		al.add(0.522);
		al.add(23f);
		System.out.println(al);
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al);
		System.out.println(al.isEmpty());
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(30);
		System.out.println(al);
		al.lastIndexOf(30);
		System.out.println(al.lastIndexOf(30));
		//dal.get(40);
		System.out.println(al.get(4));*/
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		System.out.println(ll);
		ll.offer(60);
		System.out.println(ll);
		ll.addFirst(110);
		System.out.println(ll);
		System.out.println(ll.peekLast());
		System.out.println(ll.poll());
		System.out.println(ll);
		PriorityQueue pq=new PriorityQueue();
		pq.add(10);
		pq.add(20);
		pq.add(100);
		pq.add(125);
		pq.add(175);
		pq.add(50);
		pq.add(75);
		pq.add(230);
		System.out.println(pq);
		
	}
}
