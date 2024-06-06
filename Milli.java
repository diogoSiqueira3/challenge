public class Milli {

    public static String formatMilli(long milli) {

        if (milli == 0) {
            return "now";
        }

        final long mSec = 1000;
        final long mMin = mSec * 60;
        final long mHour = mMin * 60;
        final long mDay = mHour * 24;
        final long mMo = mDay * 30;
        final long mYear = mDay * 365;

        long y = milli / mYear;
        milli %= mYear;

        long mo = milli / mMo;
        milli %= mMo;

        long d = milli / mDay;
        milli %= mDay;

        long h = milli / mHour;
        milli %= mHour;

        long m = milli / mMin;
        milli %= mMin;

        long s = milli / mSec;

        String sF = "";

        if (y > 0) {
            sF += y + " year" + (y > 1 ? "s" : "") + ", ";
        }
        if (mo > 0) {
            sF += mo + " month" + (mo > 1 ? "s" : "") + ", ";
        }
        if (d > 0) {
            sF += d + " day" + (d > 1 ? "s" : "") + ", ";
        }
        if (h > 0) {
            sF += h + " hour" + (h > 1 ? "s" : "") + ", ";
        }
        if (m > 0) {
            sF += m + " minute" + (m > 1 ? "s" : "") + ", ";
        }
        if (s > 0) {
            sF += s + " second" + (s > 1 ? "s" : "") + ", ";
        }

        if (!sF.isEmpty()) {
            sF = sF.substring(0, sF.length() - 2);
        }

        int co = sF.lastIndexOf(", ");
        if (co != -1 && co != sF.length() - 2) {
            sF = sF.substring(0, co) + " and " + sF.substring(co + 2);
        }

        return sF;
    }
}
