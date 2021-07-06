package com.example;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;
    private String name;
    private int volume;

    public MusicPlayer(){

    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void play() {
        for (Music music : musicList) {
            System.out.println("Music player " + name + ", volume - " + volume + " \nThis is " + music.playMusic());
        }
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
