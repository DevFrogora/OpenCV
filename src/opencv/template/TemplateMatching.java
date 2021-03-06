/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv.template;

import opencv.load.Loader;
import org.opencv.core.Core;
import org.opencv.core.Core.MinMaxLocResult;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/**
 *
 * @author root
 */
import org.opencv.core.Core;
import org.opencv.core.Core.MinMaxLocResult;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;

class MatchingDemo {

    public void run(String inFile, String templateFile, String outFile, int match_method) {
        System.out.println("\nRunning Template Matching");

        Mat img = Imgcodecs.imread(inFile);
        Mat templ = Imgcodecs.imread(templateFile);

        // / Create the result matrix
        int result_cols = img.cols() - templ.cols() + 1;
        int result_rows = img.rows() - templ.rows() + 1;
        Mat result = new Mat(result_rows, result_cols, CvType.CV_32FC1);

        // / Do the Matching and Normalize
        Imgproc.matchTemplate(img, templ, result, match_method);
        Core.normalize(result, result, 0, 1, Core.NORM_MINMAX, -1, new Mat());

        // / Localizing the best match with minMaxLoc
        MinMaxLocResult mmr = Core.minMaxLoc(result);

        Point matchLoc;
        if (match_method == Imgproc.TM_SQDIFF || match_method == Imgproc.TM_SQDIFF_NORMED) {
            matchLoc = mmr.minLoc;
        } else {
            matchLoc = mmr.maxLoc;
        }

        int i = 0;
        while (true) {
            mmr = Core.minMaxLoc(result);
            matchLoc = mmr.maxLoc;
            if (mmr.maxVal >= 0.98) {
                            i++;
                Imgproc.putText(img, "coin "+i, new Point(matchLoc.x  ,matchLoc.y -5), 0, 0.5, new Scalar(255, 0, 255));
                Imgproc.rectangle(img, matchLoc,
                        new Point(matchLoc.x + templ.cols(), matchLoc.y + templ.rows()),
                        new Scalar(0, 255, 0));
                Imgproc.rectangle(result, matchLoc,
                        new Point(matchLoc.x + templ.cols(), matchLoc.y + templ.rows()),
                        new Scalar(0, 255, 0), -1);
                System.out.println("loop : " + i);
//                HighGui.imshow("template" + i, img.clone());

                //break;
            } else {
                break; //No more results within tolerance, break search
            }
        }
        // Save the visualized detection.
        System.out.println("total Coin " + i);
        HighGui.imshow("template", img);
        HighGui.waitKey();
//        Highgui.imwrite(outFile, img);

    }
}

public class TemplateMatching {

    public static void main(String[] args) {
        Loader.load();
        new MatchingDemo().run("E:\\image\\mario2.png", "E:\\image\\coin.png", "", Imgproc.TM_CCOEFF);
    }
}
