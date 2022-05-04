package com.company.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    public User getUserById(String userId) {
        return this.UserList.get(userId);
    }

    public List<User> getActiveUsers(){
        List<User> list = new ArrayList<User>(UserList.values());
        List<User> filteredList = new ArrayList<User>();
        for (User user: list){
            if(user.getStatus() == "enabled"){
                filteredList.add(user);
            }
        }
        return filteredList;
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