public class Player {
    private String name;
    private int age;
    private String gender;
    private int Character;
    private int resultsBolvanchik;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public int setAge(int age) {

        this.age = age;
        return age;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public int getCharacter() {

        return Character;
    }

    public void setCharacter(int character) {

        Character = character;
    }

    public int getResultsBolvanchik() {
        return resultsBolvanchik;
    }

    public void setResultsBolvanchik(int resultsBolvanchik) {
        this.resultsBolvanchik = resultsBolvanchik;
    }

    public Player(String[] props) {
        this.name = props[0];
        this.age = Integer.parseInt(props[1]);
        this.gender = props[2];
    }

    public Player() {
    }


}
