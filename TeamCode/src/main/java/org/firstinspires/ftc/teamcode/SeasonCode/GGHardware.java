package org.firstinspires.ftc.teamcode.SeasonCode;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class GGHardware {

    GGParameters _parameters = null;
    /* Public OP Mode Members*/
    public DcMotor motor1 = null;

    ColorSensor sensorColor;
    DistanceSensor sensorDistance;

    /* Local OP Mode Members*/
    HardwareMap hwMap = null;
    public LinearOpMode BaseOpMode = null;
    private ElapsedTime runtime = new ElapsedTime();

    public DcMotor frontLeft, frontRight, backLeft, backRight, collector, lift;
    public Servo release, hookDelivery, lander;

    public void init(GGParameters parameters /*HardwareMap ahwMap*/) {
        _parameters = parameters;
        hwMap = parameters.BaseOpMode.hardwareMap;/*ahwMap*/
        BaseOpMode = parameters.BaseOpMode;

        frontLeft = hwMap.get(DcMotor.class, "FL");
        frontRight = hwMap.get(DcMotor.class, "FR");
        backLeft = hwMap.get(DcMotor.class, "BL");
        backRight = hwMap.get(DcMotor.class, "BR");
        lift = hwMap.get(DcMotor.class, "lift");

        }

        public void liftUp()
        {
            lift.setPower(1.00);
        }

        public void liftDown()
        {
            lift.setPower(-1.00);
        }
}
