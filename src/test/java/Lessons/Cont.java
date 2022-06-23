package Lessons;

public class Cont {



    public static void main(String[] args) {
        Cont cont = new Cont();
        cont.run();
    }
    public void run() {
        Lesson lesson = new Lesson();
        lesson.setA(1);
        lesson.setB(23);
        System.out.println(lesson.getA() + " " + lesson.getB());


        Class1 kit = new Class1(342, "kokos", 12.4);

                System.out.println(kit.q + " "+ kit.w + " "+ kit.e);

    }
}

