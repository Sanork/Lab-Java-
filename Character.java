package Сlasses;

import java.util.Scanner;

public class Character {
    private String name; /*Имя*/
    private int lvl; /*Уровень*/
    private String race; /*Раса*/
    public static int count = 0;
    private int id;
    public Guild guild; //{ get; set; }   /*Информация о гильдии*/
    public Armor arm ; /*Класс брони*/
    public Weapon weap; /*Класс оружия*/
    public Stats stat; /*Класс характеристик*/

    public Character()
    {
        //guild = new Guild();
        arm = new Armor();
        weap = new Weapon();
        stat = new Stats();
    }
    public void Init(String characterName, int characterLVL, String characterRace, Armor arm, Weapon weap, Stats st, Resistance res, Guild gld) /*Создание персонажа*/
    {
        this.name = characterName;
        this.lvl = characterLVL;
        this.race = characterRace;
        this.arm = arm;
        this.weap = weap;
        this.stat = st;
        this.guild = gld;
        count++;
        id = count;
    }

    public void Input()  /*Создание персонажа вручную с консоли*/
    {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Введите имя персонажа\n");
        this.name = scanner.nextLine();
       System.out.println("Введите уровень персонажа\n");
        this.lvl = scanner.nextInt();
       System.out.println("Введите расу персонажа\n");
        this.race = scanner.nextLine();

        this.arm.Input();
        this.weap.Input();
        this.stat.Input();
        this.guild.Input();
        count++;
        id = count;
    }

    public void Print() /*Вывод информации о персонаже*/
    {
       System.out.println("Персонаж: ");
       System.out.println("Имя - " + this.name);
       System.out.println("ID - " + id);
       System.out.println("Уровень - " + this.lvl);
       System.out.println("Раса - " + this.race);
        this.arm.Print();
        this.weap.Print();
        this.stat.Print();
        this.guild.Print();
    }
}
