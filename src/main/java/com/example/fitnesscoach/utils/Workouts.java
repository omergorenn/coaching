package com.example.fitnesscoach.utils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
public enum Workouts {
    BENCH_PRESS("Göğüs kaslarını çalıştırır","Sırtüstü bir bench'in üzerine yatın ve bir barbell'i göğüs seviyenizde tutun. Kollarınızı yavaşça bükün ve göğsünüze indirin."),
    DEAD_LIFT("Sırt, bacak ve kalça kaslarını çalıştırır","Ayakları omuz genişliği kadar açarak, kalçaları geriye doğru iterek ve sırtınızı düz tutarak bir barı kaldırın."),
    SQUAD("Bacak kaslarını ve glutes'leri çalıştırır.","Ayakları omuz genişliği kadar açarak, kalçaları geriye doğru iterek ve sırtınızı düz tutarak çömelin, sonra tekrar yavaşça yükselin."),
    LUNGES("Bacak kaslarını ve glutes'leri çalıştırır.","Ayakları omuz genişliği kadar açarak, bir adım ileri atın ve ön dizinizi 90 derece bükün, ardından tekrar başlangıç pozisyonuna geri dönün."),
    PULL_UPS("Sırt kaslarını ve biceps'leri çalıştırır.","Bir barın altında asılı kalın ve kollarınızı çekerek çenenizi barın üzerine getirin, sonra yavaşça aşağı doğru indirin."),
    SHOULDER_PRESS("Omuz kaslarını çalıştırır.","Omuz genişliğinde ayaklarla ayakta durun ve bir dambıl veya barbell'ı omuzlarınızın üzerinde tutun. Kollarınızı yukarı doğru kaldırın, sonra tekrar başlangıç pozisyonuna indirin."),
    BICEP_CURLS("Biceps kaslarını çalıştırır.","Bir dambıl veya barbell'ı elinizde tutarak, kolunuzu dirseğinizden kıvırarak bilek seviyenize kadar kaldırın. Ardından yavaşça kolu başlangıç pozisyonuna geri indirin."),
    TRICEP_DIPS("Triceps kaslarını çalıştırır.","Bir sandalyeye veya bench'e sırtınızı dayayarak ayaklarınızı öne doğru uzatın. Ellerinizle benchi tutun ve kollarınızı bükerek kalçanızı yere doğru indirin, sonra kollarınızı gererek başlangıç pozisyonuna dönün."),
    BOX_JUMPS("Bacak kaslarını ve kardiyovasküler dayanıklılığı arttırır.","Bir kutunun önünde ayakta durun ve kutuya sıçrayın."),
    CRUNCHES("Karın kaslarını çalıştırır.","Sırtüstü yere yatın, dizlerinizi bükerek ayaklarınızı yere basın. Ellerinizi ensenizin arkasında birleştirin ve üst vücudunuzu yukarı doğru kaldırın, sonra yavaşça başlangıç pozisyonuna geri dönün."),
    RUSSIAN_TWITS("Karın kaslarını çalıştırır.","Oturun ve ayaklarınızı yerden kaldırın, dizlerinizi bükün. Ellerinizi göğsünüzün önünde birleştirin ve üst vücudunuzu yavaşça sağa ve sola çevirin."),
    SIDE_LUNGES("Bacak kaslarını ve glutes'leri çalıştırır." ,"Ayakları omuz genişliği kadar açarak, bir adım yan tarafa atın ve bacaklarınızı bükün, ardından tekrar başlangıç pozisyonuna geri dönün."),
    PUSH_UPS("Göğüs, triceps ve omuz kaslarını çalıştırır.","Düz bir zemine yüzüstü yatın ve ellerinizi omuz genişliğinde yerleştirin. Ayaklarınızı geriye doğru iterek plank pozisyonuna alın ve kollarınızı bükerek göğsünüzü yere yaklaştırın, sonra kollarınızı gererek başlangıç pozisyonuna dönün."),
    BURPEES("Tüm vücut kaslarını çalıştırır ve kardiyovasküler dayanıklılığı arttırır. ","Ayakta durun, ardından yere çömelin ve ellerinizi yere koyun. Ayaklarınızı geriye doğru iterek plank pozisyonuna geçin, ardından ayaklarınızı tekrar öne doğru getirin ve ayağa kalkın."),
    LEG_PRESS("Bacak kaslarını çalıştırır. ","Bir leg press makinesinde oturun ve ayaklarınızı platforma yerleştirin. Ayaklarınızı yavaşça iterek platformu yukarı doğru kaldırın, sonra tekrar aşağı indirin."),
    LAT_PULLDOWNS("Sırt kaslarını çalıştırır.","Bir lat pulldown makinesinde oturun ve bir çubuğu ellerinizle tutun. Çubuğu yavaşça çekerek sırtınızı ve biceps'lerinizi çalıştırın."),
    LEG_EXTENSIONS("Diz kaslarını çalıştırır.","Bir leg extension makinesine oturun ve ayak bileklerinize ağırlıkları takın. Ayaklarınızı yavaşça yukarı doğru uzatarak diz kaslarınızı sıkın, sonra yavaşça başlangıç pozisyonuna geri dönün."),
    SEATED_ROW("Sırt kaslarını çalıştırır.","Bir seated row makinesinde oturun ve çubuğu ellerinizle tutun. Çubuğu yavaşça çekerek sırtınızı ve biceps'lerinizi çalıştırın, sonra yavaşça başlangıç pozisyonuna geri dönün."),
    SIDE_PLANK("Karın kaslarını ve oblik kaslarını çalıştırır. ","Yan yatın ve dirseklerinizin üzerine dayanın. Vücudunuzu düz bir çizgi halinde tutarak yan plank pozisyonunu alın ve birkaç saniye boyunca pozisyonda kalın, sonra diğer taraf için tekrarlayın."),
    JUMPING_JACKS("Kardiyovasküler dayanıklılığı arttırır.","Ayakta durun ve ayaklarınızı birleştirin, ardından aynı anda ayaklarınızı açarak kollarınızı başınızın üzerinde çaprazlama kaldırın. Tekrar başlangıç pozisyonuna dönün."),
    STANDING_CALF_RAISES("Bacak kaslarını çalıştırır. "," Ayaklarınızı omuz genişliği kadar açın ve ellerinizi kalçalarınızın üzerine koyun. Ayaklarınızın üzerine yavaşça kalkın, topuklarınızı zemine yapıştırın ve yavaşça başlangıç pozisyonuna geri dönün."),
    MOUNTAIN_CLIMBERS("Kardiyovasküler dayanıklılığı arttırır ve tüm vücudu çalıştırır.","Yere yüzüstü pozisyonda gelin ve kollarınızı omuz hizasında açın. Sırtınız düz bir şekilde tutarak ayaklarınızı sırayla geriye doğru çekin, sanki bir dağa tırmanıyormuş gibi."),
    REVERSE_CRUNCHES("Alt karın kaslarını çalıştırır. ","Sırt üstü yere uzanın ve dizlerinizi bükerek ayaklarınızı yerleştirin. Kalçanızı kaldırarak alt karın kaslarınızı sıkın, sonra başlangıç pozisyonuna geri dönün."),
    BICYLE_CRUNCHES("Karın kaslarını ve oblik kaslarını çalıştırır.","Sırt üstü yere uzanın ve ellerinizi başınızın arkasında birleştirin. Dizlerinizi bükerek ayaklarınızı yere koyun. Sağ dirseğinizi sol dizinize doğru getirin, ardından sol dirseğinizi sağ dizinize doğru getirin."),
    LATERAL_RAISES("Omuz kaslarını çalıştırır.","Dumbbell'ları her iki elinize alın ve yanlarınızda tutun. Kollarınızı yavaşça yukarı doğru kaldırarak omuz kaslarınızı sıkın, sonra yavaşça başlangıç pozisyonuna geri dönün."),
    SUPERMAN("Sırt ve bel kaslarını çalıştırır.","Yere yüzüstü pozisyonda uzanın, ellerinizi başınızın yanına yerleştirin. Sırtınızı ve bacaklarınızı yavaşça yukarı kaldırarak, birkaç saniye bu pozisyonda kalın, sonra tekrar başlangıç pozisyonuna dönün."),
    LAT_PULLDOWN("Sırt, omuz ve biceps kaslarını çalıştırır.","Geniş bir tutamakla donatılmış bir çekme makinesinde durun ve çekme barını yavaşça çekin, omuzlarınızı ve sırtınızı gererek."),
    CALF_RAISES("Calf kaslarını çalıştırır.",""),
    KETTLEBENG_SWING("Sırt, kalça ve karın kaslarını çalıştırır.","Bir kettlebell tutun ve ayaklarınızı omuz genişliği kadar açın. Kettlebell'i yavaşça yere doğru indirin, ardından sırtınızı düz tutarak hızla kaldırın."),
    ROWS("Sırt ve biceps kaslarını çalıştırır.","Barbell ya da dumbbell kavranır, vücut yatay pozisyonda ve kollar yere paralel konumda çekilir."),
    SPLIT_SQUATS("Bacak kaslarını güçlendirir.", "Ayaklarınızı omuz genişliğinde açın. Sağ ayağınızı bir adım ileriye doğru atın ve sol dizinizi yere doğru indirin. Daha sonra ayağa kalkın ve diğer bacağınızla aynı hareketi tekrarlayın."),
    HIP_THRUSTS("Kalça kaslarını güçlendirir.", "Sırt üstü yere yatın ve ayaklarınızı kalçanıza yakın bir konuma getirin. Kalçanızı kaldırarak, dizlerinizi yukarı doğru itin. Bu pozisyonda birkaç saniye bekleyin ve tekrar indirin."),
    FRONT_SQUATS("Ön bacak kaslarını güçlendirir.", "Barbell'i omuzlarınızın üstüne yerleştirin. Ayaklarınızı omuz genişliğinde açın ve dizlerinizi bükerek squat yapın."),
    GOOD_MORNINGS("Bel ve sırt kaslarını güçlendirir.", "Barbell'i omuzlarınızın üstüne yerleştirin. Ayaklarınızı omuz genişliğinde açın ve sırtınızı düz tutarak öne doğru eğilin."),
    SUMO_SQUATS("İç bacak kaslarını güçlendirir.", "Ayaklarınızı daha geniş bir açıya getirin ve ayak uçlarınızı hafifçe dışa doğru açın. Dizlerinizi bükerek squat yapın."),
    BULGARIAN_SPLIT_SQUATS("Bacak kaslarını güçlendirir.", "Bir adım öne atlayın ve arkadaki bacağınızı yukarı kaldırın. Dizlerinizi bükerek squat yapın."),
    GOBLET_SQUATS("Bacak ve kalça kaslarını güçlendirir.", "Dumbbell'i iki elinizle tutun ve göğsünüzün önünde tutun. Ayaklarınızı omuz genişliğinde açın ve squat yapın."),
    OVERHEAD_SQUATS("Tüm vücudu çalıştırır.", "Barbell'i başınızın üstünde tutun ve ayaklarınızı omuz genişliğinde açın. Squat yapın ve barbell'i başınızın üstünde tutun."),
    PISTOL_SQUATS("Bacak kaslarını güçlendirir.", "Tek bacakla squat yapın. Diğer bacağınızı ileri doğru uzatın ve squat yaparken havada tutun."),
    STABILITY_BALL_LEG_CURLS("Arka bacak kaslarını güçlendirir.", "Sırt üstü yere yatın ve topuğunuzu bir stability ball'a koyun. Kalçanızı kaldırarak topuğunuzu topa doğru çekin. Ardından ayağınızı yavaşça başlangıç pozisyonuna getirin.")
    STEP_DOWNS("Kalça kaslarını çalıştırır.", "Bir adım yüksekliğinde bir bankın önünde durun ve bir ayağınızı aşağıya doğru indirin. Diğer ayağınızı kullanmadan squat yapın ve tekrar yavaşça yukarı çıkın."),
    BARBELL ROWS ("Sırt, omuz, bacak, ve kolları çalıştırır."," Barbell'ı tutarak beliniz bükülecek ve dirsekleriniz bükülü olarak ağırlığı kendinize doğru çekin. Sonra kontrollü bir şekilde bırakın.")
    INCLINE_BENCH_ROWS ("Sırt kaslarınızı hedefler."," İncline bench üzerine yatarak dumbbell'ı ellerinize alın ve göğsünüze doğru çekin. Sonra tekrar indirin."),
    DUMBBELL_ROWS ("Sırt, omuz, ve kolları çalıştırır."," Dumbbell'ı tek elinizle alın ve öne doğru eğilerek çeneniz ile aynı seviyeye getirin. Sonra ağırlığı bırakın."),
    KETTLEBELL_ROWS ("Sırt, omuz, ve kolları çalıştırır."," Kettlebell'ı tek elinizle alın ve vücudunuzu öne doğru eğerek sırtınızı düzleştirin. Sonra ağırlığı bırakın."),
    LANDMINE_ROWS ("Sırt, omuz, ve kolları hedefler."," Barbell'ı bir köşede sabitleyin ve tek elle alarak kaldırın. Sonra ağırlığı bırakın."),
    PRONE_INVERTED_ROWS ("Sırt, omuz, ve kolları hedefler."," Yere yüzüstü yatın ve bir çubukla kendinizi çekin. Sonra tekrar bırakın."),
    SEATED_CABLE_ROWS ("Sırt, omuz, ve kolları çalıştırır."," Kablo makinesine oturun ve iki elinizle kabloyu çekin. Sonra kontrollü bir şekilde bırakın."),
    HAMMER_CURLS ("Biceps kaslarını hedefler."," Dumbbell'ı tutun ve dirseklerinizi sabit tutarak bileklerinizi kaldırın. Sonra tekrar indirin."),
    PREACHER_CURLS ("Biceps kaslarını hedefler."," Preacher bench üzerine oturarak barbell'ı ellerinizle tutun ve dirseklerinizi sabit tutarak bileklerinizi kaldırın. Sonra tekrar indirin."),
    CABLE_CURLS("Biceps kaslarını çalıştırır.", "Kabloları bir makaraya takın ve her elinize bir tutacak bağlayın. Dirseklerinizi yanınıza yapışık tutarak, avuç içlerinizi yukarı doğru çevirerek tutacakları omuz seviyesine kadar kaldırın ve tekrar yavaşça indirin."),
    PLANK("Karın kaslarını, sırt kaslarını ve omuzları çalıştırır.","Düz bir zemine yüzüstü yatın ve dirseklerinizin üzerine dayanın. Ayaklarınızı geriye doğru iterek plank pozisyonunu alın. Vücudunuzu düz bir çizgi halinde tutun ve birkaç saniye boyunca pozisyonda kalın."),
    DUMBBELL_FLYS("Göğüs kaslarını çalıştırır.", "Bir çift hafif dambıl alın ve sırtüstü uzanın. Dambılları göğüs hizasında tutun ve kollarınızı yavaşça açarak yanlara doğru yayın. Kollarınızın yere paralel olmasına dikkat edin ve tekrar yavaşça kollarınızı göğsünüze doğru çekin.")
    RESISTANCE_BAND_PULL_APARTS("Sırt kaslarını çalıştırır.", "Dirseklerinizi düz tutarak her iki elinize bir direnç bandı alın. Bandı göğsünüzün önünde tutun ve kollarınızı yavaşça yanlara doğru açın. Bandı kollarınızın arkasında birleştirin ve tekrar yavaşça başlangıç pozisyonuna geri dönün.")
    T_BAR_ROWS("Sırt ve omuz kaslarını çalıştırır.", "Barı bir köşeye takın ve bir tutacak bağlayın. Barı tutun ve ayaklarınızı omuz genişliği kadar açarak hafifçe çömelin. Sırtınızı düz tutarak barı kaldırın ve omuz hizanıza kadar çekin. Kontrollü bir şekilde indirin ve tekrarlayın.")
    INCLINE_DUMBBELL_CURLS("Biceps kaslarını çalıştırır.", "Bir benchin eğimli tarafına oturun ve bir çift hafif dambıl alın. Dambılları avuç içleri birbirine bakacak şekilde tutun ve yavaşça kaldırın. Üst kolunuzu sabit tutarak, dambılları omuz seviyesine kadar kaldırın ve tekr PLYOMETRIC_PUSHUPS("Kol kaslarını çalıştırır ve kuvvetlendirir.", "Pushup pozisyonunda başınızı hızlıca yukarı iterken el ve ayaklarınızı havaya sıçrayın. Daha sonra tekrar yere inin ve düz bir pozisyona geri dönün."),
    CLAPPING_PUSHUPS("Göğüs kaslarını güçlendirir.", "Pushup pozisyonunda yere doğru eğilin. Kendinizi yukarı itin ve havada iken ellerinizi çırpın. Düşüşünüzü kontrol edin ve tekrar başlangıç pozisyonuna dönün."),
    CHEST_FLYS("Göğüs kaslarını geliştirir.", "Dambıl tutarak sırtınızı düz tutun ve kollarınızı yere paralel olacak şekilde yanlara doğru açın. Dambilleri kontrol ederek, kolunuzu göğüs hizasına kadar açın ve tekrar yavaşça indirin."),
    INCLINE_BENCH_PRESS("Göğüs kaslarını çalıştırır.", "Ağırlıklı bench press egzersizinde bench'i açılı bir şekilde kullanarak göğüs kaslarını daha iyi hedefleyebilirsiniz."),
    DECLINE_BENCH_PRESS("Göğüs kaslarını çalıştırır.", "Ağırlıklı bench press egzersizinde bench'i ters bir şekilde kullanarak göğüs kaslarını daha iyi hedefleyebilirsiniz."),
    DUMBBELL_BENCH_PRESS("Göğüs kaslarını çalıştırır.", "Dumbell bench press egzersizi, bench press hareketine benzer ancak her elde dumbell tutulur ve ağırlıkların birbirine yakın kalması gerekir."),
    ARNOLD_PRESS("Omuz kaslarını çalıştırır.", "Dumbell tutarak başlangıç pozisyonunda tutun ve daha sonra elinizin üst kısmını dışa doğru çevirerek kaldırın. Dumbell'leri yukarı doğru itin ve tekrar başlangıç pozisyonuna dönün."),
    LATERAL_RAISES("Orta ve yan omuz kaslarını çalıştırır.", "Dambıl tutarak sırtınızı düz tutun ve kollarınızı vücudunuzdan uzaklaştırarak kaldırın. Kollarınız yere paralel olana kadar yavaşça kaldırın, ardından aynı hızda indirin."),
    REAR_DELT_FLYS("Omuz kaslarını çalıştırır.", "Dambıl tutarak bacaklarınızı omuz genişliği kadar açın ve belinizi hafifçe bükerek öne doğru eğilin. Dambilleri yere doğru salın ve sonra kollarınızı yavaşça yana doğru açın."),
    FACE_PULLS("Omuz ve üst sırt kaslarını çalıştırır.", "Kablo makinesinde orta yükseklikte bir ağırlık seçin ve iki elinizi de kablo tokalarına takın. Ayakta durun ve kollarınızı yüzünüze doğru çekerek omuzlarınızı sıkın, sonra kollarınızı yavaşça geriye doğru uzatın."),
    FARMER_WALKS("Ön kol, sırt, omuz ve bacak kaslarını çalıştırır.", "Dumbbell'ları iki elinizle kaldırın ve yere düzgün bir şekilde yerleştirin. Ayakta durun ve dumbbell'ları tutarak yürümeye başlayın. Sırtınızı düz tutun ve adımlarınızı dengeli ve ölçülü bir şekilde atın."),
    BACK_EXTENSIONS("Bel ve sırt kaslarını çalıştırır.", "Yüzüstü uzanın ve ellerinizi kulaklarınızın yanına yerleştirin. Sırtınızı düzleştirerek gövdenizi yavaşça kaldırın ve sonra başlangıç pozisyonuna geri dönün."),
    PLYO_BOX_JUMP("Bacak ve kalça kaslarını çalıştırır.", "Düzgün bir kutunun (box) önünde durun ve birkaç adım geriye doğru çekilin. Koşar gibi hızla ileriye doğru atlayın ve kutunun üzerine düzgün bir şekilde yerleşin. Kutunun üzerinde dik bir şekilde durun ve ardından yavaşça yere geri inin."),
    SINGLE_LEG_DEADLIFTS("Sırt ve bacak kaslarını çalıştırır.", "Dumbbell veya kettlebell tutun ve bir bacağınızı arkada tutun. Belinizi düz tutarak diğer bacağınızı bükün ve önünüzdeki ağırlığı yavaşça yere doğru indirin. Tekrar yavaşça yukarı doğru çıkın ve tekrarlayın."),
    HIP_ABDUCTORS("Kalça kaslarını çalıştırır.", "Makineye oturun ve ayaklarınızı yanlara doğru açın. Bacaklarınızı tekrar yavaşça birleştirin ve tekrarlayın."),
    HIP_ADDUCTORS("Kalça kaslarını çalıştırır.", "Makineye oturun ve ayaklarınızı birleştirin. Bacaklarınızı yavaşça açın ve ardından tekrar birleştirin."),
    LYING_LEG_CURLS("Arka bacak kaslarını çalıştırır.", "Sırt üstü yatarak bir makineye veya ağırlığa dayanın. Bacaklarınızı bükün ve yavaşça geri düzeltin."),
    HACK_SQUATS("Bacak kaslarını çalıştırır.", "Bir makinenin platformunda ayaklarınızı yerleştirin ve sırtınızı platforma dayayın. Bacaklarınızı yavaşça bükün ve ardından yavaşça uzatın."),
    INCLINE_LEG_PRESS("Bacak kaslarını çalıştırır.", "Bir makinenin eğimli yüzeyinde oturun ve bacaklarınızı birleştirin. Dizleri yavaşça bükün ve ardından yavaşça uzatın."),
    SEATED_LEG_PRESS("Bacak kaslarını çalıştırır.", "Bir makineye oturun ve ayaklarınızı platforma yerleştirin. Bacaklarınızı yavaşça bükün ve ardından yavaşça uzatın."),
    PLATE_TWISTS("Core kaslarını çalıştırır.", "Düz bir zeminde oturun, dizlerinizi bükün ve ayaklarınızı yere yerleştirin. Ellerinizle bir ağırlık levhasını tutun, göğsünüzün önünde tutun ve üst vücudunuzu sağa ve sola çevirerek ağırlık levhasını kontrol ederek hareket edin.")
    FRONT_RAISE("Ön omuz kaslarını çalıştırır.", "Hafif ağırlıklarla ellerinizi önünüze doğru kaldırın, omuzlarınızı kulağınıza kadar kaldırmadan yavaşça indirin."),
    REAR_DELT_FLY("Arka omuz kaslarını çalıştırır.", "Dumbbell'leri alın ve sırtınıza doğru çekin, omuzlarınızı kulağınıza kadar kaldırmadan yavaşça indirin."),
    BENT_OVER_ROW("Sırt kaslarını çalıştırır.", "Ayaklarınızı omuz genişliğinde açın, dizlerinizi bükün ve belinizi hafifçe öne doğru eğin. Dumbbell'leri ellerinizle tutun ve dirseklerinizi geriye doğru çekerek sırt kaslarınızı sıkın."),
    TRICEPS_EXTENSION("Triceps'leri çalıştırır.", "Dumbbell'leri kaldırın ve kollarınızı kafanızın arkasına doğru bükün. Kollarınızı tekrar düzleştirin ve tekrarlayın."),
    HAMSTRING_CURLS("Arka bacak kaslarını çalıştırır.", "Makineye uzanın ve ayak bileklerinizi rahatça yerleştirin. Bacaklarınızı yavaşça bükün, topuklarınızı kalçanıza doğru çekin ve ardından yavaşça geri doğru uzatın."),
    RUNNING("Kalp atış hızınızı artırarak kardiyo yapmanıza yardımcı olur.", "Koşmak için uygun bir yer seçin ve yavaşça koşmaya başlayın. Daha sonra hızınızı artırın."),
    CYCLING("Kalp atış hızınızı artırarak kardiyo yapmanıza yardımcı olur.", "Bir egzersiz bisikletine veya gerçek bir bisiklete binin ve hızınızı artırarak pedal çevirmeye başlayın."),
    ROWING("Tüm vücudunuzu çalıştırarak kardiyo yapmanıza yardımcı olur.", "Bir kürek makinesinde oturun ve ayaklarınızı ayak pedallarına yerleştirin. Daha sonra kürek çekmeye başlayın."),
    ELLIPTICAL("Kardiyo egzersizi yapmanıza yardımcı olur.", "Elliptik bir makineye binin ve ayaklarınızı pedalalara yerleştirin. Ellerinizle hareketi kontrol ederek pedal çevirin."),
    TABATA("Kardiyo dayanıklılığını artırır.", "Sırt üstü yatın ve dizlerinizi bükün. Kollarınızı başınızın yanında tutun. Bacaklarınızı yukarı kaldırın ve ellerinizle dokunun. Bacaklarınızı tekrar yere indirin ve tekrarlayın."),
    HIGH_KNEES("Kardiyo dayanıklılığını artırır.", "Ayaklarınızı omuz genişliği kadar açın ve sırayla her bir dizinizi göğsünüze doğru çekin."),
    RUNNING_STAIRS("Kardiyo dayanıklılığını artırır.", "Merdivenlerde yukarı ve aşağı koşun. Hızınızı artırın veya azaltın, interval antrenmanı yapmak için koşuya ara verin."),
    JUMP_ROPE("Kardiyo dayanıklılığını artırır.", "İki ayakla sıçrayarak ve ipi alttan üste doğru atlayarak atlama ipiyle zıplayın."),



    private final String description;
    private final String instruction;

    }