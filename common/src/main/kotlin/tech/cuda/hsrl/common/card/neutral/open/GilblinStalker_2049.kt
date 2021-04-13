package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GilblinStalker_2049 : Card() {
    override val id = 2049
    override val name = "海地精猎手"
    override val description = "<b>潜行</b>"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "虽然他们不如在陆地上的同类们精于算计，但他们在捕猎方面的本领却更胜一筹。"
    override val artist = "Seamus Gallagher"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/449671af0881a4a38f8586ab926bb81a7699a4318a5b4692cbf97cc74634c5ac.png"
}
