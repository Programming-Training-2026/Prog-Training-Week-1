package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShooterSubsystem;

public class ShooterCommand extends Command{
    private ShooterSubsystem shooter; 
    
    public ShooterCommand(ShooterSubsystem shooter) {
        this.shooter = shooter; 
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        shooter.setSpeed(0.4); 
    }

    @Override 
    public void end(boolean interrupted) {
        shooter.setSpeed(0); 
    }

    @Override
    public boolean isFinished() {
        return false; 
    }
}
