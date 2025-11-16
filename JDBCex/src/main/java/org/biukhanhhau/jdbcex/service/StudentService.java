    package org.biukhanhhau.jdbcex.service;

    import org.biukhanhhau.jdbcex.model.Student;
    import org.biukhanhhau.jdbcex.repository.StudentRepo;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import java.util.ArrayList;
    import java.util.List;

    @Service
    public class StudentService {

        StudentRepo repo;

        public void deleteStudent(int id){
            repo.delete(id);
        }

        public void addStudent(Student student){
            repo.save(student);
        }

        //region not simple as repo
//        public List<String> getName(){
//            List<Student> s = repo.findName();
//            List<String> sN = new ArrayList<>();
//            for(Student ss : s){
//                sN.add(ss.getName());
//            }
//            return sN;
//        }
        //endregion
        //region second way
//        public List<String> getName(){
//            return repo.findName();
//        }
        //endregion
        public void getName(){
            System.out.println(repo.findName());
        }


        public StudentRepo getRepo() {
            return repo;
        }

        @Autowired
        public void setRepo(StudentRepo repo) {
            this.repo = repo;
        }

        public List<Student> getStudents(){
            return repo.findAll();
        }
    }
