public class Arrays {
    public static void main(String[] args) {

        int[] throwsArray = new int[6];
        System.out.println(throwsArray[4]);

        for (int i = 0; i < throwsArray.length; i++) {
            System.out.println(throwsArray[i]);
        }


        int[][] playGround;
        playGround = new int[3][3];
        playGround[0][0] = 1;


        for (int row = 0; row < playGround.length; row++) {
            for (int col = 0; col < playGround.length; col++) {
                System.out.print(playGround[row][col] + "");
            }
            System.out.print(playGround);
        }
    }
}