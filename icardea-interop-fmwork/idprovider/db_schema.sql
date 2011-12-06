-- this is the SQLite schema

CREATE TABLE IF NOT EXISTS users(uid text PRIMARY KEY, prof text); 
CREATE TABLE IF NOT EXISTS auth(uid text primary key, pwd text, foreign key (uid) references users(uid));
CREATE TABLE IF NOT EXISTS approvals(uid text, trust_root text, foreign key (uid) references users(uid));

