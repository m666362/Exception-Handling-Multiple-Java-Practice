package org.richit.exception_handeling_libs;

import java.io.FileNotFoundException;

public class MyClass {
    static String dot = "----------------";
    private static void startProgramme() {
        String start = "Programme started";
        System.out.println("");
        System.out.println(dot+start+dot);
        System.out.println("");
    }
    public static void endProgramme(){

        String end = "Programme ended";
        System.out.println("");
        System.out.println(dot+end+dot);
        System.out.println();
    }


    public static void main(String[] args) throws FileNotFoundException {

        startProgramme();



        endProgramme();
    }
}
