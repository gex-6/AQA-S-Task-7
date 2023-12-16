public class CreatorObject {
    private String creatorId;
    private String name;
    private String surname;

    public CreatorObject(String name, String surname) {
        this.creatorId = Double.toString (Math.random() * 100000);
        this.name = name;
        this.surname = surname;
    }
}
