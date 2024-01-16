/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game1;

/**
 *
 * @author tishaivana
 */

  public class player {
    
    //atribur
    String name;
    int speed, healthPoint, damage, armor;
    
   //method
    void run(){
         System.out.println(name+" is Running ...");
         System.out.println("Speed "+speed);  
    }
    void attack (){
        System.out.println(name+ " is attack ...");
        System.out.println("Damage" +damage);
        armor -= damage;
        healthPoint = armor;
        
    }
    void defend (){
        System.out.println(name+ " is defend ...");
        System.out.println("Armor"+ armor);
        
    }
    boolean isDead(){
        if(healthPoint<=0) return true;
        return false;
        
    }
}  

