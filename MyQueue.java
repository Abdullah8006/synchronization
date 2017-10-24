package com.appster.abdullah.util.deleteanytime;

public class MyQueue {

    private String[] names = new String[30];
    private byte place = 0;

    public void writeName(String[] names) {
        for (String name : names) {
            System.out.println("Writing = " + name + ", place = " + place);
            this.names[place++] = name;
        }
    }

    public String getNames() {
        String listnames = "";
        for (String name : this.names) {
            listnames += name + " ";
        }
        System.out.println("Total elements " + place);
        return listnames;
    }

}
