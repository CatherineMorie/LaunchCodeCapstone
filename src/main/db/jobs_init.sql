
CREATE SCHEMA jobs authorization sa;



CREATE TABLE jobs.applied (

ID INT PRIMARY KEY,
date VARCHAR(255) DEFAULT '',
company VARCHAR(255) DEFAULT '',
title VARCHAR(255) DEFAULT '',
req VARCHAR(255) DEFAULT '',
salary VARCHAR(255) DEFAULT '',
status VARCHAR(255) DEFAULT '',
description CLOB DEFAULT '');

select * from jobs.applied;