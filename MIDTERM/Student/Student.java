package Student;

class Student {
   String firstName = "";
   String middleName = "";
   String lastName = "";
   String suffix = "";
   
   public String getFirstName(){
      return firstName;
   }
   
   public String getMiddleName(){
      return middleName;
   }
   
   public String getLastName(){
      return lastName;
   }
   
   public String getSuffix(){
      return suffix;
   }
   
   public void setFirstName(String Fname){
      firstName = Fname;
   }
   
   public void setMiddleName(String Mname){
      middleName = Mname;
   }

   public void setLastName(String Lname){
      lastName = Lname;
   }
   
   public void setSuffix(String Suffix){
      suffix = Suffix;
   }

   public String getFullName(){
      return firstName + " " + middleName + " " + lastName + " " + suffix; 
   }
}