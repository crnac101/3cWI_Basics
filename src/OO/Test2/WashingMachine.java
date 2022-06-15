package OO.Test2;

public class WashingMachine {
    private Controller controller;
    private Tank tank;


    public WashingMachine(Controller controller, Tank tank) {
        this.controller = controller;
        this.tank = tank;
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }


    public void startWashingMachine() {
        controller.setStatus(1);
    }

    public void stopWashingMachine() {
        controller.setStatus(0);
        System.out.println("Waschmaschine ausgeschaltet");
    }

    public void startWashingProcess() {
        System.out.println("Waschvorgang gestartet");
        if (tank.getCurrentLevel()<10) {
            System.out.println("Zu wenig Waschmittel im Tank, starten sie neu");
            stopWashingMachine();
        } else {
            tank.setCurrentLevel(tank.getCurrentLevel()-10);
            System.out.println("Waschmittel im Tank: " + tank.getCurrentLevel());
            if(controller.getSelect() == 1) {
                System.out.println("Erwartete Dauer: 40 min");
            } else if(controller.getSelect() == 2) {
                System.out.println("Erwartete Dauer: 1h");
            } else if(controller.getSelect() == 3){
                System.out.println("Erwartete Dauer: 2h");
            } else {
                System.out.println("Keine erwartete Dauer da falsche Auswahl");
            }
        }
    }

    public void chooseMode() {
        controller.modeSelection();

        if (controller.getSelect() == 1) {
            System.out.println("Der Schnelle Modus wurde gewählt, wollen sie noch zusätzliches Waschmittel auffüllen?");
            System.out.println("Ja   - 1");
            System.out.println("Nein - 2");
            Scanner selectScan2 = new Scanner(System.in);
            int select2 = selectScan2.nextInt();
            if (select2 == 1) {
                System.out.println("Wie viel möchten sie auffüllen? - " + tank.getCurrentLevel() + " verbleibend");
                Scanner fillScan1 = new Scanner(System.in);
                int fillAmmount1 = fillScan1.nextInt();
                if (fillAmmount1 <= tank.getVolume() - tank.getCurrentLevel()) {
                    tank.setCurrentLevel(tank.getCurrentLevel() + fillAmmount1);
                    System.out.println("Waschmittel im Tank:" + tank.getCurrentLevel());
                } else {
                    System.out.println("Zu viel Waschmittel");
                }

            } else if (select2 == 2) {
                System.out.println("Waschmittel im Tank:" + tank.getCurrentLevel());
            }
        } else if (controller.getSelect() == 2) {
            System.out.println("Der Mittlere Modus wurde gewählt, wollen sie noch zusätzliches Waschmittel auffüllen?");
            System.out.println("Ja   - 1");
            System.out.println("Nein - 2");
            Scanner selectScan3 = new Scanner(System.in);
            int select3 = selectScan3.nextInt();
            if (select3 == 1) {
                System.out.println("Wie viel möchten sie auffüllen? - " + tank.getCurrentLevel() + " verbleibend");
                Scanner fillScan2 = new Scanner(System.in);
                int fillAmmount2 = fillScan2.nextInt();
                if (fillAmmount2 <= tank.getVolume() - tank.getCurrentLevel()) {
                    tank.setCurrentLevel(tank.getCurrentLevel() + fillAmmount2);
                    System.out.println("Waschmittel im Tank:" + tank.getCurrentLevel());
                } else {
                    System.out.println("Zu viel Waschmittel");
                }

            }

        } else if (controller.getSelect() == 3) {
            System.out.println("Der Mittlere Modus wurde gewählt, wollen sie noch zusätzliches Waschmittel auffüllen?");
            System.out.println("Ja   - 1");
            System.out.println("Nein - 2");
            Scanner selectScan4 = new Scanner(System.in);
            int select4 = selectScan4.nextInt();
            if (select4 == 1) {
                System.out.println("Wie viel möchten sie auffüllen? - " + tank.getCurrentLevel() + " verbleibend");
                Scanner fillScan3 = new Scanner(System.in);
                int fillAmmount3 = fillScan3.nextInt();
                if (fillAmmount3 <= tank.getVolume() - tank.getCurrentLevel()) {
                    tank.setCurrentLevel(tank.getCurrentLevel() + fillAmmount3);
                    System.out.println("Waschmittel im Tank:" + tank.getCurrentLevel());
                } else {
                    System.out.println("Zu viel Waschmittel");
                }
            }
        }
    }
}

