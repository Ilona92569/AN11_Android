package task1;

import java.util.Scanner;

public class Test {
    public Patient[] patients;

    public Test(){
        this.patients = new Patient[4];
    }

    public void addPatient(){
        patients[0]=new Patient(true, true, true, Vaccine.SPUTNIC);
        patients[1]=new Patient(false, false, false, Vaccine.JANSSEN);
        patients[2]=new Patient(true, false, false, Vaccine.MODERNA);
        patients[3]=new Patient(false, true, true, null);
    }
    public void showMasPatients(){
        for (int i = 0; i < patients.length; i++) {
            System.out.print((i+1)+" patient\t");
            patients[i].showPatients();
            System.out.println();
        }
    }
    public boolean sick( int i){
        int a=0;
        boolean sickCOVID=false;
        if(patients[i-1].wearMask){
            a+=20;
        }
        if (patients[i-1].workRemotely) {
            a+=10;
        }
        if (patients[i-1].crown){
            a+=50;
        }
        if (patients[i-1].vaccine!=null){
            a+=20;
        }
        double sick=0;
        if(a==0) {
            sick=Math.random()*100;
        }
        if(a>0) {
            a = 100 - a;
            System.out.println(a);
            sick = Math.random() * a;
        }
        if (sick>=50) {
            sickCOVID= true;
        }
        return sickCOVID;
    }

    public double antibodies( int i){
        int a=0;
        if (patients[i-1].crown){
            a+=30;
        }
        if (patients[i-1].vaccine!=null){
            a+=70;
        }
        return Math.random()*a;
    }

    public static int int1(){
        Scanner sc = new Scanner(System.in);
        int j;
        do {
            System.out.println("Enter patient number:");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            j = sc.nextInt();
        } while (j < 0 || j > 4);
        return j;
    }
}
