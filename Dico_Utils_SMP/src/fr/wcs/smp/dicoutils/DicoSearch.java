package fr.wcs.smp.dicoutils;

import java.io.IOException;
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
        if ( foundWord.equals( "" ) ) {
            return "Aucune occurence trouvée \n";
        } else {
            DicoIhm out = new DicoIhm();
            out.display( "\n Résultat(s) trouvé(s) : \n" );
            return foundWord;
        }
    }

    public List<String> searchStartValue( List<String> contentFile, String inputValue ) {

        List<String> foundWord = new ArrayList<String>();
        Iterator<String> iter = contentFile.iterator();
        while ( iter.hasNext() ) {
            String word = iter.next();
            boolean bool = false;
            bool = word.startsWith( inputValue );
            if ( bool )
                foundWord.add( word );
        }
        responseMessage( foundWord );
        return foundWord;
    }

    public List<String> searchEndValue( List<String> contentFile, String inputValue ) {

        List<String> foundWord = new ArrayList<String>();
        Iterator<String> iter = contentFile.iterator();
        while ( iter.hasNext() ) {
            String word = iter.next();
            boolean bool = false;
            bool = word.endsWith( inputValue );
            if ( bool )
                foundWord.add( word );
        }
        responseMessage( foundWord );
        return foundWord;
    }

    public List<String> searchLikeValue( List<String> contentFile, String inputValue ) {

        List<String> foundWord = new ArrayList<String>();
        Iterator<String> iter = contentFile.iterator();
        while ( iter.hasNext() ) {
            String word = iter.next();
            boolean bool = false;
            bool = word.contains( inputValue );
            if ( bool )
                foundWord.add( word );
        }
        responseMessage( foundWord );
        return foundWord;
    }

    public List<String> searchRegexValue( List<String> contentFile, String inputValue ) {

        List<String> foundWord = new ArrayList<String>();
        Iterator<String> iter = contentFile.iterator();
        while ( iter.hasNext() ) {
            String word = iter.next();
            if ( word.matches( inputValue ) )
                foundWord.add( word );
        }
        responseMessage( foundWord );
        return foundWord;
    }

    public void resultFullWordDisplay( String value ) throws IOException {
        DicoSearch test = new DicoSearch();
        List<String> content = new ArrayList<String>();
        DicoLoader fic = new DicoLoader();
        content = fic.fileLoader( "fichier.txt" );
        DicoIhm input = new DicoIhm();
        String resultFullWord = test.searchWord( content, value );
        input.display( resultFullWord );
    }

    public void resultStartValueDisplay( String value ) throws IOException {
        DicoSearch test = new DicoSearch();
        List<String> content = new ArrayList<String>();
        DicoLoader fic = new DicoLoader();
        content = fic.fileLoader( "fichier.txt" );
        DicoIhm input = new DicoIhm();
        List<String> resultStartValue = test.searchStartValue( content, value );
        Iterator<String> iterStartValue = resultStartValue.iterator();
        while ( iterStartValue.hasNext() ) {
            String word = iterStartValue.next();
            input.display( word );
        }
    }

    public void resultEndValueDisplay( String value ) throws IOException {
        DicoSearch test = new DicoSearch();
        List<String> content = new ArrayList<String>();
        DicoLoader fic = new DicoLoader();
        content = fic.fileLoader( "fichier.txt" );
        DicoIhm input = new DicoIhm();
        List<String> resultEndValue = test.searchEndValue( content, value );
        Iterator<String> iterEndValue = resultEndValue.iterator();
        while ( iterEndValue.hasNext() ) {
            String word = iterEndValue.next();
            input.display( word );
        }

    }

    public void resultLikeValueDisplay( String value ) throws IOException {
        DicoSearch test = new DicoSearch();
        List<String> content = new ArrayList<String>();
        DicoLoader fic = new DicoLoader();
        content = fic.fileLoader( "fichier.txt" );
        DicoIhm input = new DicoIhm();
        List<String> resultLikeValue = test.searchLikeValue( content, value );
        Iterator<String> iterLikeValue = resultLikeValue.iterator();
        while ( iterLikeValue.hasNext() ) {
            String word = iterLikeValue.next();
            input.display( word );
        }
    }

    public void resultRegexValueDisplay( String value ) throws IOException {
        DicoSearch test = new DicoSearch();
        List<String> content = new ArrayList<String>();
        DicoLoader fic = new DicoLoader();
        content = fic.fileLoader( "fichier.txt" );
        DicoIhm input = new DicoIhm();
        List<String> resultRegexValue = test.searchRegexValue( content, value );
        Iterator<String> iterRegexValue = resultRegexValue.iterator();
        while ( iterRegexValue.hasNext() ) {
            String word = iterRegexValue.next();
            input.display( word );
        }

    }

    public void responseMessage( List<String> foundWord ) {
        if ( foundWord.isEmpty() ) {
            DicoIhm out = new DicoIhm();
            out.display( "Aucune occurence trouvée \n" );
        } else {
            DicoIhm out = new DicoIhm();
            out.display( "\n Résultat(s) trouvé(s) : \n" );
        }
    }

}