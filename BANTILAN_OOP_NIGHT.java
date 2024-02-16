package bantilan_oop_night;

import java.util.Scanner;

public class BANTILAN_OOP_NIGHT {

    public static void main(String[] args) {
        Scanner jnwl = new Scanner (System.in);
        
        System.out.print("Enter a message to Ivana: ");
        String msg = jnwl.nextLine();
        
        if(jejemonTyping(msg)) {
            System.out.println("JEJE!");
        }
        else {
            System.out.println("uWu");
        }
        
    }
    //check if jjemon ba ang input or not asashdh
    public static boolean jejemonTyping (String msg){
        boolean casing = false;
        for(char alp: msg.toCharArray()){
            if(Character.isLetter(alp)){
                if(Character.isUpperCase(alp) && casing){
                    return true;
                }
                casing = Character.isLowerCase(alp);
            }
            else {
                casing = false;
            }
        }
        return false;
    }
    
}
