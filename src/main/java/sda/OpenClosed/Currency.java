package sda.OpenClosed;

public enum Currency {

        PLN(1), USD(0.26f),EUR(0.23f), GBP(0.20f);

        private float course;

        Currency(float course){
            this.course = course;
        }

        public float getCourse(){
            return course;
        }

    }
