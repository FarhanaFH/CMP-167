public class Animal {
    // Instance variables
    private String name;
    private int birthYear;
    private double weight;
    private char gender;

    // Default constructor
    public Animal() {
        this.name = "";
        this.birthYear = 1900;
        this.weight = 0.0;
        this.gender = 'u';
    }

    // Parameterized constructor
    public Animal(String name, int birthYear, double weight, char gender) {
        this.name = name;
        this.birthYear = birthYear;
        this.weight = weight;
        this.gender = gender;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for birthYear
    public int getBirthYear() {
        return birthYear;
    }

    // Setter for birthYear
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Getter for gender
    public char getGender() {
        return gender;
    }

    // Setter for gender
    public void setGender(char gender) {
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        } else {
            this.gender = 'u';
        }
    }

    // Calculate age based on birthYear and currentYear
    public int calculateAge(int currentYear) {
        if (currentYear < birthYear) {
            return -1;
        } else {
            return currentYear - birthYear;
        }
    }

    // Check if animal is male
    public boolean isMale() {
        return gender == 'm';
    }

    // Check if animal is female
    public boolean isFemale() {
        return gender == 'f';
    }

    // Print animal details
    public void printDetails() {
        System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c\n",
                name, birthYear, weight, gender);
    }

    public void gainWeight(){
        this.setWeight(this.getWeight()+1);
        if(getWeight()==0){
            this.setWeight(1);
        }
    }
    public void gainWeight(double wt){
        this.setWeight(this.getWeight()+wt);
        if(getWeight()==0){
            this.setWeight(1);
        }
    }

    // Decrease weight by 1, weight can'tt drop below 0
    public void loseWeight() {
        if (weight > 0) {
            weight--;
        }
    }

    // Decrease weight , weight can't drop below 0
    public void loseWeight(double amount) {
        if (weight - amount >= 0) {
            weight -= amount;
        } else {
            weight = 0;
        }
    }
}
