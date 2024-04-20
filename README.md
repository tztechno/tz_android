# tz_android_kotlin


---


Kotlinを使用したAndroidアプリの一般的な構造は、以下のようになります。

```
your_project/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/              # Kotlinコードが含まれるソースフォルダ
│   │   │   │   └── com/
│   │   │   │       └── example/
│   │   │   │           └── yourapp/
│   │   │   │               ├── MainActivity.kt  # メインアクティビティ
│   │   │   │               └── ...
│   │   │   ├── res/              # リソースファイル
│   │   │   └── AndroidManifest.xml  # アプリケーションのマニフェストファイル
│   │   ├── test/                 # ユニットテストファイル
│   │   └── ...
│   ├── build.gradle               # アプリケーションのビルド設定
│   ├── gradle.properties          # Gradleプロパティ
│   ├── gradlew                    # Gradleラッパースクリプト（Unix）
│   ├── gradlew.bat                # Gradleラッパースクリプト（Windows）
│   ├── settings.gradle            # Gradle設定ファイル
│   └── ...
├── build/                         # ビルドされたアプリケーションの出力
├── gradle/                        # Gradle関連ファイル
├── .gitignore                     # Gitの無視設定ファイル
├── gradle.properties              # プロジェクトのGradleプロパティ
├── gradlew                        # Gradleラッパースクリプト（Unix）
├── gradlew.bat                    # Gradleラッパースクリプト（Windows）
└── settings.gradle                # Gradle設定ファイル
```
主な要素は以下の通りです：

app/src/main/java/: Kotlinコードが含まれるソースフォルダです。ここには、アプリケーションのメインロジックが含まれます。一般的に、この中にはパッケージ名に基づいたフォルダ構造があり、その下にKotlinのクラスやファイルが配置されます。

app/src/main/res/: リソースファイルが含まれるフォルダです。画像、レイアウトXML、文字列リソース、色、スタイルなどのリソースがここに格納されます。

app/src/main/AndroidManifest.xml: アプリケーションのマニフェストファイルです。アプリケーションの構成や権限、アクティビティ、サービスなどの情報が含まれます。

app/src/test/: ユニットテストファイルが含まれるフォルダです。Kotlinで書かれたテストコードがここに格納されます。

その他のファイルやフォルダは、Gradleビルドシステムの設定やプロジェクト管理のためのものです。

---

.java

.kt

.xml

.gradle
https://github.com/gradle/gradle
