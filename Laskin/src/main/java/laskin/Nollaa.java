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
class Nollaa implements Komento {
    TextField tuloskentta;
    TextField syotekentta;
    Button nollaa;
    Button undo;
    Sovelluslogiikka sovellus;
    Integer alkutulos;
    Integer alkusyote;
    
    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovellus = sovellus;
        if (this.tuloskentta.getText().isEmpty()) {
            this.alkutulos = 0;
        } else {
            this.alkutulos = Integer.parseInt(this.tuloskentta.getText());
        }
        if (this.syotekentta.getText().isEmpty()) {
            this.alkusyote = 0;
        } else {
            this.alkusyote = Integer.parseInt(this.syotekentta.getText());
        }

    }

    @Override
    public void suorita() {
        sovellus.nollaa();
        this.tuloskentta.setText(Integer.toString(0));
        this.syotekentta.setText("");
    }

    @Override
    public void peru() {
        sovellus.setTulos(this.alkutulos);
        this.tuloskentta.setText(Integer.toString(this.alkutulos));
        this.syotekentta.setText(Integer.toString(this.alkusyote));
    }
    
}
