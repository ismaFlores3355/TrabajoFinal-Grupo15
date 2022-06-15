package ar.edu.unju.fi.util;

import ar.edu.unju.fi.entity.Curriculum;

import java.util.ArrayList;

public class ListaCurriculum {

    private ArrayList<Curriculum> curriculums;

    public ListaCurriculum(){
        curriculums = new ArrayList<Curriculum>();
    }

    public ArrayList<Curriculum> getCurriculums() {
        return curriculums;
    }

    public void setCurriculums(ArrayList<Curriculum> curriculums) {
        this.curriculums = curriculums;
    }



}
