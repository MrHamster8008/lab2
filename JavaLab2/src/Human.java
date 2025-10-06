public class Human extends Name{
    private int size;

    public Human(){
        super();
    }

    public Human(String name, String surname, String fatherName,int size){
        super(name,surname,fatherName);
        this.size = size;
    }
    @Override
    public String toString() {
        String namePart = super.toString();
        if (namePart.isEmpty()) {
            return "Рост: " + size + " см";
        } else {
            return namePart + " (рост: " + size + " см)";
        }
    }
}
