public class CesarCode {
    public static void main(String[] args){
        String alphabet [] = {"A", "B", "C", "D", "E", "F", "G",
                "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
                "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        String message [] = {"Q", "U", "E", "R", "O", " ", "C", "A", "F", "E"};

        for(int j = 0; j < 1; j++){
            System.out.print("Mensagem original: ");
            for (int x = 0; x < 10; x++) {
                System.out.print(message[x]);
            }
        }

        for(int y = 0; y < 10; y++){

            switch(message[y]){
                case "Q":
                    message[y] = alphabet[19];

                    break;

                case "U":
                    message[y] = alphabet[23];

                    break;

                case "E":
                    message[y] = alphabet[7];

                    break;

                case "R":
                    message[y] = alphabet[20];

                    break;

                case "O":
                    message[y] = alphabet[17];

                    break;

                case "C":
                    message[y] = alphabet[5];

                    break;

                case "A":
                    message[y] = alphabet[3];

                    break;

                case "F":
                    message[y] = alphabet[8];

                    break;
                case " ":
                    message[y] = " ";

                    break;

                default:
                    System.out.println("CARACTERE INVÁLIDO!");
            }
        }

        for(int k = 0; k < 1; k++){
            System.out.print("\nMensagem criptografada: ");
            for (int z = 0; z < 10; z++){
                System.out.print(message[z]);
            }
        }

    }
}
