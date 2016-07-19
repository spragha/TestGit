package com.raghav.corejava.itpAssignment.file;

import java.io.*;


	class FileDemo1{

	/*BufferedReader br;
	FileInputStream fis;
	FileOutputStream fos;
	int count=0;
	String str=null;
	File f;
	String []ls;




		public static void main(String args[]){
		int flag;
		FileWriter fw;
		BufferedReader br;
		FileReader fr;

		try{
			br=new BufferedReader(new InputStreamReader(System.in));

			if(args[0].equals(null)){
			System.out.println("File doesn't Exist!Please Enter a file name:");
			}
			String str1=args[0];
			String str2=args[1];
			File fp1=new File(str1);
			if(!(fp1.exists())){
			System.out.println("The Source file "+str1+" doesn't exist:");
			System.exit(0);
			}
			File fp=new File(str2);
			if(fp.exists()){
			flag=1;
			}else{
			flag=2;
			}

			switch(flag){

				case 1:
					System.out.println(flag);
					System.out.println("Do You want to over write? (Y/N)?");
					String str=null,str3;
					str=br.readLine();
					if(str.equalsIgnoreCase("Y")){
					fw=new FileWriter(str2);
					System.out.println("Enter Text, Enter 'stop' to stop writing");
					do{
					str3=br.readLine();
					if(!(str3.equals("stop"))){
					fw.write(str3+"\t");
					}
					}while(!(str3.equals("stop")));
					}else
					{
					fw=new FileWriter(str2,true);
					System.out.println("Enter Text, Enter 'stop' to stop writing");
					do{
					str3=br.readLine();
					if(!(str3.equals("stop"))){
					fw.write(str3+" ");
					}
					}while(!(str3.equals("stop")));
					System.out.println("Append");
					}
					fw.close();
					break;


				case 2:
					fr =new FileReader(str1);
					BufferedReader br1=new BufferedReader(fr);
					String s="ss";
					fw=new FileWriter(str2);
					do{
					s=br1.readLine();
					System.out.println(s);
					fw.write(s);
					}while((s=br1.readLine())!=null);
					System.out.println("File has been written!!");
					fr.close();
					fw.close();

					break;
			}

		}catch(Exception e){
		System.out.println("Error "+e);
		System.out.println(e.getStackTrace());
		}

		}*/


	}


