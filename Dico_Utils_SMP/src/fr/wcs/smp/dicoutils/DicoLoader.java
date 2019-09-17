package fr.wcs.smp.dicoutils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DicoLoader {

    public String         currentLineFile;
    public String         dicoContent;
    public List<String>   listWord = new ArrayList<String>();
    public FileReader     filereader;
    public BufferedReader bufferedreader;

    // méthode pour lire le fichier
    public List<String> fileLoader( String file ) throws IOException {

        filereader = new FileReader( file );
        bufferedreader = new BufferedReader( filereader );

        while ( ( currentLineFile = bufferedreader.readLine() ) != null ) {

            listWord.add( currentLineFile );
        }

        bufferedreader.close();
        /*
         * Iterator<String> iter = listWord.iterator(); while ( iter.hasNext() )
         * { System.out.println( "ok" ); }
         */
        return listWord;

    }

}
