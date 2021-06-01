package com.rickjinny.leetcode;

/**
 * 551、学生出勤记录 I
 */
public class T0551_student_attendance_record_i {

    public boolean checkRecord(String s) {
        int count = 0;
        for (int i = 0; i < s.length() && count < 2; i++) {
            if (s.charAt(i) == 'A') {
                count++;
            }
        }
        return count < 2 && s.indexOf("LLL") < 0;
    }
}
