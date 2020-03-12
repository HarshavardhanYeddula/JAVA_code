package stack;

public class Dynamic_Stack_Client {
    public static void main(String[] args) throws Exception{


        Dynamic_Stack D = new Dynamic_Stack(5);

        for (int i = 1; i <=5 ; i++) {
            D.push(i * 10);
            D.display();

        }
        System.out.println(D.top());
        while (!D.isEmpty()){
            D.display();
            D.pop();
        }
//        D.pop();

    }
}
