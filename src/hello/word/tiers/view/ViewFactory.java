/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.word.tiers;

import hello.word.tiers.view.ViewImplementationFrame;

/**
 *
 * @author Julen Zarate
 */
public class ViewFactory {
    public static View getView(){
        return new ViewImplementationFrame();

    }
}
