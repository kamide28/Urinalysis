CREATE TABLE reviewer_results (
  reviewer_result_id Integer NOT NULL,
  inspector_name VARCHAR(10),
  rbc VARCHAR(20),
  wbc VARCHAR(20),
  squamous_epithelial  VARCHAR(20),
  urothelial_epithelial VARCHAR(20),
  renalTubular_epithelial VARCHAR(20),
  other VARCHAR(200),
  message VARCHAR(200),
  PRIMARY KEY(reviewer_result_id)
);

INSERT INTO reviewer_results(reviewer_result_id, inspector_name, rbc, wbc, squamous_epithelial , urothelial_epithelial, renalTubular_epithelial, other, message)
VALUES(1, "秋山", "1~3/10", "1~3/10", "1~3/10", "1~3/20", "1~3/20", "桿菌(1+)", "正確に取れていると思います");

INSERT INTO reviewer_results(reviewer_result_id, inspector_name, rbc, wbc, squamous_epithelial , urothelial_epithelial, renalTubular_epithelial, other, message)
VALUES(2, "秋山", "10~15/1", "1~3/1", "1~3/1", "1~3/10", "1~3/10", NULL, "奇形赤血球があるので形態が変化したように見えています");

INSERT INTO reviewer_results(reviewer_result_id, inspector_name, rbc, wbc, squamous_epithelial , urothelial_epithelial, renalTubular_epithelial, other, message)
VALUES(3, "冬木", "多数/1", "無数/1", "1~3/1", "1~3/1", "1~3/5", "桿菌(2+),視野が悪く参考値", "読みにくい時は薄く引いて一回見てみましょう");


