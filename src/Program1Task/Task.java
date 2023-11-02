package Program1Task;

import java.util.Scanner;

public class Task {
    private int rows;
    private int characters;


    public Task(int myRows, int myCharacters) {
        rows = myRows;
        characters = myCharacters;
    }

    public int getRows() {
        return 5;
    }

    public int getCharacters() {
        return 5;
    }

    public int getWords() {
        return 5;
    }

    public void counter() {

        System.out.println("Write a text for each row and press Enter");
        System.out.println("Close the program by typing the word \"stop\" ");

        Scanner scan = new Scanner(System.in);
        while (true) {
            String line = scan.nextLine();
            if (line.equals("stop")) {
                break;
            }
            rows++;
            characters += line.length();
        }
    }
    public void printOut() {
        System.out.println("You have typed in " + rows + " rows and " + characters +  " " +
                "characters excluding your word \"stop\" ");
    }
}

