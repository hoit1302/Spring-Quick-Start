CREATE TABLE BOARD (
	SEQ INTEGER(5) PRIMARY KEY,
	TITLE VARCHAR(200),
	WRITER VARCHAR(20),
	CONTENT VARCHAR(2000),
	REGDATE datetime default CURRENT_TIMESTAMP,
	CNT INTEGER(5) default 0
);
user:jueun1
password:jueun