/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game2;

/**
 *
 * @author tishaivana
 */
public class drone {

     //atribut
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;
    
    //method
    boolean terbang(){
        energi--;
        if(energi > 10){
            //terbang berarti nilai ketinggian bertambah
            ketinggian++;
            System.out.println( merek + "Drone terbang...");
        }else{
            System.out.println("energi lemah: Drone ngga bisa terbang");
        }
        energi-=ketinggian;
        kecepatan = energi;    
        return true;
    }
    void matikanMesin(){
        if (ketinggian > 0) {
            System.out.println( merek + "Mesin tidak bisa dimatikan karena sedang terbang");
        }else{
            System.out.println("mesin dimatikan");
        }
    }
    void turun(){
        //ketinggian berkurang, karena turun
        ketinggian--;
        energi--;
        System.out.println( merek + "Drone turun");
    }
    void belok(){
        energi--;
        System.out.println( merek + "Drone belok");
        //belok kemana?perlu di cek:)
    }
    void maju(){
        energi--;
        System.out.println( merek + "Drone maju ke depan");
        kecepatan++;
    }
    void mundur(){
        energi--;
        System.out.println( merek + "Drone mundur");
        kecepatan++;
    }
}

    

