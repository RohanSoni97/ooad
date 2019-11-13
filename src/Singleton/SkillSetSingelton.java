package Singleton;

import java.util.HashMap;
import java.util.List;

public class SkillSetSingelton {
    public static HashMap<String, List<String>> map = null;
    public static HashMap<String, List<String>> getHashObject()
    {
        if(map == null)
            map=new HashMap<>();
        return map;
    }
}
