package cagladogancay.com.ogrencikayitsistemi;

public class FriendsListView {
    String name;
    String username;
    Boolean gender;


    public FriendsListView(String name, String username, Boolean gender) {
        this.name = name;
        this.username = username;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
