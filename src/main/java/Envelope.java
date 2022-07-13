public class Envelope {
    public static void main(String[] args) {
        int height = 10;
        int width = 25;
        double tan = (double) width / height;

        final int firstRow = 0;
        final int firstCol = 0;
        final int lastRow = height - 1;
        final int lastCol = width - 1;

        String result = "";
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (row == firstRow ||
                        col == firstCol ||
                        col == lastCol ||
                        row == lastRow ||
                        col == Math.round(row * tan) ||
                        col == lastCol - Math.round(row * tan))
                    result = result + "*";
                else result = result + " ";
            }
            result = result + "\n";
        }
        System.out.println(result);
    }
}