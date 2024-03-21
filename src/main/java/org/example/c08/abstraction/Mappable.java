package org.example.c08.abstraction;

enum Geometry {
    LINE, POINT, POLYGON;
}

enum Color {
    WHITE, GREEN, RED, ORANGE, BLUE, BLACK;
}

enum PointMarkers {
    CIRCLE, DIAMOND,PUSH_PIN, STAR, SQUARE, TRIANGLE    ;
}

enum LineMarkers {
    DASHED, DOTTED, SOLID;
}

enum UsageType {
    BUSINESS, ENTERTAINMENT, GOVERNMENT, SPORTS, RESIDENTIAL
}

enum UtilityType {
    ELECTRICAL, FIBER_OPTIC, GAS, WATER;
}





public interface Mappable {
    String JSON_PROPERTY="""
    properties":{%s};
    """;
    String getLabel();

    String getMarker();

    Geometry getShape();

    default String toJSON() {
        return """
                "type": "%s', "label":"%s", "marker": "%s"
                """.formatted(getShape(), getLabel(),getMarker());
    }
    static void mapIt(Mappable mappable){
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}
