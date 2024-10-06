![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)
[![FTC #14251](https://img.shields.io/badge/FTC%20Team-14251-black?style=for-the-badge)](https://github.com/CapitalRobotics)

# FTC TeamCode Repository - Practice Bot "Error"

## Overview

This repository contains the code for our practice FTC robot, "Error.", 'Extra, Ready, Robot, Opperated Remotly.' The goal is to create a beginner-friendly foundation that new team members, or team members less experienced with programming for FTC, or FIRST, can use to understand the basic concepts of programming an FTC robot. This template includes the initialization and control of motors and servos, allowing you to easily adapt and modify it for both TeleOp and Autonomous operation modes.

### Folder Structure

**TeamCode:** This is the folder where all the robot control code is placed. The main file in this repository is Error.java, which serves as a template to help you get started with writing robot programs.

### Components Overview

**Drive Train**

The drive train includes four motors, controlling the movement of the robot:

`frontRightMotor`

`backRightMotor`

`frontLeftMotor`

`backLeftMotor`

These motors are controlled in `initializeDriveTrain()`, which sets up the direction, modes, and zero power behavior for each motor.

**Claw Mechanism**

The claw mechanism consists of two servos, `leftClaw` and `rightClaw`, as well as a motor called `clawNodMotor` to control the up and down movement of the claw.

**Arm Mechanism**

**The arm mechanism includes:**

`armExtendMotor`: To extend and retract the arm.

`armTurnMotor`: To rotate the arm.

`leftArmMotor` and `rightArmMotor`: For additional support.

All of these are initialized in `initializeArm()`.

How to Use This Template

**Clone the repository**: To use this template, start by cloning the repository.

**Set up your hardware configuration:** Update the motor and servo names in the `initializeDriveTrain()`, `initializeClaw()`, and `initializeArm()` methods to match the configuration in the FTC Driver Station phone app.

**Customize behavior:** Modify the behavior of the robot by adding logic to control motors and servos in response to controller inputs or based on specific conditions during autonomous operation.

### Recommended Resources for Beginners

**FTC Programming Guide:** A great resource for understanding the basic programming concepts in FTC.

**Java Basics for FTC:** Learn Java basics, which is the programming language used for FTC.

**YouTube Tutorials**: Many YouTube videos offer step-by-step guidance for programming and building FTC robots.

### Contributing

This repository is meant to help our team members get up to speed with programming the practice bot. If you have any suggestions or improvements, feel free to contribute by creating a pull request.

### Support

If you have questions, feel free to reach out during team practice sessions or contact one of the senior programmers, @torinriley or @cheesebroccoli

### License

This code is shared under the MIT License. You are free to modify and share it, as long as you credit the original authors.

Happy coding, and let's make our robot the best it can be!

