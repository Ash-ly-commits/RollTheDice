package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args) {
    Dice dice = new Dice();
    int roll1, roll2;
    int twoCounter = 0, fourCounter = 0, sixCounter = 0, sevenCounter = 0;
    for(int i=1;i<101;i++){
        roll1 = dice.roll();
        roll2 = dice.roll();
        int sum = roll1 + roll2;
        if (sum == 2){
            twoCounter++; }
        else if (sum == 4){
            fourCounter++; }
        else if (sum == 6){
            sixCounter++; }
        else if (sum == 7) {
            sevenCounter++; }
        System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + "  Sum: " + sum);
    }
    System.out.printf("Sum 2 rolls: %d\nSum 4 rolls: %d\nSum 6 rolls: %d\nSum 7 rolls: %d\n",
            twoCounter,fourCounter,sixCounter,sevenCounter);
    }
}
