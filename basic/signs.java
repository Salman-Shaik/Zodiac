import java.util.*;

class Signs {
protected Date starts,ends,dateOfBirth;
protected int year;
private boolean isAfter(){
  return ends.after(dateOfBirth);
}
private boolean isBefore(){
  return starts.before(dateOfBirth);
}
private boolean isEqual(){
  return starts.equals(dateOfBirth)||ends.equals(dateOfBirth);
}
private boolean isSameOrInBetween(){
  return isAfter()&&isBefore()||isEqual();
}

private void setStartAndEnd(int startDate,int startMonth,int endDate,int endMonth){
  starts=new Date(year,startMonth,startDate);
  ends=new Date(year,endMonth,endDate);
}
private boolean validateDateOfBirth(){
  if(isSameOrInBetween()) return true;
  return false;
}
private boolean isSign(int startDate,int startMonth,int endDate,int endMonth){
  setStartAndEnd(startDate,startMonth,endDate,endMonth);
  return validateDateOfBirth();
}
protected boolean isAries(){return isSign(21,2,19,3);}
protected boolean isTaurus(){return isSign(20,3,20,4);}
protected boolean isGemini(){return isSign(21,4,20,5);}
protected boolean isCancer(){return isSign(21,5,22,6);}
protected boolean isLeo(){return isSign(23,6,22,7);}
protected boolean isVirgo(){return isSign(23,7,22,8);}
protected boolean isLibra(){return isSign(23,8,22,9);}
protected boolean isScorpio(){return isSign(23,9,21,10);}
protected boolean isSagittarius(){return isSign(22,10,21,11);}
protected boolean isCapricorn(){return isSign(22,11,19,0);}
protected boolean isAquarius(){return isSign(20,0,18,1);}
protected boolean isPisces(){return isSign(19,1,20,2);}
}
