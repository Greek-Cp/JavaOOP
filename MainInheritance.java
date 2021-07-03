package riyan.belajar.java.oop;

import java.util.Scanner;

public class MainInheritance {
    public static void main(String[]args){
        CEO Yanuar = new CEO();
        Yanuar.getInformationCEO();
        Scanner getInput = new Scanner(System.in);
        Yanuar.sendChat(getInput.nextLine(),"Alice",00001);

    }
}
