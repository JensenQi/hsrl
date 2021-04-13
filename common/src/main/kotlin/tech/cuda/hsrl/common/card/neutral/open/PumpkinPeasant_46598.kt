package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PumpkinPeasant_46598 : Card() {
    override val id = 46598
    override val name = "南瓜农夫"
    override val description = "<b>吸血</b> 如果这张牌在你的手牌中，每个回合使其攻击力和生命值互换。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "你敢接我三拳吗？"
    override val artist = "Mike Azevedo"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/12766f1f6b2b1d3e9dfeac88bab2bb66cea988559c31a4e7d2f34f35b38869ed.png"
}
