package Сlasses;

import java.util.Scanner;

public class Weapon {
    private String type;   /*Тип оружия*/
    private int weight;    /*Вес оружия*/
    private int damage;    /*Урон оружия*/

    public void Init(String weaponType, int weaponWeight, int weaponDamage) /*Функция создания оружия*/
    {
        this.type = weaponType;
        this.weight = weaponWeight;
        this.damage = weaponDamage;
    }

    public void Input()   /*Функция создания оружия вручную с консоли*/
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип оружия\n");
        this.type = scanner.nextLine();
        System.out.println ("Введите вес оружия\n");
        this.weight = scanner.nextInt();
        System.out.println ("Введите урон оружия\n");
        this.damage = scanner.nextInt();
    }

    public void Print()  /*Функция вывода информации об оружии*/
    {
        System.out.println("\nОружие: ");
        System.out.println("Тип оружия - " + this.type);
        System.out.println("Вес оружия - " + this.weight);
        System.out.println("Урон оружия - " + this.damage);
    }
}
