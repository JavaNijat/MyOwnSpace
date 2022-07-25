import javax.swing.*;
import java.util.Scanner;

public class BoxApp {
    public static void main(String[] args) {


        Box boxOne = new Box(4, 3, 2);
        Box boxTwo = new Box(1, 1, 1);

        if (boxOne.compare(boxTwo)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}