import java.util.Scanner;

public class Homework3_WeekPlanner {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule [0][0] = "Sunday";
        schedule [0][1] = "do home work";
        schedule [1][0] = "Monday";
        schedule [1][1] = "go to courses; watch the film";
        schedule [2][0] = "Tuesday";
        schedule [2][1] = "prepare a lunch";
        schedule [3][0] = "Wednesday";
        schedule [3][1] = "go to the gym";
        schedule [4][0] = "Thursday";
        schedule [4][1] = "meet with friends";
        schedule [5][0] = "Friday";
        schedule [5][1] = "go to the club";
        schedule [6][0] = "Saturday";
        schedule [6][1] = "do the homework";

        for (int i = 0; i <schedule.length ; i++){
           git System.out.println("Please, input the day of the week");
            Scanner scanner = new Scanner(System.in);
            String task = scanner.nextLine().trim().toLowerCase();
            switch (task){
                case "sunday": System.out.println(schedule[0][1]);
                    break;
                case "monday": System.out.println(schedule[1][1]);
                    break;
                case "tuesday": System.out.println(schedule[2][1]);
                    break;
                case "wednesday": System.out.println(schedule[3][1]);
                    break;
                case "thursday": System.out.println(schedule[4][1]);
                    break;
                case "friday" : System.out.println(schedule[5][1]);
                    break;
                case "saturday": System.out.println(schedule[6][1]);
                case "exit" : return;
                default: System.out.println("Sorry i don't understand you, please try again");

            }
        }



    }
}

