package org.example;

import org.example.mocks.PeopleMock;
import org.example.mocks.PeopleObject;
import java.util.List;

public class People {

    public Integer calculateMeanHeight(){
        PeopleMock peopleMock = new PeopleMock();
        List<PeopleObject> peopleObjectList = peopleMock.getPeopleList();

        return 1;
    }

    public Integer calculateMeanAge(){
        PeopleMock peopleMock = new PeopleMock();
        List<PeopleObject> peopleObjectList = peopleMock.getPeopleList();

        return 1;
    }

    public String youngestPerson(){
        PeopleMock peopleMock = new PeopleMock();
        List<PeopleObject> peopleObjectList = peopleMock.getPeopleList();

        return "";
    }

    public String tallestPerson(){
        PeopleMock peopleMock = new PeopleMock();
        List<PeopleObject> peopleObjectList = peopleMock.getPeopleList();

        return "";
    }
}
