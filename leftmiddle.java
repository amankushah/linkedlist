class node
{
    int val;
    node next;
    node(int val)
    {
        this.val=val;
    }

}
public class leftmiddle
{
    public static void display(node head)
        {
            if(head==null) return;
            System.out.print(head.val+" ");
            display(head.next);
            
        }
     public static void middle(node head)
     {
        int size=6;
        if(size%2!=0)
        {
            int mid=size/2 +1;
         node temp=head;
         for(int i=1;i<=mid-1;i++)
         {
            temp=temp.next;
         }
         System.out.println(temp.val);
        }
        else{
            int mid=size/2;
         node temp=head;
         for(int i=1;i<=mid-1;i++)
         {
            temp=temp.next;
         }
         System.out.println(temp.val);

        }

     }
        
    public static void main(String[] args)
    {
        node a=new node(10);
        node b=new node(20);
        node c=new node(30);
        node d=new node(40);
        node e=new node(50);
        node f=new node(60);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        
        display(a);
        System.out.println();
        middle(a);
       // display(a);
        
    }

}