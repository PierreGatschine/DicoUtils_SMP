package fr.wcs.smp.dicoutils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DicoSearch {

    public List<String> contentFile;
    String              inputValue;

    public String searchWord( List<String> contentFile, String inputValue ) {

        String foundWord = "";
        Iterator<String> iter = contentFile.iterator();
        while ( iter.hasNext() ) {
            String word = iter.next();

            if ( word.equals( inputValue ) )
                foundWord = word;
        }
        return foundWord;

    }

    public List<String> searchStartValue( List<String> contentFile, String inputValue ) {

        List<String> foundWord = new ArrayList<String>();
        Iterator<String> iter = contentFile.iterator();
        System.out.println( "entrée dans like" );
        while ( iter.hasNext() ) {
            String word = iter.next();
            boolean bool = false;
            bool = word.startsWith( inputValue );
            if ( bool )
                foundWord.add( word );
        }
        return foundWord;

    }

    public List<String> searchLikeValue( List<String> contentFile, String inputValue ) {

        List<String> foundWord = new ArrayList<String>();
        Iterator<String> iter = contentFile.iterator();
        System.out.println( "entrée dans like" );
        while ( iter.hasNext() ) {
            String word = iter.next();
            boolean bool = false;
            bool = word.contains( inputValue );
            if ( bool )
                foundWord.add( word );
        }
        return foundWord;

    }

    public List<String> searchRegexValue( List<String> contentFile, String inputValue ) {

        List<String> foundWord = new ArrayList<String>();
        Iterator<String> iter = contentFile.iterator();
        while ( iter.hasNext() ) {
            String word = iter.next();
            // String element = val +

            if ( word.equals( inputValue ) )
                foundWord.add( word );
        }
        return foundWord;

    }
}
