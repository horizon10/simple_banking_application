import javax.swing.*;

public class Butonlar {
    private JButton button=new JButton();
    public void setText(String text){
        button.setText(text);
    }
    public void setBounds(int a,int b,int c,int d){
        button.setBounds(a,b,c,d);
    }
    public JButton getButton() {
        return button;
    }
}
