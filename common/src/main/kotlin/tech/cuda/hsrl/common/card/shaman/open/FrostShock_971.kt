package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrostShock_971 : Card() {
    override val id = 971
    override val name = "冰霜震击"
    override val description = "对一个敌方角色造成 1点伤害，并使其<b>冻结</b>。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Legacy1635
    override val background = "年轻的萨满们可能没听说过《你与冰霜震击》这本书。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/76a1b57e1ff67d17de0fd603b5a133588902a242458731e6cac434e85adce4a3.png"
}
