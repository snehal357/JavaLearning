public class SwitchChallenge {
    public static void main(String[] args) {
        char alpha;

        alpha = 'A';

        System.out.println("Input: "+ alpha + ", Output: "+ getNATOSyntax(alpha));

        alpha = 'C';
        System.out.println("Input: "+ alpha + ", Output: "+ getNATOSyntax(alpha));

        alpha = 'E';
        System.out.println("Input: "+ alpha + ", Output: "+ getNATOSyntax(alpha));

        alpha = 'Z';
        System.out.println("Input: "+ alpha + ", Output: "+ getNATOSyntax(alpha));

    }

    //Traditional Switch case
    public static String getNATOSyntax(char input){
        String output;
        switch (input) {
            case 'A':
                output = "Able";
                break;
            case 'B':
                output = "Baker";
                break;
            case 'C':
                output = "Charlie";
                break;
            case 'D':
                output = "Dog";
                break;
            case 'E':
                output = "Easy";
                break;
            default:
                output = "Invalid Input";
        }

        return output;
    }
}
