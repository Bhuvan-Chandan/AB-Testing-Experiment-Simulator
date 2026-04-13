package abtestingsimulator;

public class ParticipantResult {

    private double engagementScore;     // 0–100
    private boolean completed;          // true if session completed
    private double satisfactionScore;   // 1–5 scale

    public ParticipantResult(double engagementScore, boolean completed, double satisfactionScore) {
        this.engagementScore = engagementScore;
        this.completed = completed;
        this.satisfactionScore = satisfactionScore;
    }

    public double getEngagementScore() {
        return engagementScore;
    }

    public boolean isCompleted() {
        return completed;
    }

    public double getSatisfactionScore() {
        return satisfactionScore;
    }
}