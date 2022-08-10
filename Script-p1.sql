CREATE TABLE customerAccounts (
	user_id INTEGER NOT NULL,
	first_name VARCHAR(20) NOT NULL,
	last_name VARCHAR(20) NOT NULL,
	balance INTEGER NOT NULL, 
	last_transaction INTEGER NOT NULL,
	username VARCHAR(20) NOT NULL, 
	passphrase VARCHAR (20) NOT NULL, 
	PRIMARY KEY (user_id)
);


CREATE TABLE managerAccounts (
	user_id INTEGER NOT NULL,
	first_name VARCHAR(20) NOT NULL,
	last_name VARCHAR(20) NOT NULL,
	username VARCHAR(20) NOT NULL, 
	passphrase VARCHAR (20) NOT NULL, 
	PRIMARY KEY (user_id)
);




--Test customer thing
INSERT INTO customerAccounts (user_id, first_name, last_name, balance, last_transaction, username, passphrase) VALUES 
(1, 'Test', 'Customer1', 0, 0, 'username3', 'passphrase3'),
(2, 'Test', 'Customer2', 0, 0, 'username4', 'passphrase4'),
(3, 'Test', 'Customer3', 0, 0, 'username1', 'passphrase1'),
(4, 'Test', 'Customer4', 100, 0, 'username2', 'passphrase2')
;



INSERT INTO managerAccounts (user_id, first_name, last_name, username, passphrase) VALUES 
	(1, 'Test', 'Manager1', 'username1', 'passphrase1'),
	(2, 'Test', 'Manager2', 'username2', 'passphrase2')
	;

"INSERT INTO customerAccounts ("+user_id+", "+first_name+", "+lastname+",0,0, "+username+", "+passphrase+") VALUES ("+user_id+", \"+first_name+\", \"+lastname+\",0,0, \"+username+\", \"+passphrase+\");";"

--DQL

SELECT balance FROM customeraccounts WHERE user_id = 3;
SELECT username FROM customeraccounts WHERE username = ;



--Works as intedned
UPDATE customeraccounts SET balance = (balance + -199) WHERE user_id = 4;
UPDATE customeraccounts SET last_transaction = 23 WHERE user_id = 1;



--Works as intended
UPDATE customeraccounts SET balance = (balance + 30) WHERE user_id =3;
UPDATE customeraccounts SET last_transaction = (last_transaction + 30) WHERE user_id =3;




UPDATE customeraccounts SET balance = (balance + 30) WHERE user_id = 2;
UPDATE customeraccounts SET last_transaction = 30 WHERE user_id = 2;




 