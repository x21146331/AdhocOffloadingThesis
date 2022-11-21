package app.src.main.java.versionproject;

public final class FCL_definition {
	public final static String memberShipFunctions1 = String.join("\n"
			, "FUNCTION_BLOCK tipper"
			, "VAR_INPUT"
			, "	wan_bw : REAL;"
			, "	task_size : REAL;"
			, "	delay_sensitivity : REAL;"
			, "	avg_edge_util : REAL;"
			, "END_VAR"
			, "VAR_OUTPUT"
			, "	offload_decision : REAL;"
			, "END_VAR"
			, "FUZZIFY wan_bw"
			, "	TERM low := (0, 1) (2, 1) (4, 0);"
			, "	TERM medium := (3, 0) (5, 1) (7, 0);"
			, "	TERM high := (6, 0) (8, 1) (21, 1);"
			, "END_FUZZIFY"
			, "FUZZIFY task_size"
			, "	TERM low := (0, 1) (4000, 1) (8000, 0) ; "
			, "	TERM medium := (6000, 0) (12000,1) (18000,0);"
			, "	TERM high := (16000, 0) (20000, 1) (50000, 1);"
			, "END_FUZZIFY"
			, "FUZZIFY delay_sensitivity"
			, "	TERM low := (0, 1) (0.2, 1) (0.4, 0) ; "
			, "	TERM medium := (0.3, 0) (0.5,1) (0.7,0);"
			, "	TERM high := (0.6, 0) (0.8, 1) (1, 1);"
			, "END_FUZZIFY"
			, "FUZZIFY avg_edge_util"
			, "	TERM low := (0, 1) (20, 1) (40, 0);"
			, "	TERM medium := (30, 0) (50,1) (70,0);"
			, "	TERM high := (60, 0) (80, 1) (100, 1);"
			, "END_FUZZIFY"
			, "DEFUZZIFY offload_decision"
			, "	TERM edge := (0, 0) (30, 1) (60, 0);"
			, "	TERM cloud := (40, 0) (70, 1) (100, 0);"
			, "	METHOD : LM;"
			, "	DEFAULT := 0;"
			, "END_DEFUZZIFY"
	);

