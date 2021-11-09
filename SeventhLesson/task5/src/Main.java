public class Main {
    public static void main(String[] args) {
        Patient ilona = new Patient(1, "Sosna", "Ilona");
        Patient anna = new Patient(2, "Pesetskay", "Anna");
        Patient karina = new Patient(3, "Menkovich", "Karina");
        Test ilonaTest = new Test(ilona);
        Test annaTest = new Test(anna);
        Test karinaTest = new Test(karina);
        System.out.println(Message.message(ilona, ilonaTest));
        System.out.println(Message.message(anna, annaTest));
        System.out.println(Message.message(karina, karinaTest));

    }
}
