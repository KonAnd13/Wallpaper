/*
Created by Konshin Andrew
*/
public class Wallpaper {
    public static void main(String[] args) {
        int roomPerimeter = 28;
        double roomHeight = 2.8;
        double rollWidth = 0.85;
        int rollLength = 10;

//        Сколько всего полотнищ нужно для оклеивания помещения?
        int numberOfPanels = (int) (roomPerimeter/rollWidth + 1);

//        На сколько полотнищ хватит одного рулона?
        int panelsFromOneRoll = (int) (rollLength/roomHeight);

//        Сколько рулонов обоев понадобится?
        int numberOfRolls = numberOfPanels/panelsFromOneRoll + 1;
        System.out.println("Нам нужно " + numberOfRolls + " рулонов обоев.");
    }
}