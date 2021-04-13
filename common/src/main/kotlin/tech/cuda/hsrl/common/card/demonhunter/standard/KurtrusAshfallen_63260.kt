package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KurtrusAshfallen_63260 : Card() {
    override val id = 63260
    override val name = "库尔特鲁斯·陨烬"
    override val description = "<b>战吼：</b>攻击最左边和最右边的敌方随从。<b>流放：</b>在本回合中获得<b>免疫</b>。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "库尔特鲁斯逃出了黑暗神殿，放弃了伊利丹的大业，一心只想找恐惧魔王安纳塞隆复仇。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/43919bf5dbeb0c5dd992dc5c5d1ca2fe664b022beb226089e7fdcc50a15e61f5.png"
}
