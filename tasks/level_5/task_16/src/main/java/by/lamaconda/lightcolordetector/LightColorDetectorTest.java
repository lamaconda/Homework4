package by.lamaconda.lightcolordetector;

public class LightColorDetectorTest {
    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleLightTest();

    }

    public void violetTest() {
        int waveLength = 449;
        String expectedResult = "Violet";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(waveLength);

        if (actualResult.equals(expectedResult)) {
            System.out.println("Success ");
        } else {
            System.out.println("FAIL");
        }
    }

    public void blueTest() {
        int waveLength = 494;
        String expectedResult = "Blue";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(waveLength);

        if (actualResult.equals(expectedResult)) {
            System.out.println("Success ");
        } else {
            System.out.println("FAIL");
        }
    }

    public void greenTest() {
        int waveLength = 569;
        String expectedResult = "Green";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(waveLength);

        if (actualResult.equals(expectedResult)) {
            System.out.println("Success ");
        } else {
            System.out.println("FAIL");
        }
    }

    public void yellowTest() {
        int waveLength = 589;
        String expectedResult = "Yellow";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(waveLength);

        if (actualResult.equals(expectedResult)) {
            System.out.println("Success ");
        } else {
            System.out.println("FAIL");
        }
    }

    public void orangeTest() {
        int waveLength = 619;
        String expectedResult = "Orange";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(waveLength);

        if (actualResult.equals(expectedResult)) {
            System.out.println("Success ");
        } else {
            System.out.println("FAIL");
        }
    }

    public void redTest() {
        int waveLength = 750;
        String expectedResult = "Red";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(waveLength);

        if (actualResult.equals(expectedResult)) {
            System.out.println("Success ");
        } else {
            System.out.println("FAIL");
        }
    }

    public void invisibleLightTest() {
        int waveLength = 800;
        String expectedResult = "Invisible Light";

        LightColorDetector lightColorDetector = new LightColorDetector();
        String actualResult = lightColorDetector.detect(waveLength);

        if (actualResult.equals(expectedResult)) {
            System.out.println("Success ");
        } else {
            System.out.println("FAIL");
        }
    }
}

