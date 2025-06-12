import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{
    final JTextField textfield1;
    int statusx = 0;  // 0 ยังไม่คีย์เข้า  1 คีย์เข้าข้อมูลตัวแรก   2 //เก็บเครื่องหมาย 3 คีย์เข้าข้อมูลตัวที่สอง   4 แสดงคำตอบ   5 clear
    int statusop = 0;   // 1 = +   ; 2 = -  ; 3 = * ; 4 = / ; 5 = C ; 
    int set1 = 0;
    
    public Calculator()
    {
        setTitle("Calculator");
        statusx = 0;
        setSize(360,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        textfield1 = new JTextField("0",SwingConstants.LEFT);
        textfield1.setFont(textfield1.getFont().deriveFont(28.0f));
        getContentPane().add(textfield1,BorderLayout.PAGE_START);
        final JPanel buttonPanel = new JPanel();
        getContentPane().add(buttonPanel,BorderLayout.CENTER);
        String x[] = {"1" , "2" ,"3" , "+" , "4" , "5" , "6" ,"-","7" ,"8" ,"9", "*" ,"0" , "=", "C" ,"/"};
        buttonPanel.setLayout(new GridLayout(4,4));
        final JButton button[] = new JButton[16];
        for (int i = 0; i < 16; i++)
        {
            button[i] = new JButton(x[i]);
            button[i].setActionCommand(x[i]);
            button[i].addActionListener(this);
            buttonPanel.add(button[i]);
        }
    }   

    public void actionPerformed(ActionEvent e)
    {
        JButton button = (JButton) e.getSource();
        if (button.getActionCommand().equals("="))
        {
            
            if (statusx == 1)
            {
                if (statusop == 1)
                {
                    int answerx =  set1 + Integer.parseInt(textfield1.getText()); 
                    textfield1.setText(String.valueOf(answerx)); 

                } 
                else if (statusop == 2)
                {
                   
                    int answerx =  set1 - Integer.parseInt(textfield1.getText()); 
                    textfield1.setText(String.valueOf(answerx));
                }
                 else if (statusop == 3)
                {
                    int answerx =  set1 * Integer.parseInt(textfield1.getText()); 
                    textfield1.setText(String.valueOf(answerx));
                }
                else if (statusop == 4)
                {
                    int answerx =  set1 / Integer.parseInt(textfield1.getText()); 
                    textfield1.setText(String.valueOf(answerx));
                }
            }            
        }
        // การกระทำ + - * /
        if (button.getActionCommand().equals("+"))
        {
            if (statusx == 1)
            {
                statusop = 1; // +
                statusx = 2;  // แสดงว่าการเก็บเครื่องหมาย
                set1 =  Integer.parseInt( textfield1.getText());
            }
            
        }

        if (button.getActionCommand().equals("-"))
        {
            if (statusx == 1)
            {
                statusop = 2; // -
                statusx = 2;  // แสดงว่าการเก็บเครื่องหมาย
                set1 =  Integer.parseInt( textfield1.getText());
            }
            
        }

        if (button.getActionCommand().equals("*"))
        {
            if (statusx == 1)
            {
                statusop = 3; // *
                statusx = 2;  // แสดงว่าการเก็บเครื่องหมาย
                set1 =  Integer.parseInt( textfield1.getText());
            }
            
        }

        if (button.getActionCommand().equals("/"))
        {
            if (statusx == 1)
            {
                statusop = 4; // /
                statusx = 2;  // แสดงว่าการเก็บเครื่องหมาย
                set1 =  Integer.parseInt( textfield1.getText());
            }
            
        }

        if (button.getActionCommand().equals("C"))
        {
            if (statusx == 1)
            {
                statusop = 5; // C
                statusx = 2;  // แสดงว่ามีการเก็บเครื่องหมาย
                set1 =  0;
                textfield1.setText(String.valueOf(set1));
                set1 =  Integer.parseInt( textfield1.getText());
            }
            
        }

        // ตัวเลข
        if (button.getActionCommand().equals("1"))
        {
            if (statusx == 1)
            {
                textfield1.setText( textfield1.getText() + "1");
            }
            if (statusx == 0 || statusx == 2)
            {
                textfield1.setText("1");
                statusx = 1;
            }
        }
        if (button.getActionCommand().equals("2"))
        {
            if (statusx == 1)
            {
                textfield1.setText( textfield1.getText() + "2");
            }
            if (statusx == 0 || statusx == 2)
            {
                textfield1.setText("2");
                statusx = 1;
            }
        }
        if (button.getActionCommand().equals("3"))
        {
            if (statusx == 1)
            {
                textfield1.setText( textfield1.getText() + "3");
            }
            if (statusx == 0 || statusx == 2)
            {
                textfield1.setText("3");
                statusx = 1;
            }
        }
        if (button.getActionCommand().equals("4"))
        {
            if (statusx == 1)
            {
                textfield1.setText( textfield1.getText() + "4");
            }
            if (statusx == 0 || statusx == 2)
            {
                textfield1.setText("4");
                statusx = 1;
            }
        }
        if (button.getActionCommand().equals("5"))
        {
            if (statusx == 1)
            {
                textfield1.setText( textfield1.getText() + "5");
            }
            if (statusx == 0 || statusx == 2)
            {
                textfield1.setText("5");
                statusx = 1;
            }
        }
        if (button.getActionCommand().equals("6"))
        {
            if (statusx == 1)
            {
                textfield1.setText( textfield1.getText() + "6");
            }
            if (statusx == 0 || statusx == 2)
            {
                textfield1.setText("6");
                statusx = 1;
            }
        }
        if (button.getActionCommand().equals("7"))
        {
            if (statusx == 1)
            {
                textfield1.setText( textfield1.getText() + "7");
            }
            if (statusx == 0 || statusx == 2)
            {
                textfield1.setText("7");
                statusx = 1;
            }
        }
        if (button.getActionCommand().equals("8"))
        {
            if (statusx == 1)
            {
                textfield1.setText( textfield1.getText() + "8");
            }
            if (statusx == 0 || statusx == 2)
            {
                textfield1.setText("8");
                statusx = 1;
            }
        }
        if (button.getActionCommand().equals("9"))
        {
            if (statusx == 1)
            {
                textfield1.setText( textfield1.getText() + "9");
            }
            if (statusx == 0 || statusx == 2)
            {
                textfield1.setText("9");
                statusx = 1;
            }
        }
        if (button.getActionCommand().equals("0"))
        {
            if (statusx == 1)
            {
                textfield1.setText( textfield1.getText() + "0");
            }
            if (statusx == 0 || statusx == 2)
            {
                textfield1.setText("0");
                statusx = 1;
            }
        }

        
    }

    public static void main(String [] args)
    {
        Calculator app = new Calculator();
        app.setVisible(true);

    }
}