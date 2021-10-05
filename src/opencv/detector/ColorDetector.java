/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv.detector;

import opencv.color.ScalarColor;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author root
 */
public class ColorDetector {

    public Mat redOnMat(Mat imageMat) {

        Mat OriginalImage = imageMat.clone();

        Imgproc.cvtColor(OriginalImage, OriginalImage, Imgproc.COLOR_BGR2HSV);
        Mat red = GetColorBinary.selectColorInMatHSV(OriginalImage, ScalarColor.RED1_HSV_LL, ScalarColor.RED1_HSV_HL);
        Mat red1 = GetColorBinary.selectColorInMatHSV(OriginalImage, ScalarColor.RED2_HSV_LL, ScalarColor.RED2_HSV_HL);

        Mat mask = imageMat.clone();
        Core.bitwise_or(red, red1, mask);
        Mat dst = new Mat();
        Core.copyTo(imageMat, dst, mask);

        return dst;
    }

    public Mat blueOnMat(Mat imageMat) {

        Mat OriginalImage = imageMat.clone();

        Imgproc.cvtColor(OriginalImage, OriginalImage, Imgproc.COLOR_BGR2HSV);
        Mat blue = GetColorBinary.selectColorInMatHSV(OriginalImage, ScalarColor.BLUE_HSV_LL, ScalarColor.BLUE_HSV_HL);

        Mat mask = imageMat.clone();
        Core.bitwise_or(blue, blue, mask);
        Mat dst = new Mat();
        Core.copyTo(imageMat, dst, mask);

        return dst;
    }

    public Mat yellowOnMat(Mat imageMat) {

        Mat OriginalImage = imageMat.clone();

        Imgproc.cvtColor(OriginalImage, OriginalImage, Imgproc.COLOR_BGR2HSV);
        Mat yellowMat = GetColorBinary.selectColorInMatHSV(OriginalImage, ScalarColor.YELLOW_HSV_LL, ScalarColor.YELLOW_HSV_HL);

        Mat mask = imageMat.clone();
        Core.bitwise_or(yellowMat, yellowMat, mask);
        Mat dst = new Mat();
        Core.copyTo(imageMat, dst, mask);

        return dst;
    }
    
     public Mat blackOnMat(Mat imageMat) {

        Mat OriginalImage = imageMat.clone();

        Imgproc.cvtColor(OriginalImage, OriginalImage, Imgproc.COLOR_BGR2HSV);
        Mat blackMat = GetColorBinary.selectColorInMatHSV(OriginalImage, ScalarColor.BLACK_HSV_LL, ScalarColor.BLACK_HSV_HL);
        Imgproc.cvtColor(blackMat, blackMat, Imgproc.COLOR_GRAY2RGB);

        return blackMat;
    }
     
      public Mat greenOnMat(Mat imageMat) {

        Mat OriginalImage = imageMat.clone();

        Imgproc.cvtColor(OriginalImage, OriginalImage, Imgproc.COLOR_BGR2HSV);
        Mat greenMat = GetColorBinary.selectColorInMatHSV(OriginalImage, ScalarColor.GREEN_HSV_LL, ScalarColor.GREEN_HSV_HL);

        Mat mask = imageMat.clone();
        Core.bitwise_or(greenMat, greenMat, mask);
        Mat dst = new Mat();
        Core.copyTo(imageMat, dst, mask);

        return dst;
    }

}
