package dev;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	String asciiArt1 = FigletFont.convertOneLine("HelloWorld");
        System.out.println(asciiArt1);
    }
}
