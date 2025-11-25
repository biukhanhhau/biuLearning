package org.biukhanhhau.learningrestcontroller.repository;

import org.biukhanhhau.learningrestcontroller.model.Information;
import org.springframework.stereotype.Repository;

import javax.sound.midi.MidiFileFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class Inforrepo {

    private final Information information;
    List<Information> infors = new ArrayList<>(Arrays.asList(
            new Information(1, "nguyenvana", LocalDate.of(2000, 1, 15), "0909123456", "vana@gmail.com", "123 Cầu Giấy, Hà Nội", "Java Backend", "Sinh viên năm cuối"),
            new Information(2, "tranthib", LocalDate.of(1999, 5, 20), "0912345678", "thib@outlook.com", "456 Quận 1, TP.HCM", "Frontend React", "Thích trà sữa"),
            new Information(3, "lehoangc", LocalDate.of(2002, 11, 10), "0987654321", "hoangc@yahoo.com", "789 Hải Châu, Đà Nẵng", "Tester", "Cẩn thận, tỉ mỉ"),
            new Information(4, "phamthid", LocalDate.of(1998, 8, 5), "0933666777", "thid@company.com", "12 Lê Lợi, Huế", "Business Analyst", "Có kinh nghiệm 2 năm"),
            new Information(5, "hoangvane", LocalDate.of(2001, 3, 30), "0977888999", "vane@gmail.com", "34 Nguyễn Trãi, Cần Thơ", "DevOps", "Đang học Docker")
    ));

    public Inforrepo(Information information) {
        this.information = information;
    }


    public List<Information> findAll(){
        return infors;
    }

    public void save(Information information){
        infors.add(information);
    }

    public Information findInfor(int infoId) {
        for (Information information : infors){
            if (information.getId() == infoId){
                return information;
            }
        }
        return null;
    }

    public void putInfor(Information information) {
        for(Information infor : infors){
            if (infor.getId() == information.getId()){
                infor.setAddress(information.getAddress());
                infor.setBirth(information.getBirth());
                infor.setField(information.getField());
                infor.setNote(information.getNote());
                infor.setPhone(information.getPhone());
                infor.setUsername(information.getUsername());
                infor.setEmail(information.getEmail());
            }
        }
    }

    public void delInfo(int infoId) {
        for (Information infor  : infors){
            if (infor.getId() == infoId){
                infors.remove(infor);
            }
        }
    }
}

