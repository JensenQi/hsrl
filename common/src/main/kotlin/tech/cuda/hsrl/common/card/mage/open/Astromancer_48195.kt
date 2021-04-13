package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Astromancer_48195 : Card() {
    override val id = 48195
    override val name = "星术师"
    override val description = "<b>战吼：</b>随机召唤一个法力值消耗等同于你手牌数量的随从。"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.BoomsdayProject
    override val background = "所有的迹象都指向了安东尼达斯。"
    override val artist = "Gonzalo Ordonez"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/085ea06493574d8495723f811d1ebe31cf637d853f4b728322b2b5dc7b26e66c.png"
}
