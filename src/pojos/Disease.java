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
    
    private final Integer diseaseId;
    private String name;
    private double prevalence;

    public Disease(Integer diseaseId, String name, double prevalence) {
        this.diseaseId = diseaseId;
        this.name = name;
        this.prevalence = prevalence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrevalence() {
        return prevalence;
    }

    public void setPrevalence(double prevalence) {
        this.prevalence = prevalence;
    }

    @Override
    public String toString() {
        return "Disease{" + "diseaseId=" + diseaseId + ", name=" + name + ", prevalence=" + prevalence + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.diseaseId);
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.prevalence) ^ (Double.doubleToLongBits(this.prevalence) >>> 32));
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
        if (Double.doubleToLongBits(this.prevalence) != Double.doubleToLongBits(other.prevalence)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.diseaseId, other.diseaseId);
    }
    
    
    
}
