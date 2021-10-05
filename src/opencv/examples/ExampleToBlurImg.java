/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv.examples;

import opencv.blur.BlurMat;
import opencv.lifecycle.OpenCVLifeCycle;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;

/**
 *
 * @author root
 */
public class ExampleToBlurImg extends OpenCVLifeCycle {

    @Override
    public void run() {
        System.out.println("i m exec");
        imageMat = Imgcodecs.imread("E:\\image\\chat.jpg", Imgcodecs.IMREAD_COLOR);
        HighGui.imshow("original", imageMat);

        BlurMat blurMat = new BlurMat();
        Mat blurImage = blurMat.medianBlur(imageMat,3);

        HighGui.imshow("blur", blurImage);
        HighGui.waitKey(1);
    }

}
