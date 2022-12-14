package org.usfirst.frc706;

public final class Constants {

	public static class TimingArrays {
		public static final double[] climbStateLengths = new double[] {1,1,1,1,1,1,1,1,1,1,1,1};

	}

	public class SparkIDs {
		//Driving IDs
		public static final int sparkWheelFR = 1;
		public static final int sparkWheelFL = 3;
		public static final int sparkWheelBR = 5;
		public static final int sparkWheelBL = 7;
		public static final int sparkWheelTurnFR = 2;
		public static final int sparkWheelTurnFL = 4;
		public static final int sparkWheelTurnBR = 6;
		public static final int sparkWheelTurnBL = 8;

	}

	public static final int PID_TIMEOUT = 30;

	public class Auton {
		public static final double strafeModifier = 1;
		public static final double rotationalModifier = 1;
		public static final double tolerance = 2;
	}

	public class Chassis {
		//ALL CAN IDs
	
		// Driving
		public static final boolean USE_XBOX = false;
		public static final boolean LOGGING_ENABLED = false;
		public static final boolean JOYDEADZONE = true; //enables both rotation and xy deadzone

		//Driving Constants

	}

	public class IO {
		// Joystick Ports
		public static final int LEFT_JOY = 1;
		public static final int RIGHT_JOY = 0;
		public static final int XBOXDRIVE = 2;
		public static final int XBOXMANIP = 5;

		// Joystick Buttons
		public static final int TRIGGER = 1;
		public static final int CLIMB = 2;

		// Xbox Buttons
		public static final int A = 1;
		public static final int B = 2;
		public static final int X = 3;
		public static final int Y = 4;
		public static final int LB = 5;
		public static final int RB = 6;
		public static final int BACK = 7;
		public static final int START = 8;
		public static final int MANIP = 9;
		public static final int VISION_TRIGGER = 2;

		//Xbox deadband
		public static final double xboxDeadband = 0.08;
	}

	
	public class PID{
		// PID coefficients
		public class Wheels{
			public static final double kP = 2.1e-4; 
			public static final double kI = 0;//1e-7;
			public static final double kD = 0;//6e-5; 
			public static final double kIz = 0; 
			public static final double kFF = 0.000156; 
			public static final double kMaxOutput = 1; 
			public static final double kMinOutput = -1;
			public static final double maxRPM = 5700;
		
			// Smart Motion Coefficients
			public static final double maxVel = 2000; // rpm
			public static final double minVel = 0; // rpm
			public static final double 	maxAcc = 1500;

			public static final double allowedErr = 0;
		}

		public class TurnMotor{
			public static final double kP = 2.1e-4; 
			public static final double kI = 0;//1e-7;
			public static final double kD = 0;//6e-5; 
			public static final double kIz = 0; 
			public static final double kFF = 0.000156; 
			public static final double kMaxOutput = 1; 
			public static final double kMinOutput = -1;
			public static final double maxRPM = 5700;
		
			// Smart Motion Coefficients
			public static final double maxVel = 2000; // rpm
			public static final double minVel = 0; // rpm
			public static final double 	maxAcc = 1500;

			public static final double allowedErr = 0;
		}

	}

	
}