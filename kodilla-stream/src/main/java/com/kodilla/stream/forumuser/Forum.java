package com.kodilla.stream.forumuser;

import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUserList = new ArrayList<ForumUser>();

    public Forum() {
        theUserList.add(new ForumUser(001, "Kowalski", 'M', LocalDate.of(1998, 8, 30), 10));
        theUserList.add(new ForumUser(002, "Kieronska", 'F', LocalDate.of(1977, 11, 3), 28));
        theUserList.add(new ForumUser(003, "Macierewicz", 'M', LocalDate.of(1965, 9, 27), 160));
        theUserList.add(new ForumUser(004, "Piotrowska", 'F', LocalDate.of(1986, 7, 17), 65));
        theUserList.add(new ForumUser(005, "Nowak", 'M', LocalDate.of(1956, 5, 22), 78));
        theUserList.add(new ForumUser(006, "Kapuscinski", 'M', LocalDate.of(1995, 12, 3), 88));
        theUserList.add(new ForumUser(007, "Hojrak", 'M', LocalDate.of(1999, 8, 1), 3));

    }

    public List<ForumUser> getForumList() {
        return new ArrayList<>(theUserList);
    }
}
