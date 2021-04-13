package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DaringFireEater_50381 : Card() {
    override val id = 50381
    override val name = "大胆的吞火者"
    override val description = "<b>战吼：</b>在本回合中，你的下一个英雄技能会额外造成2点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.RastakhansRumble
    override val background = "数小时后，竞技场的洗手间被烧毁了。"
    override val artist = "Jesper Ejsing"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9d54f26673382ad835d610bb5131a6b511f7322c031529d3b90534c00ee30970.png"
}
