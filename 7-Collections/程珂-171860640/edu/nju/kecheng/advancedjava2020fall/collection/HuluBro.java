package edu.nju.kecheng.advancedjava2020fall.collection;

import java.util.Comparator;
import java.util.Random;
import static java.lang.Math.abs;

enum Gender{MALE,FEMALE}

enum Color{RED,ORANGE,YELLOW,GREEN,CRAN,BLUE,PURPLE}

class BroComparator implements Comparator<HuluBro>{
    @Override
    public int compare(HuluBro bro1,HuluBro bro2){
        return bro1.getName().compareTo(bro2.getName());
    }
}

class HuluBro implements Comparable<HuluBro>{
    public final static int COLOR_MAX_NUM=Color.values().length;
    public final static int GENDER_MAX_NUM=Gender.values().length;
    private static int MAX_SINGLE_NUM;
    private static int TOTOAL_NUM;
    private static int[] broNums;
    static{
        TOTOAL_NUM=0;
        MAX_SINGLE_NUM=0;
        broNums=new int[COLOR_MAX_NUM];
        for(int i=0;i<COLOR_MAX_NUM;i++)broNums[i]=0;
    }

    private Gender gender;
    private Color color;

    private  HuluBro(Gender g,Color c){
        gender=g;
        color=c;
    }

    static public HuluBro getHuluBro(){
        Random random=new Random();
        int gdRandom= abs(random.nextInt()%GENDER_MAX_NUM);
        //
        int clrRandom=abs(random.nextInt() % COLOR_MAX_NUM);
        if(TOTOAL_NUM==MAX_SINGLE_NUM*COLOR_MAX_NUM){//到临界值
            MAX_SINGLE_NUM++;
        }else{
            while(broNums[clrRandom]==MAX_SINGLE_NUM){
                clrRandom=abs(random.nextInt()% COLOR_MAX_NUM);
            }
        }
        broNums[clrRandom]++;
        TOTOAL_NUM++;

        return new HuluBro(Gender.values()[gdRandom],
                Color.values()[clrRandom]);
    }

    public String getName(){
        return this.color.toString();
    }

    public Gender getGender(){ return this.gender; }

    @Override
    public int compareTo(HuluBro o){
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString(){
        return color.toString()+","+ gender.toString();
    }
}
