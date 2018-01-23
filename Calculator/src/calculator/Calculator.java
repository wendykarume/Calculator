package calculator;
import javax.swing.*;
public class Calculator{
    public static void main(String[]args){
        Addition g = new Addition();
        g.setSize(250, 400);
        g.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        g.setVisible(true);
        g.setResizable(false);
    }
}
