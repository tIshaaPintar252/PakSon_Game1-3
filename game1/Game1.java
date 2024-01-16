package com.mycompany.game1;

/**
 *
 * @author tishaivana
 */
public class Game1 {

    public static void main(String[] args) {
        //Buat Objek
        player hero = new player();

        hero.name = "Adi";
        hero.speed = 60;
        hero.healthPoint = 0;
        hero.damage = 20;
        hero.armor = 15;

        hero.run();
        hero.attack();
        hero.defend();

        if (hero.isDead()) {
            System.out.println("Game over :( ");
        } else {
            System.out.println("masih hidup");
        }
    }
}
