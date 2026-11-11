package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Team{
    private final List<String> members;

    public Team(List<String> members) {
        this.members = List.copyOf(members);
    }

    public List<String> getMembers() {
        return members;
    }


}
