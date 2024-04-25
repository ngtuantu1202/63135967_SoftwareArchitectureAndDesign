package behavioral.Chain_of_Responsibility.ATM;

public class ChuoiMenhGiaVND extends ChuoiMenhGiaFactory {
    ATM_TheoMenhGia menhGia500;
    ATM_TheoMenhGia menhGia100;
    ATM_TheoMenhGia menhGia50;
    ATM_TheoMenhGia menhGia10;
    ATM_TheoMenhGia menhGia1;

    public ChuoiMenhGiaVND() {
        menhGia500 = new MenhGia(500);
        menhGia100 = new MenhGia(100);
        menhGia50 = new MenhGia(50);
        menhGia10 = new MenhGia(10);
        menhGia1 = new MenhGiaThapNhat(1);
    }

    @Override
    public ATM_TheoMenhGia getChuoiMenhGia(int menhGia) {
        switch (menhGia) {
            case 500:
                return menhGia500;
            case 100:
                return menhGia100;
            case 50:
                return menhGia50;
            case 10:
                return menhGia10;
            case 1:
                return menhGia1;
            default: throw new IllegalArgumentException("Ko tìm thấy");
        }

    }
}
