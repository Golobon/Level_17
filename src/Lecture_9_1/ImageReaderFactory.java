package Lecture_9_1;

import Lecture_9_1.common.BmpReader;
import Lecture_9_1.common.JpgReader;
import Lecture_9_1.common.PngReader;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes iT) {
        if (iT == null) {
            throw new IllegalArgumentException();
        }
        try {
            ImageReader iR = null;
            if (iT.equals(ImageTypes.BMP)) {
                iR = new BmpReader();
            } else if (iT.equals(ImageTypes.JPG)) {
                iR = new JpgReader();
            } else if (iT.equals(ImageTypes.PNG)) {
                iR = new PngReader();
            } else {
                throw new IllegalArgumentException();
            }
            return iR;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
