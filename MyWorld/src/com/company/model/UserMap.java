package com.company.model;

import java.util.HashMap;
public class UserMap {

    private HashMap<String, User> UserList;

    public UserMap(HashMap<String, User> userList) {
        UserList = userList;
    }

    public UserMap() {
        UserList = new HashMap<String, User>();
    }

    public boolean addUser(User user) {
        try {

            this.UserList.put(String.valueOf(user.getIdNumber()), user);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    public HashMap<String, User> getUserList() {
        return UserList;
    }

    public void setUserList(HashMap<String, User> userList) {
        UserList = userList;
    }

    @Override
    public String toString() {
        return "UserMap{" +
                "UserList=" + UserList +
                '}';
    }
}