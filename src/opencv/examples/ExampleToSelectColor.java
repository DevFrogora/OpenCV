/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv.examples;

import opencv.color.ScalarColor;
import opencv.detector.ColorDetector;
import opencv.examples.colorselectonimg.BlueColorSelectOnImg;
import opencv.examples.colorselectonimg.RedColorSelectOnImg;
import opencv.examples.colorselectonimg.YellowColorSelectOnImg;
import opencv.lifecycle.OpenCVLifeCycle;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.highgui.HighGui;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author root
 */
public class ExampleToSelectColor extends OpenCVLifeCycle {

    @Override
    public void run() {

//        RedColorSelectOnImg redColorSelectOnImg = new RedColorSelectOnImg();
//        redColorSelectOnImg.runner();
        
//        BlueColorSelectOnImg blueColorSelectOnImg = new BlueColorSelectOnImg();
//        blueColorSelectOnImg.runner();

        YellowColorSelectOnImg yellowColorSelectOnImg = new YellowColorSelectOnImg();
        yellowColorSelectOnImg.runner();

    }

}
