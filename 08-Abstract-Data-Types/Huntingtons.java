public class Huntingtons {

    // Returns the maximum number of consecutive repeats of CAG in the DNA string.
    public static int maxRepeats(String dna) {
        int i = 0;
        int maxCount = 0;
        
        if (dna.length() < 3) return 0;

        while (i < dna.length() - 3) {
            if (dna.substring(i, i+3).equals("CAG")) {
                int curCount = 0;
                while (dna.substring(i, i+3).equals("CAG")) {
                    curCount++;
                    i += 3;
                }
                if (curCount > maxCount) maxCount = curCount; 
            }
            else i++;
        }
        return maxCount;
    }

    // Returns a copy of s, with all whitespace (spaces, tabs, and newlines) removed.
    public static String removeWhitespace(String s) {
        s = s.replace("\n", "");
        s = s.replace("\t", "");
        s = s.replace(" ", "");
        return s;
    }

    // Returns one of these diagnoses corresponding to the maximum number of repeats:
    // "not human", "normal", "high risk", or "Huntington's".
    public static String diagnose(int maxRepeats) {
        if (maxRepeats <= 9 || maxRepeats >= 181) return "not human";
        else if (maxRepeats >= 10 && maxRepeats <= 35) return "normal";
        else if (maxRepeats >= 36 && maxRepeats <= 39) return "high risk";
        else return "Huntington's";

    }

    // Sample client (see below).
    public static void main(String[] args) {
        In input = new In(args[0]);
        String s = input.readAll();
        s = removeWhitespace(s);
        int repeats = maxRepeats(s);
        System.out.printf("max repeats = %d\n", repeats);
        System.out.printf(diagnose(repeats));
    }

}