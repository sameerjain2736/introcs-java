public class WorldMap {
    public static void main (String[] args) {
        int width = StdIn.readInt();
        int height = StdIn.readInt();

        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        while(!StdIn.isEmpty()) {
            String regionName = StdIn.readString();
            int vertexNum = StdIn.readInt();

            double[] xVals = new double[vertexNum];
            double[] yVals = new double[vertexNum];

            for (int i = 0; i < vertexNum; i++) {
                xVals[i] = StdIn.readDouble();
                yVals[i] = StdIn.readDouble();
            }
            StdDraw.polygon(xVals, yVals);
        }
    }
}