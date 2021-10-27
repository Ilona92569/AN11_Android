import start.IStart;

public class Spaceport {
    //    public IStart iStart;
//     public Spaceport(IStart iStart){
//         this.iStart=iStart;
//     }
    public static void launch(IStart iStart) {
        if (!iStart.systemCheck()) {
            System.out.println("Check failed");
            return;
        }
        iStart.engineStarting();
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();
        iStart.start();
    }
}
