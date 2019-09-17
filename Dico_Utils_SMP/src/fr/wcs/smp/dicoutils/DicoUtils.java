package fr.wcs.smp.dicoutils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DicoUtils {

    public static void main( String[] args ) throws IOException {

        final String FILE_NAME = "fichier.txt";
        final String WORD_ASK = "Type your word exactly : ";
        final String START_WORD_ASK = "Type the first letters : ";
        final String END_WORD_ASK = "Type the last letters : ";
        final String SUB_WORD_ASK = "type a few letters in content : ";
        final String REGEX_ASK = "type a regex : ";
        DicoIhm start = new DicoIhm();
        DicoIhm input = new DicoIhm();
        DicoIhm exitProg = new DicoIhm();
        List<String> content = new ArrayList<String>();
        DicoLoader fic = new DicoLoader();
        DicoSearch test = new DicoSearch();
        String choice;
        String value;
        boolean exit = false;

        do {
            start.menu();
            choice = input.read();
            content = fic.fileLoader( FILE_NAME );

            switch ( choice ) {
            case "0":
                exit = true;
                exitProg.display( "au revoir" );
                break;
            case "1":
                input.display( WORD_ASK );
                value = input.read();
                input.display( test.searchWord( content, value ) );
                break;
            case "2":
                input.display( START_WORD_ASK );
                value = input.read();

                List<String> resultStartValue = test.searchStartValue( content, value );
                Iterator<String> iterStartValue = resultStartValue.iterator();
                while ( iterStartValue.hasNext() ) {
                    String word = iterStartValue.next();
                    System.out.println( word );
                }
                break;
            case "3":
                input.display( END_WORD_ASK );
                value = input.read();

                List<String> resultEndValue = test.searchStartValue( content, value );
                Iterator<String> iterEndValue = resultEndValue.iterator();
                while ( iterEndValue.hasNext() ) {
                    String word = iterEndValue.next();
                    System.out.println( word );
                }
                break;
            case "4":
                input.display( SUB_WORD_ASK );
                value = input.read();

                List<String> resultLikeValue = test.searchLikeValue( content, value );
                Iterator<String> iterLikeValue = resultLikeValue.iterator();
                while ( iterLikeValue.hasNext() ) {
                    String word = iterLikeValue.next();
                    System.out.println( word );
                }
                break;
            case "5":
                input.display( REGEX_ASK );
                value = input.read();

                List<String> resultRegexValue = test.searchLikeValue( content, value );
                Iterator<String> iterRegexValue = resultRegexValue.iterator();
                while ( iterRegexValue.hasNext() ) {
                    String word = iterRegexValue.next();
                    System.out.println( word );
                }
                break;
            default:

            }

        } while ( !exit );

    }

}
