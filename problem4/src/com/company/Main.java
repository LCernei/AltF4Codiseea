package com.company;

import java.util.Arrays;
import java.util.Comparator;
import static com.company.ProcessingText.*;

public class Main {

    public static void main(String[] args) {

        String text = "LXXXIV: HPR\n" +
                "LVIII: HUQ\n" +
                "XXXII: YYS\n" +
                "XLVIII: NXT\n" +
                "LXXVI: GTM\n" +
                "XVI: FUP\n" +
                "XXII: MOG\n" +
                "LII: WXZ\n" +
                "LI: KMI\n" +
                "XXVIII: RGU\n" +
                "LXVIII: WLD\n" +
                "LXVI: HQQ\n" +
                "XXXVI: DZU\n" +
                "LIX: SFZ\n" +
                "LXXX: GTD\n" +
                "LXI: LOA\n" +
                "XLVII: KUC\n" +
                "XCV: OOI\n" +
                "XCII: UWR\n" +
                "LX: HVR\n" +
                "XLVI: QPG\n" +
                "LXVII: CQH\n" +
                "XLIX: HWE\n" +
                "XCVII: YOY\n" +
                "LXII: MPN\n" +
                "XXXIV: BDJ\n" +
                "LIV: OKS\n" +
                "XC: CCQ\n" +
                "LXIII: HDR\n" +
                "XCVIII: DKT\n" +
                "LXXXI: ZBE\n" +
                "LXIV: VAQ\n" +
                "XIV: MWT\n" +
                "XII: ZAE\n" +
                "XCIX: VRM\n" +
                "XXIV: CNX\n" +
                "LXX: SAU\n" +
                "LXXV: MZP\n" +
                "LVI: WAT\n" +
                "L: SFM\n" +
                "III: TSF\n" +
                "LXXIX: PRZ\n" +
                "XI: MXV\n" +
                "XXXI: NEB\n" +
                "LXV: POR\n" +
                "XXIX: TFS\n" +
                "XIX: PYL\n" +
                "XVII: CVN\n" +
                "XCIV: LXP\n" +
                "XXX: PRI\n" +
                "X: TED\n" +
                "VIII: TYN\n" +
                "LXXXVI: WQG\n" +
                "XXI: SAB\n" +
                "XLV: MNO\n" +
                "XLIV: XTF\n" +
                "I: OGP\n" +
                "XCVI: VEV\n" +
                "LXXXVIII: PWL\n" +
                "LXXIV: DDJ\n" +
                "IV: VUJ\n" +
                "XXV: LKN\n" +
                "XXXVII: YKU\n" +
                "XLIII: RBL\n" +
                "XL: UHH\n" +
                "LXXXIII: TOL\n" +
                "XXXVIII: EGM\n" +
                "XLII: DQH\n" +
                "XXXV: AQX\n" +
                "LV: PJT\n" +
                "LXXI: RWF\n" +
                "LXXXVII: DMI\n" +
                "LXIX: AVJ\n" +
                "VII: GGH\n" +
                "II: TRU\n" +
                "XCI: EWC\n" +
                "XXXIX: ERF\n" +
                "XX: NQL\n" +
                "XVIII: BPC\n" +
                "LXXIII: ISW\n" +
                "XXXIII: JRO\n" +
                "XV: CKI\n" +
                "XXVI: KFS\n" +
                "XLI: XDF\n" +
                "LXXXIX: QIL\n" +
                "XXVII: ZNN\n" +
                "LXXXII: RCY\n" +
                "VI: POC\n" +
                "XCIII: MQD\n" +
                "XIII: TZE\n" +
                "V: SPZ\n" +
                "LXXII: RNN\n" +
                "LXXVII: PRR\n" +
                "LIII: EWO\n" +
                "LXXXV: WCV\n" +
                "LXXVIII: ZKI\n" +
                "IX: XYU\n" +
                "LVII: RKH\n" +
                "XXIII: LSR";

        String[] elements = text.split("\n");

        Arrays.sort(elements, (Comparator) (o1, o2) -> {
            String rm1 = o1.toString().substring(0, o1.toString().indexOf(":"));
            String rm2 = o2.toString().substring(0, o2.toString().indexOf(":"));
            return ((Integer)convertToDecimal(rm1)).compareTo((Integer)convertToDecimal(rm2));
        });

        for(String el:elements){
            System.out.print(el.substring(el.indexOf(":")+2));
        }
    }
}
