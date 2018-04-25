package tw.edu.ntut.csie.app01_105590015;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */

public class letterGrade {
    public char getLetterGrade(int score) {
        if(score>100){
            return 'X';
        }
        else if(score<=100 && score>=90){
            return 'A';
        }
        else if(score<=89 && score>=80){
            return 'B';
        }
        else if(score<=79 && score>=70){
            return 'C';
        }
        else if(score<=69 && score>=60){
            return 'D';
        }
        else if(score<=59 && score>=0){
            return 'F';
        }
        else
            return 'X';
    }
}
