package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TempleEnforcer_70060 : Card() {
    override val id = 70060
    override val name = "圣殿执行者"
    override val description = "<b>战吼：</b>使一个友方随从获得+3生命值。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "他在每周四的夜晚都会悄然出现在猪和哨声旅店担当保镖。"
    override val artist = "Daren Bader"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/793337f797c9536a8e2aa8caa1f98064ef1daabe65b84cb1dda700c6e65d07d7.png"
}
