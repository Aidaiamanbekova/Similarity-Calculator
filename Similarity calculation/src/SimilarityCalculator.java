import java.util.HashSet;
import java.util.Set;

class SimilarityCalculator {
    public double calculateSimilarity(Set<String> set1, Set<String> set2) {
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);

        if (union.isEmpty()) {
            return 0.0; // To avoid division by zero
        }

        return (double) intersection.size() / union.size();
    }
}
