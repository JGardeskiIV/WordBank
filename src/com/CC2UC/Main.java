package com.CC2UC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner test = new Scanner(new File("VOCAB 5200 - Concise Definitions.csv"));

            for ( int i = 0; i < 10; i++ ) {
                if ( test.hasNextLine() ) {
                    System.out.println(test.nextLine());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
