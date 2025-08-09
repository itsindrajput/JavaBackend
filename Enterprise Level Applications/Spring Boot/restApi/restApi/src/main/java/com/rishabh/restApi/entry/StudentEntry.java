package com.rishabh.restApi.entry;

public class StudentEntry {
    private Long id;
    private String sem;
    private String name;
    private String course;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "StudentEntry{" +
                "id=" + id +
                ", sem='" + sem + '\'' +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