	public final static String fclDefinition1 = String.join("\n"
			, memberShipFunctions1
			, "RULEBLOCK No1"
			, "	AND : MIN;"
			, "	ACT : MIN;"
			, "	ACCU : MAX;"
			, " RULE 1 :   IF avg_edge_util IS low AND task_size IS low AND wan_bw IS low AND delay_sensitivity IS low THEN offload_decision IS edge;"
			, " RULE 2 :   IF avg_edge_util IS low AND task_size IS low AND wan_bw IS low AND delay_sensitivity IS medium THEN offload_decision IS edge;"
			, " RULE 3 :   IF avg_edge_util IS low AND task_size IS low AND wan_bw IS low AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 4 :   IF avg_edge_util IS low AND task_size IS low AND wan_bw IS medium AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 5 :   IF avg_edge_util IS low AND task_size IS low AND wan_bw IS medium AND delay_sensitivity IS medium THEN offload_decision IS edge;"
			, " RULE 6 :   IF avg_edge_util IS low AND task_size IS low AND wan_bw IS medium AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 7 :   IF avg_edge_util IS low AND task_size IS low AND wan_bw IS high AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 8 :   IF avg_edge_util IS low AND task_size IS low AND wan_bw IS high AND delay_sensitivity IS medium THEN offload_decision IS edge;"
			, " RULE 9 :   IF avg_edge_util IS low AND task_size IS low AND wan_bw IS high AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 10 :  IF avg_edge_util IS low AND task_size IS medium AND wan_bw IS low AND delay_sensitivity IS low THEN offload_decision IS edge;"
			, " RULE 11 :  IF avg_edge_util IS low AND task_size IS medium AND wan_bw IS low AND delay_sensitivity IS medium THEN offload_decision IS edge;"
			, " RULE 12 :  IF avg_edge_util IS low AND task_size IS medium AND wan_bw IS low AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 13 :  IF avg_edge_util IS low AND task_size IS medium AND wan_bw IS medium AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 14 :  IF avg_edge_util IS low AND task_size IS medium AND wan_bw IS medium AND delay_sensitivity IS medium THEN offload_decision IS cloud;"
			, " RULE 15 :  IF avg_edge_util IS low AND task_size IS medium AND wan_bw IS medium AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 16 :  IF avg_edge_util IS low AND task_size IS medium AND wan_bw IS high AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 17 :  IF avg_edge_util IS low AND task_size IS medium AND wan_bw IS high AND delay_sensitivity IS medium THEN offload_decision IS cloud;"
			, " RULE 18 :  IF avg_edge_util IS low AND task_size IS medium AND wan_bw IS high AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 19 :  IF avg_edge_util IS low AND task_size IS high AND wan_bw IS low AND delay_sensitivity IS low THEN offload_decision IS edge;"
			, " RULE 20 :  IF avg_edge_util IS low AND task_size IS high AND wan_bw IS low AND delay_sensitivity IS medium THEN offload_decision IS edge;"
			, " RULE 21 :  IF avg_edge_util IS low AND task_size IS high AND wan_bw IS low AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 22 :  IF avg_edge_util IS low AND task_size IS high AND wan_bw IS medium AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 23 :  IF avg_edge_util IS low AND task_size IS high AND wan_bw IS medium AND delay_sensitivity IS medium THEN offload_decision IS cloud;"
			, " RULE 24 :  IF avg_edge_util IS low AND task_size IS high AND wan_bw IS medium AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 25 :  IF avg_edge_util IS low AND task_size IS high AND wan_bw IS high AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 26 :  IF avg_edge_util IS low AND task_size IS high AND wan_bw IS high AND delay_sensitivity IS medium THEN offload_decision IS cloud;"
			, " RULE 27 :  IF avg_edge_util IS low AND task_size IS high AND wan_bw IS high AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 28 :  IF avg_edge_util IS medium AND task_size IS low AND wan_bw IS low AND delay_sensitivity IS low THEN offload_decision IS edge;"
			, " RULE 29 :  IF avg_edge_util IS medium AND task_size IS low AND wan_bw IS low AND delay_sensitivity IS medium THEN offload_decision IS edge;"
			, " RULE 30 :  IF avg_edge_util IS medium AND task_size IS low AND wan_bw IS low AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 31 :  IF avg_edge_util IS medium AND task_size IS low AND wan_bw IS medium AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 32 :  IF avg_edge_util IS medium AND task_size IS low AND wan_bw IS medium AND delay_sensitivity IS medium THEN offload_decision IS cloud;"
			, " RULE 33 :  IF avg_edge_util IS medium AND task_size IS low AND wan_bw IS medium AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 34 :  IF avg_edge_util IS medium AND task_size IS low AND wan_bw IS high AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 35 :  IF avg_edge_util IS medium AND task_size IS low AND wan_bw IS high AND delay_sensitivity IS medium THEN offload_decision IS cloud;"
			, " RULE 36 :  IF avg_edge_util IS medium AND task_size IS low AND wan_bw IS high AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 37 :  IF avg_edge_util IS medium AND task_size IS medium AND wan_bw IS low AND delay_sensitivity IS low THEN offload_decision IS edge;"
			, " RULE 38 :  IF avg_edge_util IS medium AND task_size IS medium AND wan_bw IS low AND delay_sensitivity IS medium THEN offload_decision IS edge;"
			, " RULE 39 :  IF avg_edge_util IS medium AND task_size IS medium AND wan_bw IS low AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 40 :  IF avg_edge_util IS medium AND task_size IS medium AND wan_bw IS medium AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 41 :  IF avg_edge_util IS medium AND task_size IS medium AND wan_bw IS medium AND delay_sensitivity IS medium THEN offload_decision IS cloud;"
			, " RULE 42 :  IF avg_edge_util IS medium AND task_size IS medium AND wan_bw IS medium AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 43 :  IF avg_edge_util IS medium AND task_size IS medium AND wan_bw IS high AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 44 :  IF avg_edge_util IS medium AND task_size IS medium AND wan_bw IS high AND delay_sensitivity IS medium THEN offload_decision IS cloud;"
			, " RULE 45 :  IF avg_edge_util IS medium AND task_size IS medium AND wan_bw IS high AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 46 :  IF avg_edge_util IS medium AND task_size IS high AND wan_bw IS low AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 47 :  IF avg_edge_util IS medium AND task_size IS high AND wan_bw IS low AND delay_sensitivity IS medium THEN offload_decision IS cloud;"
			, " RULE 48 :  IF avg_edge_util IS medium AND task_size IS high AND wan_bw IS low AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 49 :  IF avg_edge_util IS medium AND task_size IS high AND wan_bw IS medium AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 50 :  IF avg_edge_util IS medium AND task_size IS high AND wan_bw IS medium AND delay_sensitivity IS medium THEN offload_decision IS cloud;"
			, " RULE 51 :  IF avg_edge_util IS medium AND task_size IS high AND wan_bw IS medium AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 52 :  IF avg_edge_util IS medium AND task_size IS high AND wan_bw IS high AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 53 :  IF avg_edge_util IS medium AND task_size IS high AND wan_bw IS high AND delay_sensitivity IS medium THEN offload_decision IS cloud;"
			, " RULE 54 :  IF avg_edge_util IS medium AND task_size IS high AND wan_bw IS high AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 55 :  IF avg_edge_util IS high AND task_size IS low AND wan_bw IS low AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 56 :  IF avg_edge_util IS high AND task_size IS low AND wan_bw IS low AND delay_sensitivity IS medium THEN offload_decision IS cloud;"
			, " RULE 57 :  IF avg_edge_util IS high AND task_size IS low AND wan_bw IS low AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 58 :  IF avg_edge_util IS high AND task_size IS low AND wan_bw IS medium AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 59 :  IF avg_edge_util IS high AND task_size IS low AND wan_bw IS medium AND delay_sensitivity IS medium THEN offload_decision IS cloud;"
			, " RULE 60 :  IF avg_edge_util IS high AND task_size IS low AND wan_bw IS medium AND delay_sensitivity IS high THEN offload_decision IS cloud;"
			, " RULE 61 :  IF avg_edge_util IS high AND task_size IS low AND wan_bw IS high AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 62 :  IF avg_edge_util IS high AND task_size IS low AND wan_bw IS high AND delay_sensitivity IS medium THEN offload_decision IS cloud;"
			, " RULE 63 :  IF avg_edge_util IS high AND task_size IS low AND wan_bw IS high AND delay_sensitivity IS high THEN offload_decision IS cloud;"
			, " RULE 64 :  IF avg_edge_util IS high AND task_size IS medium AND wan_bw IS low AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 65 :  IF avg_edge_util IS high AND task_size IS medium AND wan_bw IS low AND delay_sensitivity IS medium THEN offload_decision IS cloud;"
			, " RULE 66 :  IF avg_edge_util IS high AND task_size IS medium AND wan_bw IS low AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 67 :  IF avg_edge_util IS high AND task_size IS medium AND wan_bw IS medium AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 68 :  IF avg_edge_util IS high AND task_size IS medium AND wan_bw IS medium AND delay_sensitivity IS medium THEN offload_decision IS cloud;"
			, " RULE 69 :  IF avg_edge_util IS high AND task_size IS medium AND wan_bw IS medium AND delay_sensitivity IS high THEN offload_decision IS cloud;"
			, " RULE 70 :  IF avg_edge_util IS high AND task_size IS medium AND wan_bw IS high AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 71 :  IF avg_edge_util IS high AND task_size IS medium AND wan_bw IS high AND delay_sensitivity IS medium THEN offload_decision IS cloud;"
			, " RULE 72 :  IF avg_edge_util IS high AND task_size IS medium AND wan_bw IS high AND delay_sensitivity IS high THEN offload_decision IS cloud;"
			, " RULE 73 :  IF avg_edge_util IS high AND task_size IS high AND wan_bw IS low AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 74 :  IF avg_edge_util IS high AND task_size IS high AND wan_bw IS low AND delay_sensitivity IS medium THEN offload_decision IS cloud;"
			, " RULE 75 :  IF avg_edge_util IS high AND task_size IS high AND wan_bw IS low AND delay_sensitivity IS high THEN offload_decision IS edge;"
			, " RULE 76 :  IF avg_edge_util IS high AND task_size IS high AND wan_bw IS medium AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 77 :  IF avg_edge_util IS high AND task_size IS high AND wan_bw IS medium AND delay_sensitivity IS medium THEN offload_decision IS cloud;"
			, " RULE 78 :  IF avg_edge_util IS high AND task_size IS high AND wan_bw IS medium AND delay_sensitivity IS high THEN offload_decision IS cloud;"
			, " RULE 79 :  IF avg_edge_util IS high AND task_size IS high AND wan_bw IS high AND delay_sensitivity IS low THEN offload_decision IS cloud;"
			, " RULE 80 :  IF avg_edge_util IS high AND task_size IS high AND wan_bw IS high AND delay_sensitivity IS medium THEN offload_decision IS cloud;"
			, " RULE 81 :  IF avg_edge_util IS high AND task_size IS high AND wan_bw IS high AND delay_sensitivity IS high THEN offload_decision IS cloud;"
			, "END_RULEBLOCK"
			, "END_FUNCTION_BLOCK"
	);
	
