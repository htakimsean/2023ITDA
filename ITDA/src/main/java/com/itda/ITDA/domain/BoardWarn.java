package com.itda.ITDA.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardWarn {
	private int warnNum;			//번호
	private String punchId;			//신고자 ID
	private String sickId;			//피신고자 ID
	private int boardNum;			//게시물 번호
	private int chNum;				//채널 번호
	private int warnCateId;			//신고 카테고리
    private Timestamp warnDate;		//신고일
    private String warnOk;			//신고처리 여부
    private String warnReason;		//신고 사유
    private int totalCount;			//전체 신고건수
    private int sumCount;			//미처리 신고건수
    private int statusid;			//아이디 상태
    private int rnum;
}