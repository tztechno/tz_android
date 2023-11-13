package com.example.app001

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.app001.ui.theme.App001Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App001Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    App001Theme {
        Greeting("Android")
    }
}

/*
   これは

MainActivity クラス:

ComponentActivity クラスを継承しています。
onCreate メソッドでは、アクティビティが作成されたときに呼び出される処理が定義されています。
setContent 関数を使用して、アクティビティのコンテンツを構築しています。
App001Theme:

テーマを適用するためのカスタムテーマ関数です。MaterialTheme を使用しています。
Surface:

テーマの背景色を使用して、画面全体を覆う Surface を作成しています。
Greeting 関数:

@Composable アノテーションが付いており、ComposeでUIを構築するための関数です。
Text コンポーネントを使用して、"Hello Android!" と表示しています。
GreetingPreview 関数:

プレビュー機能を提供する @Preview アノテーションが付いています。
Greeting 関数をプレビューしています。

   ブロックコメントです
*/
