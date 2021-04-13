package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Naturalize_233 : Card() {
    override val id = 233
    override val name = "自然平衡"
    override val description = "消灭一个随从，你的对手抽两张牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Legacy4
    override val background = "又一位战死沙场的将士。"
    override val artist = "Leo Che"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/66d46c5613d9374381f1accf81347daeded85b9c4facceaf72bb4861a3b23648.png"
}
