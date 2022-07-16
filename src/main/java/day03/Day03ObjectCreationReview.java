package day03;

public class Day03ObjectCreationReview {

    //Create method: Take name surname - find age - create student id

    public static void main(String[] args) {

        Day03ObjectCreationReview object1 = new Day03ObjectCreationReview();
        System.out.println(object1.getName("Akif", "Besir"));
        System.out.println(object1.getAge(2022, 1996));
        System.out.println(object1.studentId('A', 'B', 1996));



    }

    public String getName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    public int getAge(int currentYear, int dateOfBirth){
        return currentYear - dateOfBirth;
    }

    public String studentId(char nameInitial, char surnameInitial, int dateOfBirth){
        return nameInitial + (surnameInitial + "_") + dateOfBirth;
    }

}
