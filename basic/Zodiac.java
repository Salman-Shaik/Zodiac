import java.util.*;

class Zodiac {

private String rawDate;
private Date dateOfBirth,starts,ends;
private int year;

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

private boolean isAfter(){
  return ends.after(dateOfBirth);}
private boolean isBefore(){return starts.before(dateOfBirth);}
private boolean isEqual(){
  return starts.equals(dateOfBirth)||ends.equals(dateOfBirth);
}
private boolean isSameOrInBetween(){return isAfter()&&isBefore()||isEqual();}

private void setStartAndEnd(int startDate,int startMonth,int endDate,int endMonth){
  starts=new Date(year,startMonth,startDate);
  ends=new Date(year,endMonth,endDate);
}
private boolean validateDateOfBirth(){
  if(isSameOrInBetween()) return true;
  return false;
}

private boolean isAries(){
  setStartAndEnd(21,2,19,3);
  return validateDateOfBirth();
}

private boolean isTaurus(){
  setStartAndEnd(20,3,20,4);
  return validateDateOfBirth();
}
private boolean isGemini(){
  setStartAndEnd(21,4,20,5);
  return validateDateOfBirth();
}
private boolean isCancer(){
  setStartAndEnd(21,5,22,6);
  return validateDateOfBirth();
}
private boolean isLeo(){
  setStartAndEnd(23,6,22,7);
  return validateDateOfBirth();
}
private boolean isVirgo(){
  setStartAndEnd(23,7,22,8);
  return validateDateOfBirth();
}
private boolean isLibra(){
  setStartAndEnd(23,8,22,9);
  return validateDateOfBirth();
}
private boolean isScorpio(){
  setStartAndEnd(23,9,21,10);
  return validateDateOfBirth();
}
private boolean isSagittarius(){
  setStartAndEnd(22,10,21,11);
  return validateDateOfBirth();
}
private boolean isCapricorn(){
  setStartAndEnd(22,11,19,0);
  return validateDateOfBirth();
}
private boolean isAquarius(){
  setStartAndEnd(20,0,18,1);
  return validateDateOfBirth();
}
private boolean isPisces(){
  setStartAndEnd(19,1,20,2);
  return validateDateOfBirth();
}

private String decideSign(){
  if(isAries()) return "Aries";
  if(isTaurus()) return "Taurus";
  if(isGemini()) return "Gemini";
  if(isCancer()) return "Cancer";
  if(isLeo()) return "Leo";
  if(isVirgo()) return "Virgo";
  if(isLibra()) return "Libra";
  if(isScorpio()) return "Scorpio";
  if(isSagittarius()) return "Sagittarius";
  if(isCapricorn()) return "Capricorn";
  if(isAquarius()) return "Aquarius";
  if(isPisces()) return "Pisces";
  return "Invalid Date";
}

public String getSign(){
  int[] date = getDividedDate();
  if(date.length!=3) return "Invalid Date";
  dateOfBirth= new Date(date[2],date[1]-1,date[0]);
  year = date[2];
  return decideSign();
}

}
