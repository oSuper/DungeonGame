package customclasses;
import java.util.HashMap;

public class R {
	public static final int _BODEN_ = 0, ECKE_LO = 1, ECKE_RO = 2, ECKE_LU = 3, ECKE_RU = 4, _WAND_O = 5, _WAND_L = 6,
			_WAND_R = 7, _WAND_U = 8, _DOOR_O = 9, _DOOR_U = 10, _DOOR_L = 11, _DOOR_R = 12, KISTE = 13, WASSER = 14,
			GRASS = 15, HINDERNIS = 16, SCHLUCHT = 19, TELEPORTER = 20, PLATTEGRAU = 21, PLATTEGELB = 22,
			PLATTEROT = 23, PLATTEBLAU = 24, PLATTEGRUEN = 25, SCHLUESSEL = 26;

	public static final Integer room1[][] = { { 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 2 },
			{ 6, 16, 0, 0, 21, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 21, 7 },
			{ 6, 16, 0, 0, 16, 16, 0, 0, 16, 16, 16, 16, 0, 16, 16, 16, 7 },
			{ 6, 0, 0, 0, 0, 0, 0, 0, 16, 21, 16, 21, 0, 0, 16, 16, 7 },
			{ 6, 0, 0, 0, 0, 0, 0, 0, 16, 0, 16, 0, 16, 0, 0, 0, 12 },
			{ 6, 0, 13, 16, 0, 13, 0, 0, 0, 0, 0, 0, 16, 0, 16, 16, 7 },
			{ 6, 0, 13, 0, 0, 16, 16, 16, 16, 0, 16, 16, 16, 0, 16, 16, 7 },
			{ 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7 },
			{ 3, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 4 } }; // fertig, nurnoch Grafik für Hindernisse fehlt

	public static final Integer room2[][] = { { 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 2 },
			{ 6, 15, 15, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7 },
			{ 6, 15, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0, 0, 0, 7 },
			{ 6, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 14, 15, 0, 0, 7 },
			{ 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 14, 14, 15, 0, 0, 12 },
			{ 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 14, 15, 0, 0, 0, 7 },
			{ 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 15, 0, 0, 0, 0, 7 },
			{ 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7 },
			{ 3, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 4 } };

	public static final Integer room3[][] = { { 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 2 },
			{ 6, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 7 },
			{ 6, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 7 },
			{ 6, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 7 },
			{ 11, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 12 },
			{ 6, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 7 },
			{ 6, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 7 },
			{ 6, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 7 },
			{ 3, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 4 } };

	public static final Integer[][] room4 = { { 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 2 },
			{ 6, 0, 16, 0, 16, 0, 0, 0, 16, 16, 0, 16, 16, 0, 0, 0, 7 },
			{ 6, 0, 0, 0, 0, 0, 16, 0, 0, 0, 0, 0, 16, 0, 16, 0, 7 },
			{ 6, 0, 16, 16, 16, 16, 0, 0, 16, 0, 16, 0, 16, 0, 16, 16, 7 },
			{ 11, 0, 16, 16, 0, 16, 0, 16, 16, 0, 16, 0, 0, 0, 16, 0, 12 },
			{ 6, 0, 0, 0, 0, 16, 0, 0, 0, 0, 0, 0, 16, 0, 0, 0, 7 },
			{ 6, 0, 16, 16, 0, 0, 0, 16, 16, 16, 0, 16, 16, 0, 16, 16, 7 },
			{ 6, 0, 0, 0, 16, 16, 0, 0, 0, 16, 0, 0, 0, 0, 0, 0, 7 },
			{ 3, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 4 } };

	public static final Integer room5[][] = { { 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 2 },
			{ 6, 20, 20, 16, 20, 20, 16, 20, 20, 16, 20, 0, 20, 16, 20, 20, 7 },
			{ 6, 0, 20, 16, 16, 16, 16, 20, 0, 16, 16, 16, 16, 16, 0, 20, 7 },
			{ 6, 16, 16, 16, 20, 0, 16, 16, 16, 16, 20, 0, 16, 16, 16, 16, 7 },
			{ 11, 0, 20, 16, 0, 20, 16, 20, 0, 16, 20, 20, 16, 20, 0, 20, 7 },
			{ 6, 16, 16, 16, 16, 16, 16, 20, 20, 16, 16, 16, 16, 16, 16, 16, 7 },
			{ 6, 20, 20, 16, 20, 20, 16, 16, 16, 16, 16, 20, 20, 16, 20, 20, 7 },
			{ 6, 20, 0, 16, 0, 0, 16, 20, 20, 20, 16, 20, 0, 16, 20, 0, 7 },
			{ 3, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 4 } };
	// [9][17]

	public static final int room_clean[][] = {
			{ ECKE_LO, _WAND_O, _WAND_O, _WAND_O, _WAND_O, _WAND_O, _WAND_O, _WAND_O, _DOOR_O, _WAND_O, _WAND_O,
					_WAND_O, _WAND_O, _WAND_O, _WAND_O, _WAND_O, ECKE_RO },
			{ _WAND_L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, _WAND_R },
			{ _WAND_L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, _WAND_R },
			{ _WAND_L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, _WAND_R },
			{ _WAND_L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, _WAND_R },
			{ _WAND_L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, _WAND_R },
			{ _WAND_L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, _WAND_R },
			{ _WAND_L, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, _WAND_R },
			{ ECKE_LU, _WAND_U, _WAND_U, _WAND_U, _WAND_U, _WAND_U, _WAND_U, _WAND_U, _WAND_U, _WAND_U, _WAND_U,
					_WAND_U, _WAND_U, _WAND_U, _WAND_U, _WAND_U, ECKE_RU } };
	
	public static final HashMap<Integer, Integer[][]> room1Doors = new HashMap<Integer, Integer[][]>();
	public static final HashMap<Integer, Integer[][]> room2Doors = new HashMap<Integer, Integer[][]>();
	public static final HashMap<Integer, Integer[][]> room3Doors = new HashMap<Integer, Integer[][]>();
	public static final HashMap<Integer, Integer[][]> room4Doors = new HashMap<Integer, Integer[][]>();
	public static final HashMap<Integer, Integer[][]> room5Doors = new HashMap<Integer, Integer[][]>();
	
	public static void connectDoors()
	{
		room1Doors.put(12, room2);
		
		room2Doors.put(11, room1);
		room2Doors.put(12, room3);
		
		room3Doors.put(11, room2);
		room3Doors.put(12, room4);
		
		room4Doors.put(11, room3);
		room4Doors.put(12, room5);
		
		room5Doors.put(11, room4);
	}
	
	
	public static Integer[][] checkDoor(Integer[][] room, Integer doorNumber)
	{
		Integer[][] roomNext = null;
		if(room == room1)
		{
			roomNext = room1Doors.get(doorNumber);
		}
		else if(room == room2)
		{
			roomNext = room2Doors.get(doorNumber);
		}
		else if(room == room3)
		{
			roomNext = room3Doors.get(doorNumber);
		}
		else if(room == room4)
		{
			roomNext = room4Doors.get(doorNumber);
		}
		else if(room == room5)
		{
			roomNext = room5Doors.get(doorNumber);
		}
		return roomNext;	
	}
}
