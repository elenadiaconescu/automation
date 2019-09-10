package telacad.altPachet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class PropsWriter {
    public void writeProperties (Properties props, String path, String comments){

//            try {
//                PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(path)));
//                props.store(props, comments);
//            }
//            catch (IOException e) {
//                e.printStackTrace();
//            }




//            try {
//                PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(path)));
//                props.load(writer, comments);
//            }
//
//            catch (IOException e) {
//                e.printStackTrace();
//            }




//            try {
//                PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(path)));
//                props.load(props, comments);
//            }
//
//            catch (IOException e) {
//                e.printStackTrace();
//            }
//


            try {
                PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(path)));
                props.store(writer, comments);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }


}
