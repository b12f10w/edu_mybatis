CREATE TABLE MEMBER(
	num number constraint member_num_pk primary key,
	id varchar2(15) constraint member_id_nn not null,
	pwd varchar2(10) constraint member_pwd_nn not null,
	uname varchar2(34),
	rdate date,
	constraint member_id_uq unique(id));
/
create sequence member_seq
increment by 1
start with 1;
/