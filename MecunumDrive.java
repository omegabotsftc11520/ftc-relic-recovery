package org.firstinspires.ftc.teamcode;

        import com.qualcomm.robotcore.eventloop.opmode.OpMode;
        import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
        import com.qualcomm.robotcore.hardware.DcMotor;
        import com.qualcomm.robotcore.hardware.DcMotorSimple;
        import com.qualcomm.robotcore.util.Range;

/**
 * Created by Sachin on 2/9/2017.
 */
@TeleOp(name = "MechWheels", group = "OmegaBotsFTC")
public class MecunumDrive extends OpMode {
    DcMotor frontLeftMotor;
    DcMotor backLeftMotor;
    DcMotor frontRightMotor;
    DcMotor backRightMotor;


    @Override
    public void init() {
        frontLeftMotor = hardwareMap.dcMotor.get("lFM");
        backLeftMotor = hardwareMap.dcMotor.get("lBM");
        frontRightMotor = hardwareMap.dcMotor.get("rFM");
        backRightMotor = hardwareMap.dcMotor.get("rBM");

        frontLeftMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        backRightMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        frontRightMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeftMotor.setDirection(DcMotorSimple.Direction.FORWARD);
    }

    @Override
    public void loop() {
        float LFSpeed = gamepad1.left_stick_y - gamepad1.left_stick_x;
        float LBSpeed = gamepad1.left_stick_y + gamepad1.left_stick_x;
        float RFSpeed = gamepad1.right_stick_y + gamepad1.left_stick_x;
        float RBSpeed = gamepad1.right_stick_y - gamepad1.left_stick_x;

        LFSpeed = Range.clip(LFSpeed, -1, 1);
        LBSpeed = Range.clip(LBSpeed, -1, 1);
        RFSpeed = Range.clip(RFSpeed, -1, 1);
        RBSpeed = Range.clip(RBSpeed, -1, 1);


        frontRightMotor.setPower(RFSpeed);
        backRightMotor.setPower(RBSpeed);
        frontLeftMotor.setPower(LFSpeed);
        backLeftMotor.setPower(LBSpeed);

        if (gamepad1.dpad_right){
            frontLeftMotor.setPower(-0.5);
            backLeftMotor.setPower(0.5);
            frontRightMotor.setPower(0.5);
            backRightMotor.setPower(-0.5);
        } else if (gamepad1.dpad_left){
            frontLeftMotor.setPower(0.5);
            backLeftMotor.setPower(-0.5);
            frontRightMotor.setPower(-0.5);
            backRightMotor.setPower(0.5);
        } else if (gamepad1.dpad_down){
            frontLeftMotor.setPower(0.0);
            backLeftMotor.setPower(0.0);
            frontRightMotor.setPower(0.0);
            backRightMotor.setPower(0.0);
        } else {
            return;
        }




    }
}
