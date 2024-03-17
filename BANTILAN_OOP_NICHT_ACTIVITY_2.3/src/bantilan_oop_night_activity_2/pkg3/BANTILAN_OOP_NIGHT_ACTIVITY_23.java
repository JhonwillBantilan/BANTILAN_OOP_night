
package bantilan_oop_night_activity_2.pkg3;

import java.util.Scanner;

public class BANTILAN_OOP_NIGHT_ACTIVITY_23 {

   
    public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);
        System.out.println("Enter initial text:");
        String text = scnr.nextLine();
        System.out.println("Choose editor type (1 for Print, 2 for Advanced):");
        int editorType = scnr.nextInt();
        TextEditor editor;

        if (editorType == 2) {
            editor = new AdvancedTextEditor(text);
        } else {
            editor = new PrintTextEditor(text);
        }

        Tester.test(editor);
    }
}