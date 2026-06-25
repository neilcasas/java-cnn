import data.DataReader;
import data.Image;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Image> imageList = new DataReader().readData("data/mnist_train.csv");
        System.out.println(imageList.get(0).toString());
    }
}
