class Solution {
    public boolean isNumber(String s) {
        boolean isFirst, isDigitFound, isExponent, isDecimal;
        isFirst = true;
        isDecimal = false;
        isDigitFound = false;
        isExponent = false;

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if(c == '-' || c == '+') {
                if(!isFirst) return false;
                isFirst = false;
                // isDigitFound = true;
            } else if(c == 'e' || c == 'E') {
                if(isExponent) return false;
                if(!isDigitFound) return false;
                isExponent = true;
                isFirst = true;
                isDecimal = false;
                isDigitFound = false;
            } else if(c == '.') {
                if(isDecimal) return false;
                if(isExponent) return false;
                isDecimal = true;
                isFirst = false;
            } else if(c >= '0' && c <= '9') {
                isDigitFound = true;
                isFirst = false;
            } else {
                return false;
            }
        }

        return isDigitFound;
    }
}
