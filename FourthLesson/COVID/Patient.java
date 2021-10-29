package zad3;

public class Patient {
    public boolean wearMask, workRemotely, crown;
    public String covid;


    public Patient(boolean wearMask, boolean workRemotely, boolean crown, String covid) {
        this.wearMask = wearMask;
        this.workRemotely = workRemotely;
        this.covid = covid;
        this.crown = crown;
    }

    public void showPatients() {
        System.out.print("Wears a mask: " + wearMask + " Works remotely: " + workRemotely + " Was sick with a COVID-19: " + crown + " Vaccine: " + covid);
    }

}
