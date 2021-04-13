package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EvolvedKobold_38408 : Card() {
    override val id = 38408
    override val name = "异变的狗头人"
    override val description = "<b>法术伤害+2</b>"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "你不能拿走我的触须！"
    override val artist = "Genevieve Tsai & Nutchapol "
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b4c14101d707b27673747930a7db3aff9f43112c6d9056e7a677107efc8b7a66.png"
}
