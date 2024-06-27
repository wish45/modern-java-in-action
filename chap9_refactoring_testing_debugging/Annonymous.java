package chap9_refactoring_testing_debugging;

public class Annonymous {
    //익명클래스
    Runnable r1 = new Runnable(){
        public void run(){
            System.out.println("hello");
        }
    };

    //람다
    Runnable r2 = () -> System.out.println("hello");

}
