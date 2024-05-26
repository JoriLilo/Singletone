package exercise30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReversedFile {

    public static void main(String[] args) {
        String baseURI = "src/exercise30/";
        Path path = Paths.get(baseURI + "FileOne.txt");

        Path reversed;
        try {

            String string = path.getFileName().toString();
            String[] strings = string.split("\\.");
            String fileName = strings[0];
            String extension = strings[1];
            char[] fileNameChars = fileName.toCharArray();
            char[] reversedFileNameChars = new char[fileNameChars.length];

            for (int i=0;i<fileNameChars.length;i++) {
                reversedFileNameChars[i] = fileNameChars[fileNameChars.length - 1 - i];
            }

            String reversedPath = String.valueOf(reversedFileNameChars) + "." + extension;

            reversed = Paths.get(baseURI + reversedPath);

            if(Files.exists(reversed)) {
                Files.delete(reversed);
            }

            Files.createFile(reversed);
            System.out.println(reversed);

            for (int i=0;i<Files.readAllLines(path).size();i++) {

                String line = Files.readAllLines(path).get(i);
                char[] chars = line.toCharArray();
                char[] reversedChars = new char[chars.length];
                for (int j=0;j<chars.length;j++) {
                    reversedChars[j] = chars[chars.length - 1 - j];
                }
                line = String.copyValueOf(reversedChars);
                if(i==0) {
                    Files.write(Paths.get(reversed.toUri()), (line + "\n").getBytes(), StandardOpenOption.WRITE);
                }else {
                    Files.write(Paths.get(reversed.toUri()), (line + "\n").getBytes(), StandardOpenOption.APPEND);
                }


            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }








    }
}
