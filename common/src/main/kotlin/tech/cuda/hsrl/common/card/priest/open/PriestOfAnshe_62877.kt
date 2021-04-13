package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PriestOfAnshe_62877 : Card() {
    override val id = 62877
    override val name = "安瑟祭司"
    override val description = "<b>嘲讽</b>，<b>战吼：</b>如果你在本回合中恢复过生命值，便获得+3/+3。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "太阳神的名字为什么要叫“暗色”呢？"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b8a47b33426b838ef00c6bce5cdb528956b98b43482e4f55d94a2cae0c489600.png"
}
