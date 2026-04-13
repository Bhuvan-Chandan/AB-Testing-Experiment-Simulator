# 📊 Advanced A/B Testing Experiment Simulator

![Java](https://img.shields.io/badge/Java-17+-blue?style=for-the-badge&logo=java)
![Experimentation](https://img.shields.io/badge/A%2FB-Testing-green?style=for-the-badge)
![Statistics](https://img.shields.io/badge/Statistics-Z--Test-orange?style=for-the-badge)
![Analytics](https://img.shields.io/badge/Analytics-KPI%20Engine-purple?style=for-the-badge)

A lightweight Java-based A/B testing simulator that models real-world product experimentation logic including KPI calculation, weighted scoring, and statistical significance testing.

------------------------------------------------------------

## 📌 Project Overview

This project simulates how companies evaluate product experiments using structured metrics and statistical validation.

It compares two variants (A vs B) using:

- Engagement Score
- Completion Rate
- Satisfaction Score
- Weighted Final Score
- Z-Test Statistical Significance (95% confidence)

The system determines whether the performance difference between variants is statistically significant before declaring a winner.

------------------------------------------------------------

## 🏗 Architecture

Experiment Variant
    ↓
Participant Results
    ↓
Metric Calculation
    ↓
Weighted Scoring
    ↓
Statistical Significance Test (Z-Test)
    ↓
Winner Declaration

------------------------------------------------------------

## ✅ Implemented Features

✔ KPI Calculation (Engagement, Completion, Satisfaction)  
✔ Weighted Score Formula  
✔ Completion Rate Z-Test  
✔ 95% Confidence Threshold  
✔ Statistical Significance Detection  
✔ Clean OOP Design  
✔ Modular Architecture  

------------------------------------------------------------

## 🛠 Tech Stack

- Java
- OOP (Classes, Objects)
- Collections (ArrayList)
- Statistical Computation (Z-Test)
- Structured Console Reporting

------------------------------------------------------------

## 📂 Project Structure

abtestingsimulator  
 ├── ParticipantResult.java  
 ├── ExperimentVariant.java  
 ├── ExperimentAnalyzer.java  
 └── Main.java  

------------------------------------------------------------

## 📈 Scoring Logic

Final Score Formula:

Final Score =
(Avg Engagement * 0.4)
+ (Completion Rate * 0.3)
+ ((Avg Satisfaction / 5 * 100) * 0.3)

Z-Test Logic:

Z = (p1 - p2) / sqrt(pooledP * (1 - pooledP) * (1/n1 + 1/n2))

Significance threshold:
|Z| > 1.96 → 95% Confidence

------------------------------------------------------------

## ▶️ How to Run

1. Open project in Eclipse.
2. Run Main.java as Java Application.
3. Console output displays:
   - Variant metrics
   - Z-score
   - Statistical significance
   - Winning variant

------------------------------------------------------------

## 🔁 Real-World Applications

This logic applies to:

- Product feature experimentation
- Marketing campaign optimization
- EdTech mentoring format testing
- SaaS conversion optimization
- Checkout flow testing
- UI/UX A/B testing

------------------------------------------------------------

## 🧠 Why This Project Matters

This project demonstrates:

- Experiment design understanding
- KPI-based decision logic
- Statistical validation awareness
- Data-driven product thinking
- Analytical reasoning

It simulates real experimentation workflows used by modern product teams.

------------------------------------------------------------

Built as an advanced experimentation logic simulator using Java.
