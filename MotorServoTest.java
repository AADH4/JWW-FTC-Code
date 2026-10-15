package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardwar.Servo;

public class MotorServoTest extends LinearOpMode {
  public DcMotor motor1;
  public Servo servo1;
    @Override
    public void runOpMode() throws InterruptedException{
      motor1 = hardwareMap.get(DcMotor.class, "motor1");
      servo1 = hardwareMap.get(DcMotor.class, "servo1");


        waitForStart();
        if (isStopRequested()) return;

        motor1.setPower(1);
      
    }
  
}
