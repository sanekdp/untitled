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
        Menu menu = new Menu(3);
        menu.addFood(new Apple(100, 200));
        menu.addFood(new Bread(1000, 500));
        return menu;
    }
}
