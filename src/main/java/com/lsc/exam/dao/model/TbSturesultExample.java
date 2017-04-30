package com.lsc.exam.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbSturesultExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public TbSturesultExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStuidIsNull() {
            addCriterion("stuId is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("stuId is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(String value) {
            addCriterion("stuId =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(String value) {
            addCriterion("stuId <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(String value) {
            addCriterion("stuId >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(String value) {
            addCriterion("stuId >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(String value) {
            addCriterion("stuId <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(String value) {
            addCriterion("stuId <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLike(String value) {
            addCriterion("stuId like", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotLike(String value) {
            addCriterion("stuId not like", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<String> values) {
            addCriterion("stuId in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<String> values) {
            addCriterion("stuId not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(String value1, String value2) {
            addCriterion("stuId between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(String value1, String value2) {
            addCriterion("stuId not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andWhichlessonIsNull() {
            addCriterion("whichLesson is null");
            return (Criteria) this;
        }

        public Criteria andWhichlessonIsNotNull() {
            addCriterion("whichLesson is not null");
            return (Criteria) this;
        }

        public Criteria andWhichlessonEqualTo(String value) {
            addCriterion("whichLesson =", value, "whichlesson");
            return (Criteria) this;
        }

        public Criteria andWhichlessonNotEqualTo(String value) {
            addCriterion("whichLesson <>", value, "whichlesson");
            return (Criteria) this;
        }

        public Criteria andWhichlessonGreaterThan(String value) {
            addCriterion("whichLesson >", value, "whichlesson");
            return (Criteria) this;
        }

        public Criteria andWhichlessonGreaterThanOrEqualTo(String value) {
            addCriterion("whichLesson >=", value, "whichlesson");
            return (Criteria) this;
        }

        public Criteria andWhichlessonLessThan(String value) {
            addCriterion("whichLesson <", value, "whichlesson");
            return (Criteria) this;
        }

        public Criteria andWhichlessonLessThanOrEqualTo(String value) {
            addCriterion("whichLesson <=", value, "whichlesson");
            return (Criteria) this;
        }

        public Criteria andWhichlessonLike(String value) {
            addCriterion("whichLesson like", value, "whichlesson");
            return (Criteria) this;
        }

        public Criteria andWhichlessonNotLike(String value) {
            addCriterion("whichLesson not like", value, "whichlesson");
            return (Criteria) this;
        }

        public Criteria andWhichlessonIn(List<String> values) {
            addCriterion("whichLesson in", values, "whichlesson");
            return (Criteria) this;
        }

        public Criteria andWhichlessonNotIn(List<String> values) {
            addCriterion("whichLesson not in", values, "whichlesson");
            return (Criteria) this;
        }

        public Criteria andWhichlessonBetween(String value1, String value2) {
            addCriterion("whichLesson between", value1, value2, "whichlesson");
            return (Criteria) this;
        }

        public Criteria andWhichlessonNotBetween(String value1, String value2) {
            addCriterion("whichLesson not between", value1, value2, "whichlesson");
            return (Criteria) this;
        }

        public Criteria andRessingleIsNull() {
            addCriterion("resSingle is null");
            return (Criteria) this;
        }

        public Criteria andRessingleIsNotNull() {
            addCriterion("resSingle is not null");
            return (Criteria) this;
        }

        public Criteria andRessingleEqualTo(Integer value) {
            addCriterion("resSingle =", value, "ressingle");
            return (Criteria) this;
        }

        public Criteria andRessingleNotEqualTo(Integer value) {
            addCriterion("resSingle <>", value, "ressingle");
            return (Criteria) this;
        }

        public Criteria andRessingleGreaterThan(Integer value) {
            addCriterion("resSingle >", value, "ressingle");
            return (Criteria) this;
        }

        public Criteria andRessingleGreaterThanOrEqualTo(Integer value) {
            addCriterion("resSingle >=", value, "ressingle");
            return (Criteria) this;
        }

        public Criteria andRessingleLessThan(Integer value) {
            addCriterion("resSingle <", value, "ressingle");
            return (Criteria) this;
        }

        public Criteria andRessingleLessThanOrEqualTo(Integer value) {
            addCriterion("resSingle <=", value, "ressingle");
            return (Criteria) this;
        }

        public Criteria andRessingleIn(List<Integer> values) {
            addCriterion("resSingle in", values, "ressingle");
            return (Criteria) this;
        }

        public Criteria andRessingleNotIn(List<Integer> values) {
            addCriterion("resSingle not in", values, "ressingle");
            return (Criteria) this;
        }

        public Criteria andRessingleBetween(Integer value1, Integer value2) {
            addCriterion("resSingle between", value1, value2, "ressingle");
            return (Criteria) this;
        }

        public Criteria andRessingleNotBetween(Integer value1, Integer value2) {
            addCriterion("resSingle not between", value1, value2, "ressingle");
            return (Criteria) this;
        }

        public Criteria andResmoreIsNull() {
            addCriterion("resMore is null");
            return (Criteria) this;
        }

        public Criteria andResmoreIsNotNull() {
            addCriterion("resMore is not null");
            return (Criteria) this;
        }

        public Criteria andResmoreEqualTo(Integer value) {
            addCriterion("resMore =", value, "resmore");
            return (Criteria) this;
        }

        public Criteria andResmoreNotEqualTo(Integer value) {
            addCriterion("resMore <>", value, "resmore");
            return (Criteria) this;
        }

        public Criteria andResmoreGreaterThan(Integer value) {
            addCriterion("resMore >", value, "resmore");
            return (Criteria) this;
        }

        public Criteria andResmoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("resMore >=", value, "resmore");
            return (Criteria) this;
        }

        public Criteria andResmoreLessThan(Integer value) {
            addCriterion("resMore <", value, "resmore");
            return (Criteria) this;
        }

        public Criteria andResmoreLessThanOrEqualTo(Integer value) {
            addCriterion("resMore <=", value, "resmore");
            return (Criteria) this;
        }

        public Criteria andResmoreIn(List<Integer> values) {
            addCriterion("resMore in", values, "resmore");
            return (Criteria) this;
        }

        public Criteria andResmoreNotIn(List<Integer> values) {
            addCriterion("resMore not in", values, "resmore");
            return (Criteria) this;
        }

        public Criteria andResmoreBetween(Integer value1, Integer value2) {
            addCriterion("resMore between", value1, value2, "resmore");
            return (Criteria) this;
        }

        public Criteria andResmoreNotBetween(Integer value1, Integer value2) {
            addCriterion("resMore not between", value1, value2, "resmore");
            return (Criteria) this;
        }

        public Criteria andRestotalIsNull() {
            addCriterion("resTotal is null");
            return (Criteria) this;
        }

        public Criteria andRestotalIsNotNull() {
            addCriterion("resTotal is not null");
            return (Criteria) this;
        }

        public Criteria andRestotalEqualTo(String value) {
            addCriterion("resTotal =", value, "restotal");
            return (Criteria) this;
        }

        public Criteria andRestotalNotEqualTo(String value) {
            addCriterion("resTotal <>", value, "restotal");
            return (Criteria) this;
        }

        public Criteria andRestotalGreaterThan(String value) {
            addCriterion("resTotal >", value, "restotal");
            return (Criteria) this;
        }

        public Criteria andRestotalGreaterThanOrEqualTo(String value) {
            addCriterion("resTotal >=", value, "restotal");
            return (Criteria) this;
        }

        public Criteria andRestotalLessThan(String value) {
            addCriterion("resTotal <", value, "restotal");
            return (Criteria) this;
        }

        public Criteria andRestotalLessThanOrEqualTo(String value) {
            addCriterion("resTotal <=", value, "restotal");
            return (Criteria) this;
        }

        public Criteria andRestotalLike(String value) {
            addCriterion("resTotal like", value, "restotal");
            return (Criteria) this;
        }

        public Criteria andRestotalNotLike(String value) {
            addCriterion("resTotal not like", value, "restotal");
            return (Criteria) this;
        }

        public Criteria andRestotalIn(List<String> values) {
            addCriterion("resTotal in", values, "restotal");
            return (Criteria) this;
        }

        public Criteria andRestotalNotIn(List<String> values) {
            addCriterion("resTotal not in", values, "restotal");
            return (Criteria) this;
        }

        public Criteria andRestotalBetween(String value1, String value2) {
            addCriterion("resTotal between", value1, value2, "restotal");
            return (Criteria) this;
        }

        public Criteria andRestotalNotBetween(String value1, String value2) {
            addCriterion("resTotal not between", value1, value2, "restotal");
            return (Criteria) this;
        }

        public Criteria andJointimeIsNull() {
            addCriterion("joinTime is null");
            return (Criteria) this;
        }

        public Criteria andJointimeIsNotNull() {
            addCriterion("joinTime is not null");
            return (Criteria) this;
        }

        public Criteria andJointimeEqualTo(Date value) {
            addCriterion("joinTime =", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeNotEqualTo(Date value) {
            addCriterion("joinTime <>", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeGreaterThan(Date value) {
            addCriterion("joinTime >", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeGreaterThanOrEqualTo(Date value) {
            addCriterion("joinTime >=", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeLessThan(Date value) {
            addCriterion("joinTime <", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeLessThanOrEqualTo(Date value) {
            addCriterion("joinTime <=", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeIn(List<Date> values) {
            addCriterion("joinTime in", values, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeNotIn(List<Date> values) {
            addCriterion("joinTime not in", values, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeBetween(Date value1, Date value2) {
            addCriterion("joinTime between", value1, value2, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeNotBetween(Date value1, Date value2) {
            addCriterion("joinTime not between", value1, value2, "jointime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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