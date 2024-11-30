/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cu;

/**
 *
 * @author Windows
 */
public class PremiumCalculator {
    int calculatePremium(int premiumAmount, int accidentHistory, int drivingExperience){
        premiumAmount += (7500 * accidentHistory);
        if(drivingExperience < 3){
            premiumAmount += 3000;
        } else if(drivingExperience > 5){
            premiumAmount -= (premiumAmount * .10);
        } else if(drivingExperience > 10){
            premiumAmount -= 1500;
            premiumAmount -= (premiumAmount * .20);
        }

        return premiumAmount;
    } 
    
}

