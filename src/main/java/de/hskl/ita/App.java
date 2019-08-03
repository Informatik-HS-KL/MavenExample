package de.hskl.ita;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world.
 *
 * Diese Klasse wurde von Maven angelegt
 * und um eine weitere Ausgabe auf der Konsole erweitert.
 *
 * In dieser Version fügen wir Logging-Ausgaben
 * mit Hilfe von Log4j2 ein, um zu demonstrieren,
 * wie wir externals mit Maven auflösen.
 */
public class App 
{
    private static final Logger log=LogManager.getLogger();

    public static void main( String[] args )
    {
	log.info(">> App.main");
        System.out.println( "Hello World!" );
	System.out.println( "My first Maven projekt" );
	log.info("<< App.main");
    }
}
