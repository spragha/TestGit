package com.raghav.corejava.controlStatement;

import java.util.Scanner;

public class LoopSample {

public static void main(String[] args) {

/*// DOWhile Loop
		boolean valid = false;
		int number;
		do {
			System.out.println("Enter an int between 1 and 10");
			number = new Scanner(System.in).nextInt();
			if (number >= 1 && number <= 10) {
				valid = true;
				System.out.println("Your have entered valid number : " + number);
			}
		} while (!valid);

		 do {
         c = (char) br.read();
         System.out.println(c);
      } while(c != 'q');  --- character*/

// While loop

boolean valid = false;
int number;
while (!valid) {
	System.out.println("Enter an int between 1 and 10");
	number = new Scanner(System.in).nextInt();
	if (number >= 1 && number <= 10) {
		valid = true;
		System.out.println("Your have entered valid number : " + number);
		}
	}
}
public void Sample(){
//if(committedRequest.getConnectionPriceBand()!=null&& !committedRequest.getConnectionPriceBand().trim().equals("")){}

//if(amendReason!=null&&!amendReason.trim().equalsIgnoreCase("")){}

//if ((childNodes.item(r)).getLocalName().equalsIgnoreCase(childElementName)){}

//if((childNodes.item(r)).getNodeType() == Node.ELEMENT_NODE){}

//if(h.getNodeType() == Node.ELEMENT_NODE && h.getLocalName().equalsIgnoreCase(ancestoryElementName)){}

//if (guiECChargeBandEle!=null && (guiECChargeBandEle.getTextContent().trim().length() == 0) && xPathECChargeBandValue !=null){}

//if(listOfNoteCollection==null||listOfNoteCollection.size()<=0){}

//if (!isMandatory){}
}
}
