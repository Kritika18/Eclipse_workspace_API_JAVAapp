package Tolearn;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;

public class CheckFolder {
	public static File folder = new File("C:\\Users\\ADMIN\\Desktop\\all resumes");
	static String temp = "";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Reading files under the folder " + folder.getAbsolutePath());
		listFilesForFolder(folder);
	}

	public static void listFilesForFolder(final File folder) throws IOException {

		HashMap<String, Integer> filesinmonth = new HashMap<String, Integer>();
		int val = 0;
		filesinmonth.put("Jan", val);
		filesinmonth.put("Feb", val);
		filesinmonth.put("Mar", val);
		filesinmonth.put("Apr", val);
		filesinmonth.put("May", val);
		filesinmonth.put("Jun", val);
		filesinmonth.put("Jul", val);
		filesinmonth.put("Aug", val);
		filesinmonth.put("Sep", val);
		filesinmonth.put("Oct", val);
		filesinmonth.put("Nov", val);
		filesinmonth.put("Dec", val);
		for (final File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				listFilesForFolder(fileEntry);
			} else {
				if (fileEntry.isFile()) {
					temp = fileEntry.getName();
					System.out.println("File= " + folder.getAbsolutePath() + "\\" + fileEntry.getName());
					Path filePath = fileEntry.toPath();
					BasicFileAttributes attr = Files.readAttributes(filePath, BasicFileAttributes.class);

					// System.out.println("creationTime: " + attr.creationTime());
					// System.out.println("lastAccessTime: " + attr.lastAccessTime());
					// System.out.println("lastModifiedTime: " + attr.lastModifiedTime());

					Date newDate = new Date(attr.creationTime().toMillis());
					System.out.println(newDate);
					DateFormat dateformat = new SimpleDateFormat("MMM");
					System.out.println(dateformat.format(newDate));

					filesinmonth.put(dateformat.format(newDate), filesinmonth.get(dateformat.format(newDate)) + 1);

				}

			}
		}
		System.out.print(filesinmonth);
	}
}
