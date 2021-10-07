/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv.load;

import org.opencv.core.Core;
import org.opencv.objdetect.CascadeClassifier;

/**
 *
 * @author root
 */
public class LoadFaceDetection {

    String lbpcascade_frontalface = "C:\\opencv\\build\\etc\\lbpcascades\\lbpcascade_frontalface.xml";
    String haarFrontFaceTree_xmlFile = "C:\\opencv\\build\\etc\\haarcascades\\haarcascade_frontalface_alt_tree.xml";
    public CascadeClassifier haarFrontFaceTree_Classifier = null;
    public CascadeClassifier lbpcascade_frontalface_Classifier = null;

    private static LoadFaceDetection obj = new LoadFaceDetection();//Early, instance will be created at load time  

    private LoadFaceDetection() {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        haarFrontFaceTree_Classifier = new CascadeClassifier(haarFrontFaceTree_xmlFile);
        lbpcascade_frontalface_Classifier = new CascadeClassifier(lbpcascade_frontalface);
        load();
    }

    public static LoadFaceDetection getA() {
        return obj;
    }

    public void load() {
        System.out.println("Face detection got loaded");
    }
}
