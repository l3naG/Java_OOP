package examples;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    private static final String DATA_URL = ("https://services.hanselandpetal.com/feeds/flowers.json");

    public static void main(String[] args) throws IOException, InterruptedException {


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(DATA_URL))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());


//        File file = new File("src/files/data.json");
//        Gson gson = new Gson();
//
//        try (
//                FileReader reader = new FileReader(file);
//                JsonReader jsonReader = new JsonReader(reader);
//        ) {
//            Flower[] data = gson.fromJson(jsonReader, Flower[].class);
//            for (Flower flower : data) {
//                System.out.println(flower);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        Path sourceFile = Paths.get("src", "files", "target3.txt");
//        Path targetFile = Paths.get("src", "files", "target4.txt");
//
//        try {
//            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        Path sourcePath = Paths.get("src", "files", "loremipsum.txt");
//        Path targetPath = Paths.get("src", "files", "target3.txt");
//
//        try {
//            Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        String sourceFile = "src/files/loremipsum.txt";
//        String targetFile = "src/files/target2.txt";
//
//
//        try (FileReader reader = new FileReader(sourceFile);
//             BufferedReader bufferedReader = new BufferedReader(reader);
//             FileWriter writer = new FileWriter(targetFile)) {
//
//            while (true) {
//                String line = bufferedReader.readLine();
//                if (line == null) {
//                    break;
//                }
//                writer.write(line + "\n");
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        Date now = new Date();
//        System.out.println(now);
//
//        GregorianCalendar calendar = new GregorianCalendar(new Locale("Slovakia"));
//        Date date = calendar.getTime();
//        System.out.println(date);
//
//        calendar.add(GregorianCalendar.DATE, 3);
//        Date date2 = calendar.getTime();
//        System.out.println(date2);

//        LocalDateTime ldt = LocalDateTime.now();
//        System.out.println(ldt);
//        LocalDate ld = LocalDate.now();
//        System.out.println(ld);
//
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
//        System.out.println(dtf.format(ld));


//        Map<String, String> map = new HashMap<>();
//        map.put("California", "Sacramento");
//        map.put("Oregon", "Salem");
//        map.put("Washington", "Olympia");
//        map.put("Alaska", "Juneau");
//        System.out.println(map);
//        map.remove("Oregon");
//        System.out.println(map);
//
//        String capital = map.get("California");
//        System.out.println(String.format("The capital of California is %s", capital));

//        List<String> states = new ArrayList<>();
//        states.add("Arizona");
//        states.add("Pennsylvania");
//        states.add("California");
//        states.add("Utah");
//        states.add("Texas");
//        states.add("New York");
//
//        for (String state : states) {
//            System.out.println(state);
//        }
//
//        String state = states.get(4);
//        System.out.println(String.format("The fifth state is %s", state));
//
//        int index = states.indexOf("Arizona");
//        int place = index + 1;
//        System.out.println(String.format("Arizona is in the %d place", place));
//
//        List<Integer> integers = new ArrayList<>();
//        integers.add(23);
//        integers.add(232);
//        integers.add(56);
//        integers.add(123);
//        integers.add(33);
//
//        for (Integer integer : integers) {
//            System.out.println(integer);
//        }
//
//        integers.remove(0);
//        for (Integer integer : integers) {
//            System.out.println(integer);
//        }


//        System.out.println("Array of Primitive values");
//        int[] ints = {2, 3, 4, 5, 6};
//        for (int i = 0; i < ints.length; i++) {
//            System.out.println(ints[i]);
//        }
//
//        for (int anInt : ints) {
//            System.out.println(anInt);
//        }
//
//        System.out.println("Array of colors");
//        String[] colors = {"blue", "red", "brown", "green", "orange"};
//        for (String color : colors) {
//            System.out.println(color);
//        }
//
//        ClothingItem[] items = new ClothingItem[3];
//        items[0] = new ClothingItem("Shirt", "M", 12.99);
//        items[1] = new ClothingItem("Hat", "L", 9.99);
//        items[2] = new ClothingItem("Sweater", "M", 34.99);
//
//        for (ClothingItem item : items) {
//            System.out.println(item);
//        }
//
//        ClothingItem[] copied = Arrays.copyOf(items, 12);
//
//        for (ClothingItem clothingItem : copied) {
//            System.out.println(clothingItem);
//        }
//
//        items[0].setPrice(5.55);
//        System.out.println(items[0]);
//        System.out.println(copied[0]);


//        ClothingItem item = new ClothingItem("Shirt", "L", 19.99);
//        displayProduct(item);

//        Shirt shirt = new Shirt("L", 12.99);
//        displayProduct(shirt);
//        System.out.println(shirt);
//        shirt.setPattern("Plaid");
//        System.out.println(String.format("The shirt's pattern is %s", shirt.getPattern()));
//
//        ClothingItem reallyAShirt = new Shirt("M", 12.00);
//        displayProduct(reallyAShirt);
//        System.out.println(reallyAShirt);
//        Shirt shirt2 = (Shirt) reallyAShirt;
//        shirt2.setPattern(String.format("Shirt pattern is %s", shirt.getPattern()));
//        displayProduct(shirt2);


    }

//    private static void displayProduct(Product product) {
//        String output = product.getClass().getSimpleName() + '{' +
//                "type='" + product.getType() + '\'' +
//                ", size='" + product.getSize() + '\'' +
//                ", price=" + product.getPrice() +
//                '}';
//        System.out.println(output);
//    }

//        MathHelper helper = new MathHelper();
//
//        try {
//            while (true) {
//                String prompt = "Enter a number: ";
//                int value = helper.doMath(prompt, MULTIPLY);
//                int total = helper.getTotal();
//                System.out.println(String.format("You entered: %d, total is %d", value, total));
//            }
//        } catch (NumberFormatException e) {
//            System.out.println("All done!");
//        }
//    }
}
