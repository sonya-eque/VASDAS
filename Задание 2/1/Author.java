public class Author {
    private String name, email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        if (gender == 'w' || gender == 'W') this.gender = 'w';
        else this.gender = 'm';
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return "Author{name=" + this.name + ", email=" + this.email + ", gender=" + this.gender + "}";
    }


}