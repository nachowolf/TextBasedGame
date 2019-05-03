package enums;

public enum Directions {

    N ("north"),
    W ("west"),
    S ("south"),
    E ("east"),
    U ("up"),
    D ("down")

    ;

private final String direction;

    private Directions(String direction) {
        this.direction = direction;
    }
}
