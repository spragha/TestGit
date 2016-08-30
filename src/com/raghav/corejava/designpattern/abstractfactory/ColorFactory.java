package com.raghav.corejava.designpattern.abstractfactory;

public class ColorFactory extends AbstractFactory {
	
	   @Override
	   public Shape getShape(String shapeType){
	      return null;
	   }
	   
	   @Override
	   Color getColor(String color) {
	   
	      if(color == null){
	         return null;
	      }		
	      
	      if(color.equalsIgnoreCase("RED")){
	         return new Red();
	         
	      }
	      
	      return null;
	   }
	}
