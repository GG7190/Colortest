package org.firstinspires.ftc.teamcode.SeasonCode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.SeasonCode.GGHardware;
import org.firstinspires.ftc.teamcode.SeasonCode.GGParameters;

    @TeleOp(name="WorldsTeleop",group="TeleOp")
    public class TeleOp extends LinearOpMode
    {

        GGHardware robot = new GGHardware();
        private ElapsedTime  runtime= new ElapsedTime();


        @Override
        public void runOpMode() {
            GGParameters parameters = new GGParameters(this);
            robot.init(parameters);
            waitForStart();
            while (opModeIsActive()) {

                // left stick controls direction
                // right stick X controls rotation

                float gamepad1LeftY = -gamepad1.left_stick_y;
                float gamepad1LeftX = gamepad1.left_stick_x;
                float gamepad1RightX = gamepad1.right_stick_x;

                // holonomic formulas

                float FrontLeft = -gamepad1LeftY - gamepad1LeftX - gamepad1RightX;
                float FrontRight = gamepad1LeftY - gamepad1LeftX - gamepad1RightX;
                float BackRight = gamepad1LeftY + gamepad1LeftX - gamepad1RightX;
                float BackLeft = -gamepad1LeftY + gamepad1LeftX - gamepad1RightX;

                // clip the right/left values so that the values never exceed +/- 1
                FrontRight = Range.clip(FrontRight, -1, 1);
                FrontLeft = Range.clip(FrontLeft, -1, 1);
                BackLeft = Range.clip(BackLeft, -1, 1);
                BackRight = Range.clip(BackRight, -1, 1);

                // write the values to the motors
                robot.frontRight.setPower(FrontRight);
                robot.frontLeft.setPower(FrontLeft);
                robot.backLeft.setPower(BackLeft);
                robot.backRight.setPower(BackRight);


            }
            }
        }