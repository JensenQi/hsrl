package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ColdBlood_268 : Card() {
    override val id = 268
    override val name = "冷血"
    override val description = "使一个随从获得+2攻击力；<b>连击：</b>改为获得+4攻击力。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy3
    override val background = "静如冰封，动如激瀑。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5018fd8289eed103cbfe8b73040d8f1a00c2f2aacd398c448fee79a0f5f81386.png"
}
