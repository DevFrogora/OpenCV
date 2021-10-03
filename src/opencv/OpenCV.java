/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv;

import java.util.ArrayList;
import opencv.color.ScalarColor;
import opencv.detector.ColorDetector;
import opencv.examples.ExampleToSelectColor;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author root
 */
public class OpenCV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ExampleToSelectColor exampleToSelectColor = new ExampleToSelectColor();
        exampleToSelectColor.runner();
    }

}
