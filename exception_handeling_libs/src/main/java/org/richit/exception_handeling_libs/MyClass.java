package org.richit.exception_handeling_libs;

import java.io.IOException;
import java.text.ParseException;

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
    public static Test test = new Test();

    public static void main(String[] args) {

        startProgramme();

        errorHandlingCommonTryCatch();
        errorHandlingNormalTryCatch();
        errorHandlingMultiTryCatch();

        endProgramme();
    }

    private static void errorHandlingCommonTryCatch() {
        try {
            test.run();
        } catch (Exception e) {
            System.out.println("Common: Eroor found in exception");
        }
    }


    public static void errorHandlingNormalTryCatch(){
        try {
            test.run();
        } catch (IOException e ) {
            System.out.println("Normal: Error found in IOException ");
        } catch (ParseException e) {
            System.out.println("Normal: Error found in Parse exception ");
        }
    }

    private static void errorHandlingMultiTryCatch() {
        try {
            test.run();
        } catch (IOException | ParseException e) {
            System.out.println("Multi: Eroor found in exception");
        }
    }
}
