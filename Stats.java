package Сlasses;

import java.util.Scanner;

public class Stats {
    private int atack; /*Атака*/
    private int agility; /*Ловкость*/
    private int durability; /*Стойкость*/
    private int hp; /*Очки здоровья*/
    private int energy; /*Очки энергии*/

    public Resistance res;

    public Stats()
    {
        res = new Resistance();
    }

    public void Init(int statAtack, int statAgility, int statDurability, int statHP, int statEnergy, Resistance res) /*Содание*/
    {
        this.res = res;
        this.atack = statAtack;
        this.agility = statAgility;
        this.durability = statDurability;
        this.hp = statHP;
        this.energy = statEnergy;
    }

    public void Input() /*Создание вручную*/
    {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Введите показатель атаки\n");
        this.atack = scanner.nextInt();
       System.out.println("Введите показатель ловкости\n");
        this.agility = scanner.nextInt();
       System.out.println("Введите показатель стойкости\n");
        this.durability = scanner.nextInt();
       System.out.println("ВВведите количество очков здоровья\n");
        this.hp = scanner.nextInt();
       System.out.println("Введите количество очков энергии\n");
        this.energy = scanner.nextInt();
        this.res.Input();
    }

    public void Print() /*Вывод информации*/
    {
       System.out.println("Характеристики: ");
       System.out.println("Атака - " + this.atack);
       System.out.println("Ловкость - " + this.agility);
       System.out.println("Стойкость - " + this.durability);
       System.out.println("Здоровье - " + this.hp);
       System.out.println("Энергия - " + this.energy);
        this.res.Print();
    }
}
