package com.CC2UC;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.eventusermodel.XSSFReader;

import java.io.IOException;

public class Main {

    private static final String WORD_LIST = "Sample.xlsx";
    private static final String WORD_LIST_QUOTES = "\"Sample.xlsx\"";

    public static void main(String[] args) {
        try {
            OPCPackage pkg = OPCPackage.open( WORD_LIST );
            System.out.println("Opened Successfully.");

            XSSFReader reader = new XSSFReader( pkg );
            System.out.println("XSSFReader Established.");


        } catch (InvalidFormatException e) {
            System.out.println("Failed to Open.");
        } catch (OpenXML4JException e2) {
            System.out.println("OpenXML4JException with XSSFReader.");
        } catch (IOException e3) {
            System.out.println("IOException with XSSFReader.");
        }
    }
}
