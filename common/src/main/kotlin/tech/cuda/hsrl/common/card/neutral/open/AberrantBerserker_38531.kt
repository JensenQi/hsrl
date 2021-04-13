package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AberrantBerserker_38531 : Card() {
    override val id = 38531
    override val name = "畸变狂战士"
    override val description = "受伤时具有+2攻 击力。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "我狂，故我在。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bf673a56ba8b8e61d58a15dc21d27a43255c1605904f361e61ed48f78a0e4a02.png"
}
