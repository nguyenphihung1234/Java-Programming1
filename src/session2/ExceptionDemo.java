package session2;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            //code có thể có ngoại lệ
        }catch(Exception e){
            //Code xử lí ngoại lệ
        }finally {
            //Code trong khối này luôn dc thực thi
        }
        /*
        *getMassage(): Trả về masage cụ thể exception đã xảy ra
        * getCouse(): Trả về nguyên nhân exception
        * printStace(): In ra kết quả của phương thức Exception kết hơp với toString()
        *toString() : Trả về tên lớp  +  kết quả vs getMassage()
         * */
    }
}
