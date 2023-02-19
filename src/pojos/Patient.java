/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojos;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author mariadefarges
 */
public class Patient implements Serializable{
    
    private static final long serialVersionUID = -1L;
    
    private final Integer patientId;
    private String name;
    private String surname;
    private String gender;
    private final Date birthDate;
    private String weight;
    private final String bloodType;
    private String background;

    public Patient(Integer patientId, String name, String surname, String gender, Date birthDate, String weight, String bloodType, String background) {
        this.patientId = patientId;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.weight = weight;
        this.bloodType = bloodType;
        this.background = background;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.patientId);
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.surname);
        hash = 67 * hash + Objects.hashCode(this.gender);
        hash = 67 * hash + Objects.hashCode(this.birthDate);
        hash = 67 * hash + Objects.hashCode(this.weight);
        hash = 67 * hash + Objects.hashCode(this.bloodType);
        hash = 67 * hash + Objects.hashCode(this.background);
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
        final Patient other = (Patient) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        if (!Objects.equals(this.weight, other.weight)) {
            return false;
        }
        if (!Objects.equals(this.bloodType, other.bloodType)) {
            return false;
        }
        if (!Objects.equals(this.background, other.background)) {
            return false;
        }
        if (!Objects.equals(this.patientId, other.patientId)) {
            return false;
        }
        return Objects.equals(this.birthDate, other.birthDate);
    }

    @Override
    public String toString() {
        return "Patient{" + "patientId=" + patientId + ", name=" + name + ", surname=" + surname + ", gender=" + gender + ", birthDate=" + birthDate + ", weight=" + weight + ", bloodType=" + bloodType + ", background=" + background + '}';
    }
    
    

    
}
