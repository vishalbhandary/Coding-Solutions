package ParallelStreams;

import java.util.List;
import java.util.stream.Collectors;

public class ImageResizeAndProcess {

    public static void main(String[] args) {
        // Create a list of ConcreteImage objects
        List<Image> images = List.of(new ConcreteImage("image1.jpg"),
                new ConcreteImage("image2.jpg"),
                new ConcreteImage("image3.jpg"));

        // Process the images using parallel streams
        List<Image> processedImages = images.parallelStream()
                .map(ImageResizeAndProcess::resizeImage)  // Resize each image in parallel
                .map(ImageResizeAndProcess::processImage) // Process each resized image in parallel
                .toList(); // Collect the processed images into a new list

        // Print the number of images processed
        System.out.println("Processed " + processedImages.size() + " images.");
    }

    // Simulates resizing an image
    public static Image resizeImage(Image image) {
        System.out.println("Resizing image... " + Thread.currentThread().getName() + " (" + image.getFileName() + ")");
        return image; // Return the resized image (currently unchanged)
    }

    // Simulates further processing of the image
    public static Image processImage(Image image) {
        System.out.println("Processing image... " + Thread.currentThread().getName() + " (" + image.getFileName() + ")");
        return image; // Return the processed image (currently unchanged)
    }
}

// Abstract Image class definition
abstract class Image {
    private String fileName;

    public Image(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    // Abstract method (could be other methods depending on your use case)
    public abstract void render();
}

// Concrete subclass of Image
class ConcreteImage extends Image {
    public ConcreteImage(String fileName) {
        super(fileName);
    }

    @Override
    public void render() {
        System.out.println("Rendering image: " + getFileName());
    }
}