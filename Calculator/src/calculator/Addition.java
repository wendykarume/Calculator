package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Addition extends JFrame{
    private JTextField answerfield;
    private JButton one,two,three,four,five,six,seven,eight,nine,zero,add,subtract,multiply,divide,equals,clear;
    private String std1, std2, sanswer;
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
        Calculator c = new Calculator ();
        
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
            
    private class Numbers implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            JButton std = (JButton) event.getSource();    
            
            if(std.equals(one))
            {
                if(opchosen==false){
                    if(std1==null){
                        std1 = "1";
                    }else{
                        std1=std1 + "1";
                    }
                }else{
                    if (std2==null){
                        std2="1";
                    }else{
                        std2=std1 + "1";
                        }
                    }
            }
            if(std.equals(two))
            {
                if(opchosen==false){
                    if(std1==null){
                        std1 = "2";
                    }else{
                        std1=std1 + "2";
                    }
                }else{
                    if (std2==null){
                        std2="2";
                    }else{
                        std2=std1 + "2";
                        }
                    }
            }
            if(std.equals(three))
            {
                if(opchosen==false){
                    if(std1==null){
                        std1 = "3";
                    }else{
                        std1=std1 + "3";
                    }
                }else{
                    if (std2==null){
                        std2="3";
                    }else{
                        std2=std1 + "3";
                        }
                    }
            }
            if(std.equals(four))
            {
                if(opchosen==false){
                    if(std1==null){
                        std1 = "4";
                    }else{
                        std1=std1 + "4";
                    }
                }else{
                    if (std2==null){
                        std2="4";
                    }else{
                        std2=std1 + "4";
                        }
                    }
            }
            if(std.equals(five))
            {
                if(opchosen==false){
                    if(std1==null){
                        std1 = "5";
                    }else{
                        std1=std1 + "5";
                    }
                }else{
                    if (std2==null){
                        std2="5";
                    }else{
                        std2=std1 + "5";
                        }
                    }
            }
            if(std.equals(six))
            {
                if(opchosen==false){
                    if(std1==null){
                        std1 = "6";
                    }else{
                        std1=std1 + "6";
                    }
                }else{
                    if (std2==null){
                        std2="6";
                    }else{
                        std2=std1 + "6";
                        }
                    }
            }
            if(std.equals(seven))
            {
                if(opchosen==false){
                    if(std1==null){
                        std1 = "7";
                    }else{
                        std1=std1 + "7";
                    }
                }else{
                    if (std2==null){
                        std2="7";
                    }else{
                        std2=std1 + "7";
                        }
                    }
            }
            if(std.equals(eight))
            {
                if(opchosen==false){
                    if(std1==null){
                        std1 = "8";
                    }else{
                        std1=std1 + "8";
                    }
                }else{
                    if (std2==null){
                        std2="8";
                    }else{
                        std2=std1 + "8";
                        }
                    }
            }
            if(std.equals(nine))
            {
                if(opchosen==false){
                    if(std1==null){
                        std1 = "9";
                    }else{
                        std1=std1 + "9";
                    }
                }else{
                    if (std2==null){
                        std2="9";
                    }else{
                        std2=std1 + "9";
                        }
                    }
            }
            if(std.equals(zero))
            {
                if(opchosen==false){
                    if(std1==null){
                        std1 = "0";
                    }else{
                        std1=std1 + "0";
                    }
                }else{
                    if (std2==null){
                        std2="0";
                     }else{
                        std2=std1 + "0";
                        }
                    }
            }
        

            if(opchosen==false){
                answerfield.setText(std1);
            }else{
                answerfield.setText(std2);
            }
            if(equalsClicked==false){
                if(opchosen==false){
                    answerfield.setText(std1);
                }else{
                    answerfield.setText(std2);
                }
                }
        }
    }  

    class Calc implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            JButton std;
            std = (JButton) event.getSource();
            
            if(std.equals(add)){
                if(std1==null){
                    System.out.println("Choose your numbers first!");
                }else
                    if(std1!= null && std2!= null){
                        opchosen = true;
                        operation = '+';
                    }else
                     if(std1!= null && std2!= null){
                        System.out.println("Two operations only!");
                }

            }
            if(std.equals(subtract)){
                if(std1==null){
                    System.out.println("Choose your numbers first!");
                }else
                    if(std1!= null && std2!= null){
                        opchosen = true;
                        operation = '-';
                    }else
                     if(std1!= null && std2!= null){
                        System.out.println("Two operations only!");
                }

            }
            if(std.equals(multiply)){
                if(std1==null){
                    System.out.println("Choose your numbers first!");
                }else
                    if(std1!= null && std2!= null){
                        opchosen = true;
                        operation = '*';
                    }else
                     if(std1!= null && std2!= null){
                        System.out.println("Two operations only!");
                }

            }
            if(std.equals(divide)){
                if(std1==null){
                    System.out.println("Choose your numbers first!");
                }else
                    if(std1!= null && std2!= null){
                        opchosen = true;
                        operation = '/';
                    }else
                     if(std1!= null && std2!= null){
                        System.out.println("Two operations only!");
                }

            }
            if(std.equals(equals)){
                if(std1==null){
                    System.out.println("Choose your numbers first!");
                }else
                    if(std1!= null && std2!= null){
                    System.out.println("Choose BOTH numbers first");
                    }else
                     if(std1!= null && std2!= null){
                        System.out.println("Two operations only!");
                }

            }
            
            if(std1 != null && std2 != null){
                double d1=0.0, d2=0.0;
                d1 = Double.parseDouble(std1);
                d2 = Double.parseDouble(std2);
                switch(operation){
                    case'+':
                        answer= d1 + d2;
                        break;
                    case'-':
                        answer= d1 - d2;
                        break;
                    case'/':
                        answer= d1 / d2;
                        break;
                    case'*':
                        answer= d1 * d2;
                        break;                        
                }
                
                sanswer = Double.toString(answer);
                answerfield.setText(sanswer);
                if(operation == '/' && d2 ==0.0){
                    answerfield.setText("DIVIDE BY 0 ERROR");
                }
                
        }
               
                    
        }
    
    }
}