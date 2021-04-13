package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncientOfLore_70077 : Card() {
    override val id = 70077
    override val name = "知识古树"
    override val description = "<b>抉择：</b>抽两张牌；或者恢复 5点生命值。"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "去吧，把你的名字刻在树皮上。"
    override val artist = "Patrik Hjelm"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/79bdea7b70c8967a75ab3193a5c7f930064bd17b35353c4b89efa095839d413a.png"
}
