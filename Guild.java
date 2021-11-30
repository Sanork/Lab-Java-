package Сlasses;

import java.util.Scanner;

public class Guild {

        private String name;
        private int rank;
        private String spec;

        public void Init(String name, int rank, String spec) /*Функция создания гильдии*/
        {
            this.name = name;
            this.rank = rank;
            this.spec = spec;
        }

        public void Input() /*Функция создания гильдии вручную с консоли*/
        {
            Scanner scanner = new Scanner(System.in);
           System.out.println("Введите название гильдии\n");
            this.name = scanner.nextLine();
           System.out.println("Введите ранг гильдии\n");
            this.rank = scanner.nextInt();
           System.out.println("Введите специализацию гильдии\n");
            this.spec = scanner.nextLine();
        }

        public void Print() /*Функция вывода информации о броне*/
        {
           System.out.println("\nГильдия: ");
           System.out.println("Название гильдии - " + this.name);
           System.out.println("Ранг гильдии - " + this.rank);
           System.out.println("Специализация гильдии - " + this.spec);
        }
}
