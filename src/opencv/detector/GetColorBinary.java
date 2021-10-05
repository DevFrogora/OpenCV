/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv.detector;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author root
 */
public class GetColorBinary {

    public static Mat selectColorInMat(Mat srcMat, Scalar lowBound, Scalar upperBound) {

        Core.inRange(srcMat, lowBound, upperBound, srcMat);

        return srcMat;

    }

    public static Mat selectColorInMatHSV(Mat srcMat, Scalar lowBound, Scalar upperBound) {

//        Imgproc.cvtColor(srcMat, srcMat, Imgproc.COLOR_BGR2HSV);
        Mat dstMat = new Mat();
        Core.inRange(srcMat, lowBound, upperBound, dstMat);

        return dstMat;

    }

    public static Mat selectColorInMat(Mat srcMat, Scalar scalarColor) {
        Mat dstMat = new Mat();

        Core.inRange(srcMat, scalarColor, scalarColor, dstMat);

        return dstMat;

    }

}
