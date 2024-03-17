package bantilan_oop_night_activity_2.pkg3;


public class AdvancedTextEditor extends TextEditor {
    private String previousText;

    public AdvancedTextEditor(String text) {
        super(text);
        this.previousText = text;
    }
    
    public void undo() {
        setText(previousText);
    }
    
    @Override
    public void append(String newText){
        previousText = getText();
        super.append(newText);
    }
    
    
    @Override
    public void delete(int n){
        previousText = getText();
        super.delete(n);
    }
}
