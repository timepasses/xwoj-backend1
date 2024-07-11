import java.util.Arrays;
import java.util.Comparator;

public class test {

    public static void main(String[] args) {
        //不能使用基本数据类型
        Integer[] arr = {5, 4, 7, 9, 2, 12, 54, 21, 1};
        //降序
        Arrays.sort(arr, new Comparator<Integer>() {
            //重写compare方法，最好加注解，不加也没事
            public int compare(Integer a, Integer b) {
                //返回值>0交换
                return b - a;
            }
        });
        System.out.println(Arrays.toString(arr));
    }

}
