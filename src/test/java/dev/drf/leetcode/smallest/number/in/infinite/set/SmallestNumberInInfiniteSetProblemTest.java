package dev.drf.leetcode.smallest.number.in.infinite.set;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmallestNumberInInfiniteSetProblemTest {
    @Test
    void example1() {
        /*
        Input
        [
            "SmallestInfiniteSet",
            "addBack",
            "popSmallest",
            "popSmallest",
            "popSmallest",
            "addBack",
            "popSmallest",
            "popSmallest",
            "popSmallest"
        ]
        [[], [2], [], [], [], [1], [], [], []]
        Output
        [null, null, 1, 2, 3, null, 1, 4, 5]
         */
        var set = new SmallestNumberInInfiniteSetProblem.SmallestInfiniteSet();

        set.addBack(2);
        int pop1 = set.popSmallest();
        int pop2 = set.popSmallest();
        int pop3 = set.popSmallest();
        set.addBack(1);
        int pop4 = set.popSmallest();
        int pop5 = set.popSmallest();
        int pop6 = set.popSmallest();

        assertEquals(1, pop1);
        assertEquals(2, pop2);
        assertEquals(3, pop3);
        assertEquals(1, pop4);
        assertEquals(4, pop5);
        assertEquals(5, pop6);
    }

    @Test
    void failed1() {
        /*
        ["SmallestInfiniteSet","addBack","addBack","addBack","popSmallest","popSmallest","addBack","popSmallest","addBack","popSmallest","popSmallest","addBack","addBack","popSmallest","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","addBack","addBack","addBack","popSmallest","addBack","addBack","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","addBack","addBack","addBack","addBack","addBack","addBack","addBack","addBack","addBack","addBack","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","addBack","popSmallest","addBack","popSmallest","popSmallest","addBack","addBack","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","popSmallest","addBack","addBack","addBack","addBack","addBack","popSmallest","addBack","addBack","addBack","addBack","addBack","addBack","popSmallest","addBack","addBack","addBack","addBack","addBack","addBack","addBack","addBack","addBack","addBack","addBack","addBack","popSmallest","addBack","popSmallest","addBack","popSmallest","addBack","popSmallest","addBack","addBack","addBack","popSmallest","popSmallest","addBack","popSmallest","addBack","addBack","addBack","addBack","popSmallest","addBack","addBack","popSmallest","popSmallest","popSmallest","popSmallest","addBack","addBack","popSmallest","popSmallest","popSmallest","popSmallest","addBack","popSmallest","addBack","addBack","addBack","popSmallest","popSmallest","addBack","popSmallest","addBack","popSmallest","addBack","popSmallest","popSmallest","addBack","addBack","popSmallest","addBack","popSmallest","addBack","addBack","popSmallest","addBack","popSmallest","popSmallest","popSmallest","addBack","addBack","popSmallest","popSmallest","addBack","addBack","popSmallest","popSmallest","addBack","popSmallest","addBack","popSmallest","addBack","popSmallest","popSmallest","addBack","addBack","popSmallest","addBack","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","addBack","popSmallest","addBack","addBack","popSmallest","popSmallest","addBack","popSmallest","addBack","popSmallest","addBack","addBack","popSmallest","addBack","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","addBack","popSmallest","addBack","popSmallest","popSmallest","popSmallest","addBack","addBack","addBack","addBack","popSmallest","addBack","addBack","addBack","popSmallest","addBack","popSmallest","addBack","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","addBack","addBack","addBack","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","addBack","addBack","addBack","addBack","addBack","popSmallest","addBack","popSmallest","popSmallest","addBack","addBack","popSmallest","addBack","addBack","popSmallest","addBack","addBack","addBack","popSmallest","addBack","popSmallest","popSmallest","popSmallest","popSmallest","addBack","addBack","popSmallest","addBack","popSmallest","addBack","popSmallest","popSmallest","popSmallest","addBack","addBack","addBack","popSmallest","addBack","popSmallest","addBack","popSmallest","popSmallest","addBack","popSmallest","popSmallest","addBack","addBack","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","addBack","popSmallest","addBack","addBack","popSmallest","popSmallest","addBack","addBack","addBack","addBack","popSmallest","addBack","addBack","addBack","popSmallest","popSmallest","addBack","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","addBack","addBack","addBack","addBack","addBack","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","addBack","addBack","popSmallest","addBack","popSmallest","addBack","popSmallest","popSmallest","addBack","popSmallest","addBack","addBack","addBack","popSmallest","popSmallest","addBack","addBack","addBack","addBack","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","addBack","popSmallest","addBack","popSmallest","addBack","addBack","addBack","popSmallest","popSmallest","popSmallest","addBack","popSmallest","addBack","addBack","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","addBack","popSmallest","popSmallest","addBack","addBack","popSmallest","popSmallest","addBack","popSmallest","addBack","addBack","addBack","addBack","popSmallest","popSmallest","addBack","addBack","addBack","popSmallest","addBack","popSmallest","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","popSmallest","addBack","addBack","popSmallest","addBack","popSmallest","addBack","popSmallest","addBack","addBack","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","popSmallest","addBack","addBack","addBack","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","popSmallest","addBack","addBack","addBack","addBack","popSmallest","popSmallest","addBack","addBack","addBack","popSmallest","addBack","popSmallest","popSmallest","addBack","popSmallest","addBack","addBack","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","addBack","addBack","addBack","popSmallest","popSmallest","addBack","addBack","popSmallest","addBack","addBack","popSmallest","addBack","popSmallest","addBack","addBack","addBack","addBack","addBack","addBack","popSmallest","popSmallest","addBack","popSmallest","addBack","popSmallest","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","addBack","addBack","addBack","addBack","addBack","popSmallest","popSmallest","popSmallest","addBack","popSmallest","addBack","addBack","addBack","popSmallest","addBack","popSmallest","popSmallest","addBack","addBack","popSmallest","addBack","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","addBack","popSmallest","addBack","popSmallest","popSmallest","popSmallest","popSmallest","addBack","popSmallest","addBack","addBack","addBack","addBack","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","addBack","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","addBack","popSmallest","addBack","addBack","popSmallest","addBack","popSmallest","addBack","addBack","addBack","addBack","addBack","addBack","addBack","popSmallest","popSmallest","addBack","addBack","popSmallest","addBack","addBack","popSmallest","addBack","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","addBack","addBack","popSmallest","popSmallest","addBack","addBack","addBack","popSmallest","addBack","popSmallest","popSmallest","popSmallest","addBack","addBack","popSmallest","addBack","addBack","addBack","addBack","popSmallest","popSmallest","addBack","popSmallest","addBack","popSmallest","addBack","addBack","addBack","addBack","addBack","addBack","addBack","popSmallest","popSmallest","popSmallest","popSmallest","addBack","addBack","addBack","addBack","popSmallest","addBack","addBack","popSmallest","popSmallest","addBack","addBack","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","popSmallest","addBack","popSmallest","popSmallest","addBack","addBack","popSmallest","addBack","popSmallest","addBack","popSmallest","popSmallest","addBack","addBack","popSmallest","popSmallest","addBack","popSmallest","addBack","addBack","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","popSmallest","addBack","addBack","addBack","popSmallest","popSmallest","addBack","addBack","addBack","addBack","popSmallest","popSmallest","popSmallest","addBack","addBack","addBack","addBack","addBack","addBack","addBack","popSmallest","addBack","popSmallest","addBack","addBack","popSmallest","popSmallest","addBack","addBack","addBack","addBack","addBack","addBack","popSmallest","addBack","addBack","addBack"]
        [[],[84],[550],[88],[],[],[152],[],[413],[],[],[359],[33],[],[321],[],[],[],[],[],[],[],[],[827],[839],[618],[165],[],[89],[783],[708],[],[],[],[],[],[],[816],[],[],[],[],[],[],[869],[34],[707],[841],[957],[485],[527],[109],[254],[799],[442],[],[],[],[318],[],[],[980],[],[202],[],[],[993],[119],[],[],[188],[],[],[],[855],[],[],[],[],[],[630],[],[],[],[],[435],[67],[681],[396],[73],[],[218],[179],[868],[157],[435],[334],[],[514],[883],[641],[325],[60],[926],[67],[667],[709],[134],[763],[534],[],[899],[],[389],[],[24],[],[769],[473],[51],[],[],[479],[],[471],[991],[787],[288],[],[599],[455],[],[],[],[],[785],[991],[],[],[],[],[663],[],[990],[484],[246],[],[],[356],[],[618],[],[90],[],[],[27],[466],[],[493],[],[579],[170],[],[42],[],[],[],[645],[710],[],[],[458],[464],[],[],[418],[],[753],[],[441],[],[],[820],[395],[],[731],[19],[],[],[],[],[],[],[],[],[941],[917],[],[865],[537],[],[],[52],[],[604],[],[963],[862],[],[162],[],[],[89],[],[],[],[],[],[],[115],[691],[],[807],[],[],[],[529],[846],[529],[255],[],[799],[395],[759],[],[717],[],[728],[483],[],[],[],[],[],[],[],[],[140],[462],[537],[287],[],[],[],[180],[],[],[],[305],[856],[636],[561],[178],[],[660],[],[],[703],[578],[],[902],[99],[],[477],[259],[768],[],[726],[],[],[],[],[68],[463],[],[984],[],[511],[],[],[],[401],[106],[91],[],[671],[],[233],[],[],[94],[],[],[777],[451],[],[],[],[868],[],[],[133],[],[249],[128],[],[],[942],[991],[406],[886],[],[55],[470],[247],[],[],[943],[68],[],[],[],[],[],[],[],[],[108],[488],[685],[315],[832],[952],[],[],[208],[],[],[],[460],[],[],[],[189],[437],[],[642],[],[316],[],[],[356],[],[138],[628],[520],[],[],[771],[42],[549],[751],[17],[],[],[],[],[],[],[13],[],[],[],[270],[],[210],[],[764],[27],[419],[],[],[],[957],[],[996],[546],[32],[],[],[],[],[],[10],[412],[],[],[690],[220],[],[],[873],[],[219],[296],[647],[936],[],[],[56],[946],[897],[],[579],[],[],[],[],[333],[],[],[],[],[92],[212],[],[80],[],[289],[],[494],[907],[],[],[512],[],[],[],[],[552],[745],[874],[633],[],[],[],[],[],[656],[],[989],[479],[797],[807],[],[],[509],[280],[591],[],[3],[],[],[16],[],[796],[726],[],[],[125],[],[],[],[217],[908],[58],[],[],[432],[692],[],[23],[512],[],[554],[],[249],[953],[662],[143],[808],[627],[],[],[255],[],[952],[],[],[],[],[467],[],[],[852],[41],[302],[730],[644],[],[],[],[383],[],[510],[540],[194],[],[558],[],[],[676],[662],[],[940],[],[],[],[312],[],[],[93],[],[434],[],[],[],[],[150],[],[338],[575],[731],[710],[610],[],[],[],[],[],[],[],[938],[563],[],[],[],[734],[],[],[245],[],[],[],[],[],[173],[],[],[],[],[439],[],[],[],[451],[],[],[],[],[924],[],[],[],[],[],[33],[498],[],[80],[296],[],[391],[],[39],[522],[487],[119],[940],[999],[337],[],[],[406],[696],[],[493],[642],[],[841],[],[],[369],[],[],[],[],[],[396],[],[],[20],[328],[],[],[158],[751],[686],[],[233],[],[],[],[595],[984],[],[676],[101],[75],[397],[],[],[128],[],[242],[],[76],[526],[956],[377],[477],[957],[335],[],[],[],[],[622],[815],[381],[490],[],[908],[231],[],[],[504],[767],[419],[],[],[],[],[],[],[],[],[],[23],[],[408],[],[],[760],[730],[],[319],[],[605],[],[],[939],[638],[],[],[250],[],[513],[903],[],[],[251],[],[],[],[],[],[],[649],[5],[152],[],[],[716],[873],[120],[153],[],[],[],[312],[747],[533],[168],[289],[44],[168],[],[778],[],[971],[883],[],[],[901],[886],[931],[529],[71],[186],[],[805],[919],[670]]

        output:
        [null,null,null,null,1,2,null,3,null,4,5,null,null,6,null,7,8,9,10,11,12,13,14,null,null,null,null,15,null,null,null,16,17,18,19,20,21,null,22,23,24,25,26,27,null,null,null,null,null,null,null,null,null,null,null,28,29,30,null,31,32,null,33,null,34,35,null,null,36,37,null,38,39,40,null,41,42,43,44,45,null,46,47,48,49,null,null,null,null,null,50,null,null,null,null,null,null,51,null,null,null,null,null,null,null,null,null,null,null,null,52,null,53,null,54,null,24,null,null,null,51,55,null,56,null,null,null,null,57,null,null,58,59,60,61,null,null,62,63,64,65,null,66,null,null,null,67,68,null,69,null,70,null,71,72,null,null,27,null,73,null,null,74,null,42,75,76,null,null,77,78,null,null,79,80,null,81,null,82,null,83,84,null,null,85,null,null,19,86,87,88,89,90,91,92,null,null,93,null,null,94,95,null,52,null,96,null,null,97,null,98,99,null,89,100,101,102,103,104,null,null,105,null,106,107,108,null,null,null,null,109,null,null,null,110,null,111,null,null,112,113,114,115,116,117,118,119,null,null,null,null,120,121,122,null,123,124,125,null,null,null,null,null,126,null,127,128,null,null,129,null,null,99,null,null,null,130,null,131,132,133,134,null,null,68,null,135,null,136,137,138,null,null,null,91,null,106,null,139,140,null,94,141,null,null,142,143,144,null,145,146,null,133,null,null,128,147,null,null,null,null,148,null,null,null,55,149,null,null,68,150,151,152,153,154,155,156,null,null,null,null,null,null,108,157,null,158,159,160,null,161,162,163,null,null,164,null,165,null,166,167,null,168,null,null,null,138,169,null,null,null,null,null,17,42,170,171,172,173,null,13,174,175,null,176,null,177,null,null,null,27,178,179,null,180,null,null,null,32,181,182,183,184,null,null,10,185,null,null,186,187,null,188,null,null,null,null,189,190,null,null,null,56,null,191,192,193,194,null,195,196,197,198,null,null,92,null,80,null,199,null,null,200,201,null,202,203,204,205,null,null,null,null,206,207,208,209,210,null,211,null,null,null,null,212,213,null,null,null,214,null,3,215,null,16,null,null,216,217,null,125,218,219,null,null,null,58,217,null,null,220,null,null,23,null,221,null,null,null,null,null,null,143,222,null,223,null,224,225,226,227,null,228,229,null,null,null,null,null,41,230,231,null,232,null,null,null,194,null,233,234,null,null,235,null,236,237,238,null,239,240,null,93,null,241,242,243,244,null,150,null,null,null,null,null,245,246,247,248,249,250,251,null,null,252,253,254,null,255,256,null,245,257,258,259,260,null,173,261,262,263,null,264,265,266,null,267,268,269,270,null,271,272,273,274,275,null,null,33,null,null,80,null,276,null,null,null,null,null,null,null,39,119,null,null,277,null,null,278,null,279,280,null,281,282,283,284,285,null,286,287,null,null,20,288,null,null,null,158,null,233,289,290,null,null,291,null,null,null,null,75,101,null,128,null,242,null,null,null,null,null,null,null,76,292,293,294,null,null,null,null,295,null,null,231,296,null,null,null,297,298,299,300,301,302,303,304,305,null,23,null,306,307,null,null,308,null,309,null,310,311,null,null,312,313,null,250,null,null,314,315,null,251,316,317,318,319,320,null,null,null,5,152,null,null,null,null,120,153,321,null,null,null,null,null,null,null,44,null,168,null,null,168,289,null,null,null,null,null,null,71,null,null,null]
        expected:
        [null,null,null,null,1,2,null,3,null,4,5,null,null,6,null,7,8,9,10,11,12,13,14,null,null,null,null,15,null,null,null,16,17,18,19,20,21,null,22,23,24,25,26,27,null,null,null,null,null,null,null,null,null,null,null,28,29,30,null,31,32,null,33,null,34,35,null,null,36,37,null,38,39,40,null,41,42,43,44,45,null,46,47,48,49,null,null,null,null,null,50,null,null,null,null,null,null,51,null,null,null,null,null,null,null,null,null,null,null,null,52,null,53,null,54,null,24,null,null,null,51,55,null,56,null,null,null,null,57,null,null,58,59,60,61,null,null,62,63,64,65,null,66,null,null,null,67,68,null,69,null,70,null,71,72,null,null,27,null,73,null,null,74,null,42,75,76,null,null,77,78,null,null,79,80,null,81,null,82,null,83,84,null,null,85,null,null,19,86,87,88,89,90,91,92,null,null,93,null,null,94,95,null,52,null,96,null,null,97,null,98,99,null,89,100,101,102,103,104,null,null,105,null,106,107,108,null,null,null,null,109,null,null,null,110,null,111,null,null,112,113,114,115,116,117,118,119,null,null,null,null,120,121,122,null,123,124,125,null,null,null,null,null,126,null,127,128,null,null,129,null,null,99,null,null,null,130,null,131,132,133,134,null,null,68,null,135,null,136,137,138,null,null,null,91,null,106,null,139,140,null,94,141,null,null,142,143,144,null,145,146,null,133,null,null,128,147,null,null,null,null,148,null,null,null,55,149,null,null,68,150,151,152,153,154,155,156,null,null,null,null,null,null,108,157,null,158,159,160,null,161,162,163,null,null,164,null,165,null,166,167,null,168,null,null,null,138,169,null,null,null,null,null,17,42,170,171,172,173,null,13,174,175,null,176,null,177,null,null,null,27,178,179,null,180,null,null,null,32,181,182,183,184,null,null,10,185,null,null,186,187,null,188,null,null,null,null,189,190,null,null,null,56,null,191,192,193,194,null,195,196,197,198,null,null,92,null,80,null,199,null,null,200,201,null,202,203,204,205,null,null,null,null,206,207,208,209,210,null,211,null,null,null,null,212,213,null,null,null,214,null,3,215,null,16,null,null,216,217,null,125,218,219,null,null,null,58,217,null,null,220,null,null,23,null,221,null,null,null,null,null,null,143,222,null,223,null,224,225,226,227,null,228,229,null,null,null,null,null,41,230,231,null,232,null,null,null,194,null,233,234,null,null,235,null,236,237,238,null,239,240,null,93,null,241,242,243,244,null,150,null,null,null,null,null,245,246,247,248,249,250,251,null,null,252,253,254,null,255,256,null,245,257,258,259,260,null,173,261,262,263,null,264,265,266,null,267,268,269,270,null,271,272,273,274,275,null,null,33,null,null,80,null,276,null,null,null,null,null,null,null,39,119,null,null,277,null,null,278,null,279,280,null,281,282,283,284,285,null,286,287,null,null,20,288,null,null,null,158,null,233,289,290,null,null,291,null,null,null,null,75,101,null,128,null,242,null,null,null,null,null,null,null,76,292,293,294,null,null,null,null,295,null,null,231,296,null,null,null,297,298,299,300,301,302,303,304,305,null,23,null,306,307,null,null,308,null,309,null,310,311,null,null,312,313,null,250,null,null,314,315,null,251,316,317,318,319,320,null,null,null,5,152,null,null,null,null,120,153,321,null,null,null,null,null,null,null,44,null,168,null,null,289,312,null,null,null,null,null,null,71,null,null,null]
         */
        var set = new SmallestNumberInInfiniteSetProblem.SmallestInfiniteSet();

        String[] commands = new String[]{
                "SmallestInfiniteSet", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "addBack", "popSmallest", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "addBack", "addBack", "popSmallest", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "popSmallest", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "addBack", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "addBack", "addBack", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "addBack", "popSmallest", "addBack", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "addBack", "popSmallest", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "addBack", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "addBack", "popSmallest", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "popSmallest", "addBack", "popSmallest", "addBack", "addBack", "popSmallest", "popSmallest", "addBack", "addBack", "addBack", "addBack", "addBack", "addBack", "popSmallest", "addBack", "addBack", "addBack"
        };
        Integer[] parameters = new Integer[]{
                null, 84, 550, 88, null, null, 152, null, 413, null, null, 359, 33, null, 321, null, null, null, null, null, null, null, null, 827, 839, 618, 165, null, 89, 783, 708, null, null, null, null, null, null, 816, null, null, null, null, null, null, 869, 34, 707, 841, 957, 485, 527, 109, 254, 799, 442, null, null, null, 318, null, null, 980, null, 202, null, null, 993, 119, null, null, 188, null, null, null, 855, null, null, null, null, null, 630, null, null, null, null, 435, 67, 681, 396, 73, null, 218, 179, 868, 157, 435, 334, null, 514, 883, 641, 325, 60, 926, 67, 667, 709, 134, 763, 534, null, 899, null, 389, null, 24, null, 769, 473, 51, null, null, 479, null, 471, 991, 787, 288, null, 599, 455, null, null, null, null, 785, 991, null, null, null, null, 663, null, 990, 484, 246, null, null, 356, null, 618, null, 90, null, null, 27, 466, null, 493, null, 579, 170, null, 42, null, null, null, 645, 710, null, null, 458, 464, null, null, 418, null, 753, null, 441, null, null, 820, 395, null, 731, 19, null, null, null, null, null, null, null, null, 941, 917, null, 865, 537, null, null, 52, null, 604, null, 963, 862, null, 162, null, null, 89, null, null, null, null, null, null, 115, 691, null, 807, null, null, null, 529, 846, 529, 255, null, 799, 395, 759, null, 717, null, 728, 483, null, null, null, null, null, null, null, null, 140, 462, 537, 287, null, null, null, 180, null, null, null, 305, 856, 636, 561, 178, null, 660, null, null, 703, 578, null, 902, 99, null, 477, 259, 768, null, 726, null, null, null, null, 68, 463, null, 984, null, 511, null, null, null, 401, 106, 91, null, 671, null, 233, null, null, 94, null, null, 777, 451, null, null, null, 868, null, null, 133, null, 249, 128, null, null, 942, 991, 406, 886, null, 55, 470, 247, null, null, 943, 68, null, null, null, null, null, null, null, null, 108, 488, 685, 315, 832, 952, null, null, 208, null, null, null, 460, null, null, null, 189, 437, null, 642, null, 316, null, null, 356, null, 138, 628, 520, null, null, 771, 42, 549, 751, 17, null, null, null, null, null, null, 13, null, null, null, 270, null, 210, null, 764, 27, 419, null, null, null, 957, null, 996, 546, 32, null, null, null, null, null, 10, 412, null, null, 690, 220, null, null, 873, null, 219, 296, 647, 936, null, null, 56, 946, 897, null, 579, null, null, null, null, 333, null, null, null, null, 92, 212, null, 80, null, 289, null, 494, 907, null, null, 512, null, null, null, null, 552, 745, 874, 633, null, null, null, null, null, 656, null, 989, 479, 797, 807, null, null, 509, 280, 591, null, 3, null, null, 16, null, 796, 726, null, null, 125, null, null, null, 217, 908, 58, null, null, 432, 692, null, 23, 512, null, 554, null, 249, 953, 662, 143, 808, 627, null, null, 255, null, 952, null, null, null, null, 467, null, null, 852, 41, 302, 730, 644, null, null, null, 383, null, 510, 540, 194, null, 558, null, null, 676, 662, null, 940, null, null, null, 312, null, null, 93, null, 434, null, null, null, null, 150, null, 338, 575, 731, 710, 610, null, null, null, null, null, null, null, 938, 563, null, null, null, 734, null, null, 245, null, null, null, null, null, 173, null, null, null, null, 439, null, null, null, 451, null, null, null, null, 924, null, null, null, null, null, 33, 498, null, 80, 296, null, 391, null, 39, 522, 487, 119, 940, 999, 337, null, null, 406, 696, null, 493, 642, null, 841, null, null, 369, null, null, null, null, null, 396, null, null, 20, 328, null, null, 158, 751, 686, null, 233, null, null, null, 595, 984, null, 676, 101, 75, 397, null, null, 128, null, 242, null, 76, 526, 956, 377, 477, 957, 335, null, null, null, null, 622, 815, 381, 490, null, 908, 231, null, null, 504, 767, 419, null, null, null, null, null, null, null, null, null, 23, null, 408, null, null, 760, 730, null, 319, null, 605, null, null, 939, 638, null, null, 250, null, 513, 903, null, null, 251, null, null, null, null, null, null, 649, 5, 152, null, null, 716, 873, 120, 153, null, null, null, 312, 747, 533, 168, 289, 44, 168, null, 778, null, 971, 883, null, null, 901, 886, 931, 529, 71, 186, null, 805, 919, 670
        };
        Integer[] expected = new Integer[]{
                null, null, null, null, 1, 2, null, 3, null, 4, 5, null, null, 6, null, 7, 8, 9, 10, 11, 12, 13, 14, null, null, null, null, 15, null, null, null, 16, 17, 18, 19, 20, 21, null, 22, 23, 24, 25, 26, 27, null, null, null, null, null, null, null, null, null, null, null, 28, 29, 30, null, 31, 32, null, 33, null, 34, 35, null, null, 36, 37, null, 38, 39, 40, null, 41, 42, 43, 44, 45, null, 46, 47, 48, 49, null, null, null, null, null, 50, null, null, null, null, null, null, 51, null, null, null, null, null, null, null, null, null, null, null, null, 52, null, 53, null, 54, null, 24, null, null, null, 51, 55, null, 56, null, null, null, null, 57, null, null, 58, 59, 60, 61, null, null, 62, 63, 64, 65, null, 66, null, null, null, 67, 68, null, 69, null, 70, null, 71, 72, null, null, 27, null, 73, null, null, 74, null, 42, 75, 76, null, null, 77, 78, null, null, 79, 80, null, 81, null, 82, null, 83, 84, null, null, 85, null, null, 19, 86, 87, 88, 89, 90, 91, 92, null, null, 93, null, null, 94, 95, null, 52, null, 96, null, null, 97, null, 98, 99, null, 89, 100, 101, 102, 103, 104, null, null, 105, null, 106, 107, 108, null, null, null, null, 109, null, null, null, 110, null, 111, null, null, 112, 113, 114, 115, 116, 117, 118, 119, null, null, null, null, 120, 121, 122, null, 123, 124, 125, null, null, null, null, null, 126, null, 127, 128, null, null, 129, null, null, 99, null, null, null, 130, null, 131, 132, 133, 134, null, null, 68, null, 135, null, 136, 137, 138, null, null, null, 91, null, 106, null, 139, 140, null, 94, 141, null, null, 142, 143, 144, null, 145, 146, null, 133, null, null, 128, 147, null, null, null, null, 148, null, null, null, 55, 149, null, null, 68, 150, 151, 152, 153, 154, 155, 156, null, null, null, null, null, null, 108, 157, null, 158, 159, 160, null, 161, 162, 163, null, null, 164, null, 165, null, 166, 167, null, 168, null, null, null, 138, 169, null, null, null, null, null, 17, 42, 170, 171, 172, 173, null, 13, 174, 175, null, 176, null, 177, null, null, null, 27, 178, 179, null, 180, null, null, null, 32, 181, 182, 183, 184, null, null, 10, 185, null, null, 186, 187, null, 188, null, null, null, null, 189, 190, null, null, null, 56, null, 191, 192, 193, 194, null, 195, 196, 197, 198, null, null, 92, null, 80, null, 199, null, null, 200, 201, null, 202, 203, 204, 205, null, null, null, null, 206, 207, 208, 209, 210, null, 211, null, null, null, null, 212, 213, null, null, null, 214, null, 3, 215, null, 16, null, null, 216, 217, null, 125, 218, 219, null, null, null, 58, 217, null, null, 220, null, null, 23, null, 221, null, null, null, null, null, null, 143, 222, null, 223, null, 224, 225, 226, 227, null, 228, 229, null, null, null, null, null, 41, 230, 231, null, 232, null, null, null, 194, null, 233, 234, null, null, 235, null, 236, 237, 238, null, 239, 240, null, 93, null, 241, 242, 243, 244, null, 150, null, null, null, null, null, 245, 246, 247, 248, 249, 250, 251, null, null, 252, 253, 254, null, 255, 256, null, 245, 257, 258, 259, 260, null, 173, 261, 262, 263, null, 264, 265, 266, null, 267, 268, 269, 270, null, 271, 272, 273, 274, 275, null, null, 33, null, null, 80, null, 276, null, null, null, null, null, null, null, 39, 119, null, null, 277, null, null, 278, null, 279, 280, null, 281, 282, 283, 284, 285, null, 286, 287, null, null, 20, 288, null, null, null, 158, null, 233, 289, 290, null, null, 291, null, null, null, null, 75, 101, null, 128, null, 242, null, null, null, null, null, null, null, 76, 292, 293, 294, null, null, null, null, 295, null, null, 231, 296, null, null, null, 297, 298, 299, 300, 301, 302, 303, 304, 305, null, 23, null, 306, 307, null, null, 308, null, 309, null, 310, 311, null, null, 312, 313, null, 250, null, null, 314, 315, null, 251, 316, 317, 318, 319, 320, null, null, null, 5, 152, null, null, null, null, 120, 153, 321, null, null, null, null, null, null, null, 44, null, 168, null, null, 289, 312, null, null, null, null, null, null, 71, null, null, null
        };

        for (int i = 1; i < commands.length; i++) {
            String command = commands[i];
            Integer param = parameters[i];
            Integer expect = expected[i];

            if (command.equals("addBack")) {
                set.addBack(param);
            } else if (command.equals("popSmallest")) {
                int result = set.popSmallest();
                assertEquals(expect, result, "iteration: " + i);
            } else {
                fail();
            }
        }
    }
}

