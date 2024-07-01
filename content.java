import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame extends JFrame {
  JPanel input, main, btnpanel;
  JLabel name, phone;
  JTextField namet, phonet;
  JButton add, delete;

  private String insertname; 
  private String insertphone;

  public Contact(String insertname , String insertphone){
    this.insertname=insertname;
    this.insertphone=insertphone;
  }

  public String getInsertname(){
    return insertname;
  }

  public String getInsertphone(){
    return insertphone;
  }



  MyFrame() {
    input = new JPanel(new GridLayout(2, 2));

    name = new JLabel("Name");
    phone = new JLabel("Phone Number");

    namet = new JTextField();
    phonet = new JTextField();

    add = new JButton("Add");
    delete = new JButton("Delete");

    // Add components to input panel
    input.add(name);
    input.add(namet);
    input.add(phone);
    input.add(phonet);

    // Initialize the main panel
    main = new JPanel(new BorderLayout());
    main.add(input, BorderLayout.NORTH);

    // Initialize the button panel and add buttons
    btnpanel = new JPanel(new FlowLayout());
    btnpanel.add(add);
    btnpanel.add(delete);
    main.add(new ScrollPane() , BorderLayout.CENTER);
    // Add the button panel to the main panel
    main.add(btnpanel, BorderLayout.SOUTH);

    // Add the main panel to the frame
    this.add(main);

    // Set frame properties
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(600, 300);
    this.setVisible(true);
  }
}

class Content {
  public static void main(String[] args) {
    new MyFrame();
  }
}
