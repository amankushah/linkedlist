class SLL
{
    node head;
    node tail;
    int size;

void insertAtend(int val)
{
    node temp = new node(val);
    if(head==null)
    {
        head=tail=temp;
    }
    else{
        tail.next = temp;
        tail=temp;
    }
    size++;
 }
 void insertAhead(int val)
{
    node temp = new node(val);
    if(head==null)
    {
        head=tail=temp;
    }
    else{
        temp.next = head;
        head=temp;
    }
    size++;
 }
 void insertAtindex(int idx, int val)
 {
    if(idx==0) 
    {
        insertAhead(val);
        return;
    }
    if(idx==size) 
    {
        insertAtend(val);
        return;
    }
    if(idx>size)
    {
        System.out.println("invalid index");
        return;
    }
    node temp= new node(val);
    node x=head;
    for(int i=1;i<=idx-1;i++)
    {
        x=x.next;
    }
    temp.next=x.next;
    x.next=temp;
    size++;
 }
  void get(int idx)
 {
    if(idx==size-1) System.out.println(tail.val);
    if(idx>=size || idx<0) 
    {
        System.out.println("invalid index");
    }
    else
    {
    node temp=head;
    for(int i=1;i<=idx;i++)
    {
        temp=temp.next;
    }
    System.err.println(temp.val);
    }
 }
 void set(int idx, int val) throws Error
 {
    if(idx==size-1) tail.val=val;
    if(idx>=size || idx<0) 
    {
        throw new Error("bhai error baa");
    }
    else
    {
    node temp=head;
    for(int i=1;i<=idx;i++)
    {
        temp=temp.next;
    }
    temp.val=val;
    }

 }
 void deleteAthead()
 {
   if(head==null) System.out.println("empty list");
   else 
   {
    head=head.next;
   size--;
   }
 }
 void delete(int idx)
 {
    if(idx==0) deleteAthead();
    else if(idx>=size || idx<0) 
    {
        System.out.println("invalid index");
        return;
    }
    else
    {
    node temp=head;
    for(int i=1;i<=idx-1;i++)
    {
        temp=temp.next;
    }
    if(temp.next==tail) tail=temp;
    temp.next=temp.next.next;
    size--;
 }
 
}

 void size()
 {
    System.out.println("the size is : " + size);
 }
 void display()
 {
    node temp=head;
    while(temp!=null)
    {
        System.out.print(temp.val+" ");
        temp=temp.next;
    }
    System.out.println();
 }

}
public class implementmethods
{
    
    public static void main(String[] args)
    {
        SLL list = new SLL();
        list.insertAtend(10);
        list.insertAtend(20);
        list.insertAtend(30);
        list.insertAtend(40);
        list.insertAtend(50);
        list.display();
        list.size();
        list.insertAhead(5);
        list.display();
        list.size();
        list.insertAtindex(2, 00);
        list.display();
        list.size();
        list.get(4);
        list.size();
        list.set(1,9);
        list.display();
        list.size();
        list.deleteAthead();
        list.display();
        list.size();
        list.delete(0);
        list.display();
        list.size();



        
    }
}
