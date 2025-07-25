 public class nthNodefromend{
    public static Node nthNode(Node head,int n ){
        int size=0;
        Node temp= head;
        while(temp!=null){
            size++;
            temp= temp.next;
        }
        int m =size -n+1;
        // nuth node from the start
         temp=head;
        for (int i=1; i<=m-1;i++){
            temp =temp.next;

        }
        return temp;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args){
        Node a= new Node(10);
     Node b = new Node(20);
      Node c = new Node(30);
      Node d = new Node(40);
      Node e = new Node(50);
      Node f = new Node(60);
       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;
       e.next=f;
       // 10 20 30 40 50 60
       Node q=nthNode(a,3);
       System.out.println(q.data);



    }
}
