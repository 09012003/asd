package com.example.insta.models;

public class PostModel{
    int avatar,pic;
    String name;
    public PostModel(int avatar, int pic, String name) {
        this.avatar = avatar;
        this.pic = pic;
        this.name = name;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
