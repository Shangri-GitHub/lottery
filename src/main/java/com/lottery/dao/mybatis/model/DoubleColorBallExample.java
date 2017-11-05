package com.lottery.dao.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class DoubleColorBallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoubleColorBallExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNull() {
            addCriterion("period is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("period is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(Integer value) {
            addCriterion("period =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(Integer value) {
            addCriterion("period <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(Integer value) {
            addCriterion("period >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("period >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(Integer value) {
            addCriterion("period <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("period <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<Integer> values) {
            addCriterion("period in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<Integer> values) {
            addCriterion("period not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(Integer value1, Integer value2) {
            addCriterion("period between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("period not between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andR1IsNull() {
            addCriterion("r1 is null");
            return (Criteria) this;
        }

        public Criteria andR1IsNotNull() {
            addCriterion("r1 is not null");
            return (Criteria) this;
        }

        public Criteria andR1EqualTo(Integer value) {
            addCriterion("r1 =", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1NotEqualTo(Integer value) {
            addCriterion("r1 <>", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1GreaterThan(Integer value) {
            addCriterion("r1 >", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1GreaterThanOrEqualTo(Integer value) {
            addCriterion("r1 >=", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1LessThan(Integer value) {
            addCriterion("r1 <", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1LessThanOrEqualTo(Integer value) {
            addCriterion("r1 <=", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1In(List<Integer> values) {
            addCriterion("r1 in", values, "r1");
            return (Criteria) this;
        }

        public Criteria andR1NotIn(List<Integer> values) {
            addCriterion("r1 not in", values, "r1");
            return (Criteria) this;
        }

        public Criteria andR1Between(Integer value1, Integer value2) {
            addCriterion("r1 between", value1, value2, "r1");
            return (Criteria) this;
        }

        public Criteria andR1NotBetween(Integer value1, Integer value2) {
            addCriterion("r1 not between", value1, value2, "r1");
            return (Criteria) this;
        }

        public Criteria andR2IsNull() {
            addCriterion("r2 is null");
            return (Criteria) this;
        }

        public Criteria andR2IsNotNull() {
            addCriterion("r2 is not null");
            return (Criteria) this;
        }

        public Criteria andR2EqualTo(Integer value) {
            addCriterion("r2 =", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2NotEqualTo(Integer value) {
            addCriterion("r2 <>", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2GreaterThan(Integer value) {
            addCriterion("r2 >", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2GreaterThanOrEqualTo(Integer value) {
            addCriterion("r2 >=", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2LessThan(Integer value) {
            addCriterion("r2 <", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2LessThanOrEqualTo(Integer value) {
            addCriterion("r2 <=", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2In(List<Integer> values) {
            addCriterion("r2 in", values, "r2");
            return (Criteria) this;
        }

        public Criteria andR2NotIn(List<Integer> values) {
            addCriterion("r2 not in", values, "r2");
            return (Criteria) this;
        }

        public Criteria andR2Between(Integer value1, Integer value2) {
            addCriterion("r2 between", value1, value2, "r2");
            return (Criteria) this;
        }

        public Criteria andR2NotBetween(Integer value1, Integer value2) {
            addCriterion("r2 not between", value1, value2, "r2");
            return (Criteria) this;
        }

        public Criteria andR3IsNull() {
            addCriterion("r3 is null");
            return (Criteria) this;
        }

        public Criteria andR3IsNotNull() {
            addCriterion("r3 is not null");
            return (Criteria) this;
        }

        public Criteria andR3EqualTo(Integer value) {
            addCriterion("r3 =", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3NotEqualTo(Integer value) {
            addCriterion("r3 <>", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3GreaterThan(Integer value) {
            addCriterion("r3 >", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3GreaterThanOrEqualTo(Integer value) {
            addCriterion("r3 >=", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3LessThan(Integer value) {
            addCriterion("r3 <", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3LessThanOrEqualTo(Integer value) {
            addCriterion("r3 <=", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3In(List<Integer> values) {
            addCriterion("r3 in", values, "r3");
            return (Criteria) this;
        }

        public Criteria andR3NotIn(List<Integer> values) {
            addCriterion("r3 not in", values, "r3");
            return (Criteria) this;
        }

        public Criteria andR3Between(Integer value1, Integer value2) {
            addCriterion("r3 between", value1, value2, "r3");
            return (Criteria) this;
        }

        public Criteria andR3NotBetween(Integer value1, Integer value2) {
            addCriterion("r3 not between", value1, value2, "r3");
            return (Criteria) this;
        }

        public Criteria andR4IsNull() {
            addCriterion("r4 is null");
            return (Criteria) this;
        }

        public Criteria andR4IsNotNull() {
            addCriterion("r4 is not null");
            return (Criteria) this;
        }

        public Criteria andR4EqualTo(Integer value) {
            addCriterion("r4 =", value, "r4");
            return (Criteria) this;
        }

        public Criteria andR4NotEqualTo(Integer value) {
            addCriterion("r4 <>", value, "r4");
            return (Criteria) this;
        }

        public Criteria andR4GreaterThan(Integer value) {
            addCriterion("r4 >", value, "r4");
            return (Criteria) this;
        }

        public Criteria andR4GreaterThanOrEqualTo(Integer value) {
            addCriterion("r4 >=", value, "r4");
            return (Criteria) this;
        }

        public Criteria andR4LessThan(Integer value) {
            addCriterion("r4 <", value, "r4");
            return (Criteria) this;
        }

        public Criteria andR4LessThanOrEqualTo(Integer value) {
            addCriterion("r4 <=", value, "r4");
            return (Criteria) this;
        }

        public Criteria andR4In(List<Integer> values) {
            addCriterion("r4 in", values, "r4");
            return (Criteria) this;
        }

        public Criteria andR4NotIn(List<Integer> values) {
            addCriterion("r4 not in", values, "r4");
            return (Criteria) this;
        }

        public Criteria andR4Between(Integer value1, Integer value2) {
            addCriterion("r4 between", value1, value2, "r4");
            return (Criteria) this;
        }

        public Criteria andR4NotBetween(Integer value1, Integer value2) {
            addCriterion("r4 not between", value1, value2, "r4");
            return (Criteria) this;
        }

        public Criteria andR5IsNull() {
            addCriterion("r5 is null");
            return (Criteria) this;
        }

        public Criteria andR5IsNotNull() {
            addCriterion("r5 is not null");
            return (Criteria) this;
        }

        public Criteria andR5EqualTo(Integer value) {
            addCriterion("r5 =", value, "r5");
            return (Criteria) this;
        }

        public Criteria andR5NotEqualTo(Integer value) {
            addCriterion("r5 <>", value, "r5");
            return (Criteria) this;
        }

        public Criteria andR5GreaterThan(Integer value) {
            addCriterion("r5 >", value, "r5");
            return (Criteria) this;
        }

        public Criteria andR5GreaterThanOrEqualTo(Integer value) {
            addCriterion("r5 >=", value, "r5");
            return (Criteria) this;
        }

        public Criteria andR5LessThan(Integer value) {
            addCriterion("r5 <", value, "r5");
            return (Criteria) this;
        }

        public Criteria andR5LessThanOrEqualTo(Integer value) {
            addCriterion("r5 <=", value, "r5");
            return (Criteria) this;
        }

        public Criteria andR5In(List<Integer> values) {
            addCriterion("r5 in", values, "r5");
            return (Criteria) this;
        }

        public Criteria andR5NotIn(List<Integer> values) {
            addCriterion("r5 not in", values, "r5");
            return (Criteria) this;
        }

        public Criteria andR5Between(Integer value1, Integer value2) {
            addCriterion("r5 between", value1, value2, "r5");
            return (Criteria) this;
        }

        public Criteria andR5NotBetween(Integer value1, Integer value2) {
            addCriterion("r5 not between", value1, value2, "r5");
            return (Criteria) this;
        }

        public Criteria andR6IsNull() {
            addCriterion("r6 is null");
            return (Criteria) this;
        }

        public Criteria andR6IsNotNull() {
            addCriterion("r6 is not null");
            return (Criteria) this;
        }

        public Criteria andR6EqualTo(Integer value) {
            addCriterion("r6 =", value, "r6");
            return (Criteria) this;
        }

        public Criteria andR6NotEqualTo(Integer value) {
            addCriterion("r6 <>", value, "r6");
            return (Criteria) this;
        }

        public Criteria andR6GreaterThan(Integer value) {
            addCriterion("r6 >", value, "r6");
            return (Criteria) this;
        }

        public Criteria andR6GreaterThanOrEqualTo(Integer value) {
            addCriterion("r6 >=", value, "r6");
            return (Criteria) this;
        }

        public Criteria andR6LessThan(Integer value) {
            addCriterion("r6 <", value, "r6");
            return (Criteria) this;
        }

        public Criteria andR6LessThanOrEqualTo(Integer value) {
            addCriterion("r6 <=", value, "r6");
            return (Criteria) this;
        }

        public Criteria andR6In(List<Integer> values) {
            addCriterion("r6 in", values, "r6");
            return (Criteria) this;
        }

        public Criteria andR6NotIn(List<Integer> values) {
            addCriterion("r6 not in", values, "r6");
            return (Criteria) this;
        }

        public Criteria andR6Between(Integer value1, Integer value2) {
            addCriterion("r6 between", value1, value2, "r6");
            return (Criteria) this;
        }

        public Criteria andR6NotBetween(Integer value1, Integer value2) {
            addCriterion("r6 not between", value1, value2, "r6");
            return (Criteria) this;
        }

        public Criteria andB1IsNull() {
            addCriterion("b1 is null");
            return (Criteria) this;
        }

        public Criteria andB1IsNotNull() {
            addCriterion("b1 is not null");
            return (Criteria) this;
        }

        public Criteria andB1EqualTo(Integer value) {
            addCriterion("b1 =", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1NotEqualTo(Integer value) {
            addCriterion("b1 <>", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1GreaterThan(Integer value) {
            addCriterion("b1 >", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1GreaterThanOrEqualTo(Integer value) {
            addCriterion("b1 >=", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1LessThan(Integer value) {
            addCriterion("b1 <", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1LessThanOrEqualTo(Integer value) {
            addCriterion("b1 <=", value, "b1");
            return (Criteria) this;
        }

        public Criteria andB1In(List<Integer> values) {
            addCriterion("b1 in", values, "b1");
            return (Criteria) this;
        }

        public Criteria andB1NotIn(List<Integer> values) {
            addCriterion("b1 not in", values, "b1");
            return (Criteria) this;
        }

        public Criteria andB1Between(Integer value1, Integer value2) {
            addCriterion("b1 between", value1, value2, "b1");
            return (Criteria) this;
        }

        public Criteria andB1NotBetween(Integer value1, Integer value2) {
            addCriterion("b1 not between", value1, value2, "b1");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}