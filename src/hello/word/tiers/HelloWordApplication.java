/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.word.tiers;

/**
 * Aplicacion Hello World with tiers
 * @author Julen Zarate 
 */
public class HelloWordApplication {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ViewFactory vf = new ViewFactory();
        View view = vf.getView();
        
        ModelFactory mf = new ModelFactory();
        Model model = mf.getModel();
        
        Controller c = new Controller();
        c.run(model, view);
    }
    
}
