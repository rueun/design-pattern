package org.example.headfirst.chapter9.iterator;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinnerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        System.out.println("MENU\n----\nBREAKFAST");
        for (MenuItem menuItem : pancakeHouseMenu.getMenuItems()) {
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }

        System.out.println("\nLUNCH");
        for (int i = 0; i < dinerMenu.getMenuItems().length ; i++) {
            MenuItem menuItem = dinerMenu.getMenuItems()[i];
            if (menuItem == null) {
                break;
            }
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());

        }
    }
}
