/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv.draw;

import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.RotatedRect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author root
 */
public class Shape {

    public Mat drawCircleOnMat(Mat imageMat, Point centerPoint, int radius, Scalar colorInScalar, int thickness) {

        Mat imageMatClone = imageMat.clone();
        Imgproc.circle(
                imageMatClone, //Matrix obj of the image
                centerPoint, //Center of the circle
                radius, //Radius
                colorInScalar, //Scalar object for color
                thickness //Thickness of the circle
        );

        // Drawing a line
        return imageMatClone;
    }

    public Mat drawLineOnMat(Mat imageMat, Point startPoint, Point endPoint, int radius, Scalar colorInScalar, int thickness) {
        Mat imageMatClone = imageMat.clone();
        Imgproc.line(
                imageMatClone, //Matrix obj of the image
                startPoint, //p1
                endPoint, //p2
                colorInScalar, //Scalar object for color
                thickness //Thickness of the line
        );

        return imageMatClone;

    }

    public Mat drawRectOnMat(Mat imageMat, Point startPoint, Point endPoint, Scalar colorInScalar, int thickness) {
        Mat imageMatClone = imageMat.clone();
        // Drawing a Rectangle
        Imgproc.rectangle(
                imageMatClone, //Matrix obj of the image
                startPoint, //p1
                endPoint, //p2
                colorInScalar, //Scalar object for color
                thickness //Thickness of the line
        );

        return imageMatClone;

    }

    public Mat drawElipseOnMat(Mat imageMat) {
        //, Point startPoint, Point endPoint, Scalar colorInScalar, int thickness
        Mat imageMatClone = imageMat.clone();
        // Drawing a Rectangle
        // Drawing an Ellipse
        Imgproc.ellipse(
                imageMatClone, //Matrix obj of the image
                new RotatedRect( // RotatedRect(Point c, Size s, double a)
                        new Point(200, 150),
                        new Size(260, 180), 180
                ),
                new Scalar(0, 0, 255), //Scalar object for color
                10 //Thickness of the line
        );
        return imageMatClone;

    }
}
