create database lab34
go
use lab34
go
if OBJECT_ID('Lugger') is not null
	drop table Lugger
create table Lugger(
	MaHL int not null,
	ten nvarchar(50)not null,
	trongLuong float,
	soluong int not null,
	giaHienTai money,
	ngayTao date,
	primary key(MaHL)
)
go

create table _Log(
	id int not null identity,
	MaHL int not null,
	soLuong int,
	trangThai bit,
	gia money,
	ngay date,
	primary key (id),
	foreign key(MaHL) references Lugger(MaHL)
)
go

insert into Lugger values(1,N'Vali nhỏ',1.8,10,200000,'3-26-2018')
insert into Lugger values(2,N'Vali trung',2.4,12,250000,'2-6-2019')
insert into Lugger values(3,N'Vali lớn',2.8,18,300000,'11-1-2018')
insert into Lugger values(4,N'Túi xách',1.2,12,150000,'12-7-2020')
insert into Lugger values(5,N'Balo',0.8,6,100000,'6-5-2020')
insert into Lugger values(6,N'Túi thể thao',0.6,20,120000,'3-5-2021')

insert into _Log values(1,12,1,160000,'7-1-2021')
insert into _Log values(2,18,0,210000,'7-1-2021')
insert into _Log values(2,12,1,180000,'7-1-2021')
insert into _Log values(1,16,0,180000,'7-1-2021')
insert into _Log values(2,12,1,180000,'7-1-2021')
insert into _Log values(3,10,1,250000,'7-1-2021')
insert into _Log values(4,11,1,120000,'7-7-2021')
insert into _Log values(5,16,1,70000,'7-7-2021')
insert into _Log values(4,12,0,135000,'7-7-2021')
insert into _Log values(5,12,0,90000,'7-7-2021')
insert into _Log values(2,12,1,160000,'7-7-2021')
insert into _Log values(1,12,1,150000,'7-7-2021')

select * from Lugger
select * from _log

Select top 5 * from Lugger order by DATEDIFF(day,ngayTao,GETDATE()) desc
select top 3 MaHL,sum(soLuong)from _log group by MaHL,trangThai having trangThai=1 order by sum(soluong) desc
