public class Name {
    private String name;
    private String surname;
    private String fatherName;

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(){
        this.name = surname;
    }

    public String getFatherName(){
        return fatherName;
    }

    public void setFatherName(){
        this.name = fatherName;
    }

    public Name(){
        this.name = null;
        this.surname = null;
        this.fatherName = null;
    }

    public Name(String name, String surname, String fatherName){
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
