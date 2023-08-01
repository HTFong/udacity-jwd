CREATE TABLE IF NOT EXISTS USERS (
                                     userid INT PRIMARY KEY auto_increment,
                                     username VARCHAR(20),
    salt VARCHAR(20),
    password VARCHAR(20),
    firstname VARCHAR(20),
    lastname VARCHAR(20)
    );
CREATE TABLE IF NOT EXISTS MESSAGES (
                                        messageid INT PRIMARY KEY auto_increment,
                                        username VARCHAR(20) NOT NULL,
    messagetext VARCHAR(20) NOT NULL
    );
