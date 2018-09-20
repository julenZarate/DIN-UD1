/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.word.tiers;

import hello.word.tiers.view.ViewImplementationFrame;
import hello.word.tiers.view.ViewImplementationJFX;

/**
 *
 * @author Julen Zarate
 */
public class ViewFactory {
    public static View getView(){
        return new ViewImplementationJFX();

    }
}
