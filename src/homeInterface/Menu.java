package homeInterface;

public class Menu {
    private final Food[] menu;
    private int nextNumberItem;

    public Menu(int countItem) {
        this.menu = new Food[countItem];
    }

    public void addFood(Food food){
        if (nextNumberItem >= this.menu.length) {
            System.out.println("Menu's full");
            return;
        }
        this.menu[nextNumberItem] = food;
        nextNumberItem++;
    }

    public void showMenu(){
        for (int i = 0; i < menu.length;i++) {
            if (menu[i] == null)
                continue;
            System.out.println((i + 1) + ". " + menu[i].getClass().getSimpleName());
        }
    }

    public Food getItemByIndex(int i){
        if (i <= 0 || i > menu.length)
            return null;
        return menu[i-1];
    }

}
