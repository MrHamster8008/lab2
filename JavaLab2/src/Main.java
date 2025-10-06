import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("\nВыберите задание для выполнения:");
            System.out.println("1. Имена");
            System.out.println("2. Имена и рост");
            System.out.println("3. Сотрудники");
            System.out.println("4. Сотрудники и список");
            System.out.println("5. Имена другое");
            System.out.println("6. Пистолет");
            System.out.println("0. Выход");
            System.out.print("Ваш выбор: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Хорошего дня ");
                    scanner.close();
                    return;
                case 1:
                    Name cleopatra = new Name("Клеопатра", null, null);
                    Name pushkin = new Name("Пушкин", "Александр", "Сергеевич");
                    Name mayakovsky = new Name("Маяковский", "Владимир", null);
                    System.out.println(cleopatra);
                    System.out.println(pushkin);
                    System.out.println(mayakovsky);
                    break;
                case 2:
                    Name cleopatraWithSize = new Human("Клеопатра", null, null,152);
                    Name pushkinWithSize = new Human("Пушкин", "Александр", "Сергеевич",167);
                    Name mayakovskyWithSize = new Human("Маяковский", "Владимир", null,189);
                    System.out.println(cleopatraWithSize);
                    System.out.println(pushkinWithSize);
                    System.out.println(mayakovskyWithSize);
                    break;
                case 3:
                    Employee petrov = new Employee("Петров");
                    Employee kozlov = new Employee("Козлов");
                    Employee sidorov = new Employee("Сидоров");
                    Department itDepartment = new Department("IT");
                    petrov.setDepartment(itDepartment);
                    kozlov.setDepartment(itDepartment);
                    sidorov.setDepartment(itDepartment);
                    itDepartment.setManager(kozlov);
                    System.out.println("Информация о сотрудниках");
                    System.out.println(petrov);
                    System.out.println(kozlov);
                    System.out.println(sidorov);
                    break;
                case 4:
                    break;
                case 5:
                    Name5 cleo = new Name5("Клеопатра");
                    Name5 pushk = new Name5("Пушкин", "Александр", "Сергеевич");
                    Name5 mayakov = new Name5("Маяковский", "Владимир");
                    Name5 christo = new Name5("Христофор", "Бонифатьевич");
                    System.out.println(cleo);
                    System.out.println(pushk);
                    System.out.println(mayakov);
                    System.out.println(christo);
                    break;
                case 6:
                    Gun gun = new Gun();
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("Выстрел " + i + ": ");
                        gun.shoot();
                    }
            }
        }
    }
}