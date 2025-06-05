package ru.gltexture.zpm3.system.init;

public interface IZPSection {
    void initSection();
    String sectionName();
    int priority();
}
