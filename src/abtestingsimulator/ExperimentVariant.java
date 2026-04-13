package abtestingsimulator;

import java.util.ArrayList;
import java.util.List;

public class ExperimentVariant {

    private String name;
    private List<ParticipantResult> results;

    public ExperimentVariant(String name) {
        this.name = name;
        this.results = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addResult(ParticipantResult result) {
        results.add(result);
    }

    public int getTotalParticipants() {
        return results.size();
    }

    public double getAverageEngagement() {
        if (results.isEmpty()) return 0;

        double total = 0;
        for (ParticipantResult r : results) {
            total += r.getEngagementScore();
        }
        return total / results.size();
    }

    public double getCompletionRate() {
        if (results.isEmpty()) return 0;

        int completedCount = 0;
        for (ParticipantResult r : results) {
            if (r.isCompleted()) {
                completedCount++;
            }
        }
        return (completedCount * 100.0) / results.size();
    }

    public double getAverageSatisfaction() {
        if (results.isEmpty()) return 0;

        double total = 0;
        for (ParticipantResult r : results) {
            total += r.getSatisfactionScore();
        }
        return total / results.size();
    }

    public double calculateFinalScore() {

        double avgEngagement = getAverageEngagement();
        double completionRate = getCompletionRate();
        double avgSatisfaction = getAverageSatisfaction();

        // Normalize satisfaction (1–5 scale → 0–100)
        double satisfactionPercent = (avgSatisfaction / 5.0) * 100.0;

        return (avgEngagement * 0.4)
                + (completionRate * 0.3)
                + (satisfactionPercent * 0.3);
    }
    
    public int getCompletedCount() {
        int count = 0;
        for (ParticipantResult r : results) {
            if (r.isCompleted()) {
                count++;
            }
        }
        return count;
    }
}