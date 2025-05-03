public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println("**********Method Overloading*********");

        System.out.println(getDurationString(45));
    }

    public static String getDurationString(int seconds){
        int mins = seconds / 60;
        int remainingSeconds = seconds% 60;

        return getDurationString(mins, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds){
        int hours = minutes / 60;
        int remainingMins = minutes % 60;

        return hours+"hrs "+remainingMins+"mins "+seconds+"Sec";
    }

}
