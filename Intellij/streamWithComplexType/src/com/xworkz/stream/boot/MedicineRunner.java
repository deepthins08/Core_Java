package com.xworkz.stream.boot;

import com.sun.xml.internal.ws.util.xml.CDATA;
import com.xworkz.stream.dto.MedicineDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MedicineRunner {

    public static void main(String[] args) {

        String[] ingredients={"paracetamol","Zerodol P"};
        String[] ing={"Amoxicillin" ,"Clavulanate Potassium"};
        String[] ing1={"Albuterol","Ipratropium"};
        String[] ing2={"Ibuprofen" , "Pseudoephedrine" ," Chlorpheniramine"};
        String[] ing3={"Atorvastatin","Calcium Carbonate","Magnesium Stearate"};
        String[] ing4={"Duloxetine","Microcrystalline Cellulose","Hypromellose","Titanium Dioxide"};
        String[] ing5={ "Budesonide","Formoterol","Lactose","Magnesium Stearate"};
        String[] ing6={"Azithromycin","Lactose","Sodium Lauryl Sulfate","Povidone"};
        String[] ing7={"Esomeprazole","Sucrose","Sodium Stearyl Fumarate","Polysorbate"};
        String[] ing8={"Emtricitabine","Tenofovir Disoproxil Fumarate","Croscarmellose Sodium","Stearic Acid"};
        String[] ing9={"Fluticasone Propionate","Microcrystalline Cellulose","Carboxymethylcellulose Sodium","Benzalkonium Chloride"};
        String[] ing10={"Hydrocodone","Acetaminophen","Corn Starch","Colloidal Silicon Dioxide"};
        String[] ing11={"Celecoxib","Lactose","Croscarmellose Sodium","Magnesium Stearate"};
        String[] ing12={"Fluoxetine","Microcrystalline Cellulose","Magnesium Stearate","Titanium Dioxide"};
        String[] ing13={"Diphenhydramine","Calcium Phosphate","Magnesium Stearate","Corn Starch"};
        String[] ing14={"Simvastatin","Lactose","Microcrystalline Cellulose","Magnesium Stearate"};
        String[] ing15={"Amphetamine","Dextroamphetamine","Corn Starch","Magnesium Stearate"};
        String[] ing16={"Pregabalin","Lactose","Corn Starch","Magnesium Stearate"};
        String[] ing17={"Sertraline","Microcrystalline Cellulose","Croscarmellose Sodium","Magnesium Stearate"};
        String[] ing18={"Mometasone Furoate","Microcrystalline Cellulose","Carboxymethylcellulose Sodium","Benzalkonium Chloride"};


        MedicineDTO medicineDTO=
                new MedicineDTO("Dolo 650","DL62562","Micro Labs",
                        LocalDate.of(2025,04,28),LocalDate.now(),30,ingredients);
        MedicineDTO medicineDTO1=new MedicineDTO("Augmentin","AUG123456","GlaxoSmithKline",LocalDate.of(2026,12,12),LocalDate.now(),40,ing);
        MedicineDTO medicineDTO2=new MedicineDTO("Combivent","COMB789012","Boehringer Ingelheim",LocalDate.of(2026,03,22),LocalDate.of(2024,01,01),100,ing1);
        MedicineDTO medicineDTO3=new MedicineDTO("Advil Cold and Sinus","ADV456789","Pfizer",LocalDate.of(2027,04,20),LocalDate.now(),150,ing2);
        MedicineDTO medicineDTO4=new MedicineDTO("Lipitor","LIP345678","Pfizer",LocalDate.of(2022,05,01),LocalDate.of(2022,04,01),300,ing3);
        MedicineDTO medicineDTO5=new MedicineDTO(" Cymbalta","CYM567890","Eli Lilly and Company",LocalDate.of(2024,02,24),LocalDate.now(),1500,ing4);
        MedicineDTO medicineDTO6=new MedicineDTO("Symbicort","SYM901234","AstraZeneca",LocalDate.of(2025,10,23),LocalDate.now(),500,ing5);
        MedicineDTO medicineDTO7=new MedicineDTO("Zithromax","ZIT678901","Pfizer",LocalDate.of(2026,05,18),LocalDate.now(),250,ing6);
        MedicineDTO medicineDTO8=new MedicineDTO("Nexium","NEX789012","AstraZeneca",LocalDate.of(2026,01,12),LocalDate.now(),430,ing7);
        MedicineDTO medicineDTO9=new MedicineDTO("Truvada","TRU123456","Gilead Sciences",LocalDate.of(2028,02,25),LocalDate.now(),800,ing8);
        MedicineDTO medicineDTO10=new MedicineDTO("Flonase","FLO234567","GlaxoSmithKline",LocalDate.of(2024,9,10),LocalDate.of(2024,03,21),2000,ing9);
        MedicineDTO medicineDTO11=new MedicineDTO("Vicodin","VIC567890","AbbVie Inc.",LocalDate.of(2025,03,20),LocalDate.of(2025,02,20),1500,ing10);
        MedicineDTO medicineDTO12=new MedicineDTO(" Celebrex","CEL123456","Pfizer",LocalDate.of(2026,05,11),LocalDate.now(),600,ing11);
        MedicineDTO medicineDTO13=new MedicineDTO("Prozac","PRO901234","Eli Lilly and Company",LocalDate.of(2025,11,30),LocalDate.now(),2500,ing12);
        MedicineDTO medicineDTO14=new MedicineDTO("Benadryl","BEN345678","Johnson & Johnson",LocalDate.of(2026,05,10),LocalDate.now(),1700,ing13);
        MedicineDTO medicineDTO15=new MedicineDTO("Zocor","ZOC789012","Merck",LocalDate.of(2025,04,10),LocalDate.now(),2100,ing14);
        MedicineDTO medicineDTO16=new MedicineDTO("Adderall","ADD456789","Shire Pharmaceuticals",LocalDate.of(2026,07,27),LocalDate.now(),900,ing15);
        MedicineDTO medicineDTO17=new MedicineDTO("Lyrica","LYR890123","Pfizer",LocalDate.of(2027,02,19),LocalDate.now(),640,ing16);
        MedicineDTO medicineDTO18=new MedicineDTO(" Zoloft","ZOL234567","Pfizer",LocalDate.of(2028,12,10),LocalDate.now(),3000,ing17);
        MedicineDTO medicineDTO19=new MedicineDTO("Nasonex","NAS678901","Merck",LocalDate.of(2026,01,25),LocalDate.now(),5000,ing18);

        List<MedicineDTO> list=new ArrayList<>();
        list.add(medicineDTO);
        list.add(medicineDTO1);
        list.add(medicineDTO2);
        list.add(medicineDTO3);
        list.add(medicineDTO4);
        list.add(medicineDTO5);
        list.add(medicineDTO6);
        list.add(medicineDTO7);
        list.add(medicineDTO8);
        list.add(medicineDTO9);
        list.add(medicineDTO10);
        list.add(medicineDTO11);
        list.add(medicineDTO12);
        list.add(medicineDTO13);
        list.add(medicineDTO14);
        list.add(medicineDTO15);
        list.add(medicineDTO16);
        list.add(medicineDTO17);
        list.add(medicineDTO18);
        list.add(medicineDTO19);

       


        list.stream().sorted((p1,p2)->p1.getCompany().compareTo(p2.getCompany())).forEach(l-> System.out.println(l));
        System.out.println("------------------------------------------------------------------");
        list.stream().sorted((p1,p2)->p2.getExpiryDate().compareTo(p1.getExpiryDate())).forEach(l-> System.out.println(l));
        System.out.println("---------------------------------------------------------------------");
        list.stream().sorted((p1,p2)->Double.compare(p1.getCost(),p2.getCost())).forEach(l-> System.out.println(l));
        System.out.println("---------------------------------------------------------------------");
//        list.forEach(ingredient->{Arrays.stream(ingredient.getIngredients()).filter(ingred->ingred.length()>3).forEach(l-> System.out.println(l));});
        List<String[]> filteredIngredients = list.stream()
                .map(MedicineDTO::getIngredients)
                .filter(ingredients1 -> ingredients1.length > 3)
                .collect(Collectors.toList());
        filteredIngredients.forEach(ingredientsArray -> System.out.println(Arrays.toString(ingredientsArray)));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("getting only ingredients");
//        list.stream().collect(Collectors.toList()).forEach(ingredient->{Arrays.stream(ingredient.getIngredients()).forEach(l-> System.out.println(l));});
        list.stream()
                .map(MedicineDTO::getIngredients)
                .forEach(i -> System.out.println(Arrays.toString(i)));


        System.out.println("---------------------------------------------------------------------------");
        list.stream().sorted((p1,p2)->p2.getCompany().compareTo(p1.getCompany())).forEach(l-> System.out.println(l.getCompany().toUpperCase()));
        System.out.println("---------------------------------------------------------------------------");
        list.stream().sorted((p1,p2)->p2.getName().compareTo(p1.getName())).forEach(l-> System.out.println(l));
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("manf date less than 30 days");
        List<MedicineDTO> recentMedicines = list.stream()
                .filter(medicine -> medicine.getManfDate().isAfter(LocalDate.now().minusDays(30)))
                .collect(Collectors.toList());
        recentMedicines.forEach(l-> System.out.println(l));
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("manf date More than 30 days");
        List<MedicineDTO> longAgoMedicines = list.stream()
                .filter(medicine -> medicine.getManfDate().isBefore(LocalDate.now().minusDays(30)))
                .collect(Collectors.toList());
        longAgoMedicines.forEach(l-> System.out.println(l));
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("expiry date with in the 30 days");
        List<MedicineDTO> expiringSoonMedicines = list.stream()
                .filter(medicine -> medicine.getExpiryDate().isBefore(LocalDate.now().minusDays(30)))
                .collect(Collectors.toList());
        expiringSoonMedicines.forEach(l-> System.out.println(l));


    }
}
