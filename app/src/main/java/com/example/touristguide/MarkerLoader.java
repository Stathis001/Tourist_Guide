package com.example.touristguide;

import android.content.DialogInterface;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.MarkerOptions;

public class MarkerLoader {
    public MarkerLoader(GoogleMap map) {
        MarkerManager manager = new MarkerManager(map);
        manager.addMarker(2, 41.09835129725971, 23.551927608268336,"Lofos Koyla");
        manager.addMarker(3, 41.09156654135183, 23.559917963233605,"Achmet Pasa Tzami");
        manager.addMarker(4, 41.08828964518851, 23.553439602363994,"Ζιντζιρλί Τζαμί");
        manager.addMarker(5, 41.09146333054632, 23.55051494660206,"Liberty Square");
        manager.addMarker(6, 41.090984162331786, 23.54966866588395,"Archeological Museum of Serres (Bezesteni)");
        manager.addMarker(7, 41.10059767457084, 23.57097613512557,"Natural History Museum");
        manager.addMarker(8, 41.10434890738389, 23.553423758489348,"Agioi Anargyroi Valley");
        manager.addMarker(9, 41.07791797232521, 23.542626119426355,"Intercity Bus Station of Serres");
        manager.addMarker(10, 41.07329171632362, 23.5470893150212,"Serres Camp");
        manager.addMarker(11, 41.09486734480665, 23.558418965379346,"Philippos Xenia Hotel");
        manager.addMarker(12, 41.10347193488058, 23.549222483272818,"Elpida Resort & Spa");
        manager.addMarker(13, 41.08930648512539, 23.527421488950267,"Serres National Stadium");
        manager.addMarker(14, 41.09293009514462, 23.55736205023394,"Serres State Health Center");
        manager.addMarker(15, 41.0941120281705, 23.546161726125494,"Kalithea Serres");
        manager.addMarker(16, 41.097588736734345, 23.551225736764437,"Cityζεν WINE · BAR · RESTAURANT");
        manager.addMarker(17, 41.082807410884556, 23.5425353795879,"Fire Service");
        manager.addMarker(18, 41.07275655544222, 23.51766362781244,"Serres Racing Circuit");
        manager.addMarker(19, 41.06602011402373, 23.54131497674441,"LA VITA CENTER");
        manager.addMarker(20, 41.084803498471516, 23.546518769143844,"Serres Municipal Stadium");
        manager.addMarker(21, 41.08315378520309, 23.551668610294023,"Ελλήνων Γεύσεις");
        manager.addMarker(22, 41.08084088215488, 23.541583504790097,"Bruno Coffee Stores");
        manager.addMarker(23, 41.08787638344969, 23.541433300952594,"ACS Courier");
        manager.addMarker(24, 41.090423204868415, 23.58244886315631,"General Hospital of Serres");
       //-----------------------------------------------------------------
        manager.addMarker(25, 41.073894255079914, 23.524030147932464,"Δημοτικό Αθλητικό Πάρκο Ομόνοιας");
        manager.addMarker(26, 41.08766827906128, 23.52713543562274,"SEREXPO");
        manager.addMarker(27, 41.08728013187958, 23.534516874170333,"Κοτζά Μουσταφά Πασά Τζαμί");
        manager.addMarker(28, 41.08534363915882, 23.560577628551084,"Πρώην Στρατόπεδο Πυροβολικού \"Παπαλουκά\"");
        manager.addMarker(29, 41.09097535269406, 23.552489194031562,"Πλατεία Εμπορίου");
        manager.addMarker(30, 41.09150616099969, 23.55025486079075,"Πλατεία Ελευθερίας");
        manager.addMarker(31, 41.09231557031939, 23.552397744406058,"Πλατεία του ΙΚΑ");
        manager.addMarker(32, 41.094186143299844, 23.55485319932766,"Λαογραφικό Μουσείο Σαρακατσάνων")
        manager.addMarker(33, 41.093805352413725, 23.55821282902122,"Πάρκο Fosses");
        manager.addMarker(34, 41.09288342848256, 23.557370705547548,"Κέντρο Υγείας");
        manager.addMarker(35, 41.10368030247592, 23.55025637432727, "Θερινό Σινεμά");
        manager.addMarker(36, 41.10203711089816, 23.55149739848015, "Δημοτικό Αθλητικό Κέντρο Σερρών");
        manager.addMarker(37, 41.101063525905396, 23.55197492664004, "Κολυμβητήριο");
        manager.addMarker(38, 41.10028866611268, 23.548077151288318, "Άλσος Σερρών");
        manager.addMarker(39, 41.09681551936232, 23.556927371708124, "Πεζογέφυρα Κοιλάδας Αγίων Αναργύρων");
        manager.addMarker(40, 41.096728675967, 23.55971967626712,"Πλατεία Κατακονόζη");
        manager.addMarker(41, 41.096869703957914, 23.554097104286154, "Ιερός Ναός Αγίου Νικολάου");
        manager.addMarker(42, 41.09616472344531, 23.55686095214164, "Ιερός Βυζαντινός Ναός Τιμίου Πρoδρόμου");
        manager.addMarker(43, 41.08664760049377, 23.56086280790246,"Μουσείο Κωνσταντίνος Ξενάκης");
        manager.addMarker(44, 41.08898455787269, 23.560809163490507, "Αγια Σοφια Ταβερνα");
        manager.addMarker(45, 41.092914340287074, 23.5525265022659, "Κάππαρη");
        manager.addMarker(46, 41.093350462926914, 23.54571349895865, "Ανοιχτό Θεατράκι Καλλιθέας");
        //we need to add all the markers somehow here.HELP!!!!
    }
}
