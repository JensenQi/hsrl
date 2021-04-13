package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RegeneratinThug_50385 : Card() {
    override val id = 50385
    override val name = "再生暴徒"
    override val description = "在你的回合开始时，为该随从恢复 2点生命值。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "唯心碎无可恢复。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/93e2ece46bceb72af7e880f61702275487343efcb9829aaf05b5919a7e0aab96.png"
}
