package br.com.projeto;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
    final static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        logger.info( "Hello World!" );
	logger.info( "Mudança do colega 2" );
        logger.info( "Mudança do colega 1" );
    }
}
