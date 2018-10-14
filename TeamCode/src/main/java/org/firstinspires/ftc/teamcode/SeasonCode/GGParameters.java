package org.firstinspires.ftc.teamcode.SeasonCode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

public class GGParameters {

    public LinearOpMode BaseOpMode = null;

    public boolean InitMotors = true;
    public boolean InitImageSensor = false ;
    public boolean InitVuMarks= false;
    public boolean InitMotorWithEncoder= false;

    protected void baseInit()
    {
        InitMotors = true;
        InitImageSensor = false ;
        InitVuMarks= false;
    }

    public GGParameters(LinearOpMode baseOpMode)
    {
        BaseOpMode= baseOpMode;
        baseInit();
    }
}
