package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RitualOfDoom_62349 : Card() {
    override val id = 62349
    override val name = "末日仪式"
    override val description = "消灭一个友方随从。如果你拥有5个或更多随从，召唤一个5/5的恶魔。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Core
    override val background = "“谁想唱这首末日的歌？！”"
    override val artist = "L. Lullabi & A. Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0f447046e8f4216e7a3bcfeae4f89dcd4d908d52cc5337488ba27cb0b55fd35f.png"
}
