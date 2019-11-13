package model;



import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Skill {
    String skill_id;
    String skill_name;

    public String getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(String skill_id) {
        this.skill_id = skill_id;
    }

    public String getSkill_name() {
        return skill_name;
    }

    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }
    public List<Skill> getSkills() throws IOException {
        List<Skill> list=new ArrayList<>();
        File file = new File("/Users/i516409/Documents/InterviewProcessingSystem/src/list.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        Skill skill=null;
        int i=0;
        while((line = br.readLine()) != null){
            skill=new Skill();
            skill.setSkill_id("Id : "+i++);
            skill.setSkill_name(line);
            list.add(skill);
        }
        return list;
    }
    @Override
    public String toString() {
        return " "+this.skill_id+" "+"Skill Name :"+this.skill_name;
    }
     /*public static void main(String []args) throws IOException {
        List<Skill> list=new ArrayList<>();
        File file = new File("/Users/i516409/Documents/InterviewProcessingSystem/src/list.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        Skill skill=null;
        int i=0;
        while((line = br.readLine()) != null){
            skill=new Skill();
            skill.setSkill_id("Id : "+i++);
            skill.setSkill_name(line);
            list.add(skill);
        }
        SkillSet skillSet=new SkillSet();
        skillSet.addSkills();
        System.out.println(list);
    }*/
}
