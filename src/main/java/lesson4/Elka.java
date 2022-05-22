package lesson4;

public class Elka {

    /**
     *          Используя вложенные for loop нарисовать фигуру
     *
     *          *
     *          * *
     *          * * *
     *          * * * *
     *          * * * * *
     *          * * * * * *
     *          * * * * * * *
     *          * * * * * * * *
     *          * * * * * * * * *
     *          * * * * * * * *
     *          * * * * * * *
     *          * * * * * *
     *          * * * * *
     *          * * * *
     *          * * *
     *          * *
     *          *
     */

    public static void main(String[] args) {
        for (int i = 1; i < 18; i++) {
            if (i < 9) {
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println(i);
            }
            else {
                for (int j = 0; j < 18-i; j++) {
                    System.out.print("* ");
                }
                System.out.println(i);
            }
        }
    }
}
