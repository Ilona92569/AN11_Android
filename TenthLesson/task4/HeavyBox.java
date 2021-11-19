package task4;

public class HeavyBox implements Comparable<HeavyBox> {
    private int weight, id;

    public HeavyBox(int weight, int id) {
        this.weight = weight;
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(HeavyBox o) {
        return weight - o.weight;
    }
}
