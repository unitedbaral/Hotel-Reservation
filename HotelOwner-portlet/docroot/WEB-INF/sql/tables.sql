create table SD_Room (
	roomId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	roomno LONG,
	location VARCHAR(75) null,
	roomtypeId LONG
);

create table SD_RoomType (
	roomtypeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	description VARCHAR(75) null,
	pricepernight DATE null
);