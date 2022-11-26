/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7_progra1_carlos_noé;

import java.util.Random;

/**
 *
 * @author cd507
 */
public class Seleccion {
    public String nameGroup;
    public String nameSelecc;
    public String nameDT;
    public String Place;
    public int players;
    public int AmounGoals;
    public String Winner;

        public Seleccion(String nameGroup, String nameSelecc, String nameDT, String Place, int players, int AmounGoals, String Winner ){
        this.nameGroup= nameGroup;
        this.nameSelecc= nameSelecc;
        this.nameDT= nameDT;
        this.Place= Place;
        this.players= players;
        this.AmounGoals= AmounGoals;
        this.Winner= Winner;
        
        
        
        }

    @Override
    public String toString() {
        return "Seleccion " + "nameGroup=" + nameGroup + ", nameSelecc=" + nameSelecc + ", nameDT=" + nameDT + ", Place=" + Place + ", players=" + players + ", AmounGoals=" + AmounGoals + ", Winner=" + Winner + '}';
    }
    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public String getNameSelecc() {
        return nameSelecc;
    }

    public void setNameSelecc(String nameSelecc) {
        this.nameSelecc = nameSelecc;
    }

    public String getNameDT() {
        return nameDT;
    }

    public void setNameDT(String nameDT) {
        this.nameDT = nameDT;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String Place) {
        this.Place = Place;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public int getAmounGoals() {
        return AmounGoals;
    }

    public void setAmounGoals(int AmounGoals) {
        this.AmounGoals = AmounGoals;
    }

    public String getWinner() {
        return Winner;
    }

    public void setWinner(String Winner) {
        this.Winner = Winner;
    }
 
    public void setGoles(){
    int Random = new Random().nextInt((4-0)+1)+0;
    AmounGoals=Random;  
}
}
