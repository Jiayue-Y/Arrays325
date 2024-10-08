package LegCount;

public class LegCount {

    public static void main(String[] args) {
        String[] input1 = {"lion", "monkey", "deer", "snake", "elephant"};
        String[] input2 = {"frog", "horse", "spider", "ant"};

        System.out.println(hasFourLegs(input1));
        System.out.println(hasFourLegs(input2));
    }

    static int hasFourLegs(String[] animals){
        final String[] fourLegs = {"lion", "deer", "elephant", "horse",
            "dog", "cat"};

        int count = 0;
        for (String animal : animals) {
            for (int j = 0; j < fourLegs.length; j++) {
                if (animal.equalsIgnoreCase(fourLegs[j])) {
                    count++;
                    j = fourLegs.length;
                }
            }
        }
        return count;
    }
}
