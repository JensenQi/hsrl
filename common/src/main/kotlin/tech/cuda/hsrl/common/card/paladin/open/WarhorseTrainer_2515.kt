package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WarhorseTrainer_2515 : Card() {
    override val id = 2515
    override val name = "战马训练师"
    override val description = "你的白银之手新兵获得+1攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Tgt
    override val background = "他整天与战马为伍，终年无休。"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5fed8a6a9d0656c4f7e099364f6d2ee141eec0c7e9e821e8c13a9beb806dd8fe.png"
}
