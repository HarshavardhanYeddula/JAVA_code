package Arrayes;

import PRACTICE_MAKES_MAN_PERFECT.Linked_list;

import java.util.Scanner;

public class Averge_Value {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = s.nextInt();
        int a[]=new int[n];
        float avg=0;
        int sum=0;
        for (int i = 0; i <n ; i++) {
            System.out.println("Enter the element at index "+i+" :");
            a[i]=s.nextInt();

//            System.out.print(a[i]+"->");
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(a[i] + "->");
        }
        System.out.print("end");
        System.out.println();

        for (int i = 0; i <n ; i++) {
            sum=sum+a[i];

        }
        avg=avg+sum/n;
        System.out.println("Sum of array :"+avg);
    }
}

//
//
//
//
//private class Node{
//    int data;
//    Linked_list.Node next;
//}
//
//
//    private int temp;
//    private Linked_list.Node head;
//    private Linked_list.Node tail;
//    private int size;
//
//
//
//    public void Addlast(int item){
//        Linked_list.Node nn=new Linked_list.Node();
//        nn.data=item;
//        nn.next=null;
//
//        if(this.size>=1){
//            this.tail.next=nn;
//        }
//        if (this.size==0){
//            this.head=nn;
//            this.tail=nn;
//            this.size++;
//        }
//        else {
//            this.tail=nn;
//            this.size++;
//        }
//    }
//
//
//    public void Addfirst(int item ) {
//        Linked_list.Node nn = new Linked_list.Node();
//        nn.data = item;
//        nn.next = null;
//
//        if (this.size >= 1) {
//            nn.next =head;
//        }
//        if (this.size==0){
//            this.head=nn;
//            this.tail=nn;
//            this.size++;
//        }
//        else{
//            this.head=nn;
//            this.size++;
//        }
//    }
//
//
//    public int Getfirst() throws Exception{
//        if (this.size==0){
//            throw  new Exception("Empty Linked list");
//
//        }
//        else{
//            return this.head.data;
//        }
//    }
//
//
//    public int GetLast() throws Exception{
//        if (this.size==0){
//            throw  new Exception("Empty Linked list");
//
//        }
//        else{
//            return this.tail.data;
//        }
//    }
//
//
//
//    public int Get_any_Element(int Index) throws Exception{
//        if (this.size==0){
//            throw  new Exception("Empty Linked list");
//
//        }
//        if (Index<0 ||Index>=this.size ){
//            throw  new Exception("Invalid Index");
//        }
//        Linked_list.Node temp=head;
//        for (int i = 0; i < Index; i++) {
//            temp=temp.next;
//        }
//        return temp.data;
//    }
//
//
//
//
//    private Linked_list.Node Get_Node_at(int Index) throws Exception{
//        if (this.size==0){
//            throw new Exception("Empty Linked list");
//
//        }
//        if (Index<0 ||Index>=this.size ){
//            throw  new Exception("Invalid Index");
//        }
//        Linked_list.Node temp=head;
//        for (int i = 0; i < Index; i++) {
//            temp=temp.next;
//        }
//        return temp;
//    }
//
//
//    public void Addat(int item,int Index) throws Exception{
//
//        if (Index>size || Index<0){
//            throw new Exception("Invalid index");
//        }
//        if (Index==0){
//            Addfirst(item);
//        }
//        if (Index==this.size){
//            Addfirst(item);
//
//        }
//        else {
//            Linked_list.Node nn = new Linked_list.Node();
//            nn.data = item;
//            nn.next = null;
//
//
//            Linked_list.Node nm1 = Get_Node_at(Index);
//            Linked_list.Node np1 = nm1.next;
//            nm1.next = nn;
//            nn.next = np1;
//
//            this.size++;
//        }
//
//
//    }
//
//    public  int RemoveFirst() throws Exception{
//        if (this.size==0){
//            throw new Exception("Linked list is Empty");
//        }
//        int fst=this.head.data;
//        if (this.size==1){
//            this.head=null;
//            this.tail=null;
//            this.size=0;
//        }
//        else {
//            this.head=this.head.next;
//            this.size--;
//        }
//        return fst;
//    }
//
//
//    public int RemoveLast() throws  Exception{
//        if (this.size==0){
//            throw new Exception("Linked list is Empty");
//
//        }
//        int lst=this.tail.data;
//        if (this.size==1){
//            this.head=null;
//            this.tail=null;
//            this.size--;
//        }
//        else{
//            Linked_list.Node nm1=Get_Node_at(this.size-2);
//            this.tail=nm1;
//            this.tail=null;
//            this.size--;
//        }
//        return lst;
//    }
//
//
//
//    public int Remove_Element_at(int Index ) throws Exception{
//        if (this.size==0){
//            throw new Exception("Linked list is Empty");
//
//        }
//        if (Index<0 || Index>this.size){
//            throw new Exception("Index out of Bound");
//        }
//
//        if (Index==0){
//            return RemoveFirst();
//        }
//        else if(Index==this.size-1){
//            return RemoveLast();
//        }
//        else{
//            Linked_list.Node nm1=Get_Node_at(Index-1);
//            Linked_list.Node n = Get_Node_at(Index);
//            Linked_list.Node np1=Get_Node_at(Index+1);
//            nm1.next=np1;
//            this.size--;
//            return n.data;
//        }
//
//
//
//    }
//
//
//    public void Display(){
//        Linked_list.Node temp=this.head;
//
//        while (temp!=null){
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
//        System.out.print("End");
//    }
//
//
//
//    public int Mid_node() throws Exception{
//        int mid=0;
//        if (this.size==0){
//            throw new Exception("Empty linked list");
//
//        }
//        if (this.size<0 ||this.size>this.size){
//            throw new Exception("Invalid index");
//        }
//        else if (this.size%2==0){
//            mid=this.size/2;
//
//        }
//        else if (this.size%2!=0){
//            mid=(this.size+1)%2;
//        }
//
//        Linked_list.Node temp = head;
//        for (int i = 0; i < mid; i++) {
//            temp = temp.next;
//        }
//
//        return temp.data;
//
//    }
//
//
//
//
//
//
//
//}
