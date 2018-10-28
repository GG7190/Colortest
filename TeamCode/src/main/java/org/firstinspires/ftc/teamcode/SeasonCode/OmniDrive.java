package org.firstinspires.ftc.teamcode.SeasonCode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.SeasonCode.GGHardware;
import org.firstinspires.ftc.teamcode.SeasonCode.GGHardware;


@TeleOp(name="OmniDrive",group="TeleOp")
    public class OmniDrive extends LinearOpMode
    {
        GGHardware robot = new GGHardware();
        private ElapsedTime  runtime= new ElapsedTime();


        @Override
        public void runOpMode() {

                    //GGParameters parameters = new GGParameters(this);
                    robot.init(hardwareMap);
                    waitForStart();
                    while (opModeIsActive()) {

                    //recieve joystick values from controllers
                    getJoyVals();

                    // assign the power values to the motors
                    robot.frontRight.setPower(robot.FRPower);
                    robot.frontLeft.setPower(robot.FLPower);
                    robot.backLeft.setPower(robot.BLPower);
                    robot.backRight.setPower(robot.BRPower);

            }



        }
        public void getJoyVals ()
        {
            float gamepad1LeftY = -gamepad1.left_stick_y;
            float gamepad1LeftX = gamepad1.left_stick_x;
            float gamepad1RightX = gamepad1.right_stick_x;

            robot.FLPower = -gamepad1LeftY - gamepad1LeftX - gamepad1RightX;
            robot.FRPower = gamepad1LeftY - gamepad1LeftX - gamepad1RightX;
            robot.BRPower = gamepad1LeftY + gamepad1LeftX - gamepad1RightX;
            robot.BLPower = -gamepad1LeftY + gamepad1LeftX - gamepad1RightX;

            if (Math.abs(gamepad1LeftY) < robot.deadZone && Math.abs(gamepad1LeftX) < robot.deadZone && Math.abs(gamepad1RightX) < robot.deadZone )
            {
                robot.FLPower = 0;
                robot.FRPower = 0;
                robot.BRPower = 0;
                robot.BLPower = 0;
            }
        }

    }