package Singleton;

import model.Candidate;

import java.util.ArrayList;
import java.util.List;

public class CandidateSingleton {
    public static List<Candidate> candidate=null;
    public static List<Candidate> getCandidateList()
    {
        if(candidate == null)
        {
            candidate=new ArrayList<>();
        }
        return candidate;
    }
}
