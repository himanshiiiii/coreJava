import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {

        public static void main(String[] args) throws IOException {

            String fileName = "/home/himanshi/Desktop/file.txt";

            try {

                BufferedReader br = new BufferedReader(new FileReader(fileName)) ;
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                    if (line != null) {
                        sb.append(System.lineSeparator());
                    }
                }

                System.out.println(sb);
            }
            catch(FileNotFoundException e){
                System.out.println(e);
            }
        }
}
