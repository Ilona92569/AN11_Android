package task3;

public enum Colors {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    YELLOW(249, 215, 28),
    GREY(169, 169, 169),
    BLACK(0, 0, 0),
    PINK(255, 203, 219),
    WHITE(255, 255, 255),
    ORANGE(255, 165, 0),
    BROWN(155, 103, 60);

    int R, G, B;

    Colors(int R, int G, int B) {
        this.R = R;
        this.G = G;
        this.B = B;
    }
}
