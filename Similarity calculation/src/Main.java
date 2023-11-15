import java.io.IOException;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        try {
            WordProcessor wordProcessor1 = new WordProcessor();
            wordProcessor1.readFile("src/resource/sample1.txt");

            WordProcessor wordProcessor2 = new WordProcessor();
            wordProcessor2.readFile("src/resource/sample2.txt");

            Set<String> distinctWords1 = wordProcessor1.getDistinctWords();
            Set<String> distinctWords2 = wordProcessor2.getDistinctWords();

            SimilarityCalculator similarityCalculator = new SimilarityCalculator();
            double similarityCoefficient = similarityCalculator.calculateSimilarity(distinctWords1, distinctWords2);

            System.out.println("Jaccard Similarity Coefficient: " + similarityCoefficient);

        } catch (IOException e) {
            System.err.println("An error occurred while reading the files: " + e.getMessage());
        }
    }
}
