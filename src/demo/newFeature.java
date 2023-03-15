package demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * java8新特性
 *
 * @author : [ljl]
 * @createTime : [2023/2/14 9:28]
 */

public class newFeature {
    public static void main(String[] args) {


        streamTest();

    }

    static void optionalTest() {

        Stu stu = new Stu("1", "ljl");
        Stu stu1 = null;

        // if/else操作
        Optional.ofNullable(stu1).map(s -> s.getName()).ifPresentOrElse(str -> {
            System.out.println(str);
        }, () -> {
            System.out.println("该对象为空");
        });

//        Optional.ofNullable(stu1).map(stu2 -> stu2.getName()).ifPresent(st -> {
//            System.out.println(st);
//        });

//        System.out.println(s);

        Optional.ofNullable(stu1)
                .ifPresent(u->{
                    System.out.println(u);
                });

//        Optional.ofNullable(stu1).map(s -> s.getId()).ifPresent(id -> {
//            System.out.println(id);
//        });
        // 取值加null值异常抛出
//        try {
//            System.out.println(Optional.ofNullable(stu).map(s -> s.getId()).orElseThrow(() -> new Exception("取指错误")));
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        // 存在时调用方法
//        Optional.ofNullable(stu1).map(s -> s.getId()).ifPresent(StreamTest::accept);

//        String id = "";
//
//        System.out.println(Optional.ofNullable(id).isPresent());

//        Stu stu2 = new Stu();
        Stu stu2 = null;

//        System.out.println(stu2.getId());

//        String str = Optional.ofNullable(stu2).map(stu3 -> stu3.getName()).orElse(null);
//        String str = Optional.ofNullable(stu2).map(stu3 -> stu3.getName()).orElseThrow(() -> new IllegalArgumentException("参数异常"));

//        System.out.println(str);
//        String str = Optional.ofNullable(stu2).map(stu3 -> stu3.getName()).orElseGet(() -> null);
//
//        Optional<String> op = Optional.ofNullable(stu2).map(stock -> stock.getName());
//
//        op.ifPresent(s -> System.out.println(s));
//        String ops = op.orElseThrow(() -> new IllegalArgumentException("参数异常"));
//        System.out.println(ops);

//        System.out.println(Optional.ofNullable(stu2).isPresent());

        // 条件为true: 返回原值, false: 执行orElseGet方法体
//        id = Optional.ofNullable(id).filter(ids -> ids.equals("1")).orElseGet(() -> "100");
//        Stu stu3 = Optional.ofNullable(stu2).filter(s -> "".equals(s.getId())).orElseGet(() -> new Stu("10", "xg"));
//        Stu stu3 = Optional.ofNullable(stu2).filter(s -> "".equals(s.getId())).orElseThrow(() -> new IllegalArgumentException("异常"));
//
//        System.out.println(stu3);
//        System.out.println("" == null);
//        Optional.ofNullable(id).orElseThrow(() -> {
//            return new IllegalArgumentException("id不存在");
//        });
//
//        System.out.println(id);

    }

    static String test() {
        System.out.println("------------");
        return "++++++++";
    }

    static void datetimeTest() {
        // 时间
        LocalDate date = LocalDate.of(2021, 1, 26);
        LocalDate.parse("2021-01-26");

//        System.out.println(LocalDate.now());

//        LocalDateTime dateTime = LocalDateTime.of(2021, 1, 26, 12, 12, 22);
//        LocalDateTime dateTime1 = LocalDateTime.parse("2021-01-26T12:12:22");
//
//        System.out.println(dateTime);
//        System.out.println(dateTime1);

//        LocalTime time = LocalTime.of(12, 12, 22);
//        LocalTime.parse("12:12:22");

        // 时间格式化
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateTimes = dtf.format(LocalDateTime.now());
        System.out.println(dateTimes);
        // 指定格式日期字符串转换为localdatetime
        LocalDateTime parse = LocalDateTime.parse("2023-03-09 09:36:11", dtf);
        System.out.println(parse);

        // 年 月 日
        System.out.println(LocalDateTime.now().getYear());
        System.out.println(LocalDateTime.now().getMonth().getValue());
        System.out.println(LocalDateTime.now().getMonthValue());
        System.out.println(LocalDateTime.now().getDayOfMonth());
        System.out.println(LocalDateTime.now().getDayOfWeek());
        System.out.println(LocalDateTime.now().getDayOfWeek().getValue());
        System.out.println(LocalDateTime.now().getDayOfYear());

    }

    static void streamTest() {
//        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Stream<Integer> stream = lists.stream();
//        Stream<Integer> limit = stream.limit(5);
//
//        List<Integer> collect = limit.collect(Collectors.toList());
//
//        System.out.println();
//
//        List<Integer> list = Arrays.asList(1, 3, 1, 2, 3, 4, 1, 2, 3, 41, 1, 23, 1, 23213, 43);
//        Stream<Integer> integerStream = list.stream().map(item -> {
//            int i = item * 2;
//            System.out.println(i);// 1
//            return i;
//        });
//        System.out.println("this is a temp");// 2
//        integerStream.collect(Collectors.toList());// 3}

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = list.stream();
        // 过滤
//        stream.filter(str -> str > 5).forEach(System.out::println);
        // 遍历
//        stream.forEach(System.out::println);
        //
//        stream.map(s -> )
        System.out.println(true || false);
    }

    private static void accept(String id) {
        id = "++++";
        System.out.println(id);
    }
}