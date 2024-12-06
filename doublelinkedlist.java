class dNode
{
    int val;
    dNode next;
    dNode prev;
    dNode(int val)
    {
        this.val=val;
    }
}

class DLL
{
    dNode head;
    dNode tail;
    int size;
    void Display()
    {
        dNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();

    }
    void insertATtail(int val)
    {
        dNode temp=new dNode(val);
        if(size==0) head=tail=temp;
        else {
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
       size++;
    }
    void insertAThead(int val)
    {
        dNode temp=new dNode(val);
        if(size==0) head=tail=temp;
        else {
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
       size++;
    }
    void insertAtindex(int idx, int val)
 {
    if(idx==0) 
    {
        insertAThead(val);
        return;
    }
    if(idx==size) 
    {
        insertATtail(val);
        return;
    }
    if(idx>size || idx<0)
    {
        System.out.println("invalid index");
        return;
    }
    dNode temp= new dNode(val);
    dNode x=head;
    for(int i=1;i<=idx-1;i++)
    {
        x=x.next;
    }
    dNode y=x.next;
    x.next=temp;   temp.prev=x;
    y.prev=temp;   temp.next=y;
    size++;
 }
 void deleteAThead() throws Error
 {
   if(size==0) throw new Error ("empty list");
    head=head.next;
    head.prev=null;
   size--;
 }
 void deleteATtail() throws Error
 {
   if(size==0) throw new Error ("empty list");
    tail=tail.prev;
    tail.next=null;
   size--;
 }
 void delete(int idx) throws Error
 {
    if(idx==0) 
    {
        deleteAThead();
        return;
    }
    if(idx==size-1) 
    {
        deleteATtail();
        return;
    }

    if(idx>=size || idx<0) 
    {
        throw new Error ("invalid index");
    }
    dNode temp=head;
    for(int i=1;i<=idx-1;i++)
    {
        temp=temp.next;
    }
    temp.next=temp.next.next;
    temp=temp.next;
    temp.prev=temp.prev.prev;
    size--;
 }
 
}


public class doublelinkedlist 
{
    public static void print(dNode head)
    {
        dNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void reverseprint(dNode tail)
    {
        dNode temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void display(dNode node)
    {
        dNode temp=node;
        while(temp.prev!=null)
        {
            temp=temp.prev;
        }                   
        print(temp);   //now temp is at head
    }
    public static void main(String[] args) 
    {
        dNode a=new dNode(10);
        dNode b=new dNode(20);
        dNode c=new dNode(30);
        dNode d=new dNode(40);
        a.next=b;  b.prev=a;
        b.next=c;  c.prev=b;
        c.next=d;  d.prev=c;
       print(a);
       reverseprint(d);
       display(c);
       DLL obj=new DLL();
       obj.insertATtail(10);
       obj.insertATtail(20);
       obj.insertATtail(30);
       obj.insertATtail(40);
       obj.Display();
       System.out.println(obj.size);
       obj.insertAThead(40);
       obj.Display();
       System.out.println(obj.size);
       obj.insertAtindex(2,1);
       obj.Display();
       System.out.println(obj.size);
       obj.deleteAThead();
       obj.Display();
       System.out.println(obj.size);
       obj.deleteATtail();
       obj.Display();
       System.out.println(obj.size);
       obj.delete(3);
       obj.Display();
       System.out.println(obj.size);
    }
    
}
