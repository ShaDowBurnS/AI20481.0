package com.example.wjj.ai2048.AI;

public class Candidate {
    public int x;
    public int y;
    public int value;

    public Candidate() {
    }

    public Candidate(int x, int y, int value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }
}