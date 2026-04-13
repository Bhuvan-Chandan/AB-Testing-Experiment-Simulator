package abtestingsimulator;

public class ExperimentAnalyzer {

    public static void printVariantReport(ExperimentVariant variant) {

        System.out.println("--------------------------------------------------");
        System.out.println("Variant: " + variant.getName());
        System.out.println("Total Participants: " + variant.getTotalParticipants());
        System.out.println("Average Engagement: " + String.format("%.2f", variant.getAverageEngagement()));
        System.out.println("Completion Rate: " + String.format("%.2f", variant.getCompletionRate()) + "%");
        System.out.println("Average Satisfaction: " + String.format("%.2f", variant.getAverageSatisfaction()));
        System.out.println("Final Score: " + String.format("%.2f", variant.calculateFinalScore()));
    }

    public static ExperimentVariant determineWinner(ExperimentVariant variantA, ExperimentVariant variantB) {

        double scoreA = variantA.calculateFinalScore();
        double scoreB = variantB.calculateFinalScore();

        if (scoreA > scoreB) {
            return variantA;
        } else if (scoreB > scoreA) {
            return variantB;
        } else {
            return null; // tie
        }
    }
    
    public static double calculateZScoreForCompletion(ExperimentVariant a, ExperimentVariant b) {

        double p1 = a.getCompletionRate() / 100.0;
        double p2 = b.getCompletionRate() / 100.0;

        int n1 = a.getTotalParticipants();
        int n2 = b.getTotalParticipants();

        if (n1 == 0 || n2 == 0) return 0;

        double pooledP = (a.getCompletedCount() + b.getCompletedCount()) / (double)(n1 + n2);

        double standardError = Math.sqrt(
                pooledP * (1 - pooledP) * ( (1.0/n1) + (1.0/n2) )
        );

        if (standardError == 0) return 0;

        return (p1 - p2) / standardError;
    }
}