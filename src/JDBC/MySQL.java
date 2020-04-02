package JDBC;


//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Description
 * @Author lizhenyu18
 * @Date 2020/3/24 10:18 上午
 */
public class MySQL {


    /**
     * 添加课程
     * @param courseName 课程名称
     */
    public void addCourse(String courseName){
        String sql_1 = "insert into t_course(course_name) values(?)";

        String sql_2 = "create table t_student( " +
                "id BIGINT PRIMARY KEY AUTO_INCREMENT, " +
                "name varchar(50), " +
                "age int" +
                ")";

        //该语句为每个 IN 参数保留一个问号（“？”）作为占位符
        Connection conn = null;				//和数据库取得连接
        PreparedStatement pstmt = null;		//创建statement
        try{
            conn = DbUtil.getConnection();
            pstmt = conn.prepareStatement(sql_1);
            pstmt.setString(1, courseName); //给占位符赋值
            pstmt.executeUpdate();			//执行
            pstmt = conn.prepareStatement(sql_2);
            pstmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            DbUtil.close(pstmt);
            DbUtil.close(conn);		//必须关闭
        }
    }

    /**
     * 删除课程
     * @param courseId
     */
    public void delCourse(int courseId){
        String sql = "delete from t_course where course_id = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DbUtil.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, courseId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            DbUtil.close(pstmt);
            DbUtil.close(conn);		//必须关闭
        }
    }

    /**
     * 修改课程
     * @param courseId
     * @param courseName
     */
    public void modifyCourse(int courseId,String courseName){
        String sql = "update t_course set course_name =? where course_id=?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DbUtil.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, courseName);  //利用Preparedstatement的set方法给占位符赋值
            pstmt.setInt(2, courseId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            DbUtil.close(pstmt);
            DbUtil.close(conn);		//必须关闭
        }
    }

    /**
     * 查询课程
     * @return
     */
//    public List<Course> findCourseList(){
//        String sql = "select * from t_course order by course_id";
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;
//        //创建一个集合对象用来存放查询到的数据
//        List<Course> courseList = new ArrayList<>();
//        try {
//            conn = DbUtil.getConnection();
//            pstmt = (PreparedStatement) conn.prepareStatement(sql);
//            rs = (ResultSet) pstmt.executeQuery();
//            while (rs.next()){
//                int courseId = rs.getInt("course_id");
//                String courseName = rs.getString("course_name");
//                //每个记录对应一个对象
//                Course course = new Course();
//                course.setCourseId(courseId);
//                course.setCourseName(courseName);
//                //将对象放到集合中
//                courseList.add(course);
//            }
//        } catch (SQLException e) {
//            // TODO: handle exception
//            e.printStackTrace();
//        }finally{
//            DbUtil.close(pstmt);
//            DbUtil.close(conn);		//必须关闭
//        }
//        return courseList;
//    }
}
