public class Main {
    public static void main(String[] args) {
        System.out.println("**********Method Overloading*********");

        int feet = 5;
        int inches = 8;

        System.out.println(feet+"ft, "+inches+"inches = "+convertToCentimeters(feet, inches));

        inches = 68;
        System.out.println(inches+"inches = "+convertToCentimeters(inches));
    }

    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
        int footToInches = feet * 12;
        footToInches += inches;

        return convertToCentimeters(footToInches);
    }
}
