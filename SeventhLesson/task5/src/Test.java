import java.util.Random;

public class Test {
    public boolean test;
    public Patient patient;

    public Test(Patient patient) {
        this.patient = patient;
        this.test = test();
    }

    public boolean test() {
        Random random = new Random();
        int testCOVID = random.nextInt() * 2;
        if (testCOVID > 1) {
            return true;
        }
        return false;
    }
}
