package interview_questions;

public class Question30 {

    int age = 1;

    String name = "Emily Rose";

    int heightCM = 30;

    int weightKG = 3;

    String race = "English";

    String bornPlace = "England";

    public Question30(int age, String name, int heightCM, int weightKG, String race, String bornPlace) {
        this.age = age;
        this.name = name;
        this.heightCM = heightCM;
        this.weightKG = weightKG;
        this.race = race;
        this.bornPlace = bornPlace;
    }

    public Question30() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeightCM() {
        return heightCM;
    }

    public void setHeightCM(int heightCM) {
        this.heightCM = heightCM;
    }

    public int getWeightKG() {
        return weightKG;
    }

    public void setWeightKG(int weightKG) {
        this.weightKG = weightKG;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getBornPlace() {
        return bornPlace;
    }

    public void setBornPlace(String bornPlace) {
        this.bornPlace = bornPlace;
    }

    @Override
    public String toString() {
        return "Question30{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", heightCM=" + heightCM +
                ", weightKG=" + weightKG +
                ", race='" + race + '\'' +
                ", bornPlace='" + bornPlace + '\'' +
                '}';
    }
}
