package com.example.sutda;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    int sum = 0;
    int first = 1;
    String[] numbers = new String[2];
    int clickCount = 0;
    ImageView firstImageButton;
    ImageView secondImageButton;
    int firstScore = 0;
    int secondScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set orientation to only portrait
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);

        final ScrollView listScroll = findViewById(R.id.listScroll);

        final Button checkButton = findViewById(R.id.check_button);
        final TextView resultText = findViewById(R.id.result);

        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);

        final LinearLayout matrixLinear = findViewById(R.id.matrixLinear);
        final LinearLayout list = findViewById(R.id.list);

        final ImageButton january1 = findViewById(R.id.january1);
        final ImageButton february1 = findViewById(R.id.february1);
        final ImageButton march1 = findViewById(R.id.march1);
        final ImageButton april1 = findViewById(R.id.april1);
        final ImageButton may1 = findViewById(R.id.may1);
        final ImageButton june1 = findViewById(R.id.june1);
        final ImageButton july1 = findViewById(R.id.july1);
        final ImageButton august1 = findViewById(R.id.august1);
        final ImageButton september1 = findViewById(R.id.september1);
        final ImageButton october1 = findViewById(R.id.october1);
        final ImageButton january2 = findViewById(R.id.january2);
        final ImageButton february2 = findViewById(R.id.february2);
        final ImageButton march2 = findViewById(R.id.march2);
        final ImageButton april2 = findViewById(R.id.april2);
        final ImageButton may2 = findViewById(R.id.may2);
        final ImageButton june2 = findViewById(R.id.june2);
        final ImageButton july2 = findViewById(R.id.july2);
        final ImageButton august2 = findViewById(R.id.august2);
        final ImageButton september2 = findViewById(R.id.september2);
        final ImageButton october2 = findViewById(R.id.october2);

        final TextView gd38 = findViewById(R.id.gd38);
        final TextView gd18 = findViewById(R.id.gd18);
        final TextView gd13 = findViewById(R.id.gd13);
        final TextView dd10 = findViewById(R.id.dd10);
        final TextView dd9 = findViewById(R.id.dd9);
        final TextView dd8 = findViewById(R.id.dd8);
        final TextView dd7 = findViewById(R.id.dd7);
        final TextView dd6 = findViewById(R.id.dd6);
        final TextView dd5 = findViewById(R.id.dd5);
        final TextView dd4 = findViewById(R.id.dd4);
        final TextView dd3 = findViewById(R.id.dd3);
        final TextView dd2 = findViewById(R.id.dd2);
        final TextView dd1 = findViewById(R.id.dd1);
        final TextView al = findViewById(R.id.al);
        final TextView ds = findViewById(R.id.ds);
        final TextView gb = findViewById(R.id.gb);
        final TextView jb = findViewById(R.id.jb);
        final TextView js = findViewById(R.id.js);
        final TextView sl = findViewById(R.id.sl);
        final TextView go = findViewById(R.id.go);
        final TextView gg8 = findViewById(R.id.gg8);
        final TextView gg7 = findViewById(R.id.gg7);
        final TextView gg6 = findViewById(R.id.gg6);
        final TextView gg5 = findViewById(R.id.gg5);
        final TextView gg4 = findViewById(R.id.gg4);
        final TextView gg3 = findViewById(R.id.gg3);
        final TextView gg2 = findViewById(R.id.gg2);
        final TextView gg1 = findViewById(R.id.gg1);
        final TextView mt = findViewById(R.id.mt);
        final TextView ah = findViewById(R.id.ah);
        final TextView tg = findViewById(R.id.tg);
        final TextView mg = findViewById(R.id.mg);
        final TextView gs = findViewById(R.id.gs);

        final ImageButton[] imageButtons = {january1, january2, february1, february2, march1, march2, april1, april2,
                                        may1, may2, june1, june2, july1, july2, august1, august2, september1, september2,
                                        october1, october2};
        final TextView[] textViews = {gd38, gd18, gd13, dd10, dd9, dd8, dd7, dd6, dd5, dd4, dd3, dd2, dd1, al, ds, gb,
                                        jb, js, sl, go, gg8, gg7, gg6, gg5, gg4, gg3, gg2, gg1, mt, ah, tg, mg, gs};


        list.setVisibility(View.INVISIBLE);
        resultText.setSelected(true);

        // clicked the checkButton
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (sum != 0 && clickCount == 2) {
                    // checking ranking and view rank list
                    resultText.setVisibility(View.VISIBLE);

                    if (sum <= 10) {

                        if (sum == 2) {
                            resultText.setText("1땡");
                            dd1.setTextColor(Color.RED);
                            scrollToView(dd1, listScroll, 0);
                        } else if (sum == 3) {
                            resultText.setText("알리");
                            al.setTextColor(Color.RED);
                            scrollToView(al, listScroll, 0);
                        } else if (sum == 4) {
                            if (numbers[0].equals("february1") || numbers[0].equals("february2")) {
                                resultText.setText("2땡");
                                scrollToView(dd2, listScroll, 0);
                                dd2.setTextColor(Color.RED);
                            } else if ((numbers[0].equals("january1")) && numbers[1].equals("march1") || (numbers[1].equals("january1")) && numbers[0].equals("march1")) {
                                resultText.setText("1·3광땡");
                                gd13.setTextColor(Color.RED);
                                scrollToView(gd13, listScroll, 0);
                            } else {
                                resultText.setText("4끗");
                                gg4.setTextColor(Color.RED);
                                scrollToView(gg4, listScroll, 0);
                            }
                        } else if (sum == 5) {
                            if ((numbers[0].equals("january1") || numbers[0].equals("january2")) || (numbers[0].equals("april1") || numbers[0].equals("april2"))) {
                                resultText.setText("독사");
                                ds.setTextColor(Color.RED);
                                scrollToView(ds, listScroll, 0);
                            } else {
                                resultText.setText("5끗");
                                gg5.setTextColor(Color.RED);
                                scrollToView(gg5, listScroll, 0);
                            }
                        } else if (sum == 6) {
                            if (numbers[0].equals("march1") || numbers[0].equals("march2")) {
                                resultText.setText("3땡");
                                dd3.setTextColor(Color.RED);
                                scrollToView(dd3, listScroll, 0);
                            } else {
                                resultText.setText("6끗");
                                gg6.setTextColor(Color.RED);
                                scrollToView(gg6, listScroll, 0);
                            }
                        } else if (sum == 7) {
                            resultText.setText("7끗");
                            gg7.setTextColor(Color.RED);
                            scrollToView(gg7, listScroll, 0);
                        } else if (sum == 8) {
                            if (numbers[0].equals("april1") || numbers[0].equals("april2")) {
                                resultText.setText("4땡");
                                dd4.setTextColor(Color.RED);
                                scrollToView(dd4, listScroll, 0);
                            } else {
                                resultText.setText("8끗");
                                gg8.setTextColor(Color.RED);
                                scrollToView(gg8, listScroll, 0);
                            }
                        } else if (sum == 9) {
                            if ((numbers[0].equals("january1") && numbers[1].equals("august1")) || numbers[0].equals("august1") && numbers[1].equals("january1")) {
                                resultText.setText("1·8광땡");
                                gd18.setTextColor(Color.RED);
                                scrollToView(gd18, listScroll, 0);
                            } else {
                                resultText.setText("갑오");
                                go.setTextColor(Color.RED);
                                scrollToView(go, listScroll, 0);
                            }
                        } else if (sum == 10) {
                            if (numbers[0].equals("may1") || numbers[0].equals("may2")) {
                                resultText.setText("5땡");
                                dd5.setTextColor(Color.RED);
                                scrollToView(dd5, listScroll, 0);
                            } else if ((numbers[0].equals("april1") || numbers[0].equals("april2")) || (numbers[0].equals("june1") || numbers[0].equals("june2"))) {
                                resultText.setText("세륙");
                                sl.setTextColor(Color.RED);
                                scrollToView(sl, listScroll, 0);
                            } else if ((numbers[0].equals("january1") || numbers[0].equals("january2")) || (numbers[0].equals("september1") || numbers[0].equals("september2"))) {
                                resultText.setText("구삥");
                                gb.setTextColor(Color.RED);
                                scrollToView(gb, listScroll, 0);
                            } else if ((numbers[0].equals("march1") && numbers[1].equals("july1")) || (numbers[0].equals("july1") && numbers[1].equals("march1"))) {
                                resultText.setText("땡잡이");
                                tg.setTextColor(Color.YELLOW);
                                scrollToView(tg, listScroll, 0);
                            } else {
                                resultText.setText("망통");
                                mt.setTextColor(Color.RED);
                                scrollToView(mt, listScroll, 0);
                            }
                        }
                    }
                    else {
                        if (sum == 11) {
                            if ((numbers[0].equals("march1") && numbers[1].equals("august1")) || numbers[0].equals("august1") && numbers[1].equals("march1")) {
                                resultText.setText("3·8광땡");
                                gd38.setTextColor(Color.RED);
                                scrollToView(gd38, listScroll, 0);
                            } else if ((numbers[0].equals("january1") || numbers[0].equals("january2")) || (numbers[0].equals("october1") || numbers[0].equals("october2"))) {
                                resultText.setText("장삥");
                                jb.setTextColor(Color.RED);
                                scrollToView(jb, listScroll, 0);
                            } else if ((numbers[0].equals("april1") && numbers[1].equals("july1")) || numbers[0].equals("july1") && numbers[1].equals("april1")) {
                                resultText.setText("암행어사");
                                ah.setTextColor(Color.YELLOW);
                                scrollToView(ah, listScroll, 0);
                            } else {
                                resultText.setText("1끗");
                                gg1.setTextColor(Color.RED);
                                scrollToView(gg1, listScroll, 0);
                            }
                        } else if (sum == 12) {
                            if (numbers[0].equals("june1") || numbers[0].equals("june2")) {
                                resultText.setText("6땡");
                                dd6.setTextColor(Color.RED);
                                scrollToView(dd6, listScroll, 0);
                            } else {
                                resultText.setText("2끗");
                                gg2.setTextColor(Color.RED);
                                scrollToView(gg2, listScroll, 0);
                            }
                        } else if (sum == 13) {
                            if ((numbers[0].equals("april1") || numbers[0].equals("april2")) || (numbers[0].equals("september1") || numbers[0].equals("september2"))) {
                                if ((numbers[0].equals("april1") && numbers[1].equals("september1")) || (numbers[0].equals("september1") && numbers[1].equals("april1"))) {
                                    resultText.setText("멍텅구리 구사");
                                    mg.setTextColor(Color.YELLOW);
                                    scrollToView(mg, listScroll, 0);
                                } else {
                                    resultText.setText("구사");
                                    gs.setTextColor(Color.YELLOW);
                                    scrollToView(gs, listScroll, 0);
                                }
                            } else {
                                resultText.setText("3끗");
                                gg3.setTextColor(Color.RED);
                                scrollToView(gg3, listScroll, 0);
                            }
                        } else if (sum == 14) {
                            if (numbers[0].equals("july1") || numbers[0].equals("july2")) {
                                resultText.setText("7땡");
                                dd7.setTextColor(Color.RED);
                                scrollToView(dd7, listScroll, 0);
                            } else if ((numbers[0].equals("april1") || numbers[0].equals("april2")) || (numbers[0].equals("october1") || numbers[0].equals("october2"))) {
                                resultText.setText("장사");
                                js.setTextColor(Color.RED);
                                scrollToView(js, listScroll, 0);
                            } else {
                                resultText.setText("4끗");
                                gg4.setTextColor(Color.RED);
                                scrollToView(gg4, listScroll, 0);
                            }
                        } else if (sum == 15) {
                            resultText.setText("5끗");
                            gg5.setTextColor(Color.RED);
                            scrollToView(gg5, listScroll, 0);
                        } else if (sum == 16) {
                            if (numbers[0].equals("august1") || numbers[0].equals("august2")) {
                                resultText.setText("8땡");
                                dd8.setTextColor(Color.RED);
                                scrollToView(dd8, listScroll, 0);
                            } else {
                                resultText.setText("6끗");
                                gg6.setTextColor(Color.RED);
                                scrollToView(gg6, listScroll, 0);
                            }
                        } else if (sum == 17) {
                            resultText.setText("7끗");
                            gg7.setTextColor(Color.RED);
                            scrollToView(gg7, listScroll, 0);
                        } else if (sum == 18) {
                            if (numbers[0].equals("september1") || numbers[0].equals("september2")) {
                                resultText.setText("9땡");
                                dd9.setTextColor(Color.RED);
                                scrollToView(dd9, listScroll, 0);
                            } else {
                                resultText.setText("8끗");
                                gg8.setTextColor(Color.RED);
                                scrollToView(gg8, listScroll, 0);
                            }
                        } else if (sum == 19) {
                            resultText.setText("갑오");
                            go.setTextColor(Color.RED);
                            scrollToView(go, listScroll, 0);
                        } else {
                            resultText.setText("장땡");
                            dd10.setTextColor(Color.RED);
                            scrollToView(dd10, listScroll, 0);
                        }
                    }

                    matrixLinear.setVisibility(View.INVISIBLE);
                    list.setVisibility(View.VISIBLE);
                    checkButton.setText("돌아가기");

                    sum = 0;
                    first = 1;
                    numbers[0] = " ";
                    numbers[1] = " ";
                    clickCount = 0;
                }

                else if (sum != 0 && clickCount == 1) {
                    // when select only one card
                    firstSelected.setImageResource(R.drawable.trans2);
                    secondSelected.setImageResource(R.drawable.trans2);
                    Toast.makeText(getApplicationContext(), "두개의 패를 선택하세요", Toast.LENGTH_SHORT).show();
                    setAllButtonsEnabled(imageButtons);
                    setAllButtonsAlphaTo255(imageButtons);

                    sum = 0;
                    first = 1;
                    numbers[0] = " ";
                    numbers[1] = " ";
                    clickCount = 0;
                }

                else {
                    // when clicked the 돌아가기 button
                    // back to main screen after check rank list
                    matrixLinear.setVisibility(View.VISIBLE);
                    list.setVisibility(View.INVISIBLE);
                    checkButton.setText("족보 확인");
                    resultText.setText("패를 선택해 주세요");
                    firstSelected.setImageResource(R.drawable.trans2);
                    secondSelected.setImageResource(R.drawable.trans2);
                    listScroll.scrollTo(0, 0);
                    setAllButtonsEnabled(imageButtons);
                    setAllButtonsAlphaTo255(imageButtons);
                    setAllTextViewsColorToWhite(textViews);
                }

            }
        });


        firstSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount == 1) {
                    firstSelected.setImageResource(R.drawable.trans2);
                    firstImageButton.setAlpha(255);
                    clickCount -= 1;
                    sum -= firstScore;
                    numbers[0] = " ";
                    firstImageButton.setEnabled(true);
                    firstSelected.setEnabled(false);
                    first = 1;  // like first time
                }
                else if (clickCount == 2) {
                    firstSelected.setImageResource(R.drawable.trans2);
                    firstImageButton.setAlpha(255);
                    clickCount -= 1;
                    sum -= firstScore;
                    numbers[0] = " ";
                    firstImageButton.setEnabled(true);
                    firstSelected.setEnabled(false);
                    first = 1; // like second time
                }
            }
        });
        secondSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickCount == 1) {
                    secondSelected.setImageResource(R.drawable.trans2);
                    secondImageButton.setAlpha(255);
                    clickCount -= 1;
                    sum -= secondScore;
                    numbers[1] = " ";
                    secondImageButton.setEnabled(true);
                    secondSelected.setEnabled(false);
                    first = 1; // like first time
                }
                else if (clickCount == 2) {
                    secondSelected.setImageResource(R.drawable.trans2);
                    secondImageButton.setAlpha(255);
                    clickCount -= 1;
                    sum -= secondScore;
                    numbers[1] = " ";
                    secondImageButton.setEnabled(true);
                    secondSelected.setEnabled(false);
                    first = 0; // like second time
                }
            }
        });
    }


    void EachMonthClicked (ImageButton months, String month, int score, ImageView firstSelect, ImageView secondSelect) {
        if (clickCount < 2) {
            months.setEnabled(false);
            clickCount += 1;
            months.setAlpha(80);
            sum += score;

            int resId = getResources().getIdentifier(month, "drawable", getPackageName());
//            Drawable image = getResources().getDrawable(resId);
            Drawable image = getDrawable(resId);
            if (first == 1) {
                firstSelect.setImageDrawable(image);
                firstImageButton = months;
                firstScore = score;
                numbers[0] = month;
                first = 0;
                firstSelect.setEnabled(true);
            }
            else {
                secondSelect.setImageDrawable(image);
                secondImageButton = months;
                secondScore = score;
                numbers[1] = month;
                secondSelect.setEnabled(true);
            }
        }
    }
    void setAllTextViewsColorToWhite(TextView[] textViews) {
        for (TextView textView : textViews) {
            textView.setTextColor(Color.WHITE);
        }
    }

    void setAllButtonsEnabled(ImageButton[] imageButtons) {
        for (ImageButton imageButton : imageButtons) {
            imageButton.setEnabled(true);
        }
    }

    void setAllButtonsAlphaTo255(ImageButton[] imageButtons) {
        for (ImageButton imageButton : imageButtons) {
            imageButton.setAlpha(255);
        }
    }

    public void clickMonth (View v) {
        int viewId = v.getId();
        final ImageButton month = findViewById(viewId);
        final ImageView firstSelected = findViewById(R.id.select);
        final ImageView secondSelected = findViewById(R.id.select2);
        switch (viewId) {
            case R.id.january1:
                EachMonthClicked(month, "january1", 1, firstSelected, secondSelected);
                break;
            case R.id.january2:
                EachMonthClicked(month, "january2", 1, firstSelected, secondSelected);
                break;
            case R.id.february1:
                EachMonthClicked(month, "february1", 2, firstSelected, secondSelected);
                break;
            case R.id.february2:
                EachMonthClicked(month, "february2", 2, firstSelected, secondSelected);
                break;
            case R.id.march1:
                EachMonthClicked(month, "march1", 3, firstSelected, secondSelected);
                break;
            case R.id.march2:
                EachMonthClicked(month, "march2", 3, firstSelected, secondSelected);
                break;
            case R.id.april1:
                EachMonthClicked(month, "april1", 4, firstSelected, secondSelected);
                break;
            case R.id.april2:
                EachMonthClicked(month, "april2", 4, firstSelected, secondSelected);
                break;
            case R.id.may1:
                EachMonthClicked(month, "may1", 5, firstSelected, secondSelected);
                break;
            case R.id.may2:
                EachMonthClicked(month, "may2", 5, firstSelected, secondSelected);
                break;
            case R.id.june1:
                EachMonthClicked(month, "june1", 6, firstSelected, secondSelected);
                break;
            case R.id.june2:
                EachMonthClicked(month, "june2", 6, firstSelected, secondSelected);
                break;
            case R.id.july1:
                EachMonthClicked(month, "july1", 7, firstSelected, secondSelected);
                break;
            case R.id.july2:
                EachMonthClicked(month, "july2", 7, firstSelected, secondSelected);
                break;
            case R.id.august1:
                EachMonthClicked(month, "august1", 8, firstSelected, secondSelected);
                break;
            case R.id.august2:
                EachMonthClicked(month, "august2", 8, firstSelected, secondSelected);
                break;
            case R.id.september1:
                EachMonthClicked(month, "september1", 9, firstSelected, secondSelected);
                break;
            case R.id.september2:
                EachMonthClicked(month, "september2", 9, firstSelected, secondSelected);
                break;
            case R.id.october1:
                EachMonthClicked(month, "october1", 10, firstSelected, secondSelected);
                break;
            case R.id.october2:
                EachMonthClicked(month, "october2", 10, firstSelected, secondSelected);
                break;
        }
    }

    public static void scrollToView(View view, final ScrollView scrollView, int count) {
        if (view != null && view != scrollView) {
            count += view.getTop();
            scrollToView((View) view.getParent(), scrollView, count);
        } else if (scrollView != null) {
            final int finalCount = count;
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    scrollView.smoothScrollTo(0, finalCount);
                }
            }, 200);
        }
    }
}