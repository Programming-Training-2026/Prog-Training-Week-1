package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeCommand extends Command{
    private IntakeSubsystem intake; 
    
    private Timer timer; 
    public IntakeCommand(IntakeSubsystem intake) {
        this.intake = intake; 
        timer = new Timer(); 
    }

    @Override
    public void initialize() {
        timer.restart(); 
    }

    @Override
    public void execute() {
        intake.setSpeed(0.4); 
    }

    @Override 
    public void end(boolean interrupted) {
        intake.setSpeed(0); 
    }

    @Override
    public boolean isFinished() {
        return timer.hasElapsed(5); 
    }
}
