package com.hoit1302;

import org.springframework.boot.context.properties.ConfigurationProperties;
// properties 이용하여 빈 등록 하려고
@ConfigurationProperties("holoman")
public class HolomanProperties {
    private String name;
    private int howLong;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHowLong() {
        return howLong;
    }

    public void setHowLong(int howLong) {
        this.howLong = howLong;
    }
}
