package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
@TeleOp(name = "Motor Servo Test");
public class MotorServoTest extends LinearOpMode {
  public DcMotor motor1;
  public Servo servo1;
  public double servoPosition;
  
    @Override
    public void runOpMode() throws InterruptedException{
      motor1 = hardwareMap.get(DcMotor.class, "motor1");
      servo1 = hardwareMap.get(Servo.class, "servo1");


      waitForStart();
      if (isStopRequested()) return;
      if (gamepad1.a){
        motor1.setPower(1.0);
      }
      else{
        motor1.setPower(0);
      }

      if (gamepad1.x){
        servoPosition -= 0.01;
        servoPosition = Math.min(1.0, servoPosition);
        servo1.setPosition(servoPosition);
        telemetry.addData(" Servo Position: ", servoPosition);
        telemetry.update();
        sleep(100);
      }
      if (gamepad1.y){
        servoPosition += 0.01;
        servoPosition = Math.min(1.0, servoPosition);
        servo1.setPosition(servoPosition);
        telemetry.addData(" Servo Position: ", servoPosition);
        telemetry.update();
        sleep(100);
      }

      
    }

}
