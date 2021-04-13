package tech.cuda.hsrl.common.card.hunter.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Tracking_68433 : Card() {
    override val id = 68433
    override val name = "追踪术"
    override val description = "检视你的牌库顶的三张牌，抽其中一张，弃掉其余牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ClassicCards
    override val background = "为了那些不知道该把什么牌放入套牌的人准备的！"
    override val artist = "Mauro Cascioli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/929426ecc227e986ff5fec1ecd2ffbec091399b0e3ae4c87206fb8db07bc1986.png"
}
