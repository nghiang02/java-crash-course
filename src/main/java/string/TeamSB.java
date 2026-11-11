package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class TeamSB{
    private final List<StringBuilder> members;

    private static List<StringBuilder> deepCopy(List<StringBuilder> list) {
        List<StringBuilder> copyList = new ArrayList<>();
        for (StringBuilder member : list) {
            copyList.add(new StringBuilder(member));
        }
        return copyList;
    }

    public TeamSB(List<StringBuilder> members) {
        this.members = deepCopy(members);
    }

    public List<StringBuilder> getMembers() {
        return List.copyOf(deepCopy(members));
    }


}
