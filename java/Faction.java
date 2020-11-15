import java.util.ArrayList;
import java.util.List;

public class Faction implements Properties {
    public List<Character> members;
    public List<Faction> alliedFactions = new ArrayList<>();
    public String name;

    public Faction(String name) {
        this.members = new ArrayList<>();
        this.name = name;
    }


    public void addAlliedFactions(List<Faction> listAlliedFactions) {

        listAlliedFactions.stream()
                .forEach(faction -> {
                    if(!alliedFactions.contains(faction))
                        alliedFactions.add(faction);

                });
    }

    public void addAlliedFaction(Faction faction) {
        alliedFactions.add(faction);
    }

    @Override
    public boolean addMember(Character character) {
        if(members.contains(character))
            return false;
        return true;
    }

    @Override
    public void remouveMember(Character character) {
        if(members.contains(character))
            members.remove(character);
    }
}
