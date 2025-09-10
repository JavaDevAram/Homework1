package HomeworkTestN1;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        int x, y;
        Scanner tiv_x = new Scanner(System.in);
        {
            System.out.println("Մուտքագրեք x թիվը");
            x = tiv_x.nextInt(); //Ստանում է ներմուծված int-ը
        }
        Scanner tiv_y = new Scanner(System.in);
        {
            System.out.println("Մուտքագրեք y թիվը");
            y = tiv_x.nextInt();
            if (x > y)
                System.out.println("Ձեր x թիվը y թիվից մեծ է");
            if (x < y)
                System.out.println("Ձեր x թիվը y թիվից փոքր է");
            if (x == y)
                System.out.println("Ձեր x և y թվերը հավասար են");
        }

        System.out.println("Մուտքագրեք թիվը բազմապատկելու համար");
        Scanner tivAngam = new Scanner(System.in);
        int tiv = tivAngam.nextInt();
        {
            for (int i = 1; i <= 10; i++) {
                System.out.println(tiv + " * " + i + " = " + tiv * i);
            }
        }
    }
}
