package Сlasses;

import java.util.Scanner;

public class Resistance {
    private int poison_res;  /*Сопротивление яду*/
    private int fire_res;    /*Сопротивление огню*/
    private int frost_res;   /*Сопротивление холоду*/

    public void Init(int resistancePoison, int resistanceFire, int resistanceFrost)   /*Создание*/
    {
        this.poison_res = resistancePoison;
        this.fire_res = resistancePoison;
        this.frost_res = resistanceFrost;
    }

    public void Input()   /*Создание вручную*/
    {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Введите сопротивление яду\n");
        this.poison_res = scanner.nextInt();
       System.out.println("Введите сопротивление огню\n");
        this.fire_res = scanner.nextInt();
       System.out.println("Введите сопротивление холоду\n");
        this.frost_res = scanner.nextInt();
    }

    public void Print()  /*Вывод информации*/
    {
       System.out.println("\nСопротивление: ");
       System.out.println("Сопротивление яду - " + this.poison_res);
       System.out.println("Сопротивление огню - " + this.fire_res);
       System.out.println("Сопротивление холоду - " + this.frost_res);
    }
}
