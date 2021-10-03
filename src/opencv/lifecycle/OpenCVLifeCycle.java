/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv.lifecycle;

import opencv.color.ScalarColor;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author root
 */
public class OpenCVLifeCycle {

    public Mat imageMat = null;

    public String srcImgPath = "E:\\image\\circles.jpg";
    public String destImgPath = "E:\\image\\output.png";

    public OpenCVLifeCycle() {
        init();
    }

    public void init() {
//        System.out.println(System.getProperty("java.library.path"));
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        imageMat = Imgcodecs.imread(srcImgPath, Imgcodecs.IMREAD_COLOR);
    }

    public void setRandomShape() {
        Rect rect = new Rect(10, 10, 100, 100);

        Imgproc.rectangle(imageMat, //Matrix obj of the image
                rect,
                ScalarColor.RED, //Scalar object for color
                5 //Thickness of the line
        );

        Imgproc.circle(
                imageMat, //Matrix obj of the image
                new Point(60, 60), //Center of the circle
                40, //Radius
                ScalarColor.BLUE, //Scalar object for color
                5 //Thickness of the circle
        );
    }

    public void test() {
        Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);
        System.out.println("mat = " + mat.dump());
    }

    public void runner() {
        try {
            run();
        } finally {
            Imgcodecs.imwrite(destImgPath, imageMat);
            HighGui.waitKey();
        }

    }

    public void run() {

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.

    }

}
