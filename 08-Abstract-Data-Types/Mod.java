public class Mod {
    public static void main (String[] args) {
        int c = 5;
        int r = 0;
        System.out.printf("%d, %d \t",Math.floorMod(c-1,6),Math.floorMod(r-1,6));
        System.out.printf("%d, %d \t",Math.floorMod(c-0,6),Math.floorMod(r-1,6));
        System.out.printf("%d, %d \n",Math.floorMod(c+1,6),Math.floorMod(r-1,6));
        System.out.printf("%d, %d \t",Math.floorMod(c-1,6),Math.floorMod(r-0,6));
        System.out.printf("%d, %d \t",Math.floorMod(c-0,6),Math.floorMod(r-0,6));
        System.out.printf("%d, %d \n",Math.floorMod(c+1,6),Math.floorMod(r-0,6));
        System.out.printf("%d, %d \t",Math.floorMod(c-1,6),Math.floorMod(r+1,6));
        System.out.printf("%d, %d \t",Math.floorMod(c-0,6),Math.floorMod(r+1,6));
        System.out.printf("%d, %d"   ,Math.floorMod(c+1,6),Math.floorMod(r+1,6));
    }
}