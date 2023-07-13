CREATE TABLE tasks (
  task_id Integer unsigned AUTO_INCREMENT,
  task_name VARCHAR(100) NOT NULL,
  reviewee_result_id Integer,
  reviewer_result_id Integer,
  PRIMARY KEY(task_id)
);

INSERT INTO tasks(task_name, reviewee_result_id, reviewer_result_id) VALUES ("7/7 1本目", 1, 1);
INSERT INTO tasks(task_name, reviewee_result_id, reviewer_result_id) VALUES ("7/7 2本目", 2, 2);
INSERT INTO tasks(task_name, reviewee_result_id, reviewer_result_id) VALUES ("7/7 3本目", 3, 3);
