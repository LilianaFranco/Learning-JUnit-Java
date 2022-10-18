import java.util.ArrayList;
import java.util.List;

public class Group {

    //Properties
    private List<Persona> groupList = new ArrayList<>();
    private int listLength;

    //Methods

    public Group() {
    }

    public List<Persona> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Persona> groupList) {
        this.groupList = groupList;
    }

    public int getListLength() {
        return groupList.size();
    }

    public void setListLength(){
        this.listLength = groupList.size();
    }

    public void addPersona(Persona persona){
        if (persona.hasLegalAge() && persona.validCharacterLength() && persona.validCharactersName()){
            this.groupList.add(persona);
        }
    }
}
