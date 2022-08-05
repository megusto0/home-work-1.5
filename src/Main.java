public class Main {
    public static void main(String[] args) {
        //Задание 1
        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;

        double[] second = {1.57, 7.654, 9.986};

        double[] apples = {1.01, 4.81, 6.09};

        //Задача 2
        for(int i = 0; i < first.length - 1; ++i) {
            System.out.print(first[i] + ", ");
        }
        System.out.println(first[first.length - 1]);

        for(int i = 0; i < second.length - 1; ++i) {
            System.out.print(second[i] + ", ");
        }
        System.out.println(second[second.length - 1]);

        for(int i = 0; i < apples.length - 1; ++i) {
            System.out.print(apples[i] + ", ");
        }
        System.out.println(apples[apples.length - 1]);

        //Задача 3

        for(int i = first.length - 1; i > 0; --i) {
            System.out.print(first[i] + ", ");
        }
        System.out.println(first[0]);

        for(int i = second.length - 1; i > 0; --i) {
            System.out.print(second[i] + ", ");
        }
        System.out.println(second[0]);

        for(int i = apples.length - 1; i > 0; --i) {
            System.out.print(apples[i] + ", ");
        }
        System.out.println(apples[0]);

        //Задачв 4
        for(int i: first) {
           if(i % 2 == 0) ++i;
            System.out.println(i);
        }

    }
}