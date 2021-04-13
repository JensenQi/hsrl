package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OverconfidentOrc_57190 : Card() {
    override val id = 57190
    override val name = "狂傲的兽人"
    override val description = "<b>嘲讽</b> 当拥有所有生命值时，该随从具有+2攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 6
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“我最强力！你是弱鸡！”"
    override val artist = "Sam Nielson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/840c815bd325e4138413490d91cebf74904c75e159de51bb349d5c49cd41f271.png"
}
