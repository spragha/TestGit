package com.raghav.corejava.general;

import java.util.ArrayList;
import java.util.List;

class Values {
  private int s;

  public Values(int x)
  {
    s = x;
  }

  public int getNumber()
  {
    return s;
  }

  public void setNumber(int s)
  {
    this.s = s;
  }

  public void increment()
  {
    s++;
  }

  public String toString()
 {
    return Integer.toString(s);
  }
}

public class ArrayAdd
 {

  public static void main(String[] args)
 {
    List list = new ArrayList();
    for (int i = 0; i < 10; i++)
      list.add(new Values(i));
    System.out.println(list);
    for (int i = 0; i < list.size(); i++)
      ((Values) list.get(i)).increment();
    System.out.println(list);

  }
}

