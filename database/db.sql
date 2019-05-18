create database QLTHVIEN;
use QLTHVIEN;
/*tao bang sach*/
create table sach (     
	masach int primary key,
    ten nvarchar(50),
    tacgia nvarchar(50),
    nxb nvarchar(100),
    soluong int
);

create table docgia(
	sothe int primary key,
    ten nvarchar(50),
    khoa nvarchar(50),
    khoahoc nvarchar(50), 
    thoihanthe timestamp
);
/*tao bang phieu muon*/ 
create table phieumuon(
	masach int,
    sothe int,
    ngaymuon  datetime,
    ngaytra datetime,
    ghichu  nvarchar(100),
    primary key (masach, sothe),
    foreign key (masach) references sach(masach),
    foreign key (sothe) references docgia(sothe)
);
/*3.insert*/
insert into sach(masach, ten, tacgia, nxb, soluong) values(1, "linh", "duc", "kim đồng", 123);
insert into sach(masach, ten, tacgia, nxb, soluong) values(2, "lan", "dao", "kim đồng", 122);
insert into sach(masach, ten, tacgia, nxb, soluong) values(3, "li", "du", "kim đồng", 123);
insert into sach(masach, ten, tacgia, nxb, soluong) values(4, "linh", "duc", "kim đồng", 123);
insert into sach(masach, ten, tacgia, nxb, soluong) values(5, "linh", "duc", "kim đồng", 123);

insert into docgia(sothe, ten, khoa, khoahoc, thoihanthe) values(1,  "ab", "cntt", "lap trinh c", "2019-03-10");
insert into docgia(sothe, ten, khoa, khoahoc, thoihanthe) values(2,  "ac", "attt", "lap trinh java", "2019-02-11");
insert into docgia(sothe, ten, khoa, khoahoc, thoihanthe) values(3,  "ad", "dt-vt", "lap trinh java-web", "2019-04-12");
insert into docgia(sothe, ten, khoa, khoahoc, thoihanthe) values(4,  "ae", "cntt", "lap trinh php", "2019-05-13");
insert into docgia(sothe, ten, khoa, khoahoc, thoihanthe) values(5,  "ab", "attt", "lap trinh python", "2019-06-14");

insert into phieumuon(masach, sothe, ngaymuon, ngaytra, ghichu) values(2,2, "2019-06-15", "2019-07-15", "abc");
insert into phieumuon(masach, sothe, ngaymuon, ngaytra, ghichu) values(3,3, "2019-07-15", "2019-08-15", "abc");
insert into phieumuon(masach, sothe, ngaymuon, ngaytra, ghichu) values(4,5, "2019-08-15", "2019-09-15", "abc");
insert into phieumuon(masach, sothe, ngaymuon, ngaytra, ghichu) values(5,2, "2019-09-15", "2019-10-15", "abc");

select * from docgia;
delete from phieumuon where masach=4 and sothe=5;
delete from sach where masach=4;
delete from docgia where sothe=5;
update sach set ten = "ly" where masach=3;
select dg.ten, dg.khoa from docgia as dg order by khoa;

update sach set ten = "toan" where masach = 1;

select * from sach as s, phieumuon as p where s.masach = p.masach and s.ten = 'toan' and p.ngaymuon='2018-01-01';

select dg.ten, dg.sothe, s.ten from sach as s, docgia as dg, phieumuon as p 
where s.masach = p.masach and dg.sothe= p.sothe and year(p.ngaymuon) = 2019 and month(p.ngaymuon) = 05;

