package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WingCommander_55403 : Card() {
    override val id = 55403
    override val name = "空军指挥官"
    override val description = "你手牌中每有一张龙牌，便获得+2 攻击力。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "“扇翅膀！快扇啊！”"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d2354d189d42d6a3d8123a825e6ab6df4154620fdf16edf652489700ab477567.png"
}
