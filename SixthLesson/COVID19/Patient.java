package task1;

public class Patient {
    public boolean wearMask, workRemotely, crown;
    public Vaccine vaccine;


    public Patient(boolean wearMask, boolean workRemotely, boolean crown, Vaccine vaccine) {
        this.wearMask = wearMask;
        this.workRemotely = workRemotely;
        this.vaccine=vaccine;
        this.crown = crown;
    }

    public void showPatients() {
        System.out.print("Wears a mask: " + wearMask + " Works remotely: " + workRemotely + " Was sick with a COVID-19: " + crown + " Vaccine: " + vaccine);
    }

}
