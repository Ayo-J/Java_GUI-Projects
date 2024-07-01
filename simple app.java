import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame implements ActionListener{
    JLabel label;
    JButton click;
    JTextField text;
    String txt;


    Calculator(){
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Simple");
        setLayout(new FlowLayout());

        label =new JLabel();
        label.setText(txt);

        

        text = new JTextField();
        text.setColumns(15);

        click = new JButton("Click");

        

        this.add(click);
        this.add(label);
        this.setLayout(new FlowLayout());
        this.add(text);
        click.addActionListener(this);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==click){
            System.out.println(text.getText());
            label.setText(text.getText());
        }
        

        //labrl change



    }

}

class example {
    public static void main(String[] args) {
        new Calculator();
    }
}
