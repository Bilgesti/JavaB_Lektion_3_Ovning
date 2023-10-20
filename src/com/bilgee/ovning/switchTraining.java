package com.bilgee.ovning;

import java.util.Scanner;

public class switchTraining {

    public static void findWeekday (){

        Scanner scan = new Scanner( System.in );
        System.out.println("What is the username?");
        String username = scan.nextLine();
        System.out.println("What day of the week do you want?");

        int weekday = 0;
        do {

            switch (scan.nextInt()) {
                case 1:
                    System.out.println( "Monday" );
                    break;
                case 2:
                    System.out.println( "Tuesday" );
                    break;
                case 3:
                    System.out.println( "Wednesday" );
                    break;
                case 4:
                    System.out.println( "Thursday" );
                    break;
                case 5:
                    System.out.println( "Friday" );
                    break;
                case 6:
                    System.out.println( "Saturday" );
                    break;
                case 7:
                    System.out.println( "Sunday" );
                    break;
                case 9:sayGoodbye(  username);
                    System.exit( 9 );

                default:
                    System.out.println( "Wrong number!" );

            }

        }while (true);
    }
    public static void sayGoodbye (String username) {
        System.out.println("Goodbye User! " +  username);
    }
}
