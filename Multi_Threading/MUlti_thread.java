package Multi_Threading;
class hello1 extends Thread{
    public void run(){
//    public void show(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("hello");
            try{
                Thread.sleep(40);
            }
            catch (Exception e){

            }
        }
    }
}


class how1 extends Thread{
    public void run(){
//    public void show(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("how");
            try{
                Thread.sleep(40);
            }
            catch (Exception e){

            }
        }
    }
}


class r1 extends Thread{
    public void run(){
//    public void show(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Are");
            try{
                Thread.sleep(40);
            }
            catch (Exception e){

            }
        }
    }
}


class u extends Thread{
    public void run(){
//    public void show(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("you");
            try{
                Thread.sleep(40);
            }
            catch (Exception e){

            }
        }
    }
}


class Yeah extends Thread{
    public void run(){
//    public void show(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("yeah");
            try{
                Thread.sleep(40);
            }
            catch (Exception e){

            }
        }
    }
}


class I extends Thread{
    public void run(){
//    public void show(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("I");
            try{
                Thread.sleep(40);
            }
            catch (Exception e){

            }
        }
    }
}


class am extends Thread{
    public void run(){
//    public void show(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("am");
            try{
                Thread.sleep(40);
            }
            catch (Exception e){

            }
        }
    }
}


class fine extends Thread{
    public void run(){
//    public void show(){
        for (int i = 0; i <10 ; i++) {
            System.out.println("fine");
            try{
                Thread.sleep(40);
            }
            catch (Exception e){

            }
        }
    }
}
public class MUlti_thread {
    public static void main(String[] args) {
        hello1 obj0=new hello1();
        how1 obj1=new how1();
        r1 obj2 = new r1();
        u obj3=new u();
        Yeah obj4=new Yeah();
        I obj5=new I();
        am obj6 = new am();
        fine obj7=new fine();


//        obj0.show();
//        obj1.show();
//        obj2.show();
//        obj3.show();
//        obj4.show();
//        obj5.show();
//        obj5.show();
//        obj7.show();


        obj0.start();
        obj1.start();

        obj2.start();
        try {
            obj0.join();
            obj1.join();
            obj2.join();
        }
        catch (Exception e){

        }
        obj3.start();
        obj4.start();
        obj5.start();
        try {
            obj3.join();
            obj4.join();
            obj5.join();
        }
        catch (Exception e){

        }
        obj6.start();
        obj7.start();


    }
}
