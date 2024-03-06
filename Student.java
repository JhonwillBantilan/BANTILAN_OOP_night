package BantilanJhonwill;

public class Student {
    
    private String givenName;
    private String familyName;
    private int age;
    private boolean isUnderage;

    
    public Student(String givenName, String familyName, int age) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.age = age;
        this.isUnderage = age < 18;
    }

    
    public String retrieveFullName() {
        return familyName + ", " + givenName;
    }

    public void commemorateBirthday() {
        age++;
        isUnderage = age < 18;
    }

    @Override
    public String toString() {
        String status = isUnderage ? "minor" : "adult";
        return retrieveFullName() + " - " + age + " - " + status;
    }
}