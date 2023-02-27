/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojos;

import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author mariadefarges
 */
public class Disease {
    
    private int myocardialInfarction;
    private int heartFailure ;
    private int pArterialSisease;
    private int heartBurn;
    private int hypertension;
    private int stroke;
    private int arrythmia;

    public Disease(int myocardialInfarction, int heartFailure, int pArterialSisease, int heartBurn, int hypertension, int stroke, int arrythmia) {
        this.myocardialInfarction = myocardialInfarction;
        this.heartFailure = heartFailure;
        this.pArterialSisease = pArterialSisease;
        this.heartBurn = heartBurn;
        this.hypertension = hypertension;
        this.stroke = stroke;
        this.arrythmia = arrythmia;
    }

    public int getMyocardialInfarction() {
        return myocardialInfarction;
    }

    public int getHeartFailure() {
        return heartFailure;
    }

    @Override
    public String toString() {
        return "Disease{" + "myocardialInfarction=" + myocardialInfarction + ", heartFailure=" + heartFailure + ", pArterialSisease=" + pArterialSisease + ", heartBurn=" + heartBurn + ", hypertension=" + hypertension + ", stroke=" + stroke + ", arrythmia=" + arrythmia + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.myocardialInfarction;
        hash = 41 * hash + this.heartFailure;
        hash = 41 * hash + this.pArterialSisease;
        hash = 41 * hash + this.heartBurn;
        hash = 41 * hash + this.hypertension;
        hash = 41 * hash + this.stroke;
        hash = 41 * hash + this.arrythmia;
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
        final Disease other = (Disease) obj;
        if (this.myocardialInfarction != other.myocardialInfarction) {
            return false;
        }
        if (this.heartFailure != other.heartFailure) {
            return false;
        }
        if (this.pArterialSisease != other.pArterialSisease) {
            return false;
        }
        if (this.heartBurn != other.heartBurn) {
            return false;
        }
        if (this.hypertension != other.hypertension) {
            return false;
        }
        if (this.stroke != other.stroke) {
            return false;
        }
        return this.arrythmia == other.arrythmia;
    }

    public void setMyocardialInfarction(int myocardialInfarction) {
        this.myocardialInfarction = myocardialInfarction;
    }

    public void setHeartFailure(int heartFailure) {
        this.heartFailure = heartFailure;
    }

    public void setpArterialSisease(int pArterialSisease) {
        this.pArterialSisease = pArterialSisease;
    }

    public void setHeartBurn(int heartBurn) {
        this.heartBurn = heartBurn;
    }

    public void setHypertension(int hypertension) {
        this.hypertension = hypertension;
    }

    public void setStroke(int stroke) {
        this.stroke = stroke;
    }

    public void setArrythmia(int arrythmia) {
        this.arrythmia = arrythmia;
    }

    public int getpArterialSisease() {
        return pArterialSisease;
    }

    public int getHeartBurn() {
        return heartBurn;
    }

    public int getHypertension() {
        return hypertension;
    }

    public int getStroke() {
        return stroke;
    }

    public int getArrythmia() {
        return arrythmia;
    }
    
    


    
    
}
