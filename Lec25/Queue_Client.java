package Lec25;

public class Queue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Queue q = new Queue();
//        System.out.println(q.Dequeue());
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Display();
       System.out.println(q.Dequeue());
       q.Display();
       q.Enqueue(40);
       q.Enqueue(50);
       q.Display();
       System.out.println(q.Dequeue());
       q.Display();
       q.Enqueue(60);
       q.Enqueue(70);
       q.Display();
       System.out.println(q.size());
	}

}
