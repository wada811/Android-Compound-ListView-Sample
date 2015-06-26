Android-Compound-ListView-Sample
====

In here, Compound-ListView is defined as ListView that has the view of multiple type like ListView.

## Example
```
┌──────────────┐
│┌────────────┐│
││  TextView  ││
│└────────────┘│
│┌────────────┐│
││  ListView  ││
│└────────────┘│
│┌────────────┐│
││   Button   ││
│└────────────┘│
│┌────────────┐│
││  TextView  ││
│└────────────┘│
│┌────────────┐│
││  ListView  ││
│└────────────┘│
│┌────────────┐│
││   Button   ││
│└────────────┘│
└──────────────┘
```

## Performance

### Views in ScrollView
ListView in ScrollView は１つのアイテムしか表示されないので

各リストアイテムの高さを計算して ListView の高さを設定する必要があります。

表示の際には全てのリストアイテムを生成することになるので

リストアイテムが多いと表示に時間がかかります。

### MergeAdapter

[commonsguy/cwac-merge](https://github.com/commonsguy/cwac-merge)

MergeAdapter は何の View でも追加できます。

ListView も Adapter を追加する形になるので

再生成が効いてパフォーマンスが良いのかもしれません。

[Android - MergeAdapterが便利 - Qiita](http://qiita.com/yyaammaa/items/d31dc8f67da87ca36574)

## Licence

    Copyright 2015 wada811

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

## Author

[wada811](https://github.com/wada811)
