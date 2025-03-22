import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
public class colorpicker extends JFrame implements ActionListener{
    
    JButton button;
    JLabel label; 
    
    colorpicker(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setVisible(true);
        
        button = new JButton("Pick a color");
        button.addActionListener(this);


        label = new JLabel(); 
        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setText("This is some text. :D"); 
        label.setFont(new Font("MV Boli", Font.PLAIN,100)); 

        this.add(button);
        this.add(label); 
        this.pack();
        this.setVisible(true); 


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        if(e.getSource()==button){
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null , "Pick a color" , Color.black);
            label.setBackground(color); 

        }
    }

 }