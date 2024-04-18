import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Userinput inputscan = new Userinput();
        int id = 1;

        ArrayList<Item>itemList = new ArrayList<>();

        while(true){

          System.out.println("Add an item (exit the app by typing 'exit'): ");
          String input = inputscan.scanner.nextLine();

          if(input == "exit") {
              System.out.println("Exiting the app!");
              break;
          }

          Item newItem = new Item(id++,input);
          itemList.add(newItem);
          System.out.println("Item has been added!");

        }


    }
}