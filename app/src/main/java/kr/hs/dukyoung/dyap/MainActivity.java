package kr.hs.dukyoung.dyap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.Calendar;


import kr.hs.dukyoung.dyap.request.Request;
import kr.hs.dukyoung.dyap.request.URLRequest;
import kr.hs.dukyoung.dyap.schedule.view.ScheduleActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH) + 1;
        Intent intent1 = new Intent(getApplicationContext(), ScheduleActivity.class);

        Request request = new Request(() -> {
            try {
//              URLRequest urlRequest = new URLRequest("192.168.0.21:8080/api/detailLunch?year=" + year + "&month=" + month);
//              String jsonString = urlRequest.sendRequest();
                String jsonString = "[{\"id\":261,\"year\":\"2021\",\"month\":\"11\",\"day\":\"01\",\"eventName\":\"['전면등교']\"},{\"id\":262,\"year\":\"2021\",\"month\":\"11\",\"day\":\"02\",\"eventName\":\"['전면등교', '2학년 도제학생 OJT']\"},{\"id\":263,\"year\":\"2021\",\"month\":\"11\",\"day\":\"03\",\"eventName\":\"['전면등교']\"},{\"id\":264,\"year\":\"2021\",\"month\":\"11\",\"day\":\"04\",\"eventName\":\"['1&2학년등교', '3학년온라인수업']\"},{\"id\":265,\"year\":\"2021\",\"month\":\"11\",\"day\":\"05\",\"eventName\":\"['1&2학년등교', '3학년온라인수업', '2022학년도 신입생 특별전형 접수기간(11/5-9)', '동아리 활동', '교원능력평가 마감', '전학공']\"},{\"id\":266,\"year\":\"2021\",\"month\":\"11\",\"day\":\"06\",\"eventName\":\"[]\"},{\"id\":267,\"year\":\"2021\",\"month\":\"11\",\"day\":\"07\",\"eventName\":\"[]\"},{\"id\":268,\"year\":\"2021\",\"month\":\"11\",\"day\":\"08\",\"eventName\":\"['1&2학년등교', '3학년온라인수업']\"},{\"id\":269,\"year\":\"2021\",\"month\":\"11\",\"day\":\"09\",\"eventName\":\"['1&2학년등교', '3학년온라인수업', '2학년 도제학생 OJT']\"},{\"id\":270,\"year\":\"2021\",\"month\":\"11\",\"day\":\"10\",\"eventName\":\"['1&2학년등교', '3학년온라인수업']\"},{\"id\":271,\"year\":\"2021\",\"month\":\"11\",\"day\":\"11\",\"eventName\":\"['1&2학년등교', '3학년온라인수업', '1차 전형(심의)']\"},{\"id\":272,\"year\":\"2021\",\"month\":\"11\",\"day\":\"12\",\"eventName\":\"['1&2학년등교', '3학년온라인수업', '2차 전형(면접)14:30-17:00']\"},{\"id\":273,\"year\":\"2021\",\"month\":\"11\",\"day\":\"13\",\"eventName\":\"[]\"},{\"id\":274,\"year\":\"2021\",\"month\":\"11\",\"day\":\"14\",\"eventName\":\"[]\"},{\"id\":275,\"year\":\"2021\",\"month\":\"11\",\"day\":\"15\",\"eventName\":\"['1&2학년등교', '3학년온라인수업', '2022학년도 신입생 특별전형 합격자 발표']\"},{\"id\":276,\"year\":\"2021\",\"month\":\"11\",\"day\":\"16\",\"eventName\":\"['1&2학년등교', '3학년온라인수업', '2학년 도제학생 OJT']\"},{\"id\":277,\"year\":\"2021\",\"month\":\"11\",\"day\":\"17\",\"eventName\":\"['1&2학년등교', '3학년온라인수업', '급식미실시', '수능 예비소집', '수능응시표 배부']\"},{\"id\":278,\"year\":\"2021\",\"month\":\"11\",\"day\":\"18\",\"eventName\":\"['대학수학능력시험일', '재량휴업일']\"},{\"id\":279,\"year\":\"2021\",\"month\":\"11\",\"day\":\"19\",\"eventName\":\"['1&2학년등교', '3학년온라인수업', '동아리 활동', '북콘서트(이규찬 웹툰작가)']\"},{\"id\":280,\"year\":\"2021\",\"month\":\"11\",\"day\":\"20\",\"eventName\":\"['경기도 공무원 시험장 설치']\"},{\"id\":281,\"year\":\"2021\",\"month\":\"11\",\"day\":\"21\",\"eventName\":\"[]\"},{\"id\":282,\"year\":\"2021\",\"month\":\"11\",\"day\":\"22\",\"eventName\":\"['전면등교', '3학년 2차 지필평가']\"},{\"id\":283,\"year\":\"2021\",\"month\":\"11\",\"day\":\"23\",\"eventName\":\"['전면등교', '3학년 2차 지필평가', '2학년 도제학생 OJT']\"},{\"id\":284,\"year\":\"2021\",\"month\":\"11\",\"day\":\"24\",\"eventName\":\"['전면등교', '3학년 2차 지필평가', '고1-2 전국연합']\"},{\"id\":285,\"year\":\"2021\",\"month\":\"11\",\"day\":\"25\",\"eventName\":\"['전면등교', '3학년 2차 지필평가']\"},{\"id\":286,\"year\":\"2021\",\"month\":\"11\",\"day\":\"26\",\"eventName\":\"['전면등교', '정보통신윤리교육(교정부)', '교내환경 정화활동', '전학공']\"},{\"id\":287,\"year\":\"2021\",\"month\":\"11\",\"day\":\"27\",\"eventName\":\"[]\"},{\"id\":288,\"year\":\"2021\",\"month\":\"11\",\"day\":\"28\",\"eventName\":\"[]\"},{\"id\":289,\"year\":\"2021\",\"month\":\"11\",\"day\":\"29\",\"eventName\":\"['전면등교']\"},{\"id\":290,\"year\":\"2021\",\"month\":\"11\",\"day\":\"30\",\"eventName\":\"['전면등교', '2학년 도제학생 OJT', '지역인재9급 면접장소 발표', '폐건전지 수거주간']\"}]";
                intent1.putExtra("jsonString", jsonString);
                startActivity(intent1);
            }
            catch(Exception e) {
                e.printStackTrace();
                Toast.makeText(MainActivity.this, "서버 요청중 에러가 발생했습니다!\n인터넷 연결 상태를 확인해주시고 다시 실행해주세요!", Toast.LENGTH_LONG).show();
            }
        });
        request.execute();





//        finish();
    }
}
