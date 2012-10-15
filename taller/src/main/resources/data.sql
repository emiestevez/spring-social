insert into Account (userId,username, password, firstName, lastName) values ('eestevez','epestevez', 'granate100', 'Emiliano', 'Estevez');

insert into UserConnection (userId,providerId,providerUserId,rank int not null,
	displayName varchar(255),
	profileUrl varchar(512),
	imageUrl varchar(512),
	accessToken varchar(255) not null,					
	secret varchar(255),
	refreshToken varchar(255),
	expireTime bigint,
	primary key (userId, providerId, providerUserId));
create unique index UserConnectionRank on UserConnection(userId, providerId, rank);