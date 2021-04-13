package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CrystalStag_53179 : Card() {
    override val id = 53179
    override val name = "晶角雄鹿"
    override val description = "<b>突袭，战吼：</b>在本局对战中，如果你累计恢复了5点生命值，则召唤一个该随从的复制。 <i>（还剩下 点！）</i> <i>（已经就绪！）</i>"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.RiseOfShadows
    override val background = "孤身而来，携友而归。"
    override val artist = "Patrik Bjorkstrom"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1516e503261d025dfc1c40c3d51206c20de23a1a06b4f73b8cd2785fe3eaa0cd.png"
}
