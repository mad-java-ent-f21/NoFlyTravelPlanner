DROP TABLE IF EXISTS `reviews`;
DROP TABLE IF EXISTS `destinations`;
DROP TABLE IF EXISTS `users`;

create table users
               (
                 id int auto_increment primary key,
                 first_name varchar(25),
                 last_name varchar(30),
                 user_name varchar(15),
                 password varchar(30),
               screen_name varchar(30)
               );

               insert into users values (1, 'Joe', 'Coyne', 'jcoyne', 'enyoC', 'CoolKid');
               insert into users values (2, 'Tina', 'Miller', 'tmiller', 'relliM', 'fishhateme');
               insert into users values (3, 'Jayme', 'Stolt', 'jystolt', 'tlotS', 'whystayhome');
               insert into users values (4, 'Jim', 'Stolt', 'jstolt', 'tlotS', 'phisherpun');
               insert into users values (5, 'Laura', 'Johnson', 'ljohnson', 'nosnhoH', 'Treehugger');
               insert into users values (6, 'Marcy', 'Smith', 'msmith', 'htimS', 'climbOn');
               insert into users values (7, 'Kari', 'Metford', 'kmetford', 'drofteM', 'Huntress');
               insert into users values (8, 'Phillip', 'Walters', 'pwalters', 'sretlaW', 'Snowman');
               insert into users values (9, 'John', 'Wheeler', 'jwheeler', 'releehW', 'Wheelee');
               insert into users values (10, 'Jeanne', 'Wood', 'jwood', 'dooW', 'lostNotFound');
               insert into users values (11, 'Tom', 'Cotten', 'tcotten', 'nettoC', 'offscreen');
               insert into users values (12, 'Susan', 'Jones', 'sjones', 'senoJ', 'add_venture');
               insert into users values (13, 'Brian', 'Miles', 'bmiles', 'seliM', 'WhyNot');
               insert into users values (14, 'Mike', 'Jackson', 'mjackson', 'noskcaK', 'Eaglemann');
               insert into users values (15, 'Sara', 'Cooper', 'scooper', 'repooC', 'skinnyski');
               insert into users values (16, 'Lisa', 'Jordan', 'ljorden', 'nadroJ', 'Creek');
               insert into users values (17, 'Jason', 'Shardt', 'jshardt', 'tdrahS', 'prairewalker');
               insert into users values (18, 'Amder', 'Brenner', 'abrenner', 'rennerB', 'RVRoadee');

create table destinations
(
    DestinationID     int        not null,
    type              text       null,
    location          text       not null,
    nearest_Amtrak    int        null,
    nearest_Grayhound int        null,
    nearest_port      int        null,
    rental_car        tinyint(1) null,
    activity          text       null,
    overnight         text       null,
    constraint destinations_DestinationID_uindex
        unique (DestinationID)
);

alter table destinations
    add primary key (DestinationID);

INSERT INTO `destinations` VALUES (54880,'Park','Wisconsin',137,14,0,15,'Scenic','Camp');
INSERT INTO `destinations` VALUES (80809,'Mountain','Colorado',100,30,0,29,'Scenic','Multiple');

create table reviews
(
    userid        int  not null,
    DestinationID int  not null,
    image         text null,
    review_text   text null,
    constraint reviews_destinations_DestinationID_fk
        foreign key (DestinationID) references destinations (DestinationID),
    constraint reviews_users_id_fk
        foreign key (userid) references users (id)
);

INSERT INTO `reviews` VALUES (7,54880,'images/LittleM.jpg','TextReviews/Pattison1.txt');
INSERT INTO `reviews` VALUES (12,54880,'images/seasonal.JPG','TextReviews/Pattison2.txt');

