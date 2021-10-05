/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv.examples.colorselectonimg;

import gui.ConvertUtils;
import gui.ReadImageFrame;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import opencv.color.ScalarColor;
import opencv.detector.ColorDetector;
import opencv.draw.Shape;
import opencv.text.WriterOnMat;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;

/**
 *
 * @author root
 */
public class MultiColorSelectOnImg {

    public Mat sunflower() {
        ColorDetector colorDetector = new ColorDetector();
        Mat originalImage = Imgcodecs.imread("E:\\image\\sunflower.jpg", Imgcodecs.IMREAD_COLOR);
        Shape shape = new Shape();
        Mat redImage = originalImage.clone();
//        redImage = shape.drawElipseOnMat(redImage);
        redImage = colorDetector.redOnMat(redImage);

        Mat greenImage = originalImage.clone();
        greenImage = colorDetector.greenOnMat(greenImage);

        Mat blueImage = originalImage.clone();
        blueImage = colorDetector.blueOnMat(blueImage);

        Mat yellowImage = originalImage.clone();
        yellowImage = colorDetector.yellowOnMat(yellowImage);

        Mat blackImage = originalImage.clone();
        blackImage = colorDetector.blackOnMat(blackImage);

        Mat mask = new Mat();
        Core.bitwise_or(redImage, greenImage, mask);

        Core.bitwise_or(mask, blueImage, mask);
        Core.bitwise_or(greenImage, yellowImage, mask);
        Core.bitwise_or(mask, blackImage, mask);

        System.out.println("Black Image : " + blackImage.channels());
        System.out.println("Yellow Image : " + yellowImage.channels());

        WriterOnMat writerOnMat = new WriterOnMat();
        mask = writerOnMat.writeText(mask, "Sunflower", new Point(0, 15), 0.5, ScalarColor.RED_BGR, 2);

        HighGui.imshow("original", originalImage);
        HighGui.imshow("mask", mask);

        return mask;

    }

}
