package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Addition extends JFrame{
    private JTextField answerfield;
    private JButton one,two,three,four,five,six,seven,eight,nine,zero,add,subtract,multiply,divide,equals,clear;
    private String stemp1, stemp2, sanswer;
    double answer;
    private JPanel contentPanel;
    private boolean equalsClicked;
    private boolean opchosen = false;
    char operation = ' ';

    

    public Addition(){
        super("Calculator");
        this.equalsClicked = false;
        
        answerfield = new JTextField(null,20);
        answerfield.setEditable(false);
    //initializing buttons        
        one=new JButton("1");
        two=new JButton("2");
        three=new JButton("3");
        four=new JButton("4");
        five=new JButton("5");
        six=new JButton("6");
        seven=new JButton("7");
        eight=new JButton("8");
        nine=new JButton("9");
        zero=new JButton("0");
        add=new JButton("+");
        subtract=new JButton("-");
        multiply=new JButton("*");
        divide=new JButton("/");
        equals=new JButton("=");
        clear=new JButton("c");
        
        Dimension dim = new Dimension(75,25);
        
        one.setSize(dim);
        two.setSize(dim);
        three.setSize(dim);
        four.setSize(dim);
        five.setSize(dim);
        six.setSize(dim);
        seven.setSize(dim);
        eight.setSize(dim);
        nine.setSize(dim);
        zero.setSize(new Dimension(225,25));
        add.setSize(new Dimension(113,25));
        subtract.setSize(new Dimension(113,25));
        multiply.setSize(new Dimension(113,25));
        divide.setSize(new Dimension(113,25));
        equals.setSize(new Dimension(225,25));
        
        Numbers n = new Numbers ();
        Calc c = new Calc ();
        
        one.addActionListener(n); two.addActionListener(n); three.addActionListener(n);
        four.addActionListener(n); five.addActionListener(n); six.addActionListener(n);
        seven.addActionListener(n); eight.addActionListener(n); nine.addActionListener(n);
        zero.addActionListener(n);
        
        add.addActionListener(c); subtract.addActionListener(c); multiply.addActionListener(c);
        divide.addActionListener(c); equals.addActionListener(n);
        
    //initializing the layout    
       
        contentPanel = new JPanel ();
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setLayout(new FlowLayout());
        contentPanel.add(answerfield,BorderLayout.NORTH);
        
        contentPanel.add(one);contentPanel.add(two);contentPanel.add(three);contentPanel.add(four);contentPanel.add(five);contentPanel.add(six);contentPanel.add(seven);contentPanel.add(eight);contentPanel.add(nine);contentPanel.add(zero);contentPanel.add(add);contentPanel.add(subtract);contentPanel.add(multiply);contentPanel.add(divide);contentPanel.add(equals);
        this.setContentPane(contentPanel);
        
    }

