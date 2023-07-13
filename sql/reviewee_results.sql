CREATE TABLE reviewee_results (
  reviewee_result_id Integer NOT NULL,
  inspector_name VARCHAR(10),
  rbc VARCHAR(20),
  wbc VARCHAR(20),
  squamous_epithelial  VARCHAR(20),
  urothelial_epithelial VARCHAR(20),
  renalTubular_epithelial VARCHAR(20),
  other VARCHAR(200),
  message VARCHAR(200),
  PRIMARY KEY(reviewee_result_id)
);

INSERT INTO reviewee_results(reviewee_result_id, inspector_name, rbc, wbc, squamous_epithelial , urothelial_epithelial, renalTubular_epithelial, other, message)
VALUES(1, "鈴木", "1~3/10", "1~3/10", "1~3/10", "1~3/20", "1~3/20", "桿菌(1+)", "正常範囲と考えます");

INSERT INTO reviewee_results(reviewee_result_id, inspector_name, rbc, wbc, squamous_epithelial , urothelial_epithelial, renalTubular_epithelial, other, message)
VALUES(2, "高橋", "7~9/1", "1~3/1", "3~5/1", "1~3/10", "1~3/10", NULL, "赤血球形態が気になります");

INSERT INTO reviewee_results(reviewee_result_id, inspector_name, rbc, wbc, squamous_epithelial , urothelial_epithelial, renalTubular_epithelial, other, message)
VALUES(3, "山田", "75~100/1", "無数/1", "1~3/1", "1~3/5", "1~3/5", "桿菌(1+),視野が悪く参考値", "読みにくい時いい方法はありますか");
