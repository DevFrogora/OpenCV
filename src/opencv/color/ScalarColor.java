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
    //https://stackoverflow.com/questions/36817133/identifying-the-range-of-a-color-in-hsv-using-opencv/51686953

//    color_dict_HSV = {'black': [[180, 255, 30], [0, 0, 0]],
//              'white': [[180, 18, 255], [0, 0, 231]],
//              'red1': [[180, 255, 255], [159, 50, 70]],
//              'red2': [[9, 255, 255], [0, 50, 70]],
//              'green': [[89, 255, 255], [36, 50, 70]],
//              'blue': [[128, 255, 255], [90, 50, 70]],
//              'yellow': [[35, 255, 255], [25, 50, 70]],
//              'purple': [[158, 255, 255], [129, 50, 70]],
//              'orange': [[24, 255, 255], [10, 50, 70]],
//              'gray': [[180, 18, 230], [0, 0, 40]]}
    public static Scalar RED_BGR = new Scalar(0, 0, 255);
    public static Scalar BLUE_BGR = new Scalar(255, 0, 0);

    public static Scalar BLUE_HSV_LL = new Scalar(95, 150, 75, 0);
    public static Scalar BLUE_HSV_HL = new Scalar(145, 255, 255, 0);

    public static Scalar RED1_HSV_LL = new Scalar(159, 150, 75, 0);
    public static Scalar RED1_HSV_HL = new Scalar(180, 255, 255, 0);

    public static Scalar RED2_HSV_LL = new Scalar(0, 50, 70, 0);
    public static Scalar RED2_HSV_HL = new Scalar(9, 255, 255, 0);

    public static Scalar YELLOW_HSV_LL = new Scalar(25, 50, 70, 0);
    public static Scalar YELLOW_HSV_HL = new Scalar(35, 255, 255, 0);

    public static Scalar BLACK_HSV_LL = new Scalar(0, 0, 0, 0);
    public static Scalar BLACK_HSV_HL = new Scalar(180, 255, 30, 0);

    public static Scalar GREEN_HSV_LL = new Scalar(36, 50, 70, 0);
    public static Scalar GREEN_HSV_HL = new Scalar(89, 255, 255, 0);

}
