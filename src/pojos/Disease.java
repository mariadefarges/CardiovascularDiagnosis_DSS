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
    
    private double myocardialInfarction;
    private double heartFailure ;
    private double pArterialSisease;
    private double heartBurn;
    private double hypertension;
    private double stroke;
    private double arrythmia;

    public Disease(double myocardialInfarction, double heartFailure, double pArterialSisease, double heartBurn, double hypertension, double stroke, double arrythmia) {
        this.myocardialInfarction = myocardialInfarction;
        this.heartFailure = heartFailure;
        this.pArterialSisease = pArterialSisease;
        this.heartBurn = heartBurn;
        this.hypertension = hypertension;
        this.stroke = stroke;
        this.arrythmia = arrythmia;
    }
    
    public Disease(){
        this.myocardialInfarction = 0;
        this.heartFailure = 0;
        this.pArterialSisease = 0;
        this.heartBurn = 0;
        this.hypertension = 0;
        this.stroke = 0;
        this.arrythmia = 0;
    }

    public double getMyocardialInfarction() {
        return myocardialInfarction;
    }

    public double getHeartFailure() {
        return heartFailure;
    }

    @Override
    public String toString() {
        return "Disease{" + "myocardialInfarction=" + myocardialInfarction + ", heartFailure=" + heartFailure + ", pArterialSisease=" + pArterialSisease + ", heartBurn=" + heartBurn + ", hypertension=" + hypertension + ", stroke=" + stroke + ", arrythmia=" + arrythmia + '}';
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

    public void setMyocardialInfarction(double myocardialInfarction) {
        this.myocardialInfarction = myocardialInfarction;
    }

    public void setHeartFailure(double heartFailure) {
        this.heartFailure = heartFailure;
    }

    public void setpArterialSisease(double pArterialSisease) {
        this.pArterialSisease = pArterialSisease;
    }

    public void setHeartBurn(double heartBurn) {
        this.heartBurn = heartBurn;
    }

    public void setHypertension(double hypertension) {
        this.hypertension = hypertension;
    }

    public void setStroke(double stroke) {
        this.stroke = stroke;
    }

    public void setArrythmia(double arrythmia) {
        this.arrythmia = arrythmia;
    }

    public double getpArterialSisease() {
        return pArterialSisease;
    }

    public double getHeartBurn() {
        return heartBurn;
    }

    public double getHypertension() {
        return hypertension;
    }

    public double getStroke() {
        return stroke;
    }

    public double getArrythmia() {
        return arrythmia;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.myocardialInfarction) ^ (Double.doubleToLongBits(this.myocardialInfarction) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.heartFailure) ^ (Double.doubleToLongBits(this.heartFailure) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.pArterialSisease) ^ (Double.doubleToLongBits(this.pArterialSisease) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.heartBurn) ^ (Double.doubleToLongBits(this.heartBurn) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.hypertension) ^ (Double.doubleToLongBits(this.hypertension) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.stroke) ^ (Double.doubleToLongBits(this.stroke) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.arrythmia) ^ (Double.doubleToLongBits(this.arrythmia) >>> 32));
        return hash;
    }

   
    


    
    
}
