package Exercise;

public class StudentIDArray {

    public void search(int id){
        int[] idNum = {111111111,111111112,111111113,111111114,111111115,};
        String[] name = {"Khine Khant", "Shin Thant", "Tayzar", "Chan Myae", "Yin Min" };
        float[] gpa = {2.0f,3.4f,2.8f,2.5f,.30f};
        boolean flag = false;
        for (int i = 0; i < idNum.length; i++){
            if (idNum[i] == id)
            {
                flag = true;
                System.out.printf("Name %-15s \n GPA %-10.1f", name[i], gpa[i]);
                break;
            }
        }
        if (!flag){
            System.out.println("No Match");
        }
    }

    public static void main(String[] args) {
        StudentIDArray studentIDArray = new StudentIDArray();
        studentIDArray.search(111111111);
    }

}
