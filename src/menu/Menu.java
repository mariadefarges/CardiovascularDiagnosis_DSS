/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

/**
 *
 * @author carlo
 */

import pojos.*;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Menu {
    public static void main(String[] args) {
        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();

        execute(kc);
    }
    public static void execute(KieContainer kc) {
        boolean chestpain = true;
        boolean sweating = true;
        boolean nausea = true;
    
        boolean legs_pain = false;
        boolean skin_changes = false;
        boolean decreased_pulse = false;
    
        boolean legs_swealing = false;
        boolean shortnessofbreath = true;
        boolean tiredness = false;
    
        boolean increased_pulse = false;
        boolean headache = false;
        boolean dizziness = false;
    
        boolean neck_shoulder_back_pain = false;
        boolean palpitations = false;
        
        KieSession ksession = kc.newKieSession("CardiovascularDiagnosisKS");
        Patient p1 = new Patient(chestpain, sweating, nausea, legs_pain, skin_changes, decreased_pulse, legs_swealing,
                        shortnessofbreath, tiredness, increased_pulse, headache, dizziness, neck_shoulder_back_pain, palpitations);
        
        ksession.insert(p1);
        ksession.fireAllRules();
        System.out.println(p1.getDisease().getMyocardialInfarction());
        
        ksession.dispose();

    }
}
