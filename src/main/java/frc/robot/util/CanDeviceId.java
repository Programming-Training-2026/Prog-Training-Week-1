package frc.robot.util;

import com.ctre.phoenix6.CANBus;

public class CanDeviceId {
    private final int deviceNumber;

    private final CANBus bus;

    public CanDeviceId(int deviceNumber, CANBus bus) {
        this.deviceNumber = deviceNumber;
        this.bus = bus;
    }

    // Use the default bus name "rio".
    public CanDeviceId(int deviceNumber) {
        this(deviceNumber, CANBus.roboRIO());
    }

    public CANBus getBus() {
        return bus;
    }

    @SuppressWarnings("NonOverridingEquals")
    public boolean equals(CanDeviceId other) {
        return other.deviceNumber == deviceNumber && other.bus.equals(bus);
    }

    @Override
    public String toString() {
        return "CanDeviceId(" + deviceNumber + ", " + bus.getName() + ")";
    }

}
