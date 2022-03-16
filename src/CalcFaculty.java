public class CalcFaculty {

    public static void main(String[] args) {
        System.out.println(calcFaculty(10));

    }

    public static long calcFaculty (int value) {
        assert value >= 0;
        int newValue = 1;
        for (int i = 2; i <= value; i++) {
            newValue = i * newValue;
        }
        return newValue;
    }
}
