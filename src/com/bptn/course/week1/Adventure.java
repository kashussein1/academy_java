//Repl Link: https://replit.com/@KassimHussein/Adventure-Game#Main.java

package com.bptn.course.week1;
import java.util.Scanner;
public class Adventure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n You are on an island surrounded by water.\n There is a path to the woods to the north, the sea to the south, a beach shack to the east, \nand a cabin to the west. \nWhich way do you want to go (n,e,s,w)?");
        String command = scan.nextLine();
        if (command.equals("n"))
        {
            System.out.println("You enter the forest and hear some rustling. \nThere may be tigers here or maybe it's just monkeys.");
        } else if (command.equals("e")) {
            System.out.println("You enter the beach shack and see a lot of people. \nDon't worry its just a shop.");
        } else if (command.equals("s")) {
            System.out.println("You enter the sea and notice its really deep. \n Hopefully you can swim.");
        } else if (command.equals("w")) {
            System.out.println("You enter the cabin and see that its empty. \nIt may or may not be abandoned.");
        }else{
            System.out.println("You can’t go in that direction");
        }


        System.out.println("End of adventure!");
        scan.close();
    }
}
