import java.util.*;

class Zodiac {
private String rawDate;
private Date dateOfBirth,starts,ends;
boolean condition;
public Zodiac(String dob){this.rawDate=dob;}

public int[] convertToIntegers(List<Integer> arrayList){
  int[] list = new int[arrayList.size()];
  Iterator<Integer> iterator = arrayList.iterator();
  for (int i = 0; i < list.length; i++) list[i] = iterator.next().intValue();
  return list;
}

private int[] getDividedDate(){
  String[] fields=rawDate.split("-");
  List <Integer> date = new ArrayList<Integer>();
  for (int i=0; i<fields.length; i++) date.add(Integer.parseInt(fields[i]));
  return convertToIntegers(date);
}
private boolean isAfter(){return starts.after(dateOfBirth);}
private boolean isBefore(){return ends.after(dateOfBirth);}
private boolean isEqual(){
  return starts.equals(dateOfBirth)||ends.equals(dateOfBirth);
}
private boolean isSameOrInBetween(){return isAfter()&&isBefore()||isEqual();}

private boolean isAries(){
  int year = dateOfBirth.getYear();
  starts=new Date(year,02,21);
  ends=new Date(year,03,19);
  if(isSameOrInBetween()) return true;
  return false;
}

public String getSign(){
  int[] date = getDividedDate();
  if(date.length!=3) return "Invalid Date";
  dateOfBirth= new Date(date[2],date[1]-1,date[0]);
  if(isAries()) return "Aries";
  return "Cancer";
}

}
