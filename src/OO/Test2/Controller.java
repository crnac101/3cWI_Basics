package OO.Test2;

public class Controller {
    public class Controller {
        private String modelNr;
        private int status;
        private int select;

        public Controller(String modelNr, int status, int select) {
            this.modelNr = modelNr;
            this.status = status;
            this.select = select;
        }

        public String getModelNr() {
            return modelNr;
        }

        public void setModelNr(String modelNr) {
            this.modelNr = modelNr;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getSelect() {
            return select;
        }

        public void setSelect(int select) {
            this.select = select;
        }

        public void modeSelection() {
            if (status == 1) {
                System.out.println("---Programm-Auswahl---");
                System.out.println("1 - Schnell (40 min)");
                System.out.println("2 - Mittel (1h)");
                System.out.println("3 - Langsam (2h)");
                Scanner selectScan1 = new Scanner(System.in);
                int select1 = selectScan1.nextInt();
                if (select1 == 1) {
                    setSelect(1);
                } else if (select1 == 2) {
                    setSelect(2);
                } else if (select1 == 3) {
                    setSelect(3);
                } else {
                    System.out.println("Auswahl nicht gültig");
                }

            } else {
                System.out.println("Die Waschmaschine ist ausgeschaltet");
            }
        }
}
