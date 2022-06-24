package customclasses;

public class R {
	public static final int _BODEN_ = 0, ECKE_LO = 1, ECKE_RO = 2, ECKE_LU = 3, ECKE_RU = 4, _WAND_O = 5, _WAND_L = 6,
			_WAND_R = 7, _WAND_U = 8, _DOOR_O = 9,_DOOR_U = 10, _DOOR_L = 11, _DOOR_R = 12,  TELEPORTER = 13, WASSER = 14, GRASS = 15; HINDERNIS = 16;
			KISTE = 17; PLATTE = 18; SCHLUCHT = 19; TELEPORTER = 20;

	public static final int room1[][] = { 
			{ 1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 2 },
			{ 6, 16, 0, 0, 18, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 18, 7 },
			{ 6, 16, 0, 0, 16, 16, 0, 0, 16, 16, 16, 16,0, 16, 16, 16, 7 },
			{ 6, 0, 0, 0, 0, 0, 0, 0, 16, 18, 16, 18, 0, 0, 16, 16, 7 },
			{ 11, 0, 0, 0, 0, 16, 16, 0, 16, 0, 16, 0, 16, 0, 0, 0, 12 },
			{ 6, 0, 17, 0, 0, 17, 0, 0, 0, 0, 0, 0, 16, 0, 0, 0, 7 },
			{ 6, 0, 17, 0, 0, 16, 16, 16, 16, 0, 16, 16, 16, 0, 16, 16, 7 },
			{ 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7 },
			{ 3, 8, 8, 8, 8, 8, 8, 8, 10, 8, 8, 8, 8, 8, 8, 8, 4 } };
	
	public static final int room2[][] = { 
			{ 1, 5, 5, 5, 5, 5, 5, 5, 9, 5, 5, 5, 5, 5, 5, 5, 2 },
			{ 6, 0, 18, 0, 18, 0, 18, 0, 0, 0, 0, 18, 0, 18, 0, 18, 7 },
			{ 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7 },
			{ 6, 0, 18, 0, 18, 0, 18, 0, 0, 0, 0, 18, 0, 18, 0, 18, 7 },
			{ 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12},
			{ 6, 0, 18, 0, 18, 0, 18, 0, 0, 0, 0, 18, 0, 18, 0, 18, 7 },
			{ 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7 },
			{ 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7 },
			{ 3, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 4 } };
	public static final int room3[][] = { 
			{ 1, 5, 5, 5, 5, 5, 5, 5, 9, 5, 5, 5, 5, 5, 5, 5, 2 },
			{ 6, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 7 },
			{ 6, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 7 },
			{ 6, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 7 },
			{ 11, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 12},
			{ 6, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 7 },
			{ 6, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 7 },
			{ 6, 0, 0, 0, 0, 0, 0, 19, 0, 0, 0, 0, 0, 0, 0, 0, 7 },
			{ 3, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 4 } };
	public static final int room4[][] = { 
			{ 1, 5, 5, 5, 5, 5, 5, 5, 9, 5, 5, 5, 5, 5, 5, 5, 2 },
			{ 6, 0, 16, 0, 16, 0, 0, 0, 16, 16, 0, 16, 16, 0, 0, 0, 7 },
			{ 6, 0, 0, 0, 0, 0, 16, 0, 0, 0, 0, 0, 16, 0, 16, 0, 7 },
			{ 6, 0, 16, 16, 16, 16, 0, 0, 16, 0, 16, 0, 16, 0, 16, 16, 7 },
			{ 11, 0, 16, 16, 0, 16, 0, 16, 16, 0, 16, 0, 0, 0, 16, 0, 12 },
			{ 6, 0, 0, 0, 0, 16, 0, 0, 0, 0, 0, 0, 16, 0, 0, 0, 7 },
			{ 6, 0, 16, 16, 0, 0, 0, 16, 16, 16, 0, 16, 16, 0, 16, 16, 7 },
			{ 6, 0, 0, 0, 16, 16, 0, 0, 0, 16, 0, 0, 0, 0, 0, 0, 7 },
			{ 3, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 4 } };
	public static final int room5[][] = { 
			{ 1, 5, 5, 5, 5, 5, 5, 5, 9, 5, 5, 5, 5, 5, 5, 5, 2 },
			{ 6, 20, 20, 16, 20, 20, 16, 20, 20, 16, 20, 0, 20, 16, 20, 20, 7 },
			{ 6, 0, 20, 16, 16, 16, 16, 20, 0, 16, 16,16,16,16,0,20,7},
			{ 6, 16, 16, 16, 20, 0, 16, 16, 16, 16, 20, 0, 16, 16, 16, 16, 7 },    
			{ 11, 0, 20, 16, 0, 20,16, 20, 0, 16, 20, 20, 16, 20, 0, 20, 12 },
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
}
