package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KeeperStalladris_52809 : Card() {
    override val id = 52809
    override val name = "守护者斯塔拉蒂斯"
    override val description = "在你施放了一个<b>抉择</b>法术后，将每个选项的复制置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.RiseOfShadows
    override val background = "我全都要！"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ec906d676b5e73225bfa13d3234e5ed69e35e15151eec02facff08b55228a06b.png"
}
