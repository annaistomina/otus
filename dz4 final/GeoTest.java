public class GeoTest {
    private final Question[] questions;
    private int correctCount = 0;
    private int wrongCount = 0;
    private final UserOutput userOutput;

    private GeoTest(Question[] questions, UserOutput userOutput) {
        this.userOutput = userOutput;
        this.questions = questions;
    }


    private void runTest() {
        for (Question qs : questions) {
            if (qs.ask()) {
                correctCount++;
            } else {
                wrongCount++;
            }
        }

        userOutput.print("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }

    public static void main(String[] args) {
        Question[] questions = new Question[3];
        questions[0] = new Question("Какое государство является островным?",
                new String[]{"1 Россия",
                        "2 Австралия",
                        "3 Великобритания",
                        "4 Индия"},
                3);

        questions[1] = new Question("Самое большое соленое озеро в мире?",
                new String[]{"1 Каспийское море",
                        "2 Аральское море",
                        "3 Мертвое море",
                        "4 Большое соленое озеро"},
                1);
        questions[2] = new Question("Столица Турции?",
                new String[]{"1 Анталия",
                        "2 Анкара",
                        "3 Стамбул",
                        "4 Измир"},
                2);
        UserOutput userOutput = new ConsoleUserOutput();
            GeoTest geoTest = new GeoTest(questions, userOutput);
        geoTest.runTest();
    }

}













