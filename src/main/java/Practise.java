import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Variable");
        int a = sc.nextInt();
        if (a>0) {
            System.out.println("Bolshe 0");
        } else if (a==0) {
            System.out.println("Ravno 0");
        }
        else {
            System.out.println("Menshe 0");
        }

        }
    }






