package OO.Car;

public class Tires {
    private int size;
    private int tyreProfile;

    //hallo
    public Tires(int size, int tyreProfile) {
        this.size = size;
        this.tyreProfile = tyreProfile;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTyreProfile() {
        return tyreProfile;
    }

    public void setTyreProfile(int tyreProfile) {
        this.tyreProfile = tyreProfile;
    }
}
