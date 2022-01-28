public class Caesar {
    public static void main(String[] args) {
        System.out.println("Geben Sie hier ihre Nachricht ein");
        Scanner scanner = new Scanner(System.in);
        String inputMessage = scanner.next();
        int move = 2;

        char source[] = inputMessage.toCharArray();


        String result = encrypt(source, move);
        System.out.println(result);

        char[] convertDataForDecryption = result.toCharArray();
        String resultD = decrypt(convertDataForDecryption, move);
        System.out.println(resultD);

    }

    private static String encrypt(char[] source,int move) {
        String[] encryptedOutput = new String[source.length];
        String encrypt = "";
        for (int e = 0; e < source.length; e++) {
            int newLetter = source[e] + move;
            if (newLetter > 122) {
                newLetter -= 26;
                encrypt = Character.toString(newLetter);
                encryptedOutput[e] = encrypt;

            } else {
                encrypt = Character.toString(newLetter);
                encryptedOutput[e] = encrypt;

            }
        }
    }
