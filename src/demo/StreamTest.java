package demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * stream流
 *
 * @author : [ljl]
 * @createTime : [2023/3/13 9:48]
 */

public class StreamTest {

    public static void main(String[] args) {

        List<Stu> list = Arrays.asList(new Stu("1", "刘建亮", 21, 1),
                new Stu("2", "小鬼", 21, 0),
                new Stu("3", "芳芳", 22, 2),
                new Stu("4", "小学生", 15, 3)
        );
        // 顺序流
        Stream<Stu> stream = list.stream();
        // 并行流 (如果流中的数据量足够大，并行流可以加快处速度。)
        Stream<Stu> streamC = list.parallelStream();
        // 顺序转并行
        Stream<Stu> parallel = stream.parallel();

        // peek(类似map, forEach, 但不能改变流, 却能对引用数据类型的值进行修改)
//        stream.peek(stu -> stu.setState(0)).forEach(System.out::println);
        // 筛选
//        stream.filter(stu -> stu.getAge() > 20).forEach(System.out::println);
//        List<Stu> newList = stream.filter(stu -> stu.getAge() > 20).collect(Collectors.toList());
//        newList.forEach(System.out::println);
        // 自然排序(升序)按条件
//        stream.sorted(Comparator.comparing(Stu::getAge)).forEach(System.out::println);
        // 降序
//        stream.sorted(Comparator.comparing(Stu::getAge)).forEach(System.out::println);
        // 先根据年龄降, 再根据state降
//        stream.sorted(Comparator.comparing(Stu::getAge).thenComparing(Stu::getState).reversed()).forEach(System.out::println);

        // 匹配第一个/匹配任意（适用于并行流）
//        Integer first = stream.map(stu -> stu.getAge()).filter(age -> age > 18).findFirst().get();
//        System.out.println(first);
//        Integer first1 = streamC.map(stu -> stu.getAge()).filter(age -> age > 18).findAny().get();
//        System.out.println(first1);

        // 去重: distinct()
//        stream.map(stu -> stu.getAge()).filter(age -> age > 18).distinct().forEach(System.out::println);
        // 是否包含符合特定条件的元素
//        System.out.println(stream.map(stu -> stu.getAge()).anyMatch(age -> age < 12));

        // 反向自然顺序: Comparator.reverseOrder() 自然顺序: Comparator.naturalOrder()
//        Integer age = stream.map(stu -> stu.getAge()).max(Comparator.naturalOrder()).get();
//        System.out.println(age);
//        Stu stu = stream.filter(s -> s != null && s.getAge() != null).max(Comparator.comparing(Stu::getAge)).get();
//        Stu stu = stream.filter(s -> s != null && s.getAge() != null).min(Comparator.comparing(Stu::getAge)).get();
//        System.out.println(stu);
//        long count = stream.filter(s -> s != null && s.getAge() != null).count();
//        System.out.println(count);
        // 求和, 求积, 最大值
//        Integer ageSum = stream.map(stu -> stu.getAge()).reduce((x, y) -> x + y).get();
//        Integer ageSum = stream.map(stu -> stu.getAge()).reduce((x, y) -> x > y ? x : y).get();
//        System.out.println(ageSum);

        // 连接joining
//        String str = stream.map(stu -> stu.getName()).collect(Collectors.joining(","));
//        System.out.println(str);

        // 分组
//        Map<Integer, Map<String, List<Stu>>> map = stream.collect(Collectors.groupingBy(Stu::getAge, Collectors.groupingBy(Stu::getName)));
//        map.forEach((k, v) -> {
//            System.out.println(k + "--" +v);
//            v.forEach((ks, vs) -> {
//                System.out.println(ks + "++" + vs);
//            });
//        });

        // concat合并 limit：限制从流中获得前n个数据  skip:跳过前n个元素
        Integer[] ary1 = {1, 2, 3, 4, 5};
        Integer[] ary2 = {6, 7, 8, 9, 10};
        List<Integer> ary3 = Arrays.asList(4, 5, 6, 7);
//        Stream<Integer> stream1 = Arrays.stream(ary1);
//        Stream<Integer> stream2 = Stream.of(ary2);

//        Stream.concat(stream1, stream2).limit(5).forEach(System.out::println);
//        Stream.concat(stream1, stream2).skip(5).forEach(System.out::println);

        // 计算两个list中的差集/ 相同集合
//        stream1.filter(item -> !ary3.contains(item)).forEach(System.out::println);

        // 终端操作之后流会被关闭, 无法继续操作: forEach, find, match, reduce, max, min, count
//        Stream<Integer> stream3 = ary3.stream();
//        System.out.println(stream3.anyMatch(x -> x < 5));
//        List<Integer> collect = stream3.filter(x -> x > 0).sorted(Comparator.reverseOrder()).toList();
//        collect.forEach(System.out::println);
//        Stream<Integer> newStream = stream3.filter(x -> x > 0).sorted(Comparator.reverseOrder());
//        newStream.forEach(System.out::println);
    }

}
