package telacad.altPachet;

public class Box {
    private int width, length, height;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Box box = (Box) o;
//        if (height != box.height) return false;
//        if (length != box.length) return false;
//        if (width != box.width) return false;
//        return true;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null) {
//            Box box = (Box) o;
//            if (height != box.height) return false;
//            if (length != box.length) return false;
//            if (width != box.width) return false;
//            return true;
//        } else return false;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return false;
//        if (o == null || getClass() != o.getClass()) return false;
//        Box box = (Box) o;
//        if (height != box.height) return false;
//        if (length != box.length) return false;
//        if (width != box.width) return false;
//        return true;
//    }

    @Override
    public boolean equals(Object o) {
        Box box = (Box) o;
        if (height != box.height) return false;
        if (length != box.length) return false;
        if (width != box.width) return false;
        return true;
    }
}
