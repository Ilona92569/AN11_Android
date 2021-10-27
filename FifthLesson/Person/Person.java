import jacket.Jacket;
import pants.Pants;
import shoes.Shoes;

public class Person {
    public String name;
    public Jacket jacket;
    public Pants pants;
    public Shoes shoes;
    public boolean dressed;

    public Person(String name, Jacket jacket, Pants pants, Shoes shoes){
        this.name=name;
        this.jacket=jacket;
        this.pants=pants;
        this.shoes=shoes;
        this.dressed=false;
    }

    public void getDressed(){
        if(dressed){
            System.out.println("First you need to undress");
            return;
        }
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
        dressed=true;
        System.out.println("Person dressed");
    }

    public void undress(){
        if(!dressed){
            System.out.println("First need to dress");
            return;
        }
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
        dressed=false;
        System.out.println("Person undressed");
    }
}
