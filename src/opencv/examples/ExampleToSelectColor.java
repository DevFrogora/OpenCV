/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv.examples;

import opencv.color.ScalarColor;
import opencv.detector.ColorDetector;
import opencv.lifecycle.OpenCVLifeCycle;
import org.opencv.core.Scalar;
import org.opencv.highgui.HighGui;

/**
 *
 * @author root
 */
public class ExampleToSelectColor extends OpenCVLifeCycle {

    @Override
    public void run() {
        setRandomShape();
//        imageMat = ColorDetector.selectColorInMatHSV(imageMat,ScalarColor.BLUE_HSV_LL ,ScalarColor.BLUE_HSV_HL);
//        imageMat = ColorDetector.selectColorInMatHSV(imageMat,ScalarColor.RED_HSV_LL ,ScalarColor.RED_HSV_HL);
        imageMat = ColorDetector.selectColorInMatHSV(imageMat, ScalarColor.YELLOW_HSV_LL, ScalarColor.YELLOW_HSV_HL);

        HighGui.imshow("original", imageMat);
    }

}
