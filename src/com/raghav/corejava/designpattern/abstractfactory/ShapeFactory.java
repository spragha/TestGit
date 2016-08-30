package com.raghav.corejava.designpattern.abstractfactory;

public class ShapeFactory extends AbstractFactory {
	
	   @Override
	   public Shape getShape(String shapeType){
	   
	      if(shapeType == null){
	         return null;
	      }		
	      
	     if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	         
	      }
	      return null;
	   }
	   
	   @Override
	   Color getColor(String color) {
	      return null;
	   }
	}
