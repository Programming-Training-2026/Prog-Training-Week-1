package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase{
    
    private final TalonFX motor; // Kraken motors
    //private final SparkFlex motor2; // NEO Motors
    public IntakeSubsystem() {
        motor = new TalonFX(21, "2026CANIvore");  // The intake motor doesn't actually use the 2026CANIvore CanBus. It's just an example. 
                                                  // Remember that it defaults to "rio" if you don't give it a CanBus. 
        //motor2 = new SparkFlex(25, MotorType.kBrushless); 
    }

    public void setSpeed(double speed) {
        motor.set(speed); 
    }
}
