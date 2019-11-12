package service;

import model.Candidate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Manager {
    String manager_id;
    String manager_name;
    List<Candidate> candidateList;
    SkillSet skillSet;
    public String getManager_id() {
        return manager_id;
    }

    public void setManager_id(String manager_id) {
        this.manager_id = manager_id;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public void shortListCandidate()
    {
        Job job=new Job();
        candidateList=new ArrayList<>();
        candidateList=job.getCandidateList();
    }

    public void getCandidateSkillSet()
    {
        HashMap<String, List<String>> map = new HashMap<>();
        skillSet=new SkillSet();
        map=skillSet.getCandidateSkill();

        for (String key : map.keySet())
        {
            System.out.println("Candidate Id : "+key);
            for (String value : map.get(key))
            {
                System.out.println(value);
            }
            System.out.println("---------------------------------------");
        }
    }
}
