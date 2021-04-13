package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AstralCommunion_2785 : Card() {
    override val id = 2785
    override val name = "星界沟通"
    override val description = "获得十个法力水晶。弃掉 你的手牌。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Tgt
    override val background = "伟大的艾露恩，赐予我法力水晶吧！"
    override val artist = "Christopher Moeller"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c76212e1aef6f3eeb3ae09973b3aa09693d1da19bcdc55ed9ba2bfaeec7a8d93.png"
}
