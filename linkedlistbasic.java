class node
{
    int val;
    node next;
    node(int val)
    {
        this.val=val;
    }

}
public class linkedlistbasic
{
    public static void display(node head)
        {
            if(head==null) return;
            System.out.print(head.val+" ");
            display(head.next);
            
        }
        public static void display2(node head)
        {
            if(head==null) return;
            display(head.next);
            System.out.print(head.val+" ");
            
        }
    public static void main(String[] args)
    {
        node a=new node(10);
        node b=new node(20);
        node c=new node(30);
        node d=new node(40);
        node e=new node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(a.next);
        System.out.println(b.next);
        System.out.println(c.next);
        System.out.println(d.next);
        System.out.println(e.next);
        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(b.next.val);
        System.out.println(c.next.val);
        System.out.println(d.next.val);
        node temp=a;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
        display(a);
        System.out.println();
        display2(a);
        
    }

}