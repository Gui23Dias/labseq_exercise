package com.example.mylabseqproj.controller;

import com.example.mylabseqproj.calculator.LabseqCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/labseq")
public class LabseqController {

    private final LabseqCalculator labseqCalculator;

    @Autowired
    public LabseqController(LabseqCalculator labseqCalculator) {
        this.labseqCalculator = labseqCalculator;
    }

    @GetMapping("/{index}")
    public int getValue(@PathVariable int index) {
        // Verify that n is a positive integer
        if (index < 0) {
            //return error message
            throw new IllegalArgumentException("Index must be a positive integer");

        }

        // Get the sequence value
        return this.labseqCalculator.calculate(index);
    }
}
