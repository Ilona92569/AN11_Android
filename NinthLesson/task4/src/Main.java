import java.io.*;

public class Main {
    public static void main(String[] args) {
        Auto audi = new Auto("AUDI", 250, 35000);
        String file = "E:\\JetBrains\\AN11_Android\\NinthLesson\\task4\\Task.txt";
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream (file));
            objectOutputStream.writeObject(audi);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            try {
                Auto audi2 = (Auto) objectInputStream.readObject();
                System.out.println(audi2);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}