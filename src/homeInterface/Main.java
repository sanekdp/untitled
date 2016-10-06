package homeInterface;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Menu menu = createMenu();
        menu.showMenu();
        choiceItem(menu);
    }

    private static void choiceItem(Menu menu) {
        System.out.println("Ваш выбор ?");
        Scanner scaner = new Scanner(System.in);

        int point;
        try
        {
            point = Integer.parseInt(scaner.next());
        }
        catch(NumberFormatException e)
        {
            System.out.println("Не найден!");
            return;
        }

        Food item = menu.getItemByIndex(point);
        if (item == null)
            System.out.println("Не найдено!");
        else
            item.showInfo();
    }

    private static Menu createMenu() {
        int numberItemsMenu = 3;
        int nCalories, weight;
        Menu menu = new Menu(numberItemsMenu);
        nCalories = 100;
        weight = 200;
        menu.addFood(new Apple(nCalories, weight));
        nCalories = 1000;
        weight = 500;
        menu.addFood(new Bread(nCalories, weight));
        return menu;
    }
}
