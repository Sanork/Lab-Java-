package Сlasses;

import java.util.Scanner;

public class Armor {

    private String material;  /*Материал брони*/
    private int weight;     /*Вес брони*/
    private String w_class;    /*Класс брони*/
    private int defense;   /*Защита брони*/


    public void Init(String armorMaterial, int armorWeight, String armorClass, int armorDefence) /*Функция создания брони*/
    {
        this.material = armorMaterial;
        this.weight = armorWeight;
        this.w_class = armorClass;
        this.defense = armorDefence;
    }

    public void Input() /*Функция создания брони вручную с консоли*/
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите материал брони\n");
        this.material = scanner.nextLine();
        System.out.println("Введите вес брони\n");
        this.weight = scanner.nextInt();
        System.out.println("Введите класс брони\n");
        this.w_class = scanner.next();
        System.out.println("Введите показатель защиты брони\n");
        this.defense = scanner.nextInt();
    }

    public void Print() /*Функция вывода информации о броне*/
    {
        System.out.println("\nБроня: ");
        System.out.println("Материал брони - " + this.material);
        System.out.println("Вес брони - " + this.weight);
        System.out.println("Класс брони - " + this.w_class);
        System.out.println("Показатель защиты брони - " + this.defense);
    }
}
