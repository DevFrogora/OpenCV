/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv;

import java.util.ArrayList;
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
        System.out.println(System.getProperty("java.library.path"));
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);
        System.out.println("mat = " + mat.dump());

        String srcImgPath = "E:\\image\\blackImage.png";
        String destImgPath = "E:\\image\\output.png";

        Mat imageMat = Imgcodecs.imread("E:\\image\\blackImage.png", Imgcodecs.IMREAD_COLOR);
//        imageMat.setTo();
//        Imgproc.rectangle(
//                imageMat, //Matrix obj of the image
//                new Point(20, 10), //p1
//                new Point(100, 100), //p2
//                new Scalar(0, 0, 255), //Scalar object for color
//                5 //Thickness of the line
//        );
        Rect rect = new Rect(10, 10, 100, 100);
        Imgproc.rectangle(
                imageMat, //Matrix obj of the image
                rect,
                new Scalar(0, 0, 255), //Scalar object for color
                5 //Thickness of the line
        );

        Imgproc.circle(
                imageMat, //Matrix obj of the image
                new Point(60, 60), //Center of the circle
                40, //Radius
                new Scalar(255, 0, 0), //Scalar object for color
                5 //Thickness of the circle
        );

        Size size = rect.size();
        System.out.println("Width : " + size.width + " Height : " + size.height);

        HighGui.imshow("original", imageMat);

        Imgcodecs.imwrite(destImgPath, imageMat);

        HighGui.waitKey();
    }

}
