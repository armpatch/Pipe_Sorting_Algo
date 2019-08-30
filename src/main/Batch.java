package main;

import java.util.ArrayList;

public class Batch {

    private ArrayList<PipeCut> pipeCuts = new ArrayList<>();

    private String service;
    private float diameter;
    private boolean isPulledTee;

    private float totalLength;

    int MAX_TOTAL_LENGTH = 220; // inches

    Batch(String service, float diameter, boolean isPulledTee) {
        setService(service);
        setDiameter(diameter);
        setPulledTee(isPulledTee);
    }

    void addPipeCut(PipeCut pipeCut) {
        totalLength += pipeCut.getLength();
        pipeCuts.add(pipeCut);
    }

    public int size() {
        return pipeCuts.size();
    }

    float getUncutLengthRemaining() {
        return MAX_TOTAL_LENGTH - totalLength;
    }

    public PipeCut getPipeCut(int index) {
        return pipeCuts.get(index);
    }

    public ArrayList<PipeCut> getPipeCuts() {
        return pipeCuts;
    }

    // getters and setters

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    float getDiameter() {
        return diameter;
    }

    private void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    boolean isPulledTee() {
        return isPulledTee;
    }

    private void setPulledTee(boolean pulledTee) {
        isPulledTee = pulledTee;
    }

    public float getTotalLength() {
        return totalLength;
    }
}
