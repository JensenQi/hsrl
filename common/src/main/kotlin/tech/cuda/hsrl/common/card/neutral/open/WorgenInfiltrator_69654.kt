package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WorgenInfiltrator_69654 : Card() {
    override val id = 69654
    override val name = "狼人渗透者"
    override val description = "<b>潜行</b>"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "他们原本都是人类，他们更知道怎样悄无声息地进入某些人类的居所中。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c4cf1e44b234098a1b16b0099e4178fcf9e6729d684a278315bd373c72379ac8.png"
}
