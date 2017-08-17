package org.firstinspires.ftc.teamcode.Test;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;

/**
 * Created by Sachin on 9/18/2016.
 */
@Disabled
public class TestReflective extends OpMode {
    OpticalDistanceSensor opticalDistanceSensor;
    @Override
    public void init() {
        opticalDistanceSensor = hardwareMap.opticalDistanceSensor.get("ColorSensor");

    }

    @Override
    public void loop() {
        double reflectance = opticalDistanceSensor.getLightDetected();
        telemetry.addData("Reflectance", reflectance);

    }
}
