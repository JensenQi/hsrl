package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Equality_70057 : Card() {
    override val id = 70057
    override val name = "生而平等"
    override val description = "将所有随从的生命值变为1。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "正因为我们都是独一无二的，所以我们都是平等的。"
    override val artist = "Michal Ivan"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2bf52f44c00e213ff234997848c8c9e6210c335364d724e2b83ec80304942d0c.png"
}
