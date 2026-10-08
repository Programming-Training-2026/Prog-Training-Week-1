package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase{
    
    private final SparkFlex leftMotor; // NEO Motors
    private final SparkFlex rightMotor; // NEO Motors
    public ShooterSubsystem() {
        leftMotor = new SparkFlex(24, MotorType.kBrushless); 
        rightMotor = new SparkFlex(15, MotorType.kBrushless); 
    }

    public void setSpeed(double speed) {
        leftMotor.set(speed); 
        rightMotor.set(-speed); 
    }
}
