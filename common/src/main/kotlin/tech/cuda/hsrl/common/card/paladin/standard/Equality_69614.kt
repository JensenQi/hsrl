package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Equality_69614 : Card() {
    override val id = 69614
    override val name = "生而平等"
    override val description = "将所有随从的生命值变为1。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Core
    override val background = "正因为我们都是独一无二的，所以我们都是平等的。"
    override val artist = "Michal Ivan"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d4cb97ec388048a6de50ff7291cc6fa594ba8717af2afd0d61d48fdc3e492c4a.png"
}
