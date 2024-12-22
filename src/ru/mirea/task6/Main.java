package ru.mirea.task6;

    interface Movable {
        void moveUp();
        void moveDown();
        void moveLeft();
        void moveRight();
    }

    // Класс MovablePoint
    class MovablePoint implements Movable {
        int x, y, xSpeed, ySpeed;

        public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        @Override
        public void moveUp() {
            y += ySpeed;
        }

        @Override
        public void moveDown() {
            y -= ySpeed;
        }

        @Override
        public void moveLeft() {
            x -= xSpeed;
        }

        @Override
        public void moveRight() {
            x += xSpeed;
        }

        @Override
        public String toString() {
            return "MovablePoint{x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "}";
        }
    }

    // Класс MovableRectangle
    class MovableRectangle implements Movable {
        private MovablePoint topLeft;
        private MovablePoint bottomRight;

        public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
            this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
            this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        }

        // Проверка, имеют ли точки одинаковую скорость
        private boolean hasSameSpeed() {
            return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
        }

        @Override
        public void moveUp() {
            if (hasSameSpeed()) {
                topLeft.moveUp();
                bottomRight.moveUp();
            } else {
                System.out.println("У точек разная скорость");
            }
        }

        @Override
        public void moveDown() {
            if (hasSameSpeed()) {
                topLeft.moveDown();
                bottomRight.moveDown();
            } else {
                System.out.println("У точек разная скорость");
            }
        }

        @Override
        public void moveLeft() {
            if (hasSameSpeed()) {
                topLeft.moveLeft();
                bottomRight.moveLeft();
            } else {
                System.out.println("У точек разная скорость");
            }
        }

        @Override
        public void moveRight() {
            if (hasSameSpeed()) {
                topLeft.moveRight();
                bottomRight.moveRight();
            } else {
                System.out.println("У точек разная скорость");
            }
        }

        @Override
        public String toString() {
            return "MovableRectangle{" +
                    "topLeft=" + topLeft +
                    ", bottomRight=" + bottomRight +
                    '}';
        }
    }

