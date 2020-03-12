package stack;

public class StackusingArray_Client {
    public static void main(String[] args) throws Exception{
        StackusingArray s = new StackusingArray();


        for (int i = 1; i <=5 ; i++) {
            s.push(i * 10);
            s.display();
            
        }
        System.out.println(s.top());
        while (!s.isEmpty()){
            s.display();
            s.pop();
        }
        s.pop();
//        s.push(1);
//        s.push(2);
//        s.push(11);
//        s.push(12);
//        s.push(13);
//        s.push(22);
//        s.display();
//        System.out.println(s.pop());
//        s.top();
//        s.display();
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        s.display();
//        System.out.println( s.isEmpty());
    }

    }