/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.Lez002;

import java.util.Objects;

/**
 *
 * @author tss
 */
public class Cellphone {
    private String gestore;
    private String numtel;

    public Cellphone(String gestore, String numtel) {
        this.gestore = gestore;
        this.numtel = numtel;
    }

    @Override
    public String toString() {
        return "Cellphone{" + "gestore=" + gestore + ", numtel=" + numtel + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.gestore);
        hash = 17 * hash + Objects.hashCode(this.numtel);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cellphone other = (Cellphone) obj;
        if (!Objects.equals(this.gestore, other.gestore)) {
            return false;
        }
        if (!Objects.equals(this.numtel, other.numtel)) {
            return false;
        }
        return true;
    }

    public void setGestore(String gestore) {
        this.gestore = gestore;
    }

    public void setNumtel(String numtel) {
        this.numtel = numtel;
    }
    
    
}
class Tariffa{
    String to;
    String from;
    double cost;
    
    public Tariffa(String from, String to,double cost){
        
        this.from = from;
        this.to = to;
        this.cost = cost;
                
    }
}