	public final static String memberShipFunctions2 = String.join("\n"
			, "FUNCTION_BLOCK tipper"
			, "VAR_INPUT"
			, "	nearest_edge_uitl : REAL;"
			, "	best_remote_edge_uitl : REAL;"
			, "	man_delay : REAL;"
			, "END_VAR"
			, "VAR_OUTPUT"
			, "	offload_decision : REAL;"
			, "END_VAR"
			, "FUZZIFY man_delay"
			, "	TERM low := (0, 1) (0.001, 1) (0.004, 0);"
			, "	TERM medium := (0.002, 0) (0.007, 1) (0.012, 0);"
			, "	TERM high := (0.01, 0) (0.013, 1) (10, 1);"
			, "END_FUZZIFY"
			, "FUZZIFY best_remote_edge_uitl"
			, "	TERM low := (0, 1) (20, 1) (40, 0);"
			, "	TERM medium := (30, 0) (50,1) (70,0);"
			, "	TERM high := (60, 0) (80, 1) (100, 1);"
			, "END_FUZZIFY"
			, "FUZZIFY nearest_edge_uitl"
			, "	TERM low := (0, 1) (20, 1) (40, 0);"
			, "	TERM medium := (30, 0) (50,1) (70,0);"
			, "	TERM high := (60, 0) (80, 1) (100, 1);"
			, "END_FUZZIFY"
			, "DEFUZZIFY offload_decision"
			, "	TERM nearest_edge := (0, 0) (30, 1) (60, 0);"
			, "	TERM remote_edge := (40, 0) (70, 1) (100, 0);"
			, "	METHOD : LM;"
			, "	DEFAULT := 0;"
			, "END_DEFUZZIFY"
	);
	
