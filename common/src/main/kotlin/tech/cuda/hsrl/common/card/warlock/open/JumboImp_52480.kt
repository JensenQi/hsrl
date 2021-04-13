package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JumboImp_52480 : Card() {
    override val id = 52480
    override val name = "巨型小鬼"
    override val description = "如果这张牌在你的手牌中，每当一个友方恶魔死亡，法力值消耗就减少（1）点。"
    override var cost: Int? = 10
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.RiseOfShadows
    override val background = "大个子！大坏蛋！"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b5e204492dd4aafb6ac97763697d1871e9ddc058c12b6f2544632d1b49b754d0.png"
}
