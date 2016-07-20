create table events (
      event_type integer not null,
      value integer not null,
      time timestamp not null,
      unique(event_type, time)
  );
  
INSERT INTO events(event_type, value, TIME)
VALUES (2,5,'12-SEP-12 10.31.19.000000000 AM');
INSERT INTO events(event_type, value, TIME)
VALUES (2,5,'12-SEP-12 10.31.19.000002000 AM');
INSERT INTO events(event_type, value, TIME)
VALUES (2,5,'12-SEP-12 10.31.19.000230000 AM');
INSERT INTO events(event_type, value, TIME)
VALUES (3,5,'12-SEP-12 10.31.19.0003400 AM');
INSERT INTO events(event_type, value, TIME)
VALUES (1,5,'12-SEP-12 10.31.19.000230000 AM');

select * from EVENTS;


select EVENT_TYPE,time from events 
        where EVENT_TYPE in ( 
            select event_type from EVENTS 
              
              GROUP BY event_type 
              
              HAVING (COUNT(event_type) > 1) 
          ) order by TIME ASC;