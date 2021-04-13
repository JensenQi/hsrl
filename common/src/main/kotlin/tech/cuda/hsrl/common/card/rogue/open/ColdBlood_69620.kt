package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ColdBlood_69620 : Card() {
    override val id = 69620
    override val name = "冷血"
    override val description = "使一个随从获得+2攻击力；<b>连击：</b>改为获得+4攻击力。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Core
    override val background = "静如冰封，动如激瀑。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0ac070521f26c9e989bdc205314123ec9152c0b2d7819a6023982b649fa0c734.png"
}
