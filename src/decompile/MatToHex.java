/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decompile;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;

/**
 *
 * @author root
 */
public class MatToHex {

    public static void main(String args[]) {
        //Loading the OpenCV core library  
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        //Instantiating the Imagecodecs class 
        Imgcodecs imageCodecs = new Imgcodecs();

        //Reading the Image from the file  
        String file = "E:\\image\\dot.png";
        Mat matrix = imageCodecs.imread(file);

        MatOfByte matOfByte = new MatOfByte();
        Imgcodecs.imencode(".jpg", matrix, matOfByte);
        byte[] byteArray = matOfByte.toArray();
//        for (byte c : byteArray) {
//            System.out.println(Integer.toHexString(c));
//        }

    }

    private BufferedImage createImageFromBytes(byte[] imageData) {
        ByteArrayInputStream bais = new ByteArrayInputStream(imageData);
        try {
            return ImageIO.read(bais);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
