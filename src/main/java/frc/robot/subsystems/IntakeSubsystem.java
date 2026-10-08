package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase{
    
    private final TalonFX motor; // Kraken motors
    //private final SparkFlex motor2; // NEO Motors
    public IntakeSubsystem() {
        motor = new TalonFX(21, "2026CANIvore");  
        //motor2 = new SparkFlex(25, MotorType.kBrushless); 
    }

    public void setSpeed(double speed) {
        motor.set(speed); 
    }
}
