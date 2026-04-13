package abtestingsimulator;

public class Main {

    public static void main(String[] args) {

        // Create Variant A
        ExperimentVariant variantA = new ExperimentVariant("1-on-1 Mentoring");

        variantA.addResult(new ParticipantResult(80, true, 4.5));
        variantA.addResult(new ParticipantResult(75, true, 4.2));
        variantA.addResult(new ParticipantResult(70, false, 3.8));
        variantA.addResult(new ParticipantResult(85, true, 4.7));
        variantA.addResult(new ParticipantResult(60, false, 3.5));

        // Create Variant B
        ExperimentVariant variantB = new ExperimentVariant("Group Mentoring");

        variantB.addResult(new ParticipantResult(85, true, 4.6));
        variantB.addResult(new ParticipantResult(88, true, 4.8));
        variantB.addResult(new ParticipantResult(82, true, 4.3));
        variantB.addResult(new ParticipantResult(78, false, 3.9));
        variantB.addResult(new ParticipantResult(90, true, 4.9));

        // Print reports
        ExperimentAnalyzer.printVariantReport(variantA);
        ExperimentAnalyzer.printVariantReport(variantB);

        // Determine winner
     // Statistical significance test
        double zScore = ExperimentAnalyzer.calculateZScoreForCompletion(variantA, variantB);

        System.out.println("Z-Score (Completion Rate Comparison): " + String.format("%.2f", zScore));

        System.out.println("--------------------------------------------------");

        if (Math.abs(zScore) > 1.96) {
            System.out.println("Result is STATISTICALLY SIGNIFICANT (95% confidence)");
        } else {
            System.out.println("Result is NOT statistically significant");
        }

        System.out.println("--------------------------------------------------");

        // Weighted winner logic
        ExperimentVariant winner = ExperimentAnalyzer.determineWinner(variantA, variantB);

        if (winner != null) {
            System.out.println("Winner Variant (Based on Weighted Score): " + winner.getName());
        } else {
            System.out.println("Result: It's a Tie!");
        }
        System.out.println("--------------------------------------------------");
    }
}