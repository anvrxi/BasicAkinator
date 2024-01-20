package com.ProDuctive;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String...args){
        boolean y = true;
        boolean n = false;


        //hashmap start
        HashMap c1 = new HashMap();c1.put("name","Info(1)");c1.put("new",n);c1.put("qualified",y);c1.put("5years", y);c1.put("Ploiesti",y);c1.put("Bucuresti",n);c1.put("Pitest",n);c1.put("Brasov",n);c1.put("Constanta",n);c1.put("Targoviste",n);c1.put("Urlati",n);c1.put("Arges",n);c1.put("green",y);c1.put("orange",n);c1.put("purple",n);c1.put("red",n);c1.put("yellow",n);c1.put("blue",n);c1.put("logo",y);
        HashMap c2 = new HashMap();c2.put("name","team2");c2.put("new",n);c2.put("qualified",y);c2.put("5years", y);c2.put("Ploiesti",y);c2.put("Bucuresti",n);c2.put("Pitest",n);c2.put("Brasov",n);c2.put("Constanta",n);c2.put("Targoviste",n);c2.put("Urlati",n);c2.put("Arges",n);c2.put("green",n);c2.put("orange",y);c2.put("purple",n);c2.put("red",n);c2.put("yellow",n);c2.put("blue",n);c2.put("logo",y);
        HashMap c3 = new HashMap();c3.put("name","team3");c3.put("new",n);c3.put("qualified",y);c3.put("5years", y);c3.put("Ploiesti",n);c3.put("Bucuresti",n);c3.put("Pitest",n);c3.put("Brasov",n);c3.put("Constanta",n);c3.put("Targoviste",n);c3.put("Urlati",n);c3.put("Arges",n);c3.put("green",n);c3.put("orange",n);c3.put("purple",n);c3.put("red",n);c3.put("yellow",n);c3.put("blue",n);c3.put("logo",y);
        HashMap c4 = new HashMap();c4.put("name","team4");c4.put("new",n);c4.put("qualified",y);c4.put("5years", y);c4.put("Ploiesti",n);c4.put("Bucuresti",n);c4.put("Pitest",n);c4.put("Brasov",n);c4.put("Constanta",n);c4.put("Targoviste",n);c4.put("Urlati",n);c4.put("Arges",n);c4.put("green",n);c4.put("orange",n);c4.put("purple",n);c4.put("red",n);c4.put("yellow",n);c4.put("blue",n);c4.put("logo",y);
        HashMap c5 = new HashMap();c5.put("name","team5");c5.put("new",n);c5.put("qualified",y);c5.put("5years", y);c5.put("Ploiesti",n);c5.put("Bucuresti",n);c5.put("Pitest",n);c5.put("Brasov",n);c5.put("Constanta",n);c5.put("Targoviste",n);c5.put("Urlati",n);c5.put("Arges",n);c5.put("green",n);c5.put("orange",n);c5.put("purple",n);c5.put("red",n);c5.put("yellow",n);c5.put("blue",n);c5.put("logo",y);
        HashMap c6 = new HashMap();c6.put("name","team6");c6.put("new",n);c6.put("qualified",y);c6.put("5years", y);c6.put("Ploiesti",n);c6.put("Bucuresti",n);c6.put("Pitest",n);c6.put("Brasov",n);c6.put("Constanta",n);c6.put("Targoviste",n);c6.put("Urlati",n);c6.put("Arges",n);c6.put("green",n);c6.put("orange",n);c6.put("purple",n);c6.put("red",n);c6.put("yellow",n);c6.put("blue",n);c6.put("logo",y);
        HashMap c7 = new HashMap();c7.put("name","team7");c7.put("new",n);c7.put("qualified",y);c7.put("5years", y);c7.put("Ploiesti",n);c7.put("Bucuresti",n);c7.put("Pitest",n);c7.put("Brasov",n);c7.put("Constanta",n);c7.put("Targoviste",n);c7.put("Urlati",n);c7.put("Arges",n);c7.put("green",n);c7.put("orange",n);c7.put("purple",n);c7.put("red",n);c7.put("yellow",n);c7.put("blue",n);c7.put("logo",y);
        HashMap c8 = new HashMap();c8.put("name","team8");c8.put("new",n);c8.put("qualified",y);c8.put("5years", y);c8.put("Ploiesti",n);c8.put("Bucuresti",n);c8.put("Pitest",n);c8.put("Brasov",n);c8.put("Constanta",n);c8.put("Targoviste",n);c8.put("Urlati",n);c8.put("Arges",n);c8.put("green",n);c8.put("orange",n);c8.put("purple",n);c8.put("red",n);c8.put("yellow",n);c8.put("blue",n);c8.put("logo",y);
        HashMap c9 = new HashMap();c9.put("name","team9");c9.put("new",n);c9.put("qualified",y);c9.put("5years", y);c9.put("Ploiesti",n);c9.put("Bucuresti",n);c9.put("Pitest",n);c9.put("Brasov",n);c9.put("Constanta",n);c9.put("Targoviste",n);c9.put("Urlati",n);c9.put("Arges",n);c9.put("green",n);c9.put("orange",n);c9.put("purple",n);c9.put("red",n);c9.put("yellow",n);c9.put("blue",n);c9.put("logo",y);
        HashMap c10 = new HashMap();c10.put("name","team10)");c10.put("new",n);c10.put("qualified",y);c10.put("5years", y);c10.put("Ploiesti",n);c10.put("Bucuresti",n);c10.put("Pitest",n);c10.put("Brasov",n);c10.put("Constanta",n);c10.put("Targoviste",n);c10.put("Urlati",n);c10.put("Arges",n);c10.put("green",n);c10.put("orange",n);c10.put("purple",n);c10.put("red",n);c10.put("yellow",n);c10.put("blue",n);c10.put("logo",y);
        //hasmap end

        ArrayList database = new ArrayList();
        database.add(c1);database.add(c2);database.add(c3);database.add(c4);database.add(c5);database.add(c6);database.add(c7);database.add(c8);database.add(c9);database.add(c10);

        
        Scanner sc = new Scanner(System.in);

        System.out.println("is your team new to the FTC program");
        take_input(sc.nextInt(), "new", database);

        System.out.println("Did your team qualify for the final stage? ");
        take_input(sc.nextInt(),"qualified",database);

        System.out.println("is your team in the ftc program for more than 5 years");
        take_input(sc.nextInt(),"5years",database);

        System.out.println("is your team from Ploiesti");
        int temp=sc.nextInt();
        boolean loopend=false;
        if(temp==1)
            take_input(temp,"Ploiesti",database);
        else
        {
            while(!loopend)
            {
                System.out.println("is your team from Bucharest");
                temp=sc.nextInt();
                if(temp==1) {take_input(temp,"Bucuresti",database);break;}

                System.out.println("is your team from Pitesti");temp=sc.nextInt();if(temp==1) {take_input(temp,"Pitesti",database);break;}

                System.out.println("is your team from Brasov");temp=sc.nextInt();if(temp==1) {take_input(temp,"Brasov",database);break;}

                System.out.println("is your team from Constanta");temp=sc.nextInt();if(temp==1) {take_input(temp,"Constanta",database);break;}

                System.out.println("is your team from Targoviste");temp=sc.nextInt();if(temp==1) {take_input(temp,"Targoviste",database);break;}

                System.out.println("is your team from Urlati");temp=sc.nextInt();if(temp==1) {take_input(temp,"Urlati",database);break;}

                System.out.println("is your team from Arges");take_input(sc.nextInt(),"Arges",database);

                loopend=true;
            }
        }

        System.out.println("is your team's color green?");
        temp=sc.nextInt();
        loopend=false;
        if(temp==1)
            take_input(temp,"green",database);
        else
        {
            while(!loopend)
            {
                System.out.println("is your team's color orange");
                temp=sc.nextInt();
                if(temp==1) {take_input(temp,"orange",database);break;}

                System.out.println("is your team's color purple");temp=sc.nextInt();if(temp==1) {take_input(temp,"Pitesti",database);break;}

                System.out.println("is your team's color red");temp=sc.nextInt();if(temp==1) {take_input(temp,"Brasov",database);break;}

                System.out.println("is your team's color yellow");temp=sc.nextInt();if(temp==1) {take_input(temp,"Constanta",database);break;}

                System.out.println("is your team's color blue");take_input(sc.nextInt(),"blue",database);
                loopend=true;
            }
        }





    }

    public static void take_input(int answer, String property, ArrayList database){
        boolean ans;
        if ( answer == 1){
            ans = true;
        }
        else{
            ans = false;
        }
        ArrayList to_remove = new ArrayList();
        for (Object d: database){
            HashMap character = (HashMap) d;
            boolean prop = (boolean)character.get(property);
            if (prop != ans){
                to_remove.add(character);
            }

        }
        for (Object ch: to_remove){
            database.remove(ch);
        }
        if (database.size() == 1){

            HashMap character = (HashMap)database.get(0);
            String name = (String)character.get("name");
            System.out.println("your team is "+name);
            System.exit(0);
        }


    }
}