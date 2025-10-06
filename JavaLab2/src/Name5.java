public class Name5 {
    String name;
    String surname;
    String fatherName;


    public Name5(String name){
        this.name = name;
        this.surname = null;
        this.fatherName = null;
    }

    public Name5(String name,String surname){
        this.name = name;
        this.surname = surname;
        this.fatherName = null;
    }

    public Name5(String name,String surname, String fatherName){
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;

    }

    @Override
    public String toString(){
        String result = "";
        if (name != null){
            result+=(name + " ");
        }
        if (surname != null){
            result+=(surname + " ");
        }
        if (fatherName != null){
            result+=(fatherName + " ");
        }
        return result;
    }

}