	public final static String fclDefinition2 = String.join("\n"
			, memberShipFunctions2
			, "RULEBLOCK No1"
			, "	AND : MIN;"
			, "	ACT : MIN;"
			, "	ACCU : MAX;"
			, " RULE 1 :   IF nearest_edge_uitl IS low AND best_remote_edge_uitl IS low AND man_delay IS high THEN offload_decision IS nearest_edge;"
			, " RULE 2 :   IF nearest_edge_uitl IS low AND best_remote_edge_uitl IS low AND man_delay IS medium THEN offload_decision IS nearest_edge;"
			, " RULE 3 :   IF nearest_edge_uitl IS low AND best_remote_edge_uitl IS low AND man_delay IS low THEN offload_decision IS remote_edge;"
			, " RULE 4 :   IF nearest_edge_uitl IS low AND best_remote_edge_uitl IS medium AND man_delay IS high THEN offload_decision IS nearest_edge;"
			, " RULE 5 :   IF nearest_edge_uitl IS low AND best_remote_edge_uitl IS medium AND man_delay IS medium THEN offload_decision IS nearest_edge;"
			, " RULE 6 :   IF nearest_edge_uitl IS low AND best_remote_edge_uitl IS medium AND man_delay IS low THEN offload_decision IS nearest_edge;"
			, " RULE 7 :   IF nearest_edge_uitl IS low AND best_remote_edge_uitl IS high AND man_delay IS high THEN offload_decision IS nearest_edge;"
			, " RULE 8 :   IF nearest_edge_uitl IS low AND best_remote_edge_uitl IS high AND man_delay IS medium THEN offload_decision IS nearest_edge;"
			, " RULE 9 :   IF nearest_edge_uitl IS low AND best_remote_edge_uitl IS high AND man_delay IS low THEN offload_decision IS nearest_edge;"
			, " RULE 10 :  IF nearest_edge_uitl IS medium AND best_remote_edge_uitl IS low AND man_delay IS high THEN offload_decision IS nearest_edge;"
			, " RULE 11 :  IF nearest_edge_uitl IS medium AND best_remote_edge_uitl IS low AND man_delay IS medium THEN offload_decision IS remote_edge;"
			, " RULE 12 :  IF nearest_edge_uitl IS medium AND best_remote_edge_uitl IS low AND man_delay IS low THEN offload_decision IS remote_edge;"
			, " RULE 13 :  IF nearest_edge_uitl IS medium AND best_remote_edge_uitl IS medium AND man_delay IS high THEN offload_decision IS nearest_edge;"
			, " RULE 14 :  IF nearest_edge_uitl IS medium AND best_remote_edge_uitl IS medium AND man_delay IS medium THEN offload_decision IS remote_edge;"
			, " RULE 15 :  IF nearest_edge_uitl IS medium AND best_remote_edge_uitl IS medium AND man_delay IS low THEN offload_decision IS remote_edge;"
			, " RULE 16 :  IF nearest_edge_uitl IS medium AND best_remote_edge_uitl IS high AND man_delay IS high THEN offload_decision IS nearest_edge;"
			, " RULE 17 :  IF nearest_edge_uitl IS medium AND best_remote_edge_uitl IS high AND man_delay IS medium THEN offload_decision IS nearest_edge;"
			, " RULE 18 :  IF nearest_edge_uitl IS medium AND best_remote_edge_uitl IS high AND man_delay IS low THEN offload_decision IS nearest_edge;"
			, " RULE 19 :  IF nearest_edge_uitl IS high AND best_remote_edge_uitl IS low AND man_delay IS high THEN offload_decision IS remote_edge;"
			, " RULE 20 :  IF nearest_edge_uitl IS high AND best_remote_edge_uitl IS low AND man_delay IS medium THEN offload_decision IS remote_edge;"
			, " RULE 21 :  IF nearest_edge_uitl IS high AND best_remote_edge_uitl IS low AND man_delay IS low THEN offload_decision IS remote_edge;"
			, " RULE 22 :  IF nearest_edge_uitl IS high AND best_remote_edge_uitl IS medium AND man_delay IS high THEN offload_decision IS remote_edge;"
			, " RULE 23 :  IF nearest_edge_uitl IS high AND best_remote_edge_uitl IS medium AND man_delay IS medium THEN offload_decision IS remote_edge;"
			, " RULE 24 :  IF nearest_edge_uitl IS high AND best_remote_edge_uitl IS medium AND man_delay IS low THEN offload_decision IS remote_edge;"
			, " RULE 25 :  IF nearest_edge_uitl IS high AND best_remote_edge_uitl IS high AND man_delay IS high THEN offload_decision IS nearest_edge;"
			, " RULE 26 :  IF nearest_edge_uitl IS high AND best_remote_edge_uitl IS high AND man_delay IS medium THEN offload_decision IS remote_edge;"
			, " RULE 27 :  IF nearest_edge_uitl IS high AND best_remote_edge_uitl IS high AND man_delay IS low THEN offload_decision IS remote_edge;"
			, "END_RULEBLOCK"
			, "END_FUNCTION_BLOCK"
	);
	
