package fr.wcs.smp.dicoutils;

import java.util.Scanner;

public class DicoIhm {

    String         inputType;
    String         valueDisplay;

    static Scanner input = new Scanner( System.in );

    public String read() {
        String inputType = input.nextLine();
        // input.nextLine();
        return inputType;
    }

    public void menu() {
        System.out.println( "************************" );
        System.out.println( "********DicoUtils*******" );
        System.out.println( "************************" );
        System.out.println( "Enter your choice : " );
        System.out.println( "0 : exit " );
        System.out.println( "1 : start letters of word " );
        System.out.println( "2 : end letters of word  " );
        System.out.println( "3 : party of word" );

    }

    public void display( String valueDisplay ) {
        System.out.println( valueDisplay );
    }
}
