package com.company.barcl;


import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,val=0;
        String str="";
        //Scan Total number of Coins and Notes
        //given by client
        n=sc.nextInt();
        //A bag to store Coins
        Bag<Coin> bagOfCoins=new Bag<Coin>();
        //A bag to store Notes
        Bag<Note> bagOfNotes=new Bag<Note>();
        for(int i=0;i<n;i++)
        {
            //Scan whether its a Coin or a Note
            str=sc.next();
            //Scan the denomination of the Coin/Note
            val=sc.nextInt();
            switch(str)
            {
                case  "Coin":
                    Coin coin=new Coin();
                    //Set the value of Coin and add it to the bag
                    coin.setValue(val);
                    bagOfCoins.add(coin);
                    break;
                case  "Note":
                    Note note=new Note();
                    //Set the value of Note and add it to the bag
                    note.setValue(val);
                    bagOfNotes.add(note);
                    break;
            }
        }
        System.out.println("Coins :");
        bagOfCoins.display();
        System.out.println("Notes :");
        bagOfNotes.display();
    }

    static class Bag<T extends Denomination> {

        private List<T> list = new ArrayList<>();

        void add(T t){
            this.list.add(t);
        }

        void display(){
            list.stream().map(Denomination::getValue).forEach(System.out::println);
        }
    }

    static class Coin implements Denomination{

        private int val;

        public int getValue() {
            return val;
        }

        public void setValue(int val) {
            this.val = val;
        }
    }

    static class Note implements Denomination {
        private int val;

        public int getValue() {
            return val;
        }

        public void setValue(int val) {
            this.val = val;
        }
    }
}