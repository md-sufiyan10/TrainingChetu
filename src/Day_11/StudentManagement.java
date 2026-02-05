package Day_11;

 class StudentManagement {
     private static int totalStudents;
     private int rollNo;
     private String name;
     private String course;

     static {
         totalStudents=0;
     }
     {
         totalStudents++;
     }
   StudentManagement(int rollNo,String name, String course){
         this.rollNo=rollNo;
         this.name=name;
         this.course=course;
   }
   StudentManagement(int rollNo){
         this(rollNo, "Unknown","Not Assign");
   }
   public void enrollCourse(String course){
     this.course=course;
       System.out.println( name + " enrolled in this course "+course);
   }
   public void dropCourse(){
       System.out.println(name +" dropped "+course);
       this.course="Not Assigned";
   }
   public static int getTotalStudents(){
         return totalStudents;
   }

     static void main() {
         StudentManagement stu=new StudentManagement(121,"Sufiyan","Java");
         StudentManagement stu1=new StudentManagement(131);

         System.out.println(StudentManagement.getTotalStudents());

         stu1.enrollCourse("python");
         stu.dropCourse();
     }
}
