package ru.geekbrains.pr8;

/**
 * Project ClassEmployee.java
 *
 * @Author Svetlana Totmyanina
 * Create 01.04.2021
 */
public class WorkClass {
    public static void main(String[] args) {
        String[][] massFaslConvert = {
                {"5", "6", "1", "4"},
                {"", "0", "7", "6"},
                {"6", "1", "2", "3"},
                {"5", "5", "3", "5"}
        };
        String[][] massTrueSumm = {
                {"3", "4", "4", "7"},
                {"6", "1", "4", "5"},
                {"6", "1", "7", "3"},
                {"5", "8", "5", "7"}
        };
        String[][] massNotColumn = {
                {"3", "2", "3", "3"},
                {"6", "1", ""},
                {"0", "2", "7", "3"},
                {"0", "2", "7", "3"}
        };

        try {
            System.out.println(ConvertClass.massConvert(massFaslConvert));
        }
        catch (ExceptionCustom e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(ConvertClass.massConvert(massNotColumn));
        }
        catch (ExceptionCustom e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(ConvertClass.massConvert(massTrueSumm));
        }
        catch (ExceptionCustom e) {
            System.err.println(e.getMessage());
        }
    }

}

