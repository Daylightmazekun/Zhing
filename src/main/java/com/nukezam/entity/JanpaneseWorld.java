package com.nukezam.entity;

import org.springframework.stereotype.Component;

@Component
public class JanpaneseWorld {

    private int worldId;

    private String worldName;

    private String worldKana;

    public int getWorldId() {
        return worldId;
    }

    public void setWorldId(int worldId) {
        this.worldId = worldId;
    }

    public String getWorldName() {
        return worldName;
    }

    public void setWorldName(String worldName) {
        this.worldName = worldName;
    }

    public String getWorldKana() {
        return worldKana;
    }

    public void setWorldKana(String worldKana) {
        this.worldKana = worldKana;
    }

}
