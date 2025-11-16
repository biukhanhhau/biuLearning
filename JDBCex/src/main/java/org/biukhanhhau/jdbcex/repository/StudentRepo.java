package org.biukhanhhau.jdbcex.repository;

import org.biukhanhhau.jdbcex.model.Student;
import org.biukhanhhau.jdbcex.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Repository
public class StudentRepo {

    JdbcTemplate jdbcTemplate;

    public void delete(int id){
        String del = "delete from student where rollNo = ?";
        int rows = jdbcTemplate.update(del, id);
        System.out.println(rows + " row(s) were deleted");
    }

    public void save(Student student){
        String sql = "insert into student (rollNo, name, grade) values (?,?,?)";
        int rows = jdbcTemplate.update(sql, student.getRollNo(), student.getName(), student.getGrade());
        System.out.println(rows + " row(s) were added");
    }

    public List<Student> findAll(){

        String sql = "select * from student";
        //region For more complex
//        RowMapper<Student> rowMapper = new RowMapper<Student>() {
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//
//                Student student = new Student();
//                student.setRollNo(rs.getInt("rollNo"));
//                student.setName(rs.getString("name"));
//                student.setGrade(rs.getInt("grade"));
//                return student;
//            }
//        };
        //endregion
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Student student = new Student();
            student.setRollNo(rs.getInt("rollNo"));
            student.setName(rs.getString("name"));
            student.setGrade(rs.getInt("grade"));
            return student;
        });
    }

    //region For more complex :)))
//    public List<Student> findName(){
//        String sql = "select name from student";
//        return jdbcTemplate.query(sql, (rs, rowNum) -> {
//            Student student = new Student();
//            student.setName(rs.getString("name"));
//            return student;
//        });
//    }
    //endregion
    public List<String> findName(){
        String sql ="select name from student";
        return jdbcTemplate.queryForList(sql, String.class);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
