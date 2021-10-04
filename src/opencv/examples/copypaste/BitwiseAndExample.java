/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv.examples.copypaste;

/**
 *
 * @author root
 */
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
public class BitwiseAndExample {
   public static void main(String args[]) throws Exception {
      //Loading the OpenCV core library
      System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
      //Reading the Image
      String file ="E://image//elephant.jpg";
      Mat src = Imgcodecs.imread(file, Imgcodecs.IMREAD_GRAYSCALE );
      HighGui.imshow("Grayscale Image", src);
      //Creating an empty matrix to store the results
      Mat dst = new Mat(src.rows(), src.cols(), src.type());
      Mat threshold = new Mat(src.rows(), src.cols(), src.type());
      Mat gray = new Mat(src.rows(), src.cols(), src.type());
      //Converting the gray scale image to binary image
      Imgproc.threshold(src, threshold, 100, 255, Imgproc.THRESH_BINARY_INV);
      HighGui.imshow("Binary Image", threshold);
      //Applying bitwise and operation
      Core.bitwise_and(src, threshold, dst);
      HighGui.imshow("Bitwise And operation", dst);
      HighGui.waitKey();
   }
}