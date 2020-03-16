package org.geyuqiao.mleetcode.p1394;

public class CompressString {
    public String compressString(String S) {
        if (S == null || S.length() < 2) {
            return S;
        }

        StringBuilder sbu = new StringBuilder();
        int num = 1;
        int i = 0;
        for (; i < S.length() - 1; i++) {
            if (S.charAt(i) == S.charAt(i+1)) {
                num++;
                continue;
            }
            sbu.append(S.charAt(i)).append(num);
            num = 1;
        }
        sbu.append(S.charAt(i)).append(num);

        if (sbu.length() < S.length()) {
            return sbu.toString();
        }

        return S;
    }
}
