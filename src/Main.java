import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {

    public static void mergeFiles(String file1Path, String file2Path, String outputPath) {
        try {
            String content1 = Files.readString(Path.of(file1Path));
            String content2 = Files.readString(Path.of(file2Path));

            String mergedContent = content1 + System.lineSeparator() + content2;

            Files.writeString(Path.of(outputPath), mergedContent, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("Файлы успешно объединены в: " + outputPath);
        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        String file1Path = "C:\\Users\\217038\\Downloads\\testInput1.txt";
        String file2Path = "C:\\Users\\217038\\Downloads\\testInput2.txt";
        String outputPath = "C:\\Users\\217038\\Downloads\\testOutput.txt";

        mergeFiles(file1Path, file2Path, outputPath);
    }
}
