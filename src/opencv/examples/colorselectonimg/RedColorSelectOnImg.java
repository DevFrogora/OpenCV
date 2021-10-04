/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv.examples.colorselectonimg;

import opencv.color.ScalarColor;
import opencv.detector.ColorDetector;
import opencv.lifecycle.OpenCVLifeCycle;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author root
 */
public class RedColorSelectOnImg extends OpenCVLifeCycle {

    @Override
    public void run() {

        setRandomShape();
        Mat OriginalImage = imageMat.clone();
        
        Imgproc.cvtColor(OriginalImage, OriginalImage, Imgproc.COLOR_BGR2HSV);
        Mat red = ColorDetector.selectColorInMatHSV(OriginalImage, ScalarColor.RED1_HSV_LL, ScalarColor.RED1_HSV_HL);
        Mat red1 = ColorDetector.selectColorInMatHSV(OriginalImage, ScalarColor.RED2_HSV_LL, ScalarColor.RED2_HSV_HL);


        Mat mask = imageMat.clone();
        Core.bitwise_or(red, red1, mask);
        HighGui.imshow("mask", mask);
        Mat dst = new Mat();
        System.out.println("mask channel : " + mask.channels());
        Core.copyTo(imageMat, dst, mask);
        System.out.println("dst channel : " + dst.channels());
        HighGui.imshow("CopyTo ", dst);
        System.out.println("Original channel : " + dst.channels());
        HighGui.imshow("original", imageMat);

        HighGui.waitKey(1);

    }

}
