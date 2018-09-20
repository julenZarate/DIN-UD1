/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.word.tiers;

/**
 *
 * @author Julen Zarate
 */
public class Controller {
    public void run(Model model, View view){
       String greeting = model.getGreeting();
       view.showGreeting(greeting);
        
    }
}    