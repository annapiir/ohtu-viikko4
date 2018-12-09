/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author annapiir
 */
class Erotus implements Komento {
    TextField tuloskentta;
    TextField syotekentta;
    Button nollaa;
    Button undo;
    Sovelluslogiikka sovellus;

    public Erotus(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovellus = sovellus;
    }

    @Override
    public void suorita() {
        sovellus.miinus(Integer.parseInt(this.syotekentta.getText()));
        this.tuloskentta.setText(Integer.toString(sovellus.tulos()));
    }

    @Override
    public void peru() {
        sovellus.plus(Integer.parseInt(this.syotekentta.getText()));
        this.tuloskentta.setText(Integer.toString(sovellus.tulos()));
    }
    
}
