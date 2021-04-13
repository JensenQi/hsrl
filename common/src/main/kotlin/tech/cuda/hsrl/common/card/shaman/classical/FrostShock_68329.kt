package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrostShock_68329 : Card() {
    override val id = 68329
    override val name = "冰霜震击"
    override val description = "对一个敌方角色造成 1点伤害，并使其<b>冻结</b>。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "年轻的萨满们可能没听说过《你与冰霜震击》这本书。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/735e1150c6bfe1f3ce70a0fccdfbf1a201ce4ba680aa17bef378884df88ea97b.png"
}
