package data;


// Class that represents the binary data of the MNIST data and its label (some number like 8)
public class Image {
    double[][] data;
    int label;

    public Image(double[][] data, int label) {
        this.data = data;
        this.label = label;
    }

    public double[][] getData() {
        return data;
    }

    public int getLabel() {
        return label;
    }

    @Override
    public String toString() {

        String labelString = String.valueOf(this.getLabel()) + "\n";
        StringBuilder dataString = new StringBuilder();
        for(int row = 0; row < data.length; row++){
            StringBuilder line = new StringBuilder();
            for (int col = 0; col < data[row].length; col++) {
                line.append(data[row][col]).append(",");
            }
            line.append("\n");
            dataString.append(line);
        }

        return labelString + dataString;
    }
}
