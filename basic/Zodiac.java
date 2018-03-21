import java.util.*;

class Zodiac extends Signs{
private String rawDate;

public Zodiac(String dob){
  super();
  this.rawDate=dob;
}

private int[] convertToIntegers(List<Integer> arrayList){
  int[] list = new int[arrayList.size()];
  Iterator<Integer> iterator = arrayList.iterator();
  for (int i=0;i<list.length;i++) list[i]=iterator.next().intValue();
  return list;
}

private int[] getDividedDate(){
  String[] fields=rawDate.split("-");
  List <Integer> date = new ArrayList<Integer>();
  for (String field: fields) date.add(Integer.parseInt(field));
  return convertToIntegers(date);
}

private String decideSign(){
  String retVal="Invalid Date";
  if(isAries()) retVal="Aries";
  if(isTaurus()) retVal="Taurus";
  if(isGemini()) retVal="Gemini";
  if(isCancer()) retVal="Cancer";
  if(isLeo()) retVal="Leo";
  if(isVirgo()) retVal="Virgo";
  if(isLibra()) retVal="Libra";
  if(isScorpio()) retVal="Scorpio";
  if(isSagittarius()) retVal="Sagittarius";
  if(isCapricorn()) retVal="Capricorn";
  if(isAquarius()) retVal="Aquarius";
  if(isPisces()) retVal="Pisces";
  return retVal;
}

public String getSign(){
  int[] date = getDividedDate();
  if(date.length!=3) return "Invalid Date";
  dateOfBirth= new Date(date[2],date[1]-1,date[0]);
  year = date[2];
  return decideSign();
}

}
