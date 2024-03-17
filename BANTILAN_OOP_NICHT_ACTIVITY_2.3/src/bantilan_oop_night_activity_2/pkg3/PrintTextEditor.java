package bantilan_oop_night_activity_2.pkg3;


public class PrintTextEditor extends TextEditor{

    public PrintTextEditor(String text) {
        super(text);
    }
    
    public void print(){
        System.out.println(getText());
    }
}
