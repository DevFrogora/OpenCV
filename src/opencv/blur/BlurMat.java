/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv.blur;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author root
 */
public class BlurMat {

    public Mat avgBlur(Mat src) {
        // Creating an empty matrix to store the result
        Mat dst = new Mat();

        // Creating the Size and Point objects
        Size size = new Size(45, 45);
        Point point = new Point(20, 30);

        // Applying Blur effect on the Image
        Imgproc.blur(src, dst, size, point, Core.BORDER_DEFAULT);

        return dst;

    }

    public Mat gaussianBlur(Mat src) {
        // Creating an empty matrix to store the result
        Mat dst = new Mat();

        // Creating the Size and Point objects
        Size size = new Size(45, 45);
        Point point = new Point(20, 30);

        // Applying Blur effect on the Image
        Imgproc.GaussianBlur(src, dst, size, 0);

        return dst;

    }

    public Mat medianBlur(Mat src,int kernelSize) {
        // Creating an empty matrix to store the result
        Mat dst = new Mat();

        // Creating the Size and Point objects
        Size size = src.size();
        Point point = new Point(100, 100);

        // Applying Blur effect on the Image
        // Applying MedianBlur on the Image
        Imgproc.medianBlur(src, dst, kernelSize);

        return dst;

    }

}
