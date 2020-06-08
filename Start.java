import Entity.HeatEngine;
import Entity.HeatManager;
import Entity.Person;
import Entity.WrapperEngine;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

//        Person person = new Person("Ivan");
//        Person person1 = new Person("Dragan");
//        Person person2 = new Person("Stefan");
//
//        HeatManager mashine1 = new HeatEngine(200, 2,"Black",person);
//        HeatManager mashine2 = new HeatEngine(210, 3,"White",person1);
//        HeatManager mashine3 = new HeatEngine(220, 2,"RED",person2);
//        HeatManager mashine4 = new HeatEngine(230, 5,"Green",person);
//        HeatManager mashine5 = new HeatEngine(240, 3,"Black",person1);
//        HeatManager mashine6 = new WrapperEngine(250, 5,"White",person2);
//        HeatManager mashine7 = new WrapperEngine(260, 1,"RED",person);
//        HeatManager mashine8 = new WrapperEngine(270, 2,"Green",person1);
//        HeatManager mashine9 = new WrapperEngine(280, 4,"Black",person2);
//        HeatManager mashine10 = new WrapperEngine(290, 7,"Green",person);
//
        HeatManager[] managment = new HeatManager[20];
//        managment[0] = mashine1;
//        managment[1] = mashine2;
//        managment[2] = mashine3;
//        managment[3] = mashine4;
//        managment[4] = mashine5;
//        managment[5] = mashine6;
//        managment[6] = mashine7;
//        managment[7] = mashine8;
//        managment[8] = mashine9;
//        managment[9] = mashine10;

        int counter = 0 ;
        while (counter < 20) {

            System.out.println("Моля изберете операция");
            System.out.println("1. Мъвеждане на инфомация");
            System.out.println("2. направи справка");
            System.out.println("3. Изход");


            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();


            switch (number) {
                case 1:
                    System.out.println("моля въведете мощност на машината!");
                    scan = new Scanner(System.in);
                    int power = scan.nextInt();

                    System.out.println("моля въведете височина на машината!");
                    scan = new Scanner(System.in);
                    int height = scan.nextInt();

                    System.out.println("моля въведете цвят на машината!");
                    scan = new Scanner(System.in);
                    String color = scan.next();

                    System.out.println("моля въведете работник създал машината!");
                    scan = new Scanner(System.in);
                    String peple = scan.next();
                    Person person = new Person(peple);

                    System.out.println("моля въведете тип на машината!");
                    scan = new Scanner(System.in);
                    int mode = scan.nextInt();
                    HeatManager mashine1;
                    if (mode == 1) {
                        mashine1 = new HeatEngine(power, height, color, person);
                    } else {
                        mashine1 = new WrapperEngine(power, height, color, person);
                    }
                    managment[counter] = mashine1;
                    counter++;
                    break;
                case 2:
                    for (HeatManager man: managment) {
                        if (man != null) {
                            man.ShowPower(man);
                        }
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }
    }
}
