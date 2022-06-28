package ru.javarush.zazimko.wildisland.view;

import ru.javarush.zazimko.wildisland.classes.animals.Organism;
import ru.javarush.zazimko.wildisland.gameField.Cell;
import ru.javarush.zazimko.wildisland.gameField.Field;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


@SuppressWarnings("FieldCanBeLocal")
public class ConsoleView implements View {


    private final Field field;

    public ConsoleView(Field field) {
        this.field = field;

    }


    @Override
    public String showStatistics() {
        Map<String, Double> rawStatistics = new HashMap<>();
        Map<String, Long> statistics = new HashMap<>();
        Cell[][] cells = field.getCells();
        for (Cell[] row : cells) {
            for (Cell cell : row) {
                ConcurrentHashMap<Type, Set<Organism>> organisms = cell.getOrganisms();
                if (Objects.nonNull(organisms)) {
                    for (Map.Entry<Type, Set<Organism>> pair : organisms.entrySet()) {
                        Set<Organism> animalSet = pair.getValue();
                        if (animalSet.size() > 0) {
                            animalSet
                                    .forEach(organisms1 -> {
                                                String icon = organisms1.getIcon();
                                                double count = animalSet.size();
                                                rawStatistics.put(icon, rawStatistics.getOrDefault(icon, 0D) + count);
                                            }
                                    );
                        }
                    }
                }
                rawStatistics.forEach((key, value) -> statistics.put(key, Math.round(value)));
                System.out.println(statistics + "\n");

            }
        }
            return statistics.toString();
    }

    @Override
    public void showScale() {

    }

    @Override
    public String showMap() {
        return null;
    }

//            @Override
//            public void showScale () {
//                int n = 100;
//                StringJoiner joiner = new StringJoiner(" ");
//                for (int i = 10; i <= n; i += 10) {
//                    String color = Color.getColor(i, n);
//                    joiner.add(color + i + "%" + Color.RESET);
//                }
//                System.out.println("Scale: " + joiner);
//            }

//            @Override
//            public String showMap () {
//                StringBuilder out = new StringBuilder();
//                Cell[][] cells = field.getCells();
//                for (int row = 0; row < rows; row++) {
//                    out.append(row == 0
//                            ? line(cols, Symbols.LEFT_TOP, Symbols.TOP, Symbols.RIGHT_TOP)
//                            : line(cols, Symbols.LEFT, Symbols.CENTER, Symbols.RIGHT)
//                    ).append("\n");
//                    for (int col = 0; col < cols; col++) {
//                        String residentSting = get(cells[row][col]);
//                        out.append(String.format(Symbols.CELL_MARGIN + "%-" + cellWidth + "s", residentSting));
//                    }
//                    out.append(cutCols ? Symbols.INF_MARGIN : Symbols.CELL_MARGIN)
//                            .append("\n");
//                }
//                if (!cutCols) {
//                    out.append(line(cols, Symbols.LEFT_BOTTOM, Symbols.CENTER_BOTTOM, Symbols.RIGHT_BOTTOM));
//                } else {
//                    out.append(String.valueOf(Symbols.INF_MARGIN).repeat(((cellWidth + 1) * showCols) + 1))
//                            .append("\n");
//                }
//                System.out.println(out);
//                return out.toString();
//            }
//
//            private String get (Cell cell){
//                cell.getLock().lock();
//                String collect = cell.getResidents().values().stream()
//                        .filter((list) -> list.size() > 0)
//                        .sorted((o1, o2) -> o2.size() - o1.size())
//                        .limit(cellWidth)
//                        .map(organisms -> {
//                            int maxCount = organisms.getLimit().getMaxCountInCell();
//                            String color = Color.getColor(organisms.size(), maxCount);
//                            return color + organisms.getLetter() + Color.RESET;
//                        })
//                        .map(Object::toString)
//                        .collect(Collectors.joining());
//                long count = cell
//                        .getResidents()
//                        .values()
//                        .stream()
//                        .filter((list) -> list.size() > 0)
//                        .limit(cellWidth)
//                        .count();
//                String blank = count < cellWidth ? ".".repeat((int) (cellWidth - count)) : "";
//                cell.getLock().unlock();
//                return collect + blank;
//            }
//
//            private String line ( int cols, char left, char center, char right){
//                right = cutCols ? Symbols.INF_MARGIN : right;
//                return (IntStream.range(0, cols)
//                        .mapToObj(col -> (col == 0 ? left : center) + border)
//                        .collect(Collectors.joining("", "", String.valueOf(right))));
//            }
//        }
    }

