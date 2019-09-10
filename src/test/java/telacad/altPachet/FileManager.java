package telacad.altPachet;

import java.io.File;

public class FileManager {
    // make the File readable by everyone, writable only by owner

    public void manageFile(File file) {
        //What is the correct definition of the manageFile method to set the permissions on the file so that it is readable by everyone, but writable only by its owner?
        // method definition goes here

        file.setWritable(false, true);
        file.setReadable(true, true);

        file.setWritable(true, false);
        file.setReadable(true, false);

        file.setWritable(true, false);
        file.setReadable(true);

        file.setWritable(false, true);
        file.setReadable(true);



    }
}
