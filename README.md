# 会議室予約
# 概要
会社研修用のサンプルプロジェクトです。

組織ごとに保持する複数の会議室を予約したり、会議への参加を管理する WEB アプリケーションです。

# アプリケーション URL
https://conference-room-ginga.herokuapp.com/

# 画面一覧（仮）
- 【画面】
  - ログイン画面
  - スケジューラ画面
  - 会議室一覧画面
  - 会議室追加画面
  - 会議室追加確認画面
  - 会議室変更画面
  - 会議室変更確認画面
  - 会議室削除確認画面
  - 会議追加画面
  - 会議追加確認画面
  - 会議変更画面
  - 会議変更確認画面
  - 会議削除確認画面
  - 会議参加者一覧画面
  - 会議参加者追加画面
  - 利用者一覧画面
  - 利用者新規登録画面
  - 利用者新規登録確認画面
  - 利用者変更画面
  - 利用者変更確認画面
  - 利用者削除確認画面
 
- 【ダイアログ】
  - 会議参加確認ダイアログ
  - 会議参加キャンセルダイアログ
  - 会議参加者削除確認ダイアログ
 
# プロジェクトclone方法
コマンドプロンプトを立ち上げ、任意の作業フォルダで下記コマンドを実行。
~~~
git clone https://github.com/gingaMkProject/ConferenceRoom/ conference-room
~~~

# STS（Eclipse）にプロジェクトをインポートする
1. Packege Explorer を右クリック → Import...
2. Maven - Existing Maven Projects
3. git clone したフォルダを選択
4. プロジェクトを右クリック → Maven → Update Project でプロジェクトをアップデート
5. プロジェクトを右クリック → Run As → Spring Boot App
6. ブラウザを立ち上げ「http://localhost:8080」にアクセス
