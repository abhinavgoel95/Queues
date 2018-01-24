
public class Queue
{
	public Node head;
	public Node tail;
	public int q;
	public Queue(int q)
	{
		this.q = q;
	}
	public void insert(int k, String s) //Adding at beggining always
	{
		Node temp = new Node(k,s);
		if(head == null)
		{
			head = temp;
			temp.next = null;
			tail = temp;
		}
		else
		{
			temp.next = head;
			head = temp;
		}
		tail.next = head;
	}
	public void remove()
	{
		Node pres = head;
		Node prev = null;
		while(pres != null)
		{
			pres.key = pres.key -q;
			if(pres.key >= 0)
			{
				if(prev == null)
				{
					head = pres.next;
				}
				else
				{
					prev.next = pres.next;
				}
			}
			prev = pres;
			pres = pres.next;
			disp();
		}
		System.out.println("All completed");
	}
	public void disp()
	{
		Node temp = head;
		while(temp != tail)
		{
			System.out.println("PID: "+temp.name+ " Time Burst: " + temp.key);
			temp = temp.next;
		}
		System.out.println("PID: "+tail.name+ " Time Burst: " + tail.key);
	}
}
class Node
{
	Node next;
	int key;
	String name;
	public Node(int k, String name)
	{
		key = k;
		this.name = name;
	}
}
