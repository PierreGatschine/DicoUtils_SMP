package fr.wcs.smp.dicoutils;

import java.io.IOException;

public class DicoUtils {

    public static void main( String[] args ) throws IOException {

        DicoIhm input = new DicoIhm();
        DicoSearch test = new DicoSearch();
        String choice;
        String value;
        boolean exit = false;

        do {
            input.menu();
            choice = input.read();

            switch ( choice ) {
            case "0":
                exit = true;
                input.display( "See you later \n" );
                break;
            case "1":
                input.display( "Type your word : \n" );
                value = input.read();
                test.resultFullWordDisplay( value );
                break;
            case "2":
                input.display( "Type the first letters : \n" );
                value = input.read();
                test.resultStartValueDisplay( value );
                break;
            case "3":
                input.display( "Type the last letters : \n" );
                value = input.read();
                test.resultEndValueDisplay( value );
                break;
            case "4":
                input.display( "type a few letters in content : \n" );
                value = input.read();
                test.resultLikeValueDisplay( value );
                break;
            case "5":
                input.display( "type a regex : \n" );
                value = input.read();
                test.resultRegexValueDisplay( value );
                break;
            default:

            }

        } while ( !exit );

    }

}
