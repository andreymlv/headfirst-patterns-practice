package com.company.c2;

public interface Source {
    void registerTarget(Target target);

    void removeTarget(Target target);

    void notifyTargets();
}
