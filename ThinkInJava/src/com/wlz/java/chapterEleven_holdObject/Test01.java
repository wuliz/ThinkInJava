package com.wlz.java.chapterEleven_holdObject;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ͨ������£����ǲ���ȷ����������ʱ���ж��ٸ�����������ʱ����֪����ȷ�������ͣ���������������ָ����� ��Ȼ�����飨���鳤���ǲ��ɱ�ģ�
		 * java�ṩ��һ�������⣨List Set Quene Map �����ࣩ
		 * Set����ÿһ��ֵֻ����һ�Σ�Map����������������Ҫ�ģ������ĳ����ǿɱ�ģ��㲻�õ�������
		 */

		/*
		 * 1���ͺ����Ͱ�ȫ������ �����ڲ�����Ķ���Object���ͣ�����ת�Ͳ���ȷ����س��쳣
		 * ������ǲ�֪�������д�ŵ���ʲô��������׳����������� ʾ����AppleAndOrangeWithGenerics.java��
		 * �������ʹ�÷��͵Ļ�������Ա���������� ʾ����AppleAndOrangeWithGenerics2.java��
		 */

		/*
		 * 2���������� Java����������;�Ǳ�����󣬷�Ϊ���ָ���
		 * Collection���ϣ�һ������Ԫ�ص����У�List���밴˳�򱣴棬Set�������ظ�Ԫ�أ�Quene�����Ŷӹ���ȷ������Ĳ���˳��
		 * Map���ϣ�һ��ɶԵļ�ֵ�Զ�������ʹ�ü�����ֵ����ĳ�������Ͻ���ArrayList�ǽ����ֺͶ�������˹�����
		 * 
		 * ���е�Collection������ʹ��foreach�﷨ List���Դ����ͬ��Ԫ�أ�Set���� ʾ����SimpleCollection��
		 */
		/*
		 * 3�����һ��Ԫ�� Arrays.asList()��Collections.addAll()��ʹ�ã��������ǹ����ࣩ
		 * ע�⣬����ͨ��Arrays
		 * .asList���ص���һ��list���󣬵����ĵײ㻹������ʵ�ֵģ����Բ��ܵ���add()��delete�����ķ�����
		 * ʾ����AddingGroup.java�� ʾ����AsListInterference.java��
		 */
		/*
		 * 4�������Ĵ�ӡ Collection: List: ArrayList LinkedList Set: HashSet TreeSet
		 * LinkedHashSet Map: HashMap TreeMap LinkedHashMap
		 * ʾ����PrintingContainer.java�������н��ܲ�ͬ�����Ĳ���
		 */

		/*
		 * 5��List ArrayList:�������Ԫ�أ���ɾ�ٶȺ��������飩 LinkedList:��ɾ�ٶȺܿ죬���Һ���������
		 * һЩ������ʹ�ã� ��鿴API ʾ����ListFeatures.java��
		 */

		/*
		 * 6�������� ���ã�ȡ�������е�Ԫ�� ��������һ�����ģʽ����һ�����󣺱�����ѡ�������еĶ���
		 * Inteator;(collection����iterator()��������) next()������һ������
		 * hasNext():����Ƿ�����һ������ remove():�����·��صĶ���ɾ�� ��foreach�����Ƚ�
		 * ��һ������Ҫ֪��������Ԫ�����ͺ������ĳ��� �ڶ�������ɾ��Ԫ�� ʾ����SimpleIterator.java��
		 * ������ͳһ�˶������ķ��ʷ�ʽ
		 * ʾ����CrossContainerIterator.java)
		 * 
		 * 6.1:ListIterator(��Iterator���ӽӿڣ�ֻ������List��ķ��ʣ�����˫���ƶ�)
		 * ͨ��list��listIterator()��� �����滻Ԫ��set()
		 * ʾ����ListIterator.java��
		 */

		/*
		 * 7��LinkedList
		 * ʵ��List�ӿڣ�����ɾ������Ч
		 * ����˿���������ջ�����С�˫����еķ���
		 * ʾ����LinkedListFeature.java��
		 */
		/*
		 * 8��Stackջ
		 * �ص㣺�Ƚ����
		 * LinkedListʵ����ջ�����й��ܷ��������Խ�LinkedList��Ϊջ��
		 * ����ʱ��������Ҫһ��������ջ(ֻ����ջӦ���еķ���)
		 * java��ջ��ʵ��
		 * ʾ����Stack.java��
		 * push()
		 * pop()
		 */
		
		/*
		 * 9��Set(�������ظ���Ԫ��)
		 * ������Set������Ҫ�Ĳ�����ͨ��ʹ���ڲ��Թ�����
		 * Set���и�Collectionһ���Ľӿ�
		 * 
		 * HashSetʹ����ɢ�б���ѯ�ٶȿ飩
		 * LinkedHashSet(ʹ����ɢ�б�������������֤����˳��)
		 * �Խ�����򣬿���ʹ��TreeSet
		 * ʾ����SetOfInteger.java)
		 * set�к���Ҫ�ķ�����contains()������set�Ĺ�����
		 */
		
		/*
		 * 10��Map��һ�ֶ���ӳ����һ�ֶ���
		 * ��ʹ��ʾ����Statistics.java��
		 * �����ʹ��map��������ӵ����ݽṹ������һ����ӵ�ж������
		 * Map<Person,List<Pet>
		 */
		
		/*
		 * 11��Quene(���У��Ƚ��ȳ�)
		 * �����ڲ�������к���Ҫ
		 * LinkedListʵ����Quene�ӿڣ����LinkedList������ΪQuene��ʵ��
		 * offer()
		 * remove();
		 * ʾ����QueueDemo.java��
		 * 11.1��PriorityQueue���ȶ��У���������һ������ʽ�洢
		 * 11.2��Collection��Iterator
		 * Collection�������������������Ĺ��Եĸ��ӿ�
		 * ʾ����InterfaceVsIterator.java)
		 */
		/*
		 * 13��Foreach�������
		 * Foreach�ܹ��������ϣ�����Ϊ����ʵ����Interable�ӿڣ�ֻҪʵ�ָýӿڣ����ܷ���һ��iterator��ʵ��������foreach��������ʱ�����ϻ�Ĭ�Ϸ���iterator����
		 */
		
		/*
		 * �ܽ᣺
		 * 1��������Դ洢�������ͺ��������ͣ����ȹ̶�������ȷ��������ʹ��forEach
		 * 2��Collection���浥һ��Ԫ�أ�Java���Ϳ���ָ�������д洢��Ԫ�����ͣ�������Ҫ����ת�������ܴ洢�������ͣ������ɱ�
		 * 3��Map����������ļ�ֵ�ԣ�
		 * 4��list�ǰ��洢˳��洢�ģ����������ǿ
		 */
		
	}

}
