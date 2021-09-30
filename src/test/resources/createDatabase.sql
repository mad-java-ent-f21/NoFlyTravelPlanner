drop table users;

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
