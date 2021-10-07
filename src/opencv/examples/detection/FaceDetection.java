/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv.examples.detection;

import opencv.lifecycle.OpenCVLifeCycle;
import opencv.load.LoadFaceDetection;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import static org.opencv.imgproc.Imgproc.resize;
import org.opencv.objdetect.CascadeClassifier;

/**
 *
 * @author root
 */
public class FaceDetection extends OpenCVLifeCycle {

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        // Reading the Image from the file and storing it in to a Matrix object
        String file = "E:\\image\\group.jpg";
        Mat originalSrc = Imgcodecs.imread(file);
        Mat src = originalSrc.clone();
        resize(originalSrc,originalSrc,new Size(1080,700));//resize image
        HighGui.imshow("original", originalSrc);
        
        // Instantiating the CascadeClassifier
//        String xmlFile = "C:\\opencv\\build\\etc\\lbpcascades\\lbpcascade_frontalface.xml";

        CascadeClassifier classifier = LoadFaceDetection.getA().haarFrontFaceTree_Classifier;

        // Detecting the face in the snap
        MatOfRect faceDetections = new MatOfRect();
        classifier.detectMultiScale(src, faceDetections);
        System.out.println(String.format("Detected %s faces",
                faceDetections.toArray().length));

        // Drawing boxes
        for (Rect rect : faceDetections.toArray()) {
            Imgproc.putText(src, "Face", new Point(rect.x  ,rect.y -5), 0, 0.5, new Scalar(255, 0, 255));
            Imgproc.rectangle(
                    src, // where to draw the box
                    new Point(rect.x, rect.y), // bottom left
                    new Point(rect.x + rect.width, rect.y + rect.height), // top right
                    new Scalar(0, 0, 255),
                    3 // RGB colour
            );
        }
        
        System.out.println("LBP Cascade hits ");
        resize(src,src,new Size(1080,700));//resize image
        
        HighGui.imshow("detected", src);
        HighGui.waitKey(1);
    }

}
