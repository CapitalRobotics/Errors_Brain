
# Software Resources for Janx and Error
---

## Introduction
---
There are three main ways to program Janx (and all FTC robots) and that’s through blocks, OnBot, and Android Studio.

**Block java** is historically how most teams start and is the easiest to understand. It’s a lot like Scratch (https://scratch.mit.edu/) but with FTC-specific libraries and resources. Both this and OnBot are hard-coded onto the control hub itself, whereas Android Studio is uploaded from our computers.

**OnBot Java** is more of a bridge between the two, where it’s typing (like Android Studio) but it also is still hard coded onto the robot.

A**ndroid Studio** is not used just for FTC, it’s used for a variety of industry-standard programming. It’s a type of software that allows programming onto Androids (like phones) which is the type of software that FTC uses. 

**Hardcoded programming** (as I am dubbing it right now) or Block and OnBot Java is very beginner-friendly because all the things that you need are right there and require nothing but programming knowledge on your end. However, the drawbacks are that you can’t access wifi while coding (more explanation forthcoming) and that it’s harder to share code with someone and almost impossible to work on outside of robotics.

Android Studio is significantly more flexible than either two ways, allowing collaboration; editing; and outside-robotics work. Another bonus is that it forces you to learn industry-standard software. The largest drawback is that it also requires knowledge of the software both on Janx and Android Studio. There is a lot more than just programming involved in this method.

### Hard Coded Programming
To set up is very straightforward. 
Turn on the robot and wait from flashing blue to solid green. This should not take more than a minute but our robot is very old and can take up to 5 if the batteries are of poor quality or about to die. 
Sign in to the wifi, it’s going to either be 14251 (because it’s our team number) or something that starts with FTC and then a series of letters.
Go to http://192.168.43.1:8080/?page=connection.html&pop=true once you are on the wifi. If you are not on the wifi it will either keep buffering or say that the network cannot be reached. If either of those occur, go to step 2.
You will see a screen that looks like this:

Code
Once you are done, build it.

It should say that it’s successful. If it doesn’t then go to step 5. If it says that there is something that isn’t there that you’re 500% is, it may be a configuration issue, in which case go to configuration
Block Java

To build in block java, press “Save OpMode” on top left. 

Here’s all the information for programming with  https://ftc-docs.firstinspires.org/en/latest/programming_resources/blocks/Blocks-Tutorial.html 

### OnBot Java

## Getting Started with Android Studio
---

**About:**
Android Studio is a powerful integrated development environment or IDE that we use to write, build, and deploy code for Janxs. If you've used other IDE’s such as VS Code, or IntelliJ, you can skip to ‘4’

Start by downloading Android Studio from the official website
If you want to start developing for Janxs, click the button ‘get form VCS` you'll be prompted to either use your GitHub account, or clone using the URL, https://github.com/CapitalRobotics/Janxs_Brain.git,
When you clone the GitHub repository to your local machine, you should see your files on the left-hand side, then a toolbar to the far left.
Once you are ready to run the code for Janxs and build the project directly to the control, you will see the REV controller hub as a device on the top of the IDE, You will NOT see medium phone API when plugged into the bot. Be sure to build the TeamCode folder, and click the green play button once you are ready



**Contributing**
As a general overview, please follow these guidelines for continuing (for more detailed information, please reference the repository readme file)
Clone the repository and create a feature branch.
Commit your changes to the feature branch.
Submit a pull request for review.
Once approved, your changes will be merged into the main branch.





**Other useful information**
Android Studio is designed to build Android apps, and the FTC robot controller is an app. You'll see a lot of files ending in “.gradle” These files Should not be changed unless you have to change them, as these files are essential for the building of the app for Android. 
The file structure is pretty straightforward. In Android Studio, you'll notice the file structure looks different than it does in GitHub, this is because Android Studio automatically structures it. You; want to find “TeamCode” and then write your code in the appropriate folder there.

### Common Errors

**Syntax Errors:** These fundamental errors occur when your code violates Java's rules. Typos, missing semicolons, or incorrect use of keywords are common culprits.
Solution: Carefully review the error message, paying close attention to the line number and error description. Double-check your code for typos, and missing punctuation, and ensure you're using the correct Java syntax.

**`IndexOutOfBoundsException`:** This occurs when you attempt to access an array or list element with an index that is outside its valid range, often seen when working with sensor data arrays or motor configurations.
**Solution:** Always ensure that the index you're using falls within the bounds of the array or list. Use array/list size checks and loops with appropriate conditions to iterate through elements safely.

**`ClassCastException`:** This arises when you try to cast an object to a type that it is not compatible with, potentially happening when working with different hardware classes or custom data structures.
**Solution:** Double-check the object's actual type before casting. Use the `instanceof` operator to verify the object's type compatibility. Be mindful of inheritance relationships and class hierarchies in FTC libraries.

**Hardware-Specific Errors (e.g., Motor/Servo Issues):** These errors can occur due to incorrect hardware configurations, faulty connections, or exceeding motor/servo limits.
**Solution:** Verify that your hardware is properly connected and configured in both the robot configuration and code. Check for loose wires or damaged components. Ensure you're operating within the specified limits of your motors and servos.

### Debugging Techniques
Read the Error Message (and Stack Trace): The error message often provides valuable clues about the nature of the problem and its location in your code.
Use the Debugger: Android Studio's debugger allows you to step through your code line by line, inspect variables, and identify the point where the error occurs.
Telemetry Logging (`telemetry.addData()`):  Telemetry statements can help you track the flow of execution, display sensor values, and monitor variable changes during runtime.




