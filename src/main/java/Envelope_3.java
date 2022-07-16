public class Envelope_3 {
    public static void main(String[] args) {
        int height = 13;
        int width = 23;
        double tan = (double) width / height;

        final int firstRow = 0;
        final int firstCol = 0;
        final int lastRow = height - 1;
        final int lastCol = width - 1;

        String result = "";
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if (col == lastCol/2 && row == lastRow/2) result = result + "X";

                else if (row == firstRow ||
                        row == firstRow +1 ||
                        col == firstCol ||
                        col == firstCol + 1 ||
                        col == lastCol ||
                        col == lastCol -1 ||
                        row == lastRow ||
                        row == lastRow - 1 ||
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
