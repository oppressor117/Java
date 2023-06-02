/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий фильтрации 
и выведет ноутбуки, отвечающие фильтру.
Критерии фильтрации можно хранить в Map.
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев - 
сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. */

package Homework_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task {
    public static void main(String[] args) {

        Notebook n1 = new Notebook("Apple", "16", "512", "MacOs", "silver");
        Notebook n2 = new Notebook("Dell", "8", "256", "Windows", "black");
        Notebook n3 = new Notebook("Hp", "4", "128", "Linux", "white");
        Notebook n4 = new Notebook("Lenovo", "8", "512", "Windows", "black");
        Notebook n5 = new Notebook("Apple", "32", "1024", "MacOs", "silver");
        Notebook n6 = new Notebook("Acer", "32", "256", "Windows", "silver");
        Set<Notebook> list = new LinkedHashSet<>(Set.of(n1, n2, n3, n4, n5, n6));

        choiseNotebook(list, filter());
    }

    public static HashMap<String, Object> filter() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Object> custom = new HashMap<String, Object>();
        custom.put("ram", "");
        custom.put("hdd", "");
        custom.put("os", "");
        custom.put("color", "");
        System.out.println("\nВведите цифру, соответствующую необходимому критерию:\n");
        while (true) {
            System.out.println("\n1. Оперативная память");
            System.out.println("2. Объем жесткого диска");
            System.out.println("3. Операционная система");
            System.out.println("4. Цвет");
            System.out.println("0. Назад");
            System.out.println("Введите цифру: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nВыберите значение для оперативной памяти: ");
                    System.out.println("1. 4");
                    System.out.println("2. 8");
                    System.out.println("3. 16");
                    System.out.println("4. 32");
                    System.out.println("Введите цифру: ");
                    int choiceRam = sc.nextInt();
                    switch (choiceRam) {
                        case 1:
                            custom.put("ram", "4");
                            return custom;
                        case 2:
                            custom.put("ram", "8");
                            return custom;
                        case 3:
                            custom.put("ram", "16");
                            return custom;
                        case 4:
                            custom.put("ram", "32");
                            return custom;
                        default:
                            System.out.println("Не найдено");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("\nВведите значение для жесткого диска: ");
                    System.out.println("1. 128");
                    System.out.println("2. 256");
                    System.out.println("3. 512");
                    System.out.println("4. 1024");
                    System.out.println("Введите цифру: ");
                    int choiceHdd = sc.nextInt();
                    switch (choiceHdd) {
                        case 1:
                            custom.put("hdd", "128");
                            return custom;
                        case 2:
                            custom.put("hdd", "256");
                            return custom;
                        case 3:
                            custom.put("hdd", "512");
                            return custom;
                        case 4:
                            custom.put("hdd", "1024");
                            return custom;
                        default:
                            System.out.println("Не найдено");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("\nВыберите операционную систему\n");
                    System.out.println("1. Windows");
                    System.out.println("2. Linux");
                    System.out.println("3. MacOs");
                    System.out.println("Введите цифру: ");
                    int choiceOs = sc.nextInt();
                    switch (choiceOs) {
                        case 1:
                            custom.put("os", "Windows");
                            return custom;
                        case 2:
                            custom.put("os", "Linux");
                            return custom;
                        case 3:
                            custom.put("os", "MacOs");
                            return custom;
                        default:
                            System.out.println("Не найдено");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("\nВыберите цвет\n");
                    System.out.println("1. Silver");
                    System.out.println("2. White");
                    System.out.println("3. Black");
                    System.out.println("4. Red");
                    System.out.println("Введите цифру: ");
                    int choiceColor = sc.nextInt();
                    switch (choiceColor) {
                        case 1:
                            custom.put("color", "silver");
                            return custom;
                        case 2:
                            custom.put("color", "white");
                            return custom;
                        case 3:
                            custom.put("color", "black");
                            return custom;
                        case 4:
                            custom.put("color", "red");
                            return custom;
                        default:
                            System.out.println("Не найдено");
                            break;
                    }
                    break;

                case 0:
                    sc.close();
                    return custom;

                default:
                    System.out.println("Не найдено");
                    break;
            }

        }

    }

    public static void choiseNotebook(Set<Notebook> list, HashMap<String, Object> filter) {
        ArrayList<Notebook> result = new ArrayList<>();
        for (Notebook element: list) {
            if (element.getRam().equals((String) filter.get("ram")) 
                            || filter.get("ram").equals("")
                    &&
                    (element.getHdd().equals((String) filter.get("hdd")) 
                            || filter.get("hdd").equals("")
                    &&
                    (element.getOs().equals((String) filter.get("os"))
                            || filter.get("os").equals(""))
                    &&
                    (element.getColor().equals((String) filter.get("color"))
                            || filter.get("color").equals("")))) {
                result.add(element);
            }
        }
        if (result.size() == 0)
            System.out.println("Ноутбук с такими параметрами не найден.");
        else {
            System.out.println("\nВ наличии:");
            for (int index = 0; index < result.size(); index++) {
                System.out.println(result.get(index));
            }
        }

    }
}