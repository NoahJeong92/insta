package com.jth.study.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

public @AllArgsConstructor
@Data
class Board {
	private int id;
	private String regDate;
	private String updateDate;
	private String code;
	private String name;
	private boolean blindStatus;
    private String blindDate;
    private boolean delStatus;
    private String delDate;
    private int hitCount;
    private int repliesCount;
    private int likeCount;
    private int dislikeCount;
}