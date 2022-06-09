package com.github.KaveeshKumarreddy.JenkinCalculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Calculator cal = new Calculator();
        System.out.println( "Hello World!" );
        System.out.println("adding 10 and 20 will give :"+cal.add(10, 20));
        System.out.println("subtracting 20 and 10 will give :"+cal.sub(20, 10));
    }
}
