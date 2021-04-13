package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InconspicuousRider_61672 : Card() {
    override val id = 61672
    override val name = "低调的游客"
    override val description = "<b>战吼：</b>从你的牌库中施放一个<b>奥秘</b>。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "随机应变，融入环境，克服困难。"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6333c9ef303de503ac12aff6fe568b696a64dd023cb2a80812429cba7927a6a2.png"
}
