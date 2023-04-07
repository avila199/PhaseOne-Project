package CoreJavaProject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename;
		char ch,entry;
		File directory = new File("C:\\Users\\user\\Desktop\\Avila\\File name");
		String[] flist = directory.list();
		// Take user Option from the below mentioned Menu
		Scanner input = new Scanner(System.in);
// 		
		System.out.println("*****************************************");
		System.out.println("******* Simplilearn Phase one project ********");
		System.out.println("*****************************************");
		System.out.println("*****************LockedMe.com*************");
		System.out.println("*****************************************");
		System.out.println("*************** Avila BS*********************");
		System.out.println("********* Full Stack Developer************");
		System.out.println("*****************************************");
		System.out.println();
		
		
		do {
			System.out.println("Welcome!, Please choose your operation:- \n");
			
	
			System.out.println("1.File List");
			System.out.println("2.File operations (Add/Delete/Search)");
			System.out.println("3.Exit");
	    
			
			int choice = input.nextInt();
			
			switch (choice) {
				
			case 1:
				listOfFiles();
				break;
				
	
				
			case 2:
				do {
					System.out.println("Select File Option to perform any operation:- \n");
					
					System.out.println("1.Add a new File");
					System.out.println("2.Delete an existing File");
					System.out.println("3.Search a file");
					System.out.println("4: Exit file operation and return to main context");
					
					int option = input.nextInt();
					
					switch (option)
					{
					case 1:
						System.out.println("Enter the file name for creating new file");
						filename = input.next();
						try {
						File file = new File("C:\\Users\\user\\Desktop\\Avila\\File name\\" + filename + ".txt");
						
						if (file.createNewFile())
						{
							System.out.println("File Created Successfully \n");
						} 
						else 
						{
							if (file.exists()) 
							{
							System.out.println("File Already Exists");
							} 
							else
							{
							System.out.println("File Doesen't exist");
							}
						}
						} 
						catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							}
						
							break;
							
					case 2:
						System.out.println("Enter the file name which you want to delete");
						filename = input.next();
						File directory_delete = new File("C:\\Users\\user\\Desktop\\Avila\\File name");
								String[] flist_delete = directory_delete.list();
								// String[] flist = directory.list();
								int flag_d = 0;
								if (flist_delete == null) {
								System.out.println("There is no file present in the directory");
								} else {
									// Linear search in the array
									for (int i = 0; i < flist_delete.length; i++) {
									String delete_filename = flist_delete[i];
									if (delete_filename.equalsIgnoreCase(filename))
									{
										
										File file = new File("C:\\Users\\user\\Desktop\\Avila\\File name\\" + delete_filename);
										delete_filename =null;
												if (file.delete()) {
												System.out.println("File deleted successfully");
									}
												 else {
													 System.out.println("Failed to delete the file");
													 }
												flag_d = 1;
									}
									}
									}	
								if (flag_d == 0) 
								{
								System.out.println("File Not Found");
								}
								break;
								
								
					case 3:
						// Create an object of the File class
						// Replace the file path with path of the directory
						System.out.println("Enter the file name for searching");
						filename = input.next();
						File directory_search = new File("C:\\Users\\user\\Desktop\\Avila\\File name");
						String[] flist_search = directory_search.list();
						int flag_s = 0;
						if (flist_search == null) 
						{
							System.out.println("There is no file preseent in the directory");
						}
						else {
							// Linear search in the array
							for (int i = 0; i < flist_search.length; i++)
							{
								String search_filename = flist_search[i];
								if
								(search_filename.equalsIgnoreCase(filename))
								 {
									System.out.println(search_filename + " found");
									flag_s = 1;
								}

							}
						}
						if (flag_s == 0) 
						{
							System.out.println(filename +" File Not Found");
						}
						break;
					
					case 4:
						System.out.println("Exiting File operation and returning to Main Context, thank you!");
						break;
						
						default:
							System.out.println("choose a correct option(1/2/3/4) \n");
							break;
					}
					System.out.println("(Do you want to continue the file operation? (Y/N) \n");
					
				entry=input.next().charAt(0);
				}while(entry == 'Y' || entry == 'y');
							
					
			
			case 3:
				System.out.println("Thank you for choosing LockMe.com :)");
				break;
				
//Additional Operations:
				
				

				
			default:
				System.out.println("Your choice is incorrect. Please Choose correct Number");
				break;
			}
			System.out.println("Do you want to continue Type (y or n) \n");
			ch = input.next().charAt(0);
			}while (ch == 'Y' || ch == 'y');
			}
	
	//Method to Retrieve the file names in an ascending order
	
			private static void listOfFiles() {
				// TODO Auto-generated method stub
				System.out.println("\n List of files and Folder \n");
				File folder = new File("C:\\Users\\user\\Desktop\\Avila\\File name\\");
				File[] listOfFiles = folder.listFiles();
				for (File file : listOfFiles) {
				if (file.isDirectory()) 
				{
					System.out.println(file.getName());
				}
				else if (file.isFile())
				{
					System.out.println(file.getName());
				}

				}
			}

	

		}
