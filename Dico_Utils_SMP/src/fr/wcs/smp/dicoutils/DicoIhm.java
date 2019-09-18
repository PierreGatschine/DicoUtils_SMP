package fr.wcs.smp.dicoutils;

import java.util.Scanner;

public class DicoIhm {

    String         inputType;
    String         valueDisplay;

    static Scanner input = new Scanner( System.in );

    public String read() {
        String inputType = input.nextLine();
        return inputType;
    }

    public void menu() {

        display( "*************************************************" );
        display( "*********************DicoUtils*******************" );
        display( "*************************************************" );
        display( "MENU OF CHOICES : " );
        display( "     0 : Exit (Leave this menu program)" );
        display( "     1 : Search  the presence  of an exact  word" );
        display( "     2 : Search all words that start with a value" );
        display( "     3 : Search all  words  that end with a value" );
        display( "     4 : Search all  words  that contain  a value" );
        display( "     5 : Search words  with  a regular expression\n" );
        display( "    Enter a number (among the possible choices)" );
        display( "    then type RETURN" );
    }

    public void display( String valueDisplay ) {
        System.out.println( valueDisplay );
    }

}
