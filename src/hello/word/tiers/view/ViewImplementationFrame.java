/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.word.tiers.view;


import hello.word.tiers.View;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Julen Zarate
 */
public class ViewImplementationFrame implements View{
    public void showGreeting(String greeting) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JOptionPane.showMessageDialog(frame, greeting, greeting,
				JOptionPane.INFORMATION_MESSAGE);
        frame.dispose();
    }

    
    

}
