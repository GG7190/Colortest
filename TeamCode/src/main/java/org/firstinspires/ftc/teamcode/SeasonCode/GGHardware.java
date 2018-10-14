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
    HardwareMap hwMap  = null;
    public LinearOpMode BaseOpMode = null;
    private ElapsedTime runtime = new ElapsedTime();

    public DcMotor frontLeft, frontRight, backLeft, backRight;

    public GGHardware()
    {

    }

    public void init(HardwareMap ahwMap) {

        hwMap = ahwMap;
        //Four wheels
        frontLeft = hwMap.get(DcMotor.class, "fl");
        frontRight = hwMap.get(DcMotor.class, "fr");
        backLeft = hwMap.get(DcMotor.class, "bl");
        backRight = hwMap.get(DcMotor.class, "br");


    }

}
