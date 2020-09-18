package Tolearn;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.stream.Stream;

public class Folderwithstream {
	//public static URI folder = new File("C:\\Users\\ADMIN\\Desktop\\all resumes");
	static String temp = "";

	 public static void main(String[] args) throws IOException, URISyntaxException {
		// TODO Auto-generated method stub
		//System.out.println("Reading files under the folder " + folder.getAbsolutePath());
		
		 
//		URL url = new URL(args[0]);
//		URLConnection connection = url.openConnection();
//		connection.setDoOutput(true);
		//listFilesForFolder();
		URL url = new URL(args[0]);
		URLConnection connection = url.openConnection();
		connection.setDoOutput(true);
		Path gitReposFolderPath = Paths.get(url.toURI());
		listFilesForFolder(gitReposFolderPath);
	}

	public static void listFilesForFolder(Path gitReposFolderPath) throws IOException, URISyntaxException {

	 /*	HashMap<String, Integer> filesinmonth = new HashMap<String, Integer>();
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
		
			foldersWithinGitReposStream.iterator();
			foldersWithinGitReposStream.
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
		*/
		//uri.toURI();
		
//		URL url = new URL(args[0]);
//		URLConnection connection = url.openConnection();
//		connection.setDoOutput(true);
//		Path gitReposFolderPath = Paths.get(uri.toURI());
		gitReposFolderPath.toFile().getName();
		
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
		
		try (Stream<Path> foldersWithinGitReposStream = Files.walk(gitReposFolderPath))  // making streams of path           
		{ // walk helps in checking sub folders too 
			
			
		  //  ArrayList<String> elements = new ArrayList<>();
		   // foldersWithinGitReposStream.forEach(p -> elements.add(p.toFile().getName()));            
		   // System.out.println(elements);
		Iterator<Path> iterator = foldersWithinGitReposStream.iterator();  // obj of stream have iterator method 
        while (iterator.hasNext()) {   // iterating on paths 
            Path next = iterator.next();
            System.out.println(next);
            
          
            BasicFileAttributes attr = Files.readAttributes(next , BasicFileAttributes.class);  // reading attributes of file

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
        System.out.println(filesinmonth);
        
}
}
	

//{Jul=2, Oct=0, Feb=0, Apr=0, Jun=5, Aug=0, Dec=3, May=1, Nov=1, Jan=0, Mar=1, Sep=0}