	public final static String memberShipFunctions3 = String.join("\n"
			, "FUNCTION_BLOCK tipper"
			, "VAR_INPUT"
			, "	wan_bw : REAL;"
			, "	video_execution : REAL;"
			, "	data_size : REAL;"
			, "	cpu_speed : REAL;"
			, "END_VAR"
			, "VAR_OUTPUT"
			, "	offload_decision : REAL;"
			, "END_VAR"
			, "FUZZIFY wan_bw"
			, "	TERM low := (0, 1) (2, 1) (4, 0);"
			, "	TERM medium := (3, 0) (5, 1) (7, 0);"
			, "	TERM high := (6, 0) (8, 1) (21, 1);"
			, "END_FUZZIFY"
			, "FUZZIFY video_execution"
			, "	TERM low := (0, 1) (0.2, 1) (0.4, 0) ; "
			, "	TERM normal := (0.3, 0) (0.5,1) (0.7,0);"
			, "	TERM high := (0.6, 0) (0.8, 1) (1, 1);"
			, "END_FUZZIFY"
			, "FUZZIFY data_size"
			, "	TERM small := (0, 1) (0.2, 1) (0.4, 0) ; "
			, "	TERM medium := (0.3, 0) (0.5,1) (0.7,0);"
			, "	TERM high := (0.6, 0) (0.8, 1) (1, 1);"
			, "END_FUZZIFY"
			, "FUZZIFY cpu_speed"
			, "	TERM low := (0, 1) (20, 1) (40, 0);"
			, "	TERM medium := (30, 0) (50,1) (70,0);"
			, "	TERM high := (60, 0) (80, 1) (100, 1);"
			, "END_FUZZIFY"
			, "DEFUZZIFY offload_decision"
			, "	TERM local_processing := (0, 1) (40, 1) (60, 0);"
			, "	TERM remote_processing := (40, 0) (60, 1) (100, 1);"
			, "	METHOD : COG;"
			, "	DEFAULT := 0;"
			, "END_DEFUZZIFY"
	);

