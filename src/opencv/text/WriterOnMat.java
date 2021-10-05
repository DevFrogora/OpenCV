/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv.text;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author root
 */
public class WriterOnMat {

    public Mat writeText(Mat imageMat, String text, Point textLoc, double fontScale, Scalar color, int thickness) {

        Mat imageMatclone = imageMat.clone();
        // Adding Text
        Imgproc.putText(
                imageMatclone, // Matrix obj of the image
                text, // Text to be added
                textLoc, // point
                0, // front face
                fontScale, // front scale
                color, // Scalar object for color
                thickness // Thickness
        );

        return imageMatclone;
    }

}
