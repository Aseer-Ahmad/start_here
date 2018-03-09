package com.example.newu.exa_ui;

/**
 * Created by cruzer on 9/3/18.
 */

public class ListItem {

    public ListItem() {
    }
    private String head;
    private String desc;

    public ListItem(String head, String desc) {
        this.head = head;
        this.desc = desc;
    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }
}
