package org.firstinspires.ftc.teamcode;

/**
 * Created by Sachin on 8/29/2017.
 */

public interface Constants {
    double     COUNTS_PER_MOTOR_REV    = 1440 ;    // eg: TETRIX Motor Encoder
    double     DRIVE_GEAR_REDUCTION    = 2.0 ;     // This is < 1.0 if geared UP
    double     WHEEL_DIAMETER_INCHES   = 4.0 ;     // For figuring circumference
    double     COUNTS_PER_INCH         = (COUNTS_PER_MOTOR_REV * DRIVE_GEAR_REDUCTION)/
            (WHEEL_DIAMETER_INCHES * 3.1415);
    double     DRIVE_SPEED             = 0.6;
    double     TURN_SPEED              = 0.5;
}
