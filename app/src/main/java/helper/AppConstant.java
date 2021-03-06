package helper;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Sebastian Florez on 3/13/2015.
 */
public class AppConstant {

    // Number of columns of Grid View
    public static final int NUM_OF_COLUMNS = 3;

    // Gridview image padding
    public static final int GRID_PADDING = 8; // in dp

    // SD card image directory
    public static final String PHOTO_ALBUM = "androidhive";

    // supported file formats
    public static final List<String> FILE_EXTN = Arrays.asList("jpg", "jpeg",
            "png");

    public static File textstuff = null;

    public static String currentlyModified = null;
}
