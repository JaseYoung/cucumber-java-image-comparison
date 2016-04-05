package Helpers;

import org.openqa.selenium.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.io.IOException;

public class ImageComparisonHelper {

    public static boolean compareElementOnPage(WebElement element, String elementName) throws Exception {
        getScreenshotElement(element, elementName);
        File a = new File("src/Images/" + elementName + ".png");
        File b = new File("src/Images/element.png");

        Float matchLevel = compareImage2(a, b);

        if (matchLevel != 100) {
            ImageIO.write(
                    getDifferenceImage(
                            ImageIO.read(a),
                            ImageIO.read(b)),
                    "png",
                    new File("src/Images/difference.png"));
            throw new Exception("Images are not the same, after Comparison match level = " + matchLevel + "% -- please look at the page: ******** For details.");
        }
        return true;
    }

    public static boolean compareWholePage(String pageName) throws Exception {
        File a = getScreenshotWholePage();
        File b = new File("src/Images/Pages/" + pageName + ".png");

        if (compareImage2(a, b) != 100) {
            ImageIO.write(
                    getDifferenceImage(
                            ImageIO.read(a),
                            ImageIO.read(b)),
                    "png",
                    new File("src/Images/difference.png"));
            throw new Exception("Images are not the same please look at the page: ******** For details.");
        }
        return true;
    }


    public static File getScreenshotWholePage() {
        return ((TakesScreenshot) SeleniumDriver.Instance()).getScreenshotAs(OutputType.FILE);
    }


    public static void getScreenshotElement(WebElement element, String elementName) throws IOException {
        File screen = ((TakesScreenshot) SeleniumDriver.Instance()).getScreenshotAs(OutputType.FILE);

        int height = element.getSize().getHeight();
        int width = element.getSize().getWidth();

        org.openqa.selenium.Point point = element.getLocation();
        int xcord = point.getX();
        int ycord = point.getY();

        element.getText();

        BufferedImage img = ImageIO.read(screen); //cut Image using height, width and x y coordinates parameters.
        BufferedImage dest = img.getSubimage(xcord, ycord, width, height);
        ImageIO.write(dest, "png", new File("src/Images/" + elementName + ".png"));
    }


    public static float compareImage2(File fileA, File fileB) {

        float percentage = 0;
        try {
            BufferedImage biA = ImageIO.read(fileA);
            DataBuffer dbA = biA.getData().getDataBuffer();
            int sizeA = dbA.getSize();
            BufferedImage biB = ImageIO.read(fileB);
            DataBuffer dbB = biB.getData().getDataBuffer();
            int sizeB = dbB.getSize();
            int count = 0;
            if (sizeA == sizeB) {

                for (int i = 0; i < sizeA; i++) {

                    if (dbA.getElem(i) == dbB.getElem(i)) {
                        count = count + 1;
                    }
                }
                percentage = (count * 100) / sizeA;
            } else {
                percentage = 0;
            }

        } catch (Exception e) {
            System.out.println("Failed to compare image files ...");
        }
        return percentage;
    }

    public static BufferedImage getDifferenceImage(BufferedImage img1, BufferedImage img2) {
        final int w = img1.getWidth(),
                h = img1.getHeight(),
                highlight = Color.GREEN.getRGB();
        final int[] p1 = img1.getRGB(0, 0, w, h, null, 0, w);
        final int[] p2 = img2.getRGB(0, 0, w, h, null, 0, w);


        for (int i = 0; i < p1.length; i++) {
            if (p1[i] != p2[i]) {
                p1[i] = highlight;
            }
        }

        final BufferedImage out = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        out.setRGB(0, 0, w, h, p1, 0, w);
        return out;
    }
}
