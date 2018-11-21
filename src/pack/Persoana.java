package pack;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Persoana {
    private String nume;
    private String prenume;
    private int age;
    private char sex;
    private static String parola="infoacademy";

    public String[] comp=new String [5];
    
    public static String getParola() {
        return parola;
    }

    public String getPrenume(){
        return prenume;
    }
    public static void setParola(String parola) {
        Persoana.parola = parola;
    }

    public char getSex() {
        return sex;
    }
    
    
    public Persoana(String nume, String prenume, int age, char sex) {
        this.nume = nume;
        this.prenume = prenume;
        this.age = age;
        this.sex = sex;
        
    }
    
    public String toString(){
        String r="";
        if (age>=18) {
                  r="Nume:"+nume+"   Prenume:"+prenume+"   Varsta:"+age+"(major)";
  
        }
        else{
            r="Nume:"+nume+"   Prenume:"+prenume+"   Varsta:"+age+"(minor)";

        }
        return r;
    }
}
