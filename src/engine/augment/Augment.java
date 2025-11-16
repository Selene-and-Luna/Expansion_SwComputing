package engine.augment;

public class Augment {
    public String name;
    public String description;
    public AugmentEffect effect;

    public Augment(String name, String description, AugmentEffect effect) {
        this.name = name;
        this.description = description;
        this.effect = effect;
    }
}