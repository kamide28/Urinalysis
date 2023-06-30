# 尿検査見合わせ楽々サービス

## アプリケーション概要

* アプリケーション概略図  
  <img width=70%  src="https://github.com/kamide28/Six-lesson/assets/127748178/41e69718-9df0-44e5-87df-06347d6e0303">
* ER図  
  <img width="70%" src="https://github.com/kamide28/Six-lesson/assets/127748178/35d88022-63e8-4d65-baa3-56b0edba688d">

## 画面について（イメージ図）

<img width="70%"  src="https://github.com/kamide28/Six-lesson/assets/127748178/fec4b240-27c5-4f81-ad89-a026032ef16b">  

## API仕様書(Swaggerにできたら移行予定)

<img width="70%"  src="https://github.com/kamide28/Six-lesson/assets/127748178/dc300c6b-b33d-46c1-b91d-6e691d37698d">  

実際こんな感じで使っていくのかなというイメージ？？？？

1. GET(/urine) TOP画面で全件表示
2. POST(/urine) 新しいレビュー依頼を画面に追加(自動でIDが決定)
3. GET(/urine/{id}) 入力ボタンを押して入力画面にいく
4. POST(/urine/reviewee/{id}) レビュー依頼者が先に読んで結果を入力→登録
5. GET(/urine) TOP画面に戻る(全件表示)
6. POST(/urine/reviewer/{id}) レビューする人が読んで結果を入力→登録
7. GET(/urine) TOP画面に戻る(全件表示)
8. GET(/urine/{id}) レビュー依頼者が結果を確認
9. GET(/urine) TOP画面に戻る(全件表示)
10. DELETE(/urine/{id}) 確認終了後レビュー依頼を消す
