package OO.Test2;


public class Main {
    public static void main(String[] args) {

        Tank t1 = new Tank(200, 20);

        Controller c1 = new Controller("mtr2550", 0, 0);

        WashingMachine w1 = new WashingMachine(c1,t1);

        w1.startWashingMachine();

        w1.chooseMode();

        w1.startWashingProcess();

        w1.stopWashingMachine();
    }
}