	public final static String fclDefinition3 = String.join("\n"
			, memberShipFunctions3
			, "RULEBLOCK No1"
			, "	AND : MIN;"
			, "	ACT : MIN;"
			, "	ACCU : MAX;"
			, " RULE 1 :   IF cpu_speed IS low AND data_size IS small AND  wan_bw IS low AND video_execution IS low THEN offload_decision IS local_processing;"
			, " RULE 2 :   IF cpu_speed IS low AND data_size IS small AND  wan_bw IS low AND video_execution IS normal THEN offload_decision IS local_processing;"
			, " RULE 3 :   IF cpu_speed IS low AND data_size IS small AND  wan_bw IS low AND video_execution IS high THEN offload_decision IS local_processing;"
			, " RULE 5 :   IF cpu_speed IS low AND data_size IS small AND  wan_bw IS medium AND video_execution IS normal THEN offload_decision IS remote_processing;"
			, " RULE 6 :   IF cpu_speed IS low AND data_size IS small AND  wan_bw IS medium AND video_execution IS high THEN offload_decision IS remote_processing;"
			, " RULE 7 :   IF cpu_speed IS low AND data_size IS small AND  wan_bw IS high AND video_execution IS low THEN offload_decision IS remote_processing;"
			, " RULE 8 :   IF cpu_speed IS low AND data_size IS small AND  wan_bw IS high AND video_execution IS normal THEN offload_decision IS remote_processing;"
			, " RULE 9 :   IF cpu_speed IS low AND data_size IS small AND  wan_bw IS high AND video_execution IS high THEN offload_decision IS remote_processing;"
			, " RULE 10 :  IF cpu_speed IS low AND data_size IS medium AND  wan_bw IS low AND video_execution IS normal THEN offload_decision IS local_processing;"
			, " RULE 11 :  IF cpu_speed IS low AND data_size IS medium AND  wan_bw IS low AND video_execution IS high THEN offload_decision IS local_processing;"
			, " RULE 12 :  IF cpu_speed IS low AND data_size IS medium AND  wan_bw IS medium AND video_execution IS normal THEN offload_decision IS local_processing;"
			, " RULE 13 :  IF cpu_speed IS low AND data_size IS medium AND  wan_bw IS medium AND video_execution IS high THEN offload_decision IS remote_processing;"
			, " RULE 14 :  IF cpu_speed IS low AND data_size IS medium AND  wan_bw IS high AND video_execution IS low THEN offload_decision IS remote_processing;"
			, " RULE 15 :  IF cpu_speed IS low AND data_size IS medium AND  wan_bw IS high AND video_execution IS normal THEN offload_decision IS remote_processing;"
			, " RULE 16 :  IF cpu_speed IS low AND data_size IS medium AND  wan_bw IS high AND video_execution IS high THEN offload_decision IS remote_processing;"
			, " RULE 17 :  IF cpu_speed IS low AND data_size IS high AND  wan_bw IS high AND video_execution IS low THEN offload_decision IS local_processing ;"
			, " RULE 18 :  IF cpu_speed IS low AND data_size IS high AND  wan_bw IS high AND video_execution IS normal THEN offload_decision IS local_processing;"
			, " RULE 19 :  IF cpu_speed IS low AND data_size IS high AND  wan_bw IS high AND video_execution IS high THEN offload_decision IS local_processing;"
			, " RULE 20 :  IF cpu_speed IS medium AND data_size IS small AND  wan_bw IS low AND video_execution IS low THEN offload_decision IS local_processing;"
			, " RULE 21 :  IF cpu_speed IS medium AND data_size IS small AND  wan_bw IS low AND video_execution IS normal THEN offload_decision IS local_processing;"
			, " RULE 22 :  IF cpu_speed IS high AND data_size IS high AND  wan_bw IS low AND video_execution IS low THEN offload_decision IS local_processing;"
			, " RULE 23 :  IF cpu_speed IS high AND data_size IS high AND  wan_bw IS low AND video_execution IS normal THEN offload_decision IS local_processing;"
			, " RULE 24 :  IF cpu_speed IS high AND data_size IS high AND  wan_bw IS low AND video_execution IS high THEN offload_decision IS local_processing;"
			, " RULE 25 :  IF cpu_speed IS high AND data_size IS high AND  wan_bw IS medium AND video_execution IS low THEN offload_decision IS local_processing;"
			, " RULE 26 :  IF cpu_speed IS high AND data_size IS high AND  wan_bw IS medium AND video_execution IS normal THEN offload_decision IS local_processing;"
			, " RULE 27 :  IF cpu_speed IS high AND data_size IS high AND  wan_bw IS medium AND video_execution IS high THEN offload_decision IS remote_processing;"
			, " RULE 28 :  IF cpu_speed IS high AND data_size IS high AND  wan_bw IS high AND video_execution IS low THEN offload_decision IS local_processing;"
			, " RULE 29 :  IF cpu_speed IS high AND data_size IS high AND  wan_bw IS high AND video_execution IS normal THEN offload_decision IS local_processing;"
			, " RULE 30 :  IF cpu_speed IS medium AND data_size IS small AND  wan_bw IS low AND video_execution IS high THEN offload_decision IS local_processing;"
			, " RULE 31 :  IF cpu_speed IS medium AND data_size IS small AND  wan_bw IS medium AND video_execution IS low THEN offload_decision IS local_processing;"
			, " RULE 32 :  IF cpu_speed IS medium AND data_size IS small AND  wan_bw IS medium AND video_execution IS normal THEN offload_decision IS remote_processing;"
			, " RULE 33 :  IF cpu_speed IS medium AND data_size IS small AND  wan_bw IS medium AND video_execution IS high THEN offload_decision IS remote_processing;"
			, " RULE 34 :  IF cpu_speed IS medium AND data_size IS small AND  wan_bw IS high AND video_execution IS low THEN offload_decision IS local_processing;"
			, " RULE 35 :  IF cpu_speed IS medium AND data_size IS small AND  wan_bw IS high AND video_execution IS normal THEN offload_decision IS remote_processing;"
			, " RULE 36 :  IF cpu_speed IS medium AND data_size IS small AND  wan_bw IS high AND video_execution IS high THEN offload_decision IS remote_processing;"
			, " RULE 37 :  IF cpu_speed IS medium AND data_size IS medium AND  wan_bw IS low AND video_execution IS low THEN offload_decision IS local_processing;"
			, " RULE 38 :  IF cpu_speed IS medium AND data_size IS medium AND  wan_bw IS low AND video_execution IS normal THEN offload_decision IS local_processing;"
			, " RULE 39 :  IF cpu_speed IS medium AND data_size IS medium AND  wan_bw IS low AND video_execution IS high THEN offload_decision IS remote_processing;"
			, " RULE 40 :  IF cpu_speed IS medium AND data_size IS medium AND  wan_bw IS medium AND video_execution IS low THEN offload_decision IS local_processing;"
			, " RULE 41 :  IF cpu_speed IS medium AND data_size IS medium AND  wan_bw IS medium AND video_execution IS normal THEN offload_decision IS local_processing;"
			, " RULE 42 :  IF cpu_speed IS medium AND data_size IS medium AND  wan_bw IS medium AND video_execution IS high THEN offload_decision IS remote_processing;"
			, " RULE 43 :  IF cpu_speed IS medium AND data_size IS medium AND  wan_bw IS high AND video_execution IS low THEN offload_decision IS local_processing;"
			, " RULE 44 :  IF cpu_speed IS medium AND data_size IS medium AND  wan_bw IS high AND video_execution IS normal THEN offload_decision IS remote_processing;"
			, " RULE 45 :  IF cpu_speed IS medium AND data_size IS medium AND  wan_bw IS high AND video_execution IS high THEN offload_decision IS remote_processing;"
			, " RULE 46 :  IF cpu_speed IS medium AND data_size IS high AND  wan_bw IS low AND video_execution IS low THEN offload_decision IS local_processing;"
			, " RULE 47 :  IF cpu_speed IS medium AND data_size IS high AND  wan_bw IS medium AND video_execution IS low THEN offload_decision IS local_processing;"
			, " RULE 48 :  IF cpu_speed IS high AND data_size IS medium AND  wan_bw IS medium AND video_execution IS normal THEN offload_decision IS local_processing;"
			, " RULE 49 :  IF cpu_speed IS high AND data_size IS high AND  wan_bw IS high AND video_execution IS high THEN offload_decision IS local_processing;"
			, " RULE 50 :  IF cpu_speed IS high AND data_size IS medium AND  wan_bw IS high AND video_execution IS low THEN offload_decision IS local_processing;"
			, " RULE 51 :  IF cpu_speed IS high AND data_size IS medium AND  wan_bw IS high AND video_execution IS normal THEN offload_decision IS local_processing;"
			, " RULE 52 :  IF cpu_speed IS medium AND data_size IS high AND  wan_bw IS high AND video_execution IS low THEN offload_decision IS local_processing;"
			, " RULE 53 :  IF cpu_speed IS medium AND data_size IS high AND  wan_bw IS high AND video_execution IS normal THEN offload_decision IS local_processing;"
			, " RULE 54 :  IF cpu_speed IS medium AND data_size IS high AND  wan_bw IS high AND video_execution IS high THEN offload_decision IS local_processing;"
			, " RULE 55 :  IF cpu_speed IS high AND data_size IS small AND  wan_bw IS low AND video_execution IS low THEN offload_decision IS local_processing;"
			, " RULE 56 :  IF cpu_speed IS high AND data_size IS small AND  wan_bw IS low AND video_execution IS normal THEN offload_decision IS local_processing;"
			, " RULE 57 :  IF cpu_speed IS high AND data_size IS small AND  wan_bw IS low AND video_execution IS high THEN offload_decision IS local_processing;"
			, " RULE 58 :  IF cpu_speed IS high AND data_size IS small AND  wan_bw IS medium AND video_execution IS low THEN offload_decision IS remote_processing;"
			, " RULE 59 :  IF cpu_speed IS high AND data_size IS small AND  wan_bw IS medium AND video_execution IS normal THEN offload_decision IS local_processing;"
			, " RULE 60 :  IF cpu_speed IS high AND data_size IS small AND  wan_bw IS medium AND video_execution IS high THEN offload_decision IS local_processing;"
			, " RULE 61 :  IF cpu_speed IS high AND data_size IS small AND  wan_bw IS high AND video_execution IS low THEN offload_decision IS local_processing;"
			, " RULE 62 :  IF cpu_speed IS high AND data_size IS small AND  wan_bw IS high AND video_execution IS normal THEN offload_decision IS local_processing;"
			, " RULE 63 :  IF cpu_speed IS high AND data_size IS small AND  wan_bw IS high AND video_execution IS high THEN offload_decision IS local_processing;"
			, " RULE 64 :  IF cpu_speed IS high AND data_size IS medium AND  wan_bw IS low AND video_execution IS low THEN offload_decision IS local_processing;"
			, " RULE 65 :  IF cpu_speed IS high AND data_size IS medium AND  wan_bw IS low AND video_execution IS normal THEN offload_decision IS local_processing;"
			, " RULE 66 :  IF cpu_speed IS high AND data_size IS medium AND  wan_bw IS low AND video_execution IS high THEN offload_decision IS local_processing;"
			, " RULE 67 :  IF cpu_speed IS high AND data_size IS medium AND  wan_bw IS medium AND video_execution IS low THEN offload_decision IS local_processing;"
			, " RULE 68 :  IF cpu_speed IS high AND data_size IS medium AND  wan_bw IS high AND video_execution IS high THEN offload_decision IS local_processing;"
			, " RULE 69 :  IF cpu_speed IS high AND data_size IS medium AND  wan_bw IS medium AND video_execution IS high THEN offload_decision IS local_processing;"
			, "END_RULEBLOCK"
			, "END_FUNCTION_BLOCK"
	);
}
