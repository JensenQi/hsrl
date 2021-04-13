package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WorgenInfiltrator_994 : Card() {
    override val id = 994
    override val name = "狼人渗透者"
    override val description = "<b>潜行</b>"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "他们原本都是人类，他们更知道怎样悄无声息地进入某些人类的居所中。"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/243d14f53768ef565c2b521c5c71e5eb424ba36172e1541bf19427dc0a4e2a18.png"
}
