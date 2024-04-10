package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@TeleOp(name="MineStem Motor Control")


public class MineStemMotorCntrol extends LinearOpMode {
    WarriorsMyrobotConfig2 robotConfig = new WarriorsMyRobotConfig2();
    String genStatus = "Hello Drivers";
    String armStatus = "Ready";
    String driveSpeed = "Normal";
    String turnSpeed = "Normal";
    
    public void updateDriversWithSystemStatus(){
        telemetry.clear();
        telemetry.addLine();
        telemetry.addData("Status", genStatus);
        telemetry.addLine();
        telemetry.addData("Arm", armStatus);
        
        telemetry.addLine();
        telemetry.addData("Drive Speed", driveSpeed);
        
        telemetry.addLine();
        telemetry.addData("Turn Speed", turnSpeed);
        
        telemetry.update();
    }
    
