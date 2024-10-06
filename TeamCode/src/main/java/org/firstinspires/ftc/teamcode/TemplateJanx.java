package org.firstinspires.ftc.teamcode;

import static java.lang.Thread.sleep;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

// Beginner-friendly FTC Robot Template for "Error"
public class Error {
    // Motors for drive train
    public DcMotorEx frontRightMotor = null;
    public DcMotorEx backRightMotor = null;
    public DcMotorEx frontLeftMotor = null;
    public DcMotorEx backLeftMotor = null;

    // Servos for the claw mechanism
    public Servo leftClaw = null;
    public Servo rightClaw = null;
    
    // Motor for controlling the claw nodding movement
    public DcMotorEx clawNodMotor = null;

    // Motors for the arm mechanism
    public DcMotorEx armExtendMotor = null;
    public DcMotorEx armTurnMotor = null;
    public DcMotorEx leftArmMotor = null;
    public DcMotorEx rightArmMotor = null;

    // Hardware Map
    HardwareMap hwMap = null;

    // Constructor to initialize hardware map
    public Error(HardwareMap hardwareMap) {
        hwMap = hardwareMap;
    }

    // Method to initialize the drive train motors
    public void initializeDriveTrain(String frontRight, String backRight, String backLeft, String frontLeft) {
        frontRightMotor = hwMap.get(DcMotorEx.class, frontRight);
        backRightMotor = hwMap.get(DcMotorEx.class, backRight);
        frontLeftMotor = hwMap.get(DcMotorEx.class, frontLeft);
        backLeftMotor = hwMap.get(DcMotorEx.class, backLeft);

        frontRightMotor.setDirection(DcMotor.Direction.FORWARD);
        backRightMotor.setDirection(DcMotor.Direction.FORWARD);
        frontLeftMotor.setDirection(DcMotor.Direction.REVERSE);
        backLeftMotor.setDirection(DcMotor.Direction.REVERSE);

        setMotorMode(frontRightMotor, DcMotor.RunMode.RUN_USING_ENCODER);
        setMotorMode(backRightMotor, DcMotor.RunMode.RUN_USING_ENCODER);
        setMotorMode(frontLeftMotor, DcMotor.RunMode.RUN_USING_ENCODER);
        setMotorMode(backLeftMotor, DcMotor.RunMode.RUN_USING_ENCODER);

        setMotorZeroPowerBehavior(frontRightMotor, DcMotor.ZeroPowerBehavior.BRAKE);
        setMotorZeroPowerBehavior(backRightMotor, DcMotor.ZeroPowerBehavior.BRAKE);
        setMotorZeroPowerBehavior(frontLeftMotor, DcMotor.ZeroPowerBehavior.BRAKE);
        setMotorZeroPowerBehavior(backLeftMotor, DcMotor.ZeroPowerBehavior.BRAKE);

        stopAllMotors();
    }

    // Method to initialize the claw mechanism
    public void initializeClaw(String leftClawName, String rightClawName, String nodMotorName) {
        clawNodMotor = hwMap.get(DcMotorEx.class, nodMotorName);
        clawNodMotor.setDirection(DcMotor.Direction.FORWARD);
        clawNodMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        leftClaw = hwMap.get(Servo.class, leftClawName);
        rightClaw = hwMap.get(Servo.class, rightClawName);
    }

    // Method to initialize the arm mechanism
    public void initializeArm(String extendMotorName, String turnMotorName, String leftArmName, String rightArmName) {
        armExtendMotor = hwMap.get(DcMotorEx.class, extendMotorName);
        armTurnMotor = hwMap.get(DcMotorEx.class, turnMotorName);
        leftArmMotor = hwMap.get(DcMotorEx.class, leftArmName);
        rightArmMotor = hwMap.get(DcMotorEx.class, rightArmName);

        armTurnMotor.setDirection(DcMotor.Direction.FORWARD);
        armTurnMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        armTurnMotor.setPower(0);

        initializeArmMotor(leftArmMotor, DcMotor.Direction.FORWARD);
        initializeArmMotor(rightArmMotor, DcMotor.Direction.REVERSE);
    }

    // Helper method to set motor mode
    private void setMotorMode(DcMotorEx motor, DcMotor.RunMode mode) {
        motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor.setMode(mode);
    }

    // Helper method to set motor zero power behavior
    private void setMotorZeroPowerBehavior(DcMotorEx motor, DcMotor.ZeroPowerBehavior behavior) {
        motor.setZeroPowerBehavior(behavior);
    }

    // Helper method to initialize arm motors
    private void initializeArmMotor(DcMotorEx motor, DcMotor.Direction direction) {
        motor.setDirection(direction);
        motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motor.setPower(0);
    }

    // Method to stop all motors
    public void stopAllMotors() {
        frontRightMotor.setPower(0);
        backRightMotor.setPower(0);
        frontLeftMotor.setPower(0);
        backLeftMotor.setPower(0);
        armExtendMotor.setPower(0);
        armTurnMotor.setPower(0);
        leftArmMotor.setPower(0);
        rightArmMotor.setPower(0);
        if (clawNodMotor != null) clawNodMotor.setPower(0);
    }
}
