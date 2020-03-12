package stack;

public class Reverse_Stack {
    public static void main(String[] args) throws Exception {


        StackusingArray Stack = new StackusingArray(5);
        for (int i = 1; i <=5 ; i++) {
            Stack.push(i * 10);
        }
        System.out.println("first stack");
        Stack.display();
        StackusingArray helper= new StackusingArray(5);
        reversestack(Stack,helper,0);
        System.out.println("Reverse Stack");
        Stack.display();


    }
    public static void reversestack(StackusingArray Stack, StackusingArray helper,int index) throws Exception{
        if(Stack.isEmpty()){
            return;
        }
        int item = Stack.pop();
        reversestack(Stack,helper,index+1);
        helper.push(item);
        if (index==0){
            while (!helper.isEmpty()){
                Stack.push(helper.pop());
            }
        }
    }

}
