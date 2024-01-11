public class Main {
    public static void main(String[] args) {
        //task1
        int age = 15;
        System.out.println("Задача №1");
        if (age>=18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний\nЗадача №2");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия\nЗадача №2");
        }
        //task2
        int temp = -5;
        if (temp<=5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку\nЗадача №3");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки\nЗадача №3");
        }
        //task3
        int speed = 75;
        if (speed>=60) {
            System.out.println("Если скорость " + speed + "км,ч, то придётся заплатить штраф\nЗадача №4");
        } else {
            System.out.println("Если скорость " + speed + "км/ч, то можно ездить спокойно\nЗадача №4");
        }
        //task4
        int age1 = 34;
        if (age1>=2 && age1<=6) {
            System.out.println("Если человеку " + age1 + ", то ему нужно ходить в детский сад\nЗадача №5");
        }
        if (age1>=7 && age1<=17) {
            System.out.println("Если человеку " + age1 + ", то ему нужно ходить в школу\nЗадача №5");
        }
        if (age1>=18 && age1<=24) {
            System.out.println("Если человеку " + age1 + ", то ему нужно посещать университет\nЗадача №5");
        }
        if (age1>24) {
            System.out.println("Если человеку " + age1 + ", то пора ходить на работу\nЗадача №5");
        }
        //task5
        int age2 = 6;
        if (age2<=5) {
            System.out.println("Если ребенку " + age2 + ", то он не может кататься на аттракционе\nЗадача №6");
        }
        if (age2>5 && age2<14) {
            System.out.println("Если ребенку " + age2 + ", то он может кататься на аттракционе только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.\nЗадача №6");
        }
        if (age2>=14) {
            System.out.println("Если ребенку " + age2 + ", то он может кататься без сопровождения взрослого\nЗадача №6");
        }
        //task6
        int place = 45;
        if (place<=60) {
            System.out.println("Ещё есть сидячее место\nЗадача №7");
        }
        if (place>60 && place<=102) {
            System.out.println("Есть только стоячее место\nЗадача №7");
        }
        if (place>102) {
            System.out.println("Мест нет\nЗадача №7");
        }
        //task7
        int one = -64;
        int two = -323;
        int three = -5;
        if (one > two) {
            if (one > three) {
                System.out.println(one + "\nДомашняя работа выполнена");
            } else {
                System.out.println(three + "\nДомашняя работа выполнена");
            }
        } else {
            if (two > three) {
                System.out.println(two + "\nДомашняя работа выполнена");
            } else {
                System.out.println(three + "\nДомашняя работа выполнена");
            }

        }




    }
}