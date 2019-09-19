/*
Created by Konshin Andrew
*/
public class Wallpaper {
    public static void main(String[] args) {
        double roomPerimeter = 28;
        double roomHeight = 2.8;
        double rollWidth = 0.85;
        int rollLength = 10;

        int numberOfPanels = (int) (roomPerimeter/rollWidth + 1);

        int panelsFromOneRoll = (int) (rollLength/roomHeight);

        int numberOfRolls = numberOfPanels/panelsFromOneRoll + 1;
        System.out.println("We need " + numberOfRolls + " rolls of wallpaper.");
    }
}
