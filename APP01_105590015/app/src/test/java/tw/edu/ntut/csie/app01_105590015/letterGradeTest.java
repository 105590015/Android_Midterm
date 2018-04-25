package tw.edu.ntut.csie.app01_105590015;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by NTUTCSIE on 2018/4/25.
 */

public class letterGradeTest {
    private letterGrade lg;
    @Before
    public void setUp(){
        lg=new letterGrade();
    }
    @After
    public void tearDown(){
        lg=null;
    }
    @Test
    public void testGetLetterGrade(){
        assertEquals('X', lg.getLetterGrade(101));
        assertEquals('X', lg.getLetterGrade(-1));
        assertEquals('A', lg.getLetterGrade(99));
        assertEquals('B', lg.getLetterGrade(88));
        assertEquals('C', lg.getLetterGrade(77));
        assertEquals('D', lg.getLetterGrade(66));
        assertEquals('F', lg.getLetterGrade(55));
    }
}
