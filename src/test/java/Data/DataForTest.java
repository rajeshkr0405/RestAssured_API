package Data;

import org.testng.annotations.DataProvider;

public class DataForTest {
    @DataProvider(name = "data_for_post")
    public Object[][] data_for_post(){
        /*Object[][] data = new Object[3][2];
        data[0][0] = "Graham";
        data[0][1] = 1;

        data[1][0] = "Ajay";
        data[1][1] = 2;

        data[2][0] = "Raj";
        data[2][1] = 3;
        return data;*/
        return new Object[][]{
                {"sam" , 1},
                {"ram" , 2},
                {"Radha" , 3},
                {"Rani" , 4}
        };
    }
    @DataProvider(name = "data_for_delete")
    public Object[] data_for_delete(){
        return  new Object[]{
                1
        };
    }
}
