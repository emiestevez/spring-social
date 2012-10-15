create table Account (userId varchar(255) not null,
						username varchar(255) unique,
						password varchar(255) not null,
						firstName varchar(255) not null, 
						lastName varchar(255) not null,
						primary key (userId));
