package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LowlySquire_2486 : Card() {
    override val id = 2486
    override val name = "低阶侍从"
    override val description = "<b>激励：</b> 获得+1攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "还不算最低的！"
    override val artist = "Ron Spears"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e912e9c15d046c984dc1d0c19ec499af6407fb0ae5f803079ee2c79c2cf215d2.png"
}
