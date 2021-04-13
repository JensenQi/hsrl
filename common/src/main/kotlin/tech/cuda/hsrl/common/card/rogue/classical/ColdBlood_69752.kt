package tech.cuda.hsrl.common.card.rogue.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ColdBlood_69752 : Card() {
    override val id = 69752
    override val name = "冷血"
    override val description = "使一个随从获得+2攻击力；<b>连击：</b>改为获得+4攻击力。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ClassicCards
    override val background = "静如冰封，动如激瀑。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dcab13bc5e146ec6cdb31f20182974e9fff11f569f5d78ce4422061c44b6632a.png"
}
