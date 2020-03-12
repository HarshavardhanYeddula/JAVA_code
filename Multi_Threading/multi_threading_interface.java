package Multi_Threading;


class HELLO_WORLD implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("HELLO WORLD");
        }
        try{
            Thread.sleep(2000);
        }
        catch (Exception e){

        }
    }


}





class FACT implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("FACT");
        }
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){

        }
    }


}





class FIBO implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("FIBO");
        }
        try{
            Thread.sleep(2000);
        }
        catch (Exception e){

        }
    }
}
class HELLO_JAVA implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("HELLO JAVA");
        }
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){

        }
    }


}
public class multi_threading_interface {
    public static void main(String[] args) {
        HELLO_WORLD obj=new HELLO_WORLD();
        FIBO OBJ1 =new FIBO();
        FACT OBJ2 = new FACT();
        HELLO_JAVA OBJ3=    new HELLO_JAVA();
        Thread t1=new Thread(obj);

        Thread t2=new Thread(OBJ1);

        Thread t3=new Thread(OBJ2);

        Thread t4=new Thread(OBJ3);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }
        catch (Exception e){

        }
        t3.start();
        t4.start();
//        ry {
//            t3.join();
//            t4.join();
//        }
//        catch (Exception e){
            for (int i = 0; i <5 ; i++) {
                System.out.println("Main");
            }
        }
    }


