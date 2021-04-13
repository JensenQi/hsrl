package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RaidingParty_50773 : Card() {
    override val id = 50773
    override val name = "团伙劫掠"
    override val description = "从你的牌库中抽两张海盗牌。 <b>连击：</b>并抽一张 武器牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.RastakhansRumble
    override val background = "严肃点，不许笑，我们这打劫呢！"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c89d9c475fdb8ad8c5eb1a47299604f0cde21e72c54db736c0cf8d15a94fb3c3.png"
}
