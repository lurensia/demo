package com.example.demo.shelterde.shelterdedto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class ShelterDeDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // 주석은 예비로 남겨둔 부분
    private String careNm;
    private String orgNm;
    private String divisionNm;
    private String saveTrgtAnimal;
    private String careAddr;
    private String jibunAddr;
    private String weekOprEtime;
    private String weekOprStime;
    private String weekCellEtime;
    private String weekCellStime;
    private String weekendOprEtime;
    private String weekendOprStime;
    private String weekendCellEtime;
    private String weekendCellStime;
    private String closeDay;
    private String careTel;

}
// private String lat;
// private String lng;
// private String dsignationDate;

// private String medicalCnt;
// private String quarabtineCnt;
// private String feedCnt;
// private String transCarCnt;
// private String dataStdDt;
// private Integer vetPersonCnt;
// private Integer specsPersonCnt;
// private Integer breedCnt;
// private Integer rnum;