/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv.examples;

import opencv.color.ScalarColor;
import opencv.detector.ColorDetector;
import opencv.lifecycle.OpenCVLifeCycle;
import org.opencv.highgui.HighGui;

/**
 *
 * @author root
 */
public class ExampleToSelectColor extends OpenCVLifeCycle {

    @Override
    public void run() {
        setRandomShape();
        imageMat = ColorDetector.selectColorInMat(imageMat, ScalarColor.BLUE);
        HighGui.imshow("original", imageMat);
    }

}