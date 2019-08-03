package de.hskl.ita;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Klasse, die einen Zeitstempel ausgibt als
 * Beispiel für eine Anwendung, die mit dem
 * Maven exec-plugin ausgeführt wird.
 *
 * Das ausgegebene Datumsformat: "Datum: dd.MM.yyyy"
 */
public class TimeStamp 
{
    public static void main( String[] args )
    {
	    String prefix      = (args.length > 0) ? args[0] : "Datum:";
	    String datetimePattern = (args.length > 1) ? args[1] : "dd.MM.yyyy";
	    System.out.println(" \n" + prefix + " " + (new SimpleDateFormat(datetimePattern).format( new Date() )) + "\n");
    }
}
