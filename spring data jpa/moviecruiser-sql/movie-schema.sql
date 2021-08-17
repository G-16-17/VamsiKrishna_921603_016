create database movie_cruiser;
use movie_cruiser;
create table movies(
mv_id int primary key auto_increment,
mv_title varchar(20),
mv_box_office varchar(10),
mv_active varchar(5),
mv_date_of_launch date,
mv_genre varchar(15)
);
alter table movies
modify column `mv_box_office` varchar(20);