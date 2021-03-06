import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class QuestionList {

	public static HashMap<Integer, String> USQ = new HashMap<Integer, String>();
	public static HashMap<Integer, String> US1A = new HashMap<Integer, String>();
	public static HashMap<Integer, String> US2A = new HashMap<Integer, String>();
	public static HashMap<Integer, String> US3A = new HashMap<Integer, String>();
	public static HashMap<Integer, String> US4A = new HashMap<Integer, String>();
	public static HashMap<Integer, String> US5A = new HashMap<Integer, String>();
	
	public static HashMap<Integer, String> UMD = new HashMap<Integer, String>();
	public static HashMap<Integer, String> UMD1A = new HashMap<Integer, String>();
	public static HashMap<Integer, String> UMD2A = new HashMap<Integer, String>();
	public static HashMap<Integer, String> UMD3A = new HashMap<Integer, String>();
	public static HashMap<Integer, String> UMD4A = new HashMap<Integer, String>();
	public static HashMap<Integer, String> UMD5A = new HashMap<Integer, String>();
	
	public static HashMap<Integer, String> CS = new HashMap<Integer, String>();
	public static HashMap<Integer, String> CS1A = new HashMap<Integer, String>();
	public static HashMap<Integer, String> CS2A = new HashMap<Integer, String>();
	public static HashMap<Integer, String> CS3A = new HashMap<Integer, String>();
	public static HashMap<Integer, String> CS4A = new HashMap<Integer, String>();
	public static HashMap<Integer, String> CS5A = new HashMap<Integer, String>();
	
	public static HashMap<Integer, String> GEO = new HashMap<Integer, String>();
	public static HashMap<Integer, String> GEO1A = new HashMap<Integer, String>();
	public static HashMap<Integer, String> GEO2A = new HashMap<Integer, String>();
	public static HashMap<Integer, String> GEO3A = new HashMap<Integer, String>();
	public static HashMap<Integer, String> GEO4A = new HashMap<Integer, String>();
	public static HashMap<Integer, String> GEO5A = new HashMap<Integer, String>();
	
	public static HashMap<Integer, String> MOV = new HashMap<Integer, String>();
	public static HashMap<Integer, String> MOV1A = new HashMap<Integer, String>();
	public static HashMap<Integer, String> MOV2A = new HashMap<Integer, String>();
	public static HashMap<Integer, String> MOV3A = new HashMap<Integer, String>();
	public static HashMap<Integer, String> MOV4A = new HashMap<Integer, String>();
	public static HashMap<Integer, String> MOV5A = new HashMap<Integer, String>();
	
	public static HashMap<Integer, String> USA = new HashMap<Integer, String>();
	public static HashMap<Integer, String> UMDA = new HashMap<Integer, String>();
	public static HashMap<Integer, String> CSA = new HashMap<Integer, String>();
	public static HashMap<Integer, String> GEOA = new HashMap<Integer, String>();
	public static HashMap<Integer, String> MOVA = new HashMap<Integer, String>();

	//Method to load the input.txt file into hashmaps for questions and answers
	public static void read() {	

		File file = new File("input.txt");

		try {
			Scanner s = new Scanner(file);
			
			USQ.put(100, s.nextLine());
			US1A.put(1, s.nextLine());
			US1A.put(2, s.nextLine());
			US1A.put(3, s.nextLine());
			US1A.put(4, s.nextLine());
			
			USQ.put(200, s.nextLine());
			US2A.put(1, s.nextLine());
			US2A.put(2, s.nextLine());
			US2A.put(3, s.nextLine());
			US2A.put(4, s.nextLine());
			
			USQ.put(300, s.nextLine());
			US3A.put(1, s.nextLine());
			US3A.put(2, s.nextLine());
			US3A.put(3, s.nextLine());
			US3A.put(4, s.nextLine());
			
			USQ.put(400, s.nextLine());
			US4A.put(1, s.nextLine());
			US4A.put(2, s.nextLine());
			US4A.put(3, s.nextLine());
			US4A.put(4, s.nextLine());
			
			USQ.put(500, s.nextLine());
			US5A.put(1, s.nextLine());
			US5A.put(2, s.nextLine());
			US5A.put(3, s.nextLine());
			US5A.put(4, s.nextLine());
			
			UMD.put(100, s.nextLine());
			UMD1A.put(1, s.nextLine());
			UMD1A.put(2, s.nextLine());
			UMD1A.put(3, s.nextLine());
			UMD1A.put(4, s.nextLine());
			
			UMD.put(200, s.nextLine());
			UMD2A.put(1, s.nextLine());
			UMD2A.put(2, s.nextLine());
			UMD2A.put(3, s.nextLine());
			UMD2A.put(4, s.nextLine());
			
			UMD.put(300, s.nextLine());
			UMD3A.put(1, s.nextLine());
			UMD3A.put(2, s.nextLine());
			UMD3A.put(3, s.nextLine());
			UMD3A.put(4, s.nextLine());
			
			UMD.put(400, s.nextLine());
			UMD4A.put(1, s.nextLine());
			UMD4A.put(2, s.nextLine());
			UMD4A.put(3, s.nextLine());
			UMD4A.put(4, s.nextLine());
			
			UMD.put(500, s.nextLine());
			UMD5A.put(1, s.nextLine());
			UMD5A.put(2, s.nextLine());
			UMD5A.put(3, s.nextLine());
			UMD5A.put(4, s.nextLine());
			
			CS.put(100, s.nextLine());
			CS1A.put(1, s.nextLine());
			CS1A.put(2, s.nextLine());
			CS1A.put(3, s.nextLine());
			CS1A.put(4, s.nextLine());
			
			CS.put(200, s.nextLine());
			CS2A.put(1, s.nextLine());
			CS2A.put(2, s.nextLine());
			CS2A.put(3, s.nextLine());
			CS2A.put(4, s.nextLine());
			
			CS.put(300, s.nextLine());
			CS3A.put(1, s.nextLine());
			CS3A.put(2, s.nextLine());
			CS3A.put(3, s.nextLine());
			CS3A.put(4, s.nextLine());
			
			CS.put(400, s.nextLine());
			CS4A.put(1, s.nextLine());
			CS4A.put(2, s.nextLine());
			CS4A.put(3, s.nextLine());
			CS4A.put(4, s.nextLine());
			
			CS.put(500, s.nextLine());
			CS5A.put(1, s.nextLine());
			CS5A.put(2, s.nextLine());
			CS5A.put(3, s.nextLine());
			CS5A.put(4, s.nextLine());
			
			GEO.put(100, s.nextLine());
			GEO1A.put(1, s.nextLine());
			GEO1A.put(2, s.nextLine());
			GEO1A.put(3, s.nextLine());
			GEO1A.put(4, s.nextLine());
			
			GEO.put(200, s.nextLine());
			GEO2A.put(1, s.nextLine());
			GEO2A.put(2, s.nextLine());
			GEO2A.put(3, s.nextLine());
			GEO2A.put(4, s.nextLine());
			
			GEO.put(300, s.nextLine());
			GEO3A.put(1, s.nextLine());
			GEO3A.put(2, s.nextLine());
			GEO3A.put(3, s.nextLine());
			GEO3A.put(4, s.nextLine());
			
			GEO.put(400, s.nextLine());
			GEO4A.put(1, s.nextLine());
			GEO4A.put(2, s.nextLine());
			GEO4A.put(3, s.nextLine());
			GEO4A.put(4, s.nextLine());
			
			GEO.put(500, s.nextLine());
			GEO5A.put(1, s.nextLine());
			GEO5A.put(2, s.nextLine());
			GEO5A.put(3, s.nextLine());
			GEO5A.put(4, s.nextLine());
			
			MOV.put(100, s.nextLine());
			MOV1A.put(1, s.nextLine());
			MOV1A.put(2, s.nextLine());
			MOV1A.put(3, s.nextLine());
			MOV1A.put(4, s.nextLine());
			
			MOV.put(200, s.nextLine());
			MOV2A.put(1, s.nextLine());
			MOV2A.put(2, s.nextLine());
			MOV2A.put(3, s.nextLine());
			MOV2A.put(4, s.nextLine());
			
			MOV.put(300, s.nextLine());
			MOV3A.put(1, s.nextLine());
			MOV3A.put(2, s.nextLine());
			MOV3A.put(3, s.nextLine());
			MOV3A.put(4, s.nextLine());
			
			MOV.put(400, s.nextLine());
			MOV4A.put(1, s.nextLine());
			MOV4A.put(2, s.nextLine());
			MOV4A.put(3, s.nextLine());
			MOV4A.put(4, s.nextLine());
			
			MOV.put(500, s.nextLine());
			MOV5A.put(1, s.nextLine());
			MOV5A.put(2, s.nextLine());
			MOV5A.put(3, s.nextLine());
			MOV5A.put(4, s.nextLine());
			
			USA.put(1, s.nextLine());
			USA.put(2, s.nextLine());
			USA.put(3, s.nextLine());
			USA.put(4, s.nextLine());
			USA.put(5, s.nextLine());
			
			UMDA.put(1, s.nextLine());
			UMDA.put(2, s.nextLine());
			UMDA.put(3, s.nextLine());
			UMDA.put(4, s.nextLine());
			UMDA.put(5, s.nextLine());
			
			CSA.put(1, s.nextLine());
			CSA.put(2, s.nextLine());
			CSA.put(3, s.nextLine());
			CSA.put(4, s.nextLine());
			CSA.put(5, s.nextLine());
			
			GEOA.put(1, s.nextLine());
			GEOA.put(2, s.nextLine());
			GEOA.put(3, s.nextLine());
			GEOA.put(4, s.nextLine());
			GEOA.put(5, s.nextLine());
			
			MOVA.put(1, s.nextLine());
			MOVA.put(2, s.nextLine());
			MOVA.put(3, s.nextLine());
			MOVA.put(4, s.nextLine());
			MOVA.put(5, s.nextLine()); 
			
			s.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
