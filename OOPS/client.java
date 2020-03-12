package OOPS;

public class client {
    public static void main(String[] args) {
        inheritance engine = new petrolengine();
        engine.start();
        engine.stop();
        engine.acceleration();
        engine.makenoise();
        engine.brake();
        engine.airbags();
    }
//    public abstract void brake();
}
