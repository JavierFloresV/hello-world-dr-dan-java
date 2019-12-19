/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Hello World with Dr. Dan - A Complete Introduction to Programming from Java to C++ (Code and Course � Dan Grissom)
//
// Additional Lesson Resources from Dr. Dan:
//		High-Quality Video Tutorials: www.helloDrDan.com
//		Free Commented Code: https://github.com/DanGrissom/hello-world-dr-dan-java
//
// Lesson Note:
// 		This class is consumed by Lesson_01_StarWarsUniverseClient_Basic_OOP & Lesson_02_StarWarsUniverseClient_Advanced_OOP..
//		This class encapsulates the GalacticID, which contains a unique Empire ID.
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public abstract class GalacticID {

	// Instance variables
	private long idNum;
	
	// Static/class variable
	private static long nextIdNum;
	
	///////////////////////////////////////////////////////////////
	// Default Constructor - Gets the next id number and assigns
	// it to this object's id number.
	//		Parameters:
	//			NONE
	///////////////////////////////////////////////////////////////
	public GalacticID() {
		idNum = nextIdNum++;
	}
	
	///////////////////////////////////////////////////////////////
	// Getters
	///////////////////////////////////////////////////////////////
	public long getIdNum() { return idNum; }
	
	///////////////////////////////////////////////////////////////
	// This method is an abstract method that will be implemented
	// by a sub-class. The sub-class should provide a definition
	// that creates a String based on their idNum and sub-class
	// info that does not exist in this class.
	//		Parameters:
	//			NONE
	//		Returns:
	//			A String representing a formatted empire id
	///////////////////////////////////////////////////////////////
	public abstract String getFormattedEmpireIdStr();
}