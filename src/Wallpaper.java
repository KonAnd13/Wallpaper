/*
Created by Konshin Andrew
*/
public class Wallpaper {
    public static void main(String[] args) {
        int roomPerimeter = 28;
        double roomHeight = 2.8;
        double rollWidth = 0.85;
        int rollLength = 10;

//        How many total panels do you need for gluing a room?
        int numberOfPanels = (int) (roomPerimeter/rollWidth + 1);

//        How many sheets will one roll have?
        int panelsFromOneRoll = (int) (rollLength/roomHeight);

//        How many rolls of wallpaper will you need?
        int numberOfRolls = numberOfPanels/panelsFromOneRoll + 1;
        System.out.println("We need " + numberOfRolls + " rolls of wallpaper.");
    }
}
