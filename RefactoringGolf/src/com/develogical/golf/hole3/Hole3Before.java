package com.develogical.golf.hole3;

import com.develogical.golf.Instruction;
import com.develogical.golf.MoveInstruction;
import com.develogical.golf.TurnInstruction;

import java.util.ArrayList;
import java.util.List;

public class Hole3Before {

    private List<Instruction> instructions = new ArrayList<Instruction>();

    public void parseCommand(String command) {

        instructions.add(Instruction.toPerform(command));
    }

}

