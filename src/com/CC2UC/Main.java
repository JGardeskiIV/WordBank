package com.CC2UC;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;

public class Main {

    private static final String WORD_LIST = "Sample.xlsx";
    private static final String WORD_LIST_QUOTES = "\"Sample.xlsx\"";

    public static void main(String[] args) {
        try {
            OPCPackage pkg = OPCPackage.open("Sample.xlsx");
            System.out.println("Opened Successfully.");
        } catch (InvalidFormatException e) {
            System.out.println("Failed to Open.");
        }
    }
}
