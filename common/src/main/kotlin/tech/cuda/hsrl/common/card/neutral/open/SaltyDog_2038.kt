package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SaltyDog_2038 : Card() {
    override val id = 2038
    override val name = "熟练的水手"
    override val description = ""
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "他喜欢在船上颠簸的感觉，比在陆地上走路更有安全感。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1f80c62d43ddb894337b3e99ce253ab310070ee9dea62e324e60b37f22e4b7b9.png"
}
