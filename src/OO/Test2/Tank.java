package OO.Test2;

public class Tank {
    private int Volume;
    private int currentLevel;

    public Tank(int volume, int currentLevel) {
        Volume = volume;
        this.currentLevel = currentLevel;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int volume) {
        Volume = volume;
    }

    public int getCurrentLevel(){
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel){
        this.currentLevel = currentLevel;
    }



}

