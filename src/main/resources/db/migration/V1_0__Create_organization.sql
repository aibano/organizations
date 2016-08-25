create table ORGANIZATION (
    ID BIGINT not null AUTO_INCREMENT,
    NAME varchar(255) not null,
    PARENT_ID BIGINT,
    PRIMARY KEY (ID)
);