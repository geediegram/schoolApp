package models;

import java.util.ArrayList;
import java.util.List;

public class School {
    private long id;
    private String name;
    private String description;
    private List <Classes> classes = new ArrayList<>();
    private SchoolType type;
    private List<Staff> staffs = new ArrayList<>();
    private Address address;
    private List <Students> students = new ArrayList<>();
}
