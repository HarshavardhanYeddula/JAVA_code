package Multi_Threading;

 class hi extends Thread{
//        public void show(){
            public void run(){
            for (int i = 0; i <5 ; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(5);
                }
                catch (Exception e){

                }
            }
        }
}

class hello extends Thread{
//        public void show(){
    public void run(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(5);
            }
            catch (Exception e){

            }
        }
    }
}
class how extends Thread{
//        public void show(){
    public void run(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("how");
            try {
                Thread.sleep(5);
            }
            catch (Exception e){

            }
        }
    }
}

class are extends Thread{
//        public void show(){
    public void run(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("are");
            try {
                Thread.sleep(5);
            }
            catch (Exception e){

            }
        }
    }
}

class you extends Thread{
//        public void show(){
    public void run(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("you");
            try {
                Thread.sleep(5);
            }
            catch (Exception e){

            }
        }
    }
}




public class Multi_threads {
    public static void main(String[] args) {
        hi ob1=new hi();
        hello ob2= new hello();
        how ob3=new how();
        are ob4=new are();
        you ob5=new you();
//        ob1.show();
//        ob2.show();
//        ob3.show();
//        ob4.show();
//        ob5.show();




            ob1.start();
            ob2.start();
            ob3.start();
            ob4.start();
            ob5.start();

    }

}
