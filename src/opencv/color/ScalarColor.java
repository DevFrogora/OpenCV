/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opencv.color;

import org.opencv.core.Scalar;

/**
 *
 * @author root
 */
public class ScalarColor {

    public static Scalar RED_BGR = new Scalar(0, 0, 255);
    public static Scalar BLUE_BGR = new Scalar(255, 0, 0);

    public static Scalar BLUE_HSV_LL = new Scalar(95, 150, 75, 0);
    public static Scalar BLUE_HSV_HL = new Scalar(145, 255, 255, 0);

    public static Scalar RED1_HSV_LL = new Scalar(159, 150, 75, 0);
    public static Scalar RED1_HSV_HL = new Scalar(180, 255, 255, 0);

    public static Scalar RED2_HSV_LL = new Scalar(0, 50, 70, 0);
    public static Scalar RED2_HSV_HL = new Scalar(9, 255, 255, 0);

    public static Scalar YELLOW_HSV_LL = new Scalar(20, 50, 100, 0);
    public static Scalar YELLOW_HSV_HL = new Scalar(40, 255, 255, 0);

    public static Scalar BLACK_HSV_LL = new Scalar(0, 0, 0, 0);
    public static Scalar BLACK_HSV_HL = new Scalar(180, 255, 30, 0);

}
