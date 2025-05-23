package company;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        String content = "これは最初の行です。\nこれは次の行です。\nそして、これが最後の行です。";

        try {
            // ファイルの書き込み
            Files.writeString(Paths.get("example.txt"), content);

            // ファイルの読み込み
            String content2 = Files.readString(Paths.get("example.txt"));
            System.out.println(content2);

            // ファイルを行ごとに読み込み
            List<String> lines = Files.readAllLines(Paths.get("example.txt"));
            var lineNumber = 1;
            for (String line : lines) {
                System.out.println("%d行目：%s".formatted(lineNumber, line));
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}