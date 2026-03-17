public class SvgScene {
    private Polygon[] polygons;
    private int i = 0;
    public SvgScene() {
        polygons = new Polygon[3];
    }

    public void addPolygon(Polygon poly) {
        polygons[i] = poly;
        i = (i + 1) % 3; // 0 -> 1 -> 2 -> 0 -> 1 -> 2 -> ...
    }

    public String toSvg() {
        String svg = "";
        for (Polygon p : polygons) {
            if (p == null) continue;

            svg += p.toSvg() + "\n";
        }
        return svg;
    }
}
