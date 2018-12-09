/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import statistics.matcher.All;
import statistics.matcher.And;
import statistics.matcher.HasAtLeast;
import statistics.matcher.HasFewerThan;
import statistics.matcher.Matcher;
import statistics.matcher.PlaysIn;

class Querybuilder {
    ArrayList<Matcher> m;

    public Querybuilder() {
        this.m = new ArrayList<>();
    }
    
    public Querybuilder playsIn(String team) {
        m.add(new PlaysIn(team));
        return this;
    }
    
    public Querybuilder hasAtLeast(int value, String category) {
        m.add(new HasAtLeast(value, category));
        return this;
    }
    
    public Querybuilder hasFewerThan(int value, String category) {
        m.add(new HasFewerThan(value, category));
        return this;
    }

    public Matcher build() {
        Matcher[] mArr = new Matcher[m.size()];
        mArr = m.toArray(mArr);
        return new And(mArr);
    }
    
}
