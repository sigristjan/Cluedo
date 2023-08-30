package ch.bbw.js.cluedo.model;

public class Weapon {
    private String name;
    private String material;
    private Double weight;

    public Weapon(String name, String material, Double weight) {
        this.name = name;
        this.material = material;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
