--회원가입
create table guest_r(
g_id varchar2(20) not null primary key,
g_pwd varchar2(20) not null,
g_name varchar2(20) not null,
g_birth varchar2(20) not null,
g_addr varchar2(50) not null,
g_tel varchar2(20) not null,
g_mail varchar2(30) not null);

select*from guest_r;

--공지사항
create table gong(
num number(5,0) not null primary key,
title varchar2(50) not null,
con long,
readcnt number(5,0),
bdate varchar2(20));

--차량 등록
create table car(
r_no number(15,0) not null primary key,
c_name varchar2(30) not null,
c_jong varchar2(20) not null,
c_bun varchar2(30) not null,
c_color varchar2(20),
c_price number(20,0) not null,
c_image varchar2(100) not null,
c_place varchar2(20) not null);

--Mysql문에서는 auto_increment를 이용해서 번호증가함
create sequence seq_carno;

insert into car(r_no,c_name,c_jong,c_bun,c_color,c_price,c_image,c_place)
values(seq_carno.nextval,'test_차이름','경차','바16호2000','노랑','200000000','image','서울');


--차량 예약
create table car_book(
r_no varchar2(10),
c_daeil varchar2(20),
c_banil varchar2(20),
g_id varchar2(20));

--노선을 위한 DB
create table a_line(
l_code varchar2(20) not null primary key,
l_end varchar2(20) not null,
l_start varchar2(20) not null);

--항공생성을 위한 DB
create table a_info_o(
l_code varchar2(20) not null,
air_name varchar2(20) not null,
O_sdate varchar2(20) not null,
O_price number(20,0) not null,
O_soyo varchar2(20) not null,
O_stime varchar2(20) not null);

--비행기예약
create table a_book(
t_no varchar2(30) not null primary key,
g_id varchar2(20) not null,
air_name varchar2(20) not null,
ab_date date,
pay varchar2(20) not null,
s_no varchar2(10));


select*from guest_r;
select*from gong;
select*from car;
select*from car_book;
select*from a_line;
select*from a_info;
select*from a_book;