package com.tvz.mobilnelabapi.utility;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;


public class MobilneLabUtility {
	
	 public static void convertFile() throws Exception {
	        File input = new File("/x/data.csv");
	        File output = new File("/x/data.json");

	        List<Map<?, ?>> data = readObjectsFromCsv(input);
	        writeAsJson(data, output);
	    }
		
	 public static List<Map<?, ?>> readObjectsFromCsv(File file) throws IOException {
		 CsvMapper mapper = new CsvMapper();
		 CsvSchema schema = CsvSchema.emptySchema().withHeader();
	        MappingIterator<Map<?, ?>> mappingIterator = mapper.readerFor(Map.class).with(schema).readValues(file);

	        return mappingIterator.readAll();
	    }

	    public static void writeAsJson(List<Map<?, ?>> data, File file) throws IOException {
	        ObjectMapper mapper = new ObjectMapper();
	        mapper.writeValue(file, data);
	    }
	
}
