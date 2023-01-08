package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 //TODO  +/- císlo - zmena znamienka doriesit


public class calcGui {
    private JButton button0;
    private JButton buttonplusminus;
    private JButton buttoncomma;
    private JButton button1;
    private JButton button4;
    private JButton button3;
    private JButton button5;
    private JButton button2;
    private JButton button6;
    private JButton buttonplus;
    private JButton buttonminus;
    private JButton buttonmultiply;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttondivide;
    private JButton buttonclear;
    private JPanel panelMain;
    private JTextPane display;
    private JFormattedTextField display2;
    private JButton buttonresult;


    private double value1=0;
    private String readvalue="";
    private double result=0;
    private String operacia="";


    //display2.setText(String.valueOf(value1));


    static double calcresult (double hodnota,double vysledok, String operacia) {
        //kroky podla operacie +-*/

        switch (operacia) {
            case "+":
                return vysledok + hodnota;
            case "-":
                return vysledok - hodnota;
            case "*":
                return  vysledok * hodnota;
            case "/":
                return  vysledok / hodnota;
                                        }

        return hodnota;
    }

public calcGui() {
    buttonclear.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            value1=0;
            result=0;
            readvalue="";
            operacia="";
            display.setText("0");
            display2.setText(String.valueOf(result));

        }
    });
    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            readvalue=readvalue+"1";
            display.setText(readvalue);
        }

    });
    button2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            readvalue=readvalue+"2";
            display.setText(readvalue);
        }
    });
    buttoncomma.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            if(readvalue.indexOf(".")!=-1)
            {
                // uz tam je desatinna ciarka/bodka
            }
            else
            {
                if (readvalue.length()==0) { readvalue=readvalue+"0"; }

                readvalue=readvalue+".";
            }

            display.setText(readvalue);


        }
    });
    button3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            readvalue=readvalue+"3";
            display.setText(readvalue);

        }
    });
    button4.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            readvalue=readvalue+"4";
            display.setText(readvalue);
        }
    });
    button5.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            readvalue=readvalue+"5";
            display.setText(readvalue);
        }
    });
    button6.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            readvalue=readvalue+"6";
            display.setText(readvalue);
        }
    });
    button7.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            readvalue=readvalue+"7";
            display.setText(readvalue);
        }
    });
    button8.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            readvalue=readvalue+"8";
            display.setText(readvalue);
        }
    });
    button9.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            readvalue=readvalue+"9";
            display.setText(readvalue);
        }
    });
    button0.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            if(readvalue=="")

                //|| (readvalue.indexOf(",")==readvalue.length()))
            {
                // hodnota je stale prazdna,
            }
            else
            {
                readvalue=readvalue+"0";
            }

            display.setText(readvalue);
        }
    });
    buttonplus.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (readvalue=="") readvalue="0";

            double value1 = Double.parseDouble(readvalue);
            result=calcresult(value1,result,operacia);

            operacia = "+";

            display.setText(String.valueOf(result));
            display2.setText(result +operacia);
            readvalue="";

        }
    });
    buttonminus.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (readvalue=="") readvalue="0";

            double value1 = Double.parseDouble(readvalue);
            result=calcresult(value1,result,operacia);

            operacia = "-";

            display.setText(String.valueOf(result));
            display2.setText(result +operacia);
            readvalue="";


        }
    });
    buttonresult.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (readvalue=="") readvalue="0";
            double value1 = Double.parseDouble(readvalue);
            result=calcresult(value1,result,operacia);

            display.setText(String.valueOf(result));
            display2.setText(result +operacia);
           // readvalue="";

        }
    });
    buttonmultiply.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (readvalue=="") readvalue="1";
            double value1 = Double.parseDouble(readvalue);

            result=calcresult(value1,result,operacia);
            operacia = "*";

            display.setText(String.valueOf(result));
            display2.setText(result +operacia);
            readvalue="";
        }
    });
    buttondivide.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (readvalue=="") readvalue="1";
            double value1 = Double.parseDouble(readvalue);
            result=calcresult(value1,result,operacia);

            operacia = "/";

            display.setText(String.valueOf(result));
            display2.setText(result +operacia);
            readvalue="";
        }
    });
    buttonplusminus.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            double value1 = Double.parseDouble(readvalue);
            value1=value1*(-1);
            String readvalue = String.valueOf(value1);
            display.setText(readvalue);
        }
    });
}

    public static void main(String[] args) {

        JFrame frame= new JFrame("Simple Calculator - Radvanisko");
        frame.setContentPane(new calcGui().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


}



