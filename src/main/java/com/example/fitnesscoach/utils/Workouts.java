package com.example.fitnesscoach.utils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
public enum Workouts {
    BENCH_PRESS(""),
    DEAD_LIFT(""),
    SQUAD("");

    private final String description;
}