package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Devolve_40694 : Card() {
    override val id = 40694
    override val name = "衰变"
    override val description = "随机将所有 敌方随从变形成为法力值消耗减少（1）点的随从。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Msog
    override val background = "鱼人宣称，该技能充分表明所有物种的祖先都是鱼人！"
    override val artist = "Sean McNally"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6344e3e7cb26177ff2a4b893328d106945a1ab18a9c0ed5e4fb4a281e09d742c.png"
}
